package org.java.spring_web5.db.service;

import java.util.List;
import java.util.Optional;

import org.java.spring_web5.db.pojo.Book;
import org.java.spring_web5.db.pojo.Bookshelf;
import org.java.spring_web5.db.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServ {

    @Autowired
    private BookRepo bookRepo;

    public List<Book> findAll() {

        return bookRepo.findAll();
    }

    public List<Book> findByBookshelf(Bookshelf bookshelf) {

        return bookRepo.findByBookshelfs(bookshelf);
    }

    public Optional<Book> findById(int id) {

        return bookRepo.findById(id);
    }

    public void save(Book book) {

        bookRepo.save(book);
    }

    public void delete(Book book) {

        bookRepo.delete(book);
    }
}