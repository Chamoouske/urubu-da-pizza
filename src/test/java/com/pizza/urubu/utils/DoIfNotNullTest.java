package com.pizza.urubu.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class DoIfNotNullTest {

    @Test
    void doIfNotNull() {
        ToTest toTest = new ToTest(2);
        DoIfNotNull.doIfNotNull(toTest::setValor, 10);
        assertEquals(10, toTest.getValor());

        DoIfNotNull.doIfNotNull(toTest::setValor, null);
        assertEquals(10, toTest.getValor());
    }

    static class ToTest {
        private Integer valor;

        public ToTest(Integer valor) {
            this.valor = valor;
        }

        public Integer getValor() {
            return valor;
        }

        public void setValor(Integer valor) {
            this.valor = valor;
        }
    }
}