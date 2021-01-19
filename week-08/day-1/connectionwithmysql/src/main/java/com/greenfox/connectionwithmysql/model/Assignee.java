package com.greenfox.connectionwithmysql.model;

import javax.persistence.*;

@Entity
public class Assignee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    @OneToOne
    private Todo todo;

    public Assignee() {

    }

    public Assignee(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
