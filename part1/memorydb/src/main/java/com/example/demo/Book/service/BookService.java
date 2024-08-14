package com.example.demo.Book.service;


import com.example.demo.Book.db.entity.BookEntity;
import com.example.demo.Book.db.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService  {
    private final BookRepository bookRepository;
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // create , update
    public BookEntity create(BookEntity book) {
        return bookRepository.save(book);
    }

    // all
    public List<BookEntity> findAll() {
        return bookRepository.findAll();
    }

    // delete

    // find one
}
