package com.souptik.Bookstore_Application_Zynetic.service;

import com.souptik.Bookstore_Application_Zynetic.exception.BookAlreadyExistsException;
import com.souptik.Bookstore_Application_Zynetic.model.Book;
import com.souptik.Bookstore_Application_Zynetic.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    // create a new book or register a new book
    public Book saveBook(Book book) throws BookAlreadyExistsException {
        if (bookRepository.existsByIsbn(book.getIsbn())) {
            throw new BookAlreadyExistsException("A book with ISBN " + book.getIsbn() + " already exists");
        }
        return bookRepository.save(book);
    }

    // get all the books
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // get the book by id ::
    public Book getBookById(Long id) {
        return bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book with ID " + id + " not found"));
    }

    // update the books by their id
    public Book updateBook(Long id, Book updatedBook) {
        Book existingBook = bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book with ID " + id + " not found"));

        existingBook.setName(updatedBook.getName());
        existingBook.setAuthor(updatedBook.getAuthor());
        existingBook.setPrice(updatedBook.getPrice());
        existingBook.setIsbn(updatedBook.getIsbn());

        return bookRepository.save(existingBook);
    }

    // DELETE Book by ID
    public void deleteBookById(Long id) {
        if (!bookRepository.existsById(id)) {
            throw new RuntimeException("Book with ID " + id + " does not exist");
        }
        bookRepository.deleteById(id);
    }

    public List<Book> filterByAuthor(String author) {
        return bookRepository.findByAuthorIgnoreCase(author);
    }

    public List<Book> filterByCategory(String category) {
        return bookRepository.findByCategoryIgnoreCase(category);
    }

    public List<Book> filterByRating(double rating) {
        return bookRepository.findByRatingGreaterThanEqual(rating);
    }

    public List<Book> searchByNameContaining(String keyword) {
        return bookRepository.findByNameContainingIgnoreCase(keyword);
    }

    public List<Book> filterByAll(String author, String category, double rating) {
        return bookRepository.findByAuthorIgnoreCaseAndCategoryIgnoreCaseAndRatingGreaterThanEqual(
                author, category, rating
        );
    }

    public List<Book> getBooksByAuthorSorted(String author, String sortBy, String direction) {
        Sort sort = direction.equalsIgnoreCase("desc") ? Sort.by(sortBy).descending() : Sort.by(sortBy).ascending();
        return bookRepository.findByAuthorContainingIgnoreCase(author, sort);
    }



}