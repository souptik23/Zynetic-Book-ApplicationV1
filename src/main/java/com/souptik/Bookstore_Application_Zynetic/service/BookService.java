package com.souptik.Bookstore_Application_Zynetic.service;

import com.souptik.Bookstore_Application_Zynetic.exception.BookAlreadyExistsException;
import com.souptik.Bookstore_Application_Zynetic.model.Book;
import com.souptik.Bookstore_Application_Zynetic.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book saveBook(Book book) throws BookAlreadyExistsException {
        if (bookRepository.existsByIsbn(book.getIsbn())) {
            throw new BookAlreadyExistsException("A book with ISBN " + book.getIsbn() + " already exists");
        }
        return bookRepository.save(book);
    }
}