package com.greenfox.connectionwithmysql.repository;

import com.greenfox.connectionwithmysql.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
}
