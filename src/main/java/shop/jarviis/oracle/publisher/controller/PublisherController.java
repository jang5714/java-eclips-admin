package shop.jarviis.oracle.publisher.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.jarviis.oracle.publisher.domain.PublisherDto;
import shop.jarviis.oracle.publisher.service.PublisherService;

@Controller
@RequestMapping("/publishers")
public class PublisherController {
	
	@Autowired PublisherDto publisher;
	@Autowired PublisherService publisherService;
	
	@RequestMapping(value="/join", method={RequestMethod.POST})
	public String join(
			@RequestParam("pubId") int pubId,
			@RequestParam("pubName") String pubName,
			@RequestParam("mgrName") String mgrName,
			@RequestParam("phone") String phone) {
		System.out.println("pubId : " + pubId);
		System.out.println("pubName : " + pubName);
		System.out.println("mgrName : " + mgrName);
		System.out.println("phone : " + phone);
		publisher.setPubId(pubId);
		publisher.setMgrName(mgrName);
		publisher.setPhone(phone);
		publisher.setPubName(pubName);
		publisherService.save(publisher);
		
		return "/publisher/publisherLogin";
	}
	
	@RequestMapping("/publishers")
	public void findAll() {
		List<PublisherDto> publishers = publisherService.findAll();
		for (PublisherDto publisher : publishers) {
			System.out.println(publisher.toString());
		}
	}
	
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
}
