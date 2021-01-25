package com.greenfox.api.model.dountil;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DoUntilResult {
    private Integer result;

    public DoUntilResult(String action, Integer until) {
        if (action.equals("sum")) {
            int sum = 0;
            for (int i = 0; i <= until; i++) {
                sum = sum + i;
            }
            this.result = sum;
        }
        if (action.equals("factor")) {
            int factor = 1;
            for (int i = 1; i <= until; i++) {
                factor = factor * i;
            }
            this.result = factor;
        }
    }
}
