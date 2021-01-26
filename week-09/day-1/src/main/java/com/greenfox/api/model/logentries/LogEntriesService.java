package com.greenfox.api.model.logentries;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogEntriesService {
    private final LogEntriesRepository logEntriesRepository;

    @Autowired
    public LogEntriesService(LogEntriesRepository logEntriesRepository) {
        this.logEntriesRepository = logEntriesRepository;
    }

    public void newEntry(LogEntries logEntries) {
        logEntriesRepository.save(logEntries);
    }

    public List<LogEntries> findAll() {
        return (List<LogEntries>) logEntriesRepository.findAll();
    }
}
