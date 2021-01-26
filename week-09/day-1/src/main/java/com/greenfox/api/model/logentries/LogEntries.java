package com.greenfox.api.model.logentries;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class LogEntries {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date createdAt;
    private String endpoint;
    private String data;

    public LogEntries(String endpoint, String data) {
        Date date = new Date();
        this.createdAt = new Timestamp(date.getTime());
        this.endpoint = endpoint;
        this.data = data;
    }
}
