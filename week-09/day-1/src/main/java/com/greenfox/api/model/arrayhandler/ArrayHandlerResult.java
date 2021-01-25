package com.greenfox.api.model.arrayhandler;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;

@Getter
@Setter
@NoArgsConstructor
public class ArrayHandlerResult {
    private int result;

    public ArrayHandlerResult(ArrayHandler arrayHandler) {
        if (arrayHandler.getWhat().equals("sum")) {
            this.result = Arrays.stream(arrayHandler.getNumbers()).sum();
        }
        if (arrayHandler.getWhat().equals("multiply")) {
            int result = 1;
            for (int i = 0; i < arrayHandler.getNumbers().length; i++) {
                result = result * arrayHandler.getNumbers()[i];
            }
            this.result = result;
        }
    }
}
