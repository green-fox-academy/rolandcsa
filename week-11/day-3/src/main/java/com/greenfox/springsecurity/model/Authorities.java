package com.greenfox.springsecurity.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Authorities {
    @Id
    private String authority;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
