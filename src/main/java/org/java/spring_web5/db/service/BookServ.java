package org.java.spring_web5.db.service;

import java.util.List;
import java.util.Optional;

import org.java.spring_web5.db.pojo.Book;
import org.java.spring_web5.db.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServ {
    @Autowired
    BookRepo br;

    public List<Book> getAll(){
        return br.findAll();
    }

    public Optional<Book> findById(int id){
        return br.findById(id);
    }

    public void save(Book b){
        br.save(b);
    }

    public void delete(Book b){
        br.delete(b);
    }

}
