package com.sma.springbootmongoapi.repository;

import com.sma.springbootmongoapi.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, String> {

    @Override
    void delete(Todo deleted);
}