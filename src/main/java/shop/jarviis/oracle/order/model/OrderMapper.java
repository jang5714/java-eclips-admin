package shop.jarviis.oracle.order.model;

import java.util.List;

import org.springframework.stereotype.Repository;

import shop.jarviis.oracle.common.GenericInterface;


@Repository
public interface OrderMapper extends GenericInterface<OrderDto, Integer>{
	public List<OrderDto> findByCustId(int custId);
	public List<OrderDto> findByBookId(int bookId);
	
}
