package shop.jarviis.oracle.common;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import shop.jarviis.oracle.customer.model.CustomerDto;
import shop.jarviis.oracle.order.model.OrderDto;

public interface GenericInterface<T, U> {
	
	public void save(T t);
	public T findby(U id);
	public List<T> findAll();
	public void update(T a);
	public void delete(U id);

}
