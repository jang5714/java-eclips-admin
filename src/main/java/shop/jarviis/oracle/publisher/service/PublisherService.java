package shop.jarviis.oracle.publisher.service;

import java.util.List;

import org.springframework.stereotype.Component;

import shop.jarviis.oracle.publisher.domain.PublisherDto;

@Component
public interface PublisherService {
	public List<PublisherDto> findAll();
	public List<PublisherDto> findByPubName(String pubName);
	public List<PublisherDto> findByPhone(String phone);
	void save(PublisherDto publisher);
}
