package com.souptik.Bookstore_Application_Zynetic.repository;

import com.souptik.Bookstore_Application_Zynetic.model.Book;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByAuthorIgnoreCase(String author);
    List<Book> findByCategoryIgnoreCase(String category);
    List<Book> findByRatingGreaterThanEqual(double rating);
    List<Book> findByNameContainingIgnoreCase(String keyword);
    List<Book> findByAuthorContainingIgnoreCase(String author, Sort sort);

    List<Book> findByAuthorIgnoreCaseAndCategoryIgnoreCaseAndRatingGreaterThanEqual(
            String author, String category, double rating
    );
    boolean existsByIsbn(String isbn);
}
