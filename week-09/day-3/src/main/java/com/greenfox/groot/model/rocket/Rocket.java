package com.greenfox.groot.model.rocket;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Rocket {
    private Integer caliber25;
    private Integer caliber30;
    private Integer caliber50;

    @JsonIgnore
    public Double getPercentage() {
        return ((caliber25 + caliber30 + caliber50) / 12500.0 * 100);
    }

    @JsonProperty(value = "shipstatus")
    public String getShipStatus() {
        if (getPercentage() == 0) {
            return "empty";
        } else if (getPercentage() > 0 && getPercentage() < 100) {
            return getPercentage() + "%";
        } else if (getPercentage() == 100) {
            return "full";
        }
        return "overloaded";
    }

    public Boolean getReady() {
        return getShipStatus().equals("full");
    }
}
