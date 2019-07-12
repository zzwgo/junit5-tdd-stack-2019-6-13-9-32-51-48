package com.thoughtworks.tdd;

public class FizzBuzzWhitzz {

    public static String number(int i){
        String result="";
        if(i%3==0){
            result= "Fizz";
        }
        if(i%5==0){
            result= "Buzz";
        }
        if(i%7==0){
            result= "Whizz";
        }
        if(i%3==0&&i%5==0){
            result= "FizzBuzz";
        }
        if(result.isEmpty()){
            result= ""+i;
        }
        return  result;
    }
}
