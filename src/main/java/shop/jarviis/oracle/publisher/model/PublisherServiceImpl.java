package shop.jarviis.oracle.publisher.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublisherServiceImpl implements PublisherService {
	@Autowired PublisherMapper publisherMapper;

	
	@Override
	public List<PublisherDto> findByPubName(String pubName) {
		return publisherMapper.findByPubName(pubName);
	}

	@Override
	public List<PublisherDto> findByPhone(String phone) {
		return publisherMapper.findByPhone(phone);
	}

	@Override
	public void save(PublisherDto t) {
		publisherMapper.save(t);
	}

	@Override
	public PublisherDto findby(Integer id) {
		return publisherMapper.findby(id);
		
	}

	@Override
	public List<PublisherDto> findAll() {
		return publisherMapper.findAll();
		
	}

	@Override
	public void update(PublisherDto a) {
		publisherMapper.update(a);
	}

	@Override
	public void delete(Integer id) {
		publisherMapper.delete(id);
	}

	
	
}
