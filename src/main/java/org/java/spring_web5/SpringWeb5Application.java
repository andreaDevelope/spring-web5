package org.java.spring_web5;

import java.util.Arrays;
import java.util.List;

import org.java.spring_web5.db.pojo.Author;
import org.java.spring_web5.db.pojo.Book;
import org.java.spring_web5.db.pojo.Bookshelf;
import org.java.spring_web5.db.service.AuthorServ;
import org.java.spring_web5.db.service.BookServ;
import org.java.spring_web5.db.service.BookshelfServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringWeb5Application /*implements CommandLineRunner*/{
	// @Autowired
	// private AuthorServ authorServ;

	// @Autowired
	// private BookServ bookServ;

	// @Autowired
	// private BookshelfServ bookshelfServ;

	public static void main(String[] args) {
		SpringApplication.run(SpringWeb5Application.class, args);
	}

// 	@Override
// 	public void run(String... args) throws Exception {

// 		Author author1 = new Author("Mario", "Rossi");
// 		Author author2 = new Author("Luigi", "Verdi");
// 		Author author3 = new Author("Giovanni", "Bianchi");

// 		authorServ.save(author1);
// 		authorServ.save(author2);
// 		authorServ.save(author3);

// 		System.out.println(author1);
// 		System.out.println("--------------------------");
// 		System.out.println(author2);
// 		System.out.println("--------------------------");
// 		System.out.println(author3);
// 		System.out.println("--------------------------");

// 		Book book1 = new Book("Il libro", author1);
// 		Book book2 = new Book("Il libro 2", author1);
// 		Book book3 = new Book("Il libro 3", author2);
// 		Book book4 = new Book("Il libro 4", author3);

// 		bookServ.save(book1);
// 		bookServ.save(book2);
// 		bookServ.save(book3);
// 		bookServ.save(book4);

// 		System.out.println(book1);
// 		System.out.println("--------------------------");
// 		System.out.println(book2);
// 		System.out.println("--------------------------");
// 		System.out.println(book3);
// 		System.out.println("--------------------------");
// 		System.out.println(book4);
// 		System.out.println("--------------------------");

// 		List<Book> bookList1 = Arrays.asList(book1, book2);
// 		List<Book> bookList2 = Arrays.asList(book3, book4);
// 		List<Book> bookList3 = Arrays.asList(book1, book3);

// 		Bookshelf bookshelf1 = new Bookshelf("Libreria 1", "Via Roma 1", bookList1);
// 		Bookshelf bookshelf2 = new Bookshelf("Libreria 2", "Via Roma 2", bookList2);
// 		Bookshelf bookshelf3 = new Bookshelf("Libreria 3", "Via Roma 3", bookList3);

// 		bookshelfServ.save(bookshelf1);
// 		bookshelfServ.save(bookshelf2);
// 		bookshelfServ.save(bookshelf3);

// 		System.out.println(bookshelf1);
// 		System.out.println("--------------------------");
// 		System.out.println(bookshelf2);
// 		System.out.println("--------------------------");
// 		System.out.println(bookshelf3);
// 		System.out.println("--------------------------");
// 	}
}
