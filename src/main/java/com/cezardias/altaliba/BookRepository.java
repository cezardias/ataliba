package com.cezardias.altaliba;

import com.cezardias.altaliba.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
