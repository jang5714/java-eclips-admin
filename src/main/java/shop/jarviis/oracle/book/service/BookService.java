package shop.jarviis.oracle.book.service;

import java.util.List;

import org.springframework.stereotype.Component;

import shop.jarviis.oracle.book.domain.BookDto;
import shop.jarviis.oracle.common.GenericInterface;

@Component
public interface BookService extends GenericInterface<BookDto, Integer> {
	
	public List<BookDto> findByPubId(int pubId);
	public List<BookDto> findByBookName(String bookName);
	public List<BookDto> findByPrice(int price);
}
