package com.greenfox.connectionwithmysql.repository;

import com.greenfox.connectionwithmysql.model.Assignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssigneeRepository extends CrudRepository<Assignee, Long> {
}
