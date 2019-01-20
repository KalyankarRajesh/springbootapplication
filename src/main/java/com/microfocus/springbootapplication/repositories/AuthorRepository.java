package com.microfocus.springbootapplication.repositories;

import com.microfocus.springbootapplication.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
