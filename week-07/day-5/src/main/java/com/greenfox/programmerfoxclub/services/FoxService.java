package com.greenfox.programmerfoxclub.services;

import com.greenfox.programmerfoxclub.model.Fox;

import java.util.ArrayList;
import java.util.List;

public class FoxService {
    private List<Fox> foxes = new ArrayList<>();

    public List<Fox> getFoxes() {
        return foxes;
    }
}
