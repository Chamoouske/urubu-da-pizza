package com.pizza.urubu.utils;

import java.util.function.Consumer;

public class DoIfNotNull {
    private DoIfNotNull() {
    }

    public static <T> void doIfNotNull(Consumer<T> consumer, T value) {
        if (value != null) {
            consumer.accept(value);
        }
    }
}
