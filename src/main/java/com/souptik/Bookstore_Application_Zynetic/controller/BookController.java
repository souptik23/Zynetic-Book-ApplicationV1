package com.souptik.Bookstore_Application_Zynetic.controller;

import com.souptik.Bookstore_Application_Zynetic.exception.BookAlreadyExistsException;
import com.souptik.Bookstore_Application_Zynetic.model.Book;
import com.souptik.Bookstore_Application_Zynetic.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    // CREATE a new book
    @PostMapping("/book-register")
    public ResponseEntity<?> createBook(@RequestBody Book book) {
        try {
            Book savedBook = bookService.saveBook(book);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedBook);
        } catch (BookAlreadyExistsException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Can't save the book. Recheck the input.");
        }
    }

    // GET all books
    @GetMapping("/all-books")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    // GET book by ID
    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable String id) {
        Book book = bookService.getBookById(id);
        return ResponseEntity.ok(book);
    }

    // UPDATE book by ID
    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable String id, @RequestBody Book updatedBook) {
        Book book = bookService.updateBook(id, updatedBook);
        return ResponseEntity.ok(book);
    }

    // DELETE book by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable String id) {
        bookService.deleteBookById(id);
        return ResponseEntity.ok("Book with ID " + id + " deleted successfully.");
    }

    // FILTER: by author
    @GetMapping("/filter/author")
    public List<Book> getBooksByAuthor(@RequestParam String author) {
        return bookService.filterByAuthor(author);
    }

    // FILTER: by category
    @GetMapping("/filter/category")
    public List<Book> getBooksByCategory(@RequestParam String category) {
        return bookService.filterByCategory(category);
    }

    // FILTER: by rating
    @GetMapping("/filter/rating")
    public List<Book> getBooksByRating(@RequestParam double rating) {
        return bookService.filterByRating(rating);
    }

    // SEARCH: name contains keyword
    @GetMapping("/search/name")
    public List<Book> searchBooksByName(@RequestParam String keyword) {
        return bookService.searchByNameContaining(keyword);
    }

    // SEARCH: by author with sorting
    @GetMapping("/search/by-sorted-author")
    public List<Book> getBooksByAuthorSorted(
            @RequestParam String author,
            @RequestParam(defaultValue = "rating") String sortBy,
            @RequestParam(defaultValue = "desc") String direction) {

        return bookService.getBooksByAuthorSorted(author, sortBy, direction);
    }

    // FILTER: all combined
    @GetMapping("/filter")
    public List<Book> filterBooksByAll(
            @RequestParam String author,
            @RequestParam String category,
            @RequestParam double rating
    ) {
        return bookService.filterByAll(author, category, rating);
    }
}
