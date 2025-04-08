package com.souptik.Bookstore_Application_Zynetic.controller;

import com.souptik.Bookstore_Application_Zynetic.exception.BookAlreadyExistsException;
import com.souptik.Bookstore_Application_Zynetic.model.Book;
import com.souptik.Bookstore_Application_Zynetic.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book/api")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/")
    public String home() {
        return "home Page";
    }

    @GetMapping("/books")
    public ResponseEntity<String> getAllBooks() {
        return ResponseEntity.ok("books Page");
    }

    @GetMapping("/book-register")
    public String books(){
        return "Book is getting";
    }

    @PostMapping("/book-register")
    public ResponseEntity<?> createBook(@RequestBody Book book) {
        try {
            Book savedBook = bookService.saveBook(book);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedBook);
        } catch (BookAlreadyExistsException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An error occurred while saving the book");
        }
    }
}