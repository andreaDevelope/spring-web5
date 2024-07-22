package org.java.spring_web5.db.web.controller;

import java.util.List;

import org.java.spring_web5.db.pojo.Author;
import org.java.spring_web5.db.pojo.Book;
import org.java.spring_web5.db.pojo.Bookshelf;
import org.java.spring_web5.db.service.AuthorServ;
import org.java.spring_web5.db.service.BookServ;
import org.java.spring_web5.db.service.BookshelfServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/v1/bookshelfs")
@CrossOrigin(origins = "http://localhost:5173")
public class MainBookshelfController{
    @Autowired
    AuthorServ as;

    @Autowired
    BookServ bs;

    @Autowired
    BookshelfServ bss;

    @GetMapping("/test/add")
    public ResponseEntity<Void> testAdd(){
        // CREO E SALVO GLI AUTORI
        Author a1 = new Author("Giacomo", "Leopardi");
        Author a2 = new Author("Pier Paolo", "Pasolini");
        Author a3 = new Author("Dante", "Aghilieri");
        as.save(a1);
        as.save(a2);
        as.save(a3);

        // CREO E SALVO I LIBRI
        Book b1 = new Book("La Divina Commedia", a3);
        Book b2 = new Book("Canti", a1);
        Book b3 = new Book("Ragazzi di Vita", a2);
        bs.save(b1);
        bs.save(b2);
        bs.save(b3);

        // CREO LISTE DI BOOK PER SALVARLE IL BOOKSHELF
        List<Book> bList1 = List.of(b1, b2);
        List<Book> bList2 = List.of(b1, b3);
        List<Book> bList3 = List.of(b2, b3);



        // CREO BOOKSHELF E LI SALVO
        Bookshelf bs1 = new Bookshelf("Libreria Centrale di Roma", "Via Non Leggo Molto", bList1);
        Bookshelf bs2 = new Bookshelf("Libreria Centrale di Milano", "Via Ascolto Solo Podcast", bList2);
        Bookshelf bs3 = new Bookshelf("Libreria Centrale di Torino", "Via Se Mi Paghi Lo Leggo", bList3);
        bss.save(bs1);
        bss.save(bs2);
        bss.save(bs3);

        return ResponseEntity.ok().build();
    }

    @GetMapping("")
    public ResponseEntity<List<Bookshelf>> getAll(){
        List<Bookshelf> bookshelfs = bss.getAll();
        return ResponseEntity.ok(bookshelfs);
    }
}
