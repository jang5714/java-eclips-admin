package shop.jarviis.oracle.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.jarviis.oracle.book.domain.BookDto;
import shop.jarviis.oracle.book.service.BookService;

@Controller
@RequestMapping("/books")
public class BookController {
	@Autowired BookDto book;
	@Autowired BookService bookService;
	
	@RequestMapping(value="/join", method= {RequestMethod.POST})
	public String join(
			@RequestParam("bookId") int bookId,
			@RequestParam("bookName") String bookName,
			@RequestParam("price") int price,
			@RequestParam("pubId") int pubId
			) {
		System.out.println("bookId : " + bookId);
		System.out.println("bookName : " + bookName);
		System.out.println("price : " + price);
		System.out.println("pubId : " + pubId);
		book.setBookId(bookId);
		book.setBookName(bookName);
		book.setPrice(price);
		book.setPubId(pubId);
		bookService.save(book);
		
		return "/book/Login";
	}
	@RequestMapping("/books")
	public void findAll() {
		List<BookDto> books = bookService.findAll();
		for(BookDto book : books) {
			System.out.println(book.toString());	
		}
	}
	
	@RequestMapping("/books/{bookTd}")
	public void findById(@PathVariable int bookId) {
		BookDto book = bookService.findById(bookId);
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
