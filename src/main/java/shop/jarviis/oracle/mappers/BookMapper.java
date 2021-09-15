package shop.jarviis.oracle.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import shop.jarviis.oracle.book.domain.BookDto;
import shop.jarviis.oracle.common.GenericInterface;

@Repository
public interface BookMapper extends GenericInterface<BookDto, Integer>{
	public List<BookDto> findByPubId(int pubId);
	public List<BookDto> findByBookName(String bookName);
	public List<BookDto> findByPrice(int price);
}
