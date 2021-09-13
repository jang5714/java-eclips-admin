package shop.jarviis.oracle.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.jarviis.oracle.customer.domain.CustomerDto;
import shop.jarviis.oracle.customer.service.CustomerService;


@Controller
@RequestMapping("/customers")
public class CustomerController {
	@Autowired CustomerDto customer;
	@Autowired CustomerService customerService;
	
	@RequestMapping("/customers")
	public void findAll() {
		List<CustomerDto> customers = customerService.findAll();
		for(CustomerDto customer : customers) {
			System.out.println(customer.toString());
		}
	}
	@RequestMapping("/customers/{custId}")
	public void findByCustId(@PathVariable int custId) {
		CustomerDto customer = customerService.findByCustId(custId);
		System.out.println(customer.toString());
	}
	@RequestMapping(value="/join",method= {RequestMethod.POST})
	public String join(
			@RequestParam("custId") int custId,
			@RequestParam("custName") String custName,
			@RequestParam("address") String address,
			@RequestParam("phone") String phone) {
		System.out.println("custId : " + custId);
		System.out.println("custName : " + custName);
		System.out.println("address : " + address);
		System.out.println("phone : " + phone);
		customer = new CustomerDto();
		customer.setCustId(custId);
		customer.setAddress(address);
		customer.setCustName(custName);
		customer.setPhone(phone);
		customerService.save(customer);
		
		return "/user/Login";
	}
	
	@RequestMapping(value="/login", method= {RequestMethod.POST})
	public String login() {
		return "/user/Login";
	}
}
