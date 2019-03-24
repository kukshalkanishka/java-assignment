package com.step.matrix;

public class Number<T> {
    private T value;

    private Number(T value) {
        this.value = value;
    }

    public static Number createNumber(Object value) throws Exception {
        if (!(value instanceof Integer)) {
            throw new Exception("Invalid number");
        }
            return new Number(value);
    }
}
