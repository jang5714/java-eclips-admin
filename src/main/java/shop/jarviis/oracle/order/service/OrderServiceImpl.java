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
	public List<OrderDto> findByCustId(int custId) {
		return orderMapper.findByCustId(custId);
	}

	@Override
	public List<OrderDto> findByBookId(int bookId) {
		return orderMapper.findByBookId(bookId);
	}

	@Override
	public void save(OrderDto t) {
		orderMapper.save(t);
	}

	@Override
	public List<OrderDto> findAll() {
		return orderMapper.findAll();
	}

	@Override
	public void update(OrderDto a) {
		orderMapper.update(a);
	}

	@Override
	public void delete(Integer id) {
		orderMapper.delete(id);
	}

	@Override
	public OrderDto findby(Integer id) {
		return orderMapper.findby(id);
	}

	
	
}
