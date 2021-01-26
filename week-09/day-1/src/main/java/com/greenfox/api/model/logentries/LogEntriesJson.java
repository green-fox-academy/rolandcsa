package com.greenfox.api.model.logentries;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class LogEntriesJson {
    @JsonProperty(value = "entries")
    private List<LogEntries> logEntries;
    @JsonProperty(value = "entry_count")
    private Integer entryCount;

    public LogEntriesJson(List<LogEntries> logEntries, Integer entryCount) {
        this.logEntries = logEntries;
        this.entryCount = entryCount;
    }
}
