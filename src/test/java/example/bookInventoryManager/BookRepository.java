package com.example.bookinventorymanager.repository;

import com.example.bookinventorymanager.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByAuthor(String author);
    List<Book> findByAvailableTrue();
}