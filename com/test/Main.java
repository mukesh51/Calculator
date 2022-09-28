package com.test;

public class Main {
    public static void main(String args[]) {
       System.out.println("Hello World");
       System.out.println(greet());
       System.out.println(greetUser("Aarti"));
}

public String greet() {
    return "How are you";
}

public String greetUser(String name) {
    return "How are you" + name;
}

}

