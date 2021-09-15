package shop.jarviis.oracle.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import shop.jarviis.oracle.common.GenericInterface;
import shop.jarviis.oracle.publisher.domain.PublisherDto;

@Repository
public interface PublisherMapper extends GenericInterface<PublisherDto, Integer>{
	
	public List<PublisherDto> findByPubName(String pubName);
	public List<PublisherDto> findByPhone(String phone);
	
}
