package shop.jarviis.oracle.order.service;

import java.util.List;

import org.springframework.stereotype.Component;

import shop.jarviis.oracle.order.domain.OrderDto;

@Component
public interface OrderService {
	public List<OrderDto> findAll();
	public List<OrderDto> findByCustId(int custId);
	public List<OrderDto> findByBookId(int bookId);
	void save(OrderDto order);
}
