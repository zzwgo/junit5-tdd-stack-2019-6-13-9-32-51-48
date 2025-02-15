package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzWhitzzTest {
    @Test
    public void shouldReturn2WhenCallNumberGiven2(){
        assertEquals("2",FizzBuzzWhitzz.number(2));
    }
    @Test
    public void shouldReturnFizzWhenCallNumberGiven3(){
        assertEquals("Fizz",FizzBuzzWhitzz.number(3));
    }
    @Test
    public void shouldReturnBuzzWhenCallNumberGiven5(){
        assertEquals("Buzz",FizzBuzzWhitzz.number(5));
    }
    @Test
    public void shouldReturnWhizzWhenCallNumberGiven7(){
        assertEquals("Whizz",FizzBuzzWhitzz.number(7));
    }
    @Test
    public void shouldReturnFizzBuzzWhenCallNumberGiven15(){
        assertEquals("FizzBuzz",FizzBuzzWhitzz.number(15));
    }
    @Test
    public void shouldReturnFizzWhizzWhenCallNumberGiven21(){
        assertEquals("FizzWhizz",FizzBuzzWhitzz.number(21));
    }
    @Test
    public void shouldReturnBuzzWhizzWhenCallNumberGiven35(){
        assertEquals("BuzzWhizz",FizzBuzzWhitzz.number(35));
    }
    @Test
    public void shouldReturnFizzBuzzWhizzWhenCallNumberGiven105(){
        assertEquals("FizzBuzzWhizz",FizzBuzzWhitzz.number(105));
    }
    @Test
    public void shouldReturnFizzWhenCallNumberGiven13(){
        assertEquals("Fizz",FizzBuzzWhitzz.number(13));
    }
}