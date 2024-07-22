package org.java.spring_web5.db.service;

import java.util.List;
import java.util.Optional;

import org.java.spring_web5.db.pojo.Bookshelf;
import org.java.spring_web5.db.repo.BookshelfRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookshelfServ {
    @Autowired
    BookshelfRepo bsr;

    public List<Bookshelf> getAll(){
        return bsr.findAll();
    }

    public Optional<Bookshelf> getById(int id){
        return bsr.findById(id);
    }

    public void save(Bookshelf b){
        bsr.save(b);
    }

    public void delete(Bookshelf b){
        bsr.delete(b);
    }

}
