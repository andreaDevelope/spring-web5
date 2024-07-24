package org.java.spring_web5.db.web.controller;

import java.util.List;

import org.java.spring_web5.db.pojo.Bookshelf;
import org.java.spring_web5.db.service.BookshelfServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/v1/bookshelfs")
@CrossOrigin("http://localhost:5173")
public class BookshelfController {

    @Autowired
    private BookshelfServ bookshelfServ;

    @GetMapping("")
    public ResponseEntity<List<Bookshelf>> getMethodName() {

        List<Bookshelf> bookshelfs = bookshelfServ.findAll();

        bookshelfs.forEach(bs -> System.out.println(bs + "\n" + bs.getBooks()));

        return ResponseEntity.ok(bookshelfs);
    }

}
