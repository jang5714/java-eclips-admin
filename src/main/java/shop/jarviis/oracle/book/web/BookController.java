package shop.jarviis.oracle.book.web;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.jarviis.oracle.book.model.BookDto;
import shop.jarviis.oracle.book.model.BookService;
import shop.jarviis.oracle.common.GenericInterface;

@Controller
@RequestMapping("/books")
public class BookController {
	@Autowired BookDto book;
	@Autowired BookService bookService;
	
	@RequestMapping(value= "/register", method= {RequestMethod.POST})
	public String save(BookDto book) {
		bookService.save(book);
		return "redirect:/move/book/List";
	}

	@RequestMapping("/")
	public String findAll() {
		List<BookDto> bookDtos = bookService.findAll();
		for (BookDto book : bookDtos) {
			System.out.println(book.toString());
		}
		return "redirect:/move/book/List";
	}
	@RequestMapping(value = "/update", method= {RequestMethod.POST})
	public String update(BookDto book) {
		bookService.update(book);
		return "redirect:/move/book/List";
	}
	@RequestMapping("/delete")
	public String delete(@Param("bookId") int bookId) {
		bookService.delete(bookId);
		return "redirect:/move/book/List";
		
	}
	
	@RequestMapping("/books/{bookTd}")
	public void findById(@PathVariable int bookId) {
		BookDto book = bookService.findby(bookId);
		System.out.println(book.toString());
	}
	
	@RequestMapping("/books/pubId/{pubId}")
	public void findByPubId(@PathVariable int pubId) {
		List<BookDto> books = bookService.findByPubId(pubId);
		System.out.println(books.toString());
		
	}
	@RequestMapping("/books/bookName/{bookName}")
	public void findByBookName(@PathVariable String bookName) {
		List<BookDto> books = bookService.findByBookName(bookName);
		System.out.println(books.toString());
		
	}
	@RequestMapping("/books/price/{price}")
	public void findByPrice(@PathVariable int price) {
		List<BookDto> books = bookService.findByPrice(price);
		System.out.println(books.toString());
	}

	
}
