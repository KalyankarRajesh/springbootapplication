package com.microfocus.springbootapplication.repositories;

import com.microfocus.springbootapplication.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
