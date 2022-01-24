package com.codedifferently.labs.lab16.part_a.examples.account.example01;

public class Person {
    public String name;
    public int age;
    public String address;

    public String greet(String personToGreet){
        return name + " says `Hello " + personToGreet +", how are you?`";
    }

    public String tellJoke(){
        return "What has two thumbs and writes bad code? .... " + name +"!";
    }
}
