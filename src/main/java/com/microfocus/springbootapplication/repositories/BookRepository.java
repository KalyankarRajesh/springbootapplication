package com.microfocus.springbootapplication.repositories;

import com.microfocus.springbootapplication.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
