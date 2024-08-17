package com.example.demo.Book.db.repository;

import com.example.demo.Book.db.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface  BookRepository extends JpaRepository<BookEntity, Long> {
}
