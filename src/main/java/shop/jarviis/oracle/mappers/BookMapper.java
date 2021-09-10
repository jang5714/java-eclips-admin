package shop.jarviis.oracle.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import shop.jarviis.oracle.book.domain.BookDto;

@Repository
public interface BookMapper {
	public List<BookDto> findAll();
	public BookDto findById(int bookId);
	public List<BookDto> findByPubId(int pubId);
	public List<BookDto> findByBookName(String bookName);
	public List<BookDto> findByPrice(int price);
}
