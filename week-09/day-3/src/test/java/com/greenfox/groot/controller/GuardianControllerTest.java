package com.greenfox.groot.controller;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.hamcrest.Matchers.is;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@WebMvcTest(GuardianController.class)
public class GuardianControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getGrootWithParameter() throws Exception {
        String message = "somemessage";
        mockMvc.perform(get("/groot?message=" + message))
                .andExpect(status().isOk())
                .andExpect(jsonPath("received", is(message)))
                .andExpect(jsonPath("translated", is("I am Groot!")))
                .andDo(print());
    }

    @Test
    public void getGrootWithoutParameter() throws Exception {
        mockMvc.perform(get("/groot"))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("error", is("I am Groot!")))
                .andDo(print());
    }

    @Test
    public void getYonduWithParameters() throws Exception {
        double distance = 100.0;
        double time = 10.0;
        mockMvc.perform(get("/yondu?distance=" + distance + "&time=" + time))
                .andExpect(status().isOk())
                .andExpect(jsonPath("distance", is(distance)))
                .andExpect(jsonPath("time", is(time)))
                .andExpect(jsonPath("speed", is(distance / time)))
                .andDo(print());
    }

    @Test
    public void getYounduWithoutParameters() throws Exception {
        mockMvc.perform(get("/yondu"))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("error", is("I am Groot!")))
                .andDo(print());
    }

    @Test
    public void getYonduTimeIsZero() throws Exception {
        double distance = 100.0;
        double time = 0.0;
        mockMvc.perform(get("/yondu?distance=" + distance + "&time=" + time))
                .andExpect(status().isOk())
                .andExpect(jsonPath("distance", is(distance)))
                .andExpect(jsonPath("time", is(time)))
                .andExpect(jsonPath("speed", is("Infinity")))
                .andDo(print());
    }
}