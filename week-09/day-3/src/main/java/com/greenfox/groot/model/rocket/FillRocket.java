package com.greenfox.groot.model.rocket;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FillRocket {
    private String received;
    private Integer amount;
    @JsonProperty(value = "shipstatus")
    private String shipStatus;
    private Boolean ready;
}
