package com.example.demo.Book.db.repository;

import com.example.demo.Book.db.entity.BookEntity;
import com.example.demo.db.SimpleDataRepository;
import org.springframework.stereotype.Service;

@Service
public class BookRepository extends SimpleDataRepository<BookEntity, Long> {
}
