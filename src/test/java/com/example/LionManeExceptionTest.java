package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class LionManeExceptionTest {
    @Test
    public void checkExeption2() {
        Feline feline = new Feline();
        Exception actualExeption = assertThrows(Exception.class, () ->
                new Lion("Самей", feline));
        assertEquals("Используйте допустимые значения пола животного - самей или самка", actualExeption.getMessage());
    }
}
