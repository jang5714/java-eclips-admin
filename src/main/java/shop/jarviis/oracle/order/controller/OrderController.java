package shop.jarviis.oracle.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import shop.jarviis.oracle.order.domain.OrderDto;
import shop.jarviis.oracle.order.service.OrderService;

@Controller
@RequestMapping("/orders")
public class OrderController {
	@Autowired OrderService orderService;
	@Autowired OrderDto order;
	
	@RequestMapping("/join")
	public String join(
			@RequestParam("orderId") int orderId,
			@RequestParam("custId") int custId,
			@RequestParam("bookId") int bookId,
			@RequestParam("orderPrice") int orderPrice,
			@RequestParam("orderDate") String orderDate) {
		System.out.println("orderId : " + orderId);
		System.out.println("custId : " + custId);
		System.out.println("bookId : " + bookId);
		System.out.println("orderPrice : " + orderPrice);
		System.out.println("orderDate : " + orderDate);
		order.setBookId(bookId);
		order.setCustId(custId);
		order.setOrderDate(orderDate);
		order.setOrderId(orderId);
		order.setOrderPrice(orderPrice);
		orderService.save(order);
		return "/order/Login";
	}
	@RequestMapping("/orders")
	public void findAll() {
		List<OrderDto> orders = orderService.findAll();
		for(OrderDto order : orders) {
			System.out.println(order.toString());
		}
	}
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
}
