package shop.jarviis.oracle.publisher.web;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.jarviis.oracle.common.GenericInterface;
import shop.jarviis.oracle.publisher.model.PublisherDto;
import shop.jarviis.oracle.publisher.model.PublisherService;

@Controller
@RequestMapping("/publishers")
public class PublisherController{
	
	@Autowired PublisherDto publisher;
	@Autowired PublisherService publisherService;
	
	
	@RequestMapping("/publishers/pubName/{pubName}")
	public void findByPubName(@PathVariable String pubName) {
		List<PublisherDto> publishers = publisherService.findByPubName(pubName);
		System.out.println(publishers.toString());
	}
	
	@RequestMapping("/publishers/phone/{phone}")
	public void findByPhone(@PathVariable String phone) {
		List<PublisherDto> publishers = publisherService.findByPhone(phone);
		System.out.println(publishers.toString());
	}
	
	@RequestMapping("/update")
	public String save(PublisherDto t) {
		publisherService.update(t);
		return "출판사 저장 완료";
	}
	
	@RequestMapping("/")
	public void findAll() {
		List<PublisherDto> publishers = publisherService.findAll();
		for(PublisherDto publisherDto : publishers) {
			System.out.println(publisherDto.toString());
		}
	}
	
	@RequestMapping(value= "/update", method= {RequestMethod.POST})
	public String update(PublisherDto a) {
		publisherService.update(a);
		return "출판사 수정완료";
	}
	
	@RequestMapping("/delete")
	public String delete(@Param("pubId") int pubId) {
		publisherService.delete(pubId);
		return "출판사 삭제 완료";
	}
}
