package com.greenfoxacademy.programmerfoxclub.service;

import com.greenfoxacademy.programmerfoxclub.model.Fox;

import java.util.List;

public interface FoxService {
    void addFox(Fox fox);

    List<Fox> getFoxList();

    void setFox(String name);

    String foxName();

    Fox getFox();
}
