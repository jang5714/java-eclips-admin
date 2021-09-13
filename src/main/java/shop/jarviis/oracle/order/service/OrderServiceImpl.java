package shop.jarviis.oracle.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.jarviis.oracle.mappers.OrderMapper;
import shop.jarviis.oracle.order.domain.OrderDto;

@Service
public class OrderServiceImpl implements OrderService{
	@Autowired OrderMapper orderMapper;

	@Override
	public List<OrderDto> findAll() {
		return orderMapper.findAll();
	}

	@Override
	public List<OrderDto> findByCustId(int custId) {
		return orderMapper.findByCustId(custId);
	}

	@Override
	public List<OrderDto> findByBookId(int bookId) {
		return orderMapper.findByBookId(bookId);
	}

	@Override
	public void save(OrderDto order) {
		orderMapper.save(order);
	}
	
	
}
