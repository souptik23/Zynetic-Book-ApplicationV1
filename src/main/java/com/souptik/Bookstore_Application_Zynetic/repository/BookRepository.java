package com.souptik.Bookstore_Application_Zynetic.repository;

import com.souptik.Bookstore_Application_Zynetic.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    boolean existsByIsbn(String isbn);
}
