package com.greenfox.api.model.arrayhandler;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ArrayHandlerResultArray {
    private int[] result;

    public ArrayHandlerResultArray(ArrayHandler arrayHandler) {
        if (arrayHandler.getWhat().equals("double")) {
            for (int i = 0; i < arrayHandler.getNumbers().length; i++) {
                arrayHandler.getNumbers()[i] = arrayHandler.getNumbers()[i] * 2;
                this.result = arrayHandler.getNumbers();
            }
        }
    }
}
