package com.greenfox.api.repository;

import com.greenfox.api.model.logentries.LogEntries;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogEntriesRepository extends CrudRepository<LogEntries, Long> {
}
