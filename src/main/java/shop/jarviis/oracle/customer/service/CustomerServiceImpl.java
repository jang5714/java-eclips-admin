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
	public void save(CustomerDto custId) {
		customermapper.save(custId);
	}

	@Override
	public CustomerDto findby(Integer id) {
		return null;
	}

	@Override
	public List<CustomerDto> findAll() {
		return customermapper.findAll();
	}

	@Override
	public void update(CustomerDto a) {
		customermapper.update(a);
	}

	@Override
	public void delete(Integer id) {
		customermapper.delete(id);
		
	}

	@Override
	public List<CustomerDto> findById(String custId) {
		return customermapper.findByCustId(custId);
	}

	

	
}
