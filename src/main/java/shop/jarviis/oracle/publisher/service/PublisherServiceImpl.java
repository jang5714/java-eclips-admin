package shop.jarviis.oracle.publisher.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.jarviis.oracle.mappers.PublisherMapper;
import shop.jarviis.oracle.publisher.domain.PublisherDto;

@Service
public class PublisherServiceImpl implements PublisherService {
	@Autowired PublisherMapper publisherMapper;

	@Override
	public List<PublisherDto> findAll() {
		return publisherMapper.findAll();
	}

	@Override
	public List<PublisherDto> findByPubName(String pubName) {
		return publisherMapper.findByPubName(pubName);
	}

	@Override
	public List<PublisherDto> findByPhone(String phone) {
		return publisherMapper.findByPhone(phone);
	}

	@Override
	public void save(PublisherDto publisher) {
		publisherMapper.save(publisher);
	}
	
	
}
