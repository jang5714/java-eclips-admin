package shop.jarviis.oracle.customer.model;

import java.util.List;

import org.springframework.stereotype.Repository;

import shop.jarviis.oracle.common.GenericInterface;

@Repository
public interface CustomerMapper extends GenericInterface<CustomerDto, Integer>{
	public List<CustomerDto> findByCustId (String custId);
	
}
