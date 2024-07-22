package org.java.spring_web5.db.repo;

import org.java.spring_web5.db.pojo.Bookshelf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookshelfRepo extends JpaRepository<Bookshelf, Integer>{

}
