package com.greenfox.api.model.logentries;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogEntriesRepository extends CrudRepository<LogEntries, Long> {
}
