package yukay.com.webApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import yukay.com.webApp.model.Book;
import yukay.com.webApp.service.BookService;

import java.util.List;
@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    @GetMapping("/all")
    private List<Book> getAllBook(){
        return bookService.getAllBooks();
    }

    @PostMapping("/create")
    private Book createBook(@RequestBody Book book){
        return  bookService.createBook(book);
    }

}







