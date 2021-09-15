package shop.jarviis.oracle.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.jarviis.oracle.book.domain.BookDto;
import shop.jarviis.oracle.mappers.BookMapper;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired BookMapper bookMapper;


	@Override
	public List<BookDto> findByPubId(int pubId) {
		return bookMapper.findByPubId(pubId);
	}

	@Override
	public List<BookDto> findByBookName(String bookName) {
		return bookMapper.findByBookName(bookName);
	}

	@Override
	public List<BookDto> findByPrice(int price) {
		return bookMapper.findByPrice(price);
	}

	@Override
	public void save(BookDto book) {
		bookMapper.save(book);
	}

	@Override
	public BookDto findby(Integer id) {
		return bookMapper.findby(id);
	}

	@Override
	public List<BookDto> findAll() {
		return bookMapper.findAll();
	}

	@Override
	public void update(BookDto a) {
		bookMapper.update(a);
	}

	@Override
	public void delete(Integer id) {
		bookMapper.delete(id);
	}

	
	
}
