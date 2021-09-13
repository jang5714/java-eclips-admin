package shop.jarviis.oracle.customer.service;

import java.util.List;

import org.springframework.stereotype.Component;

import shop.jarviis.oracle.customer.domain.CustomerDto;

@Component
public interface CustomerService {
	public List<CustomerDto> findAll();
	public CustomerDto findByCustId(int custId);
	public void save(CustomerDto customer);
}
