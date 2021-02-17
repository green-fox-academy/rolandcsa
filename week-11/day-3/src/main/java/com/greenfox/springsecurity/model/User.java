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
@Table(name = "users")
public class User {
    @Id
    private String username;
    private String password;
    private Boolean enabled;

    @OneToMany(mappedBy = "user")
    private List<Authorities> authorities;

}
