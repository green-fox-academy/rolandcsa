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

    @Test
    public void getRocket() throws Exception {
        mockMvc.perform(get("/rocket"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("caliber25", is(12500)))
                .andExpect(jsonPath("caliber30", is(0)))
                .andExpect(jsonPath("caliber50", is(0)))
                .andExpect(jsonPath("shipstatus", is("full")))
                .andExpect(jsonPath("ready", is(true)))
                .andDo(print());
    }

    @Test
    public void getFillRocketWithParameters() throws Exception {
        int amount = 5000;
        mockMvc.perform(get("/rocket/fill")
                .param("caliber", ".50")
                .param("amount", Integer.toString(amount)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("received", is(".50")))
                .andExpect(jsonPath("amount", is(amount)))
                .andExpect(jsonPath("shipstatus", is("40.0%")))
                .andExpect(jsonPath("ready", is(false)))
                .andDo(print());
    }

    @Test
    public void getFillRocketWithoutParameters() throws Exception {
        mockMvc.perform(get("/rocket/fill"))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("error", is("Please provide the requested parameters.")))
                .andDo(print());
    }

    @Test
    public void getFillRocketEmptyStatus() throws Exception {
        int amount = 0;
        mockMvc.perform(get("/rocket/fill")
                .param("caliber", ".50")
                .param("amount", Integer.toString(amount)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("shipstatus", is("empty")))
                .andDo(print());
    }

    @Test
    public void getFillRocketPercentageStatus() throws Exception {
        int amount = 5000;
        mockMvc.perform(get("/rocket/fill")
                .param("caliber", ".50")
                .param("amount", Integer.toString(amount)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("shipstatus", is("40.0%")))
                .andDo(print());
    }

    @Test
    public void getFillRocketFullStatus() throws Exception {
        int amount = 12500;
        mockMvc.perform(get("/rocket/fill")
                .param("caliber", ".50")
                .param("amount", Integer.toString(amount)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("shipstatus", is("full")))
                .andDo(print());
    }

    @Test
    public void getFillRocketOverloadedStatus() throws Exception {
        int amount = 12501;
        mockMvc.perform(get("/rocket/fill")
                .param("caliber", ".50")
                .param("amount", Integer.toString(amount)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("shipstatus", is("overloaded")))
                .andDo(print());
    }

    @Test
    public void getFillRocketReadyIsTrue() throws Exception {
        int amount = 12500;
        mockMvc.perform(get("/rocket/fill")
                .param("caliber", ".50")
                .param("amount", Integer.toString(amount)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("ready", is(true)))
                .andDo(print());
    }

    @Test
    public void getFillRocketReadyIsFalse() throws Exception {
        int amount = 5000;
        mockMvc.perform(get("/rocket/fill")
                .param("caliber", ".50")
                .param("amount", Integer.toString(amount)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("ready", is(false)))
                .andDo(print());
    }
}