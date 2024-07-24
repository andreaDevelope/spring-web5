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
    private BookshelfRepo bookshelfRepo;

    public List<Bookshelf> findAll() {

        return bookshelfRepo.findAll();
    }

    public Optional<Bookshelf> findById(int id) {

        return bookshelfRepo.findById(id);
    }

    public void save(Bookshelf bookshelf) {

        bookshelfRepo.save(bookshelf);
    }

    public void delete(Bookshelf bookshelf) {

        bookshelfRepo.delete(bookshelf);
    }
}