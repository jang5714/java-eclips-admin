package shop.jarviis.oracle.book.service;

import java.util.List;

import org.springframework.stereotype.Component;

import shop.jarviis.oracle.book.domain.BookDto;

@Component
public interface BookService {
	public List<BookDto> findAll();
	public BookDto findById(int bookId);
	public List<BookDto> findByPubId(int pubId);
	public List<BookDto> findByBookName(String bookName);
	public List<BookDto> findByPrice(int price);
	void save(BookDto book);
}
