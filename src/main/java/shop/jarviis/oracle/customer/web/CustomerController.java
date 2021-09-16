package shop.jarviis.oracle.customer.web;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.jarviis.oracle.common.GenericInterface;
import shop.jarviis.oracle.customer.model.CustomerDto;
import shop.jarviis.oracle.customer.model.CustomerService;


@Controller
@RequestMapping("/customers")
public class CustomerController {
	@Autowired CustomerDto customer;
	@Autowired CustomerService customerService;
	
	@RequestMapping(value = "/detail" , method ={RequestMethod.POST})
	public String save(CustomerDto custId) {
		customerService.save(custId);
		return "User 정보 입력완료";
	}
	
	@RequestMapping("/detail/{id}")
	public String findByCustId(@RequestParam String custId) {
		System.out.println(customerService.findById(custId));
		
		return "Id로 회원찾기";
	}
	
	@RequestMapping("/")
	public String findAll() {
		List<CustomerDto> customers = customerService.findAll();
		for(CustomerDto customer : customers) {
			System.out.println(customer.toString());
		}
		return "User 정보 조회 완료";
	}
	
	@RequestMapping(value="/update" , method = {RequestMethod.POST})
	public String update(CustomerDto a) {
		customerService.update(a);
		return "User 정보 수정 완료";
	}
	
	@RequestMapping("/delete")
	public String delete(@Param("custId") int custId) {
		customerService.delete(custId);
		return "User 정보 삭제 완료";
	}
	
	
	
	
}
