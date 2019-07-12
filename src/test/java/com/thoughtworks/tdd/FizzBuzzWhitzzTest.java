package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzWhitzzTest {
    @Test
    public void shouldReturn2WhenCallNumberGiven2(){
        assertEquals("2",FizzBuzzWhitzz.number(2));
    }
    @Test
    public void shouldReturnBuzzWhenCallNumberGiven5(){
        assertEquals("Buzz",FizzBuzzWhitzz.number(5));
    }
}