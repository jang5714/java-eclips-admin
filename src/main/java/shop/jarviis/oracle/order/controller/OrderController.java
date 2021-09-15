package shop.jarviis.oracle.order.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.jarviis.oracle.common.GenericInterface;
import shop.jarviis.oracle.order.domain.OrderDto;
import shop.jarviis.oracle.order.service.OrderService;

@Controller
@RequestMapping("/orders")
public class OrderController {
	@Autowired OrderService orderService;
	
	@RequestMapping("/orders/custId/{custId}")
	public void findByCustId(@PathVariable int custId) {
		List<OrderDto> orders = orderService.findByCustId(custId);
		System.out.println(orders.toString());
	}
	@RequestMapping("/orders/bookId/{bookId}")
	public void findByBookId(@PathVariable int bookId) {
		List<OrderDto> orders = orderService.findByBookId(bookId);
		System.out.println(orders.toString());
	}
	@RequestMapping(value= "/detail", method= {RequestMethod.POST})
	public String save(OrderDto t) {
		orderService.save(t);
		return "order 저장";
	}
	@RequestMapping("/")
	public void findAll() {
		List<OrderDto> orders = orderService.findAll();
		for(OrderDto order : orders) {
			System.out.println(order.toString());
		}
	}
	@RequestMapping(value ="/update", method= {RequestMethod.POST})
	public String update(OrderDto a) {
		orderService.update(a);
		return "order 수정완료";
	}

	@RequestMapping("/delete")
	public String delete(@Param ("orderId") int orderId) {
		orderService.delete(orderId);
		return "order 삭제 완료";
	}
	
}
