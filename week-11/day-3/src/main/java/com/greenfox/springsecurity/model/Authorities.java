package com.greenfox.springsecurity.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Authorities {
    @Id
    private Long id;
    private String authority;

    @OneToMany(mappedBy = "authorities")
    private List<User> user;
}
