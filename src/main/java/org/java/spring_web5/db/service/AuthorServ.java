package org.java.spring_web5.db.service;


import java.util.List;
import java.util.Optional;

import org.java.spring_web5.db.pojo.Author;
import org.java.spring_web5.db.repo.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServ {

    @Autowired
    private AuthorRepo authorRepo;

    public List<Author> findAll() {

        return authorRepo.findAll();
    }

    public Optional<Author> findById(int id) {

        return authorRepo.findById(id);
    }

    public void save(Author author) {

        authorRepo.save(author);
    }

    public void delete(Author author) {

        authorRepo.delete(author);
    }
}