package shop.jarviis.oracle.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import shop.jarviis.oracle.customer.domain.CustomerDto;

@Repository
public interface CustomerMapper {
	public List<CustomerDto> findAll();
	public CustomerDto findByCustId(int custId);
	public void save(CustomerDto customer);
	
}
