package shop.jarviis.oracle.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.jarviis.oracle.customer.domain.CustomerDto;
import shop.jarviis.oracle.mappers.CustomerMapper;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired CustomerMapper customermapper;

	@Override
	public List<CustomerDto> findAll() {
		return customermapper.findAll();
	}
	@Override
	public CustomerDto findByCustId(int custId) {
		return customermapper.findByCustId(custId);
		
	}
	@Override
	public void save(CustomerDto customer) {
		customermapper.save(customer);
	}
}
