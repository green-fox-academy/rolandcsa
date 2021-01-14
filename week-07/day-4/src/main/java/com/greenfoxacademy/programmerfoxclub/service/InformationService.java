package com.greenfoxacademy.programmerfoxclub.service;

import com.greenfoxacademy.programmerfoxclub.model.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class InformationService implements FoxService {
    private List<Fox> foxList = new ArrayList<>();
    Fox fox;

    @Override
    public void addFox(Fox fox) {
        foxList.add(fox);
    }

    @Override
    public List<Fox> getFoxList() {
        return foxList;
    }

    @Override
    public void setFox(String name) {
        Optional<Fox> optionalFox = foxList.stream().filter(f -> f.getName().equals("name")).findFirst();
        fox = optionalFox.orElseGet(() -> new Fox(name));
    }

    @Override
    public String foxName() {
        return fox.getName();
    }

    @Override
    public Fox getFox() {
        return this.fox;
    }
}
