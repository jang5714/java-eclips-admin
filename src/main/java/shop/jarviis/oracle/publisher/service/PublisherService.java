package shop.jarviis.oracle.publisher.service;

import java.util.List;

import org.springframework.stereotype.Component;

import shop.jarviis.oracle.common.GenericInterface;
import shop.jarviis.oracle.publisher.domain.PublisherDto;

@Component
public interface PublisherService extends GenericInterface<PublisherDto, Integer>{
	
	public List<PublisherDto> findByPubName(String pubName);
	public List<PublisherDto> findByPhone(String phone);
}
