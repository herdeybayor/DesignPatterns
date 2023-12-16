package com.herdeybayor;

public class User {
    public User(String name) {
        this.name = name;
    }
    public String name;

    public void sayHello() {
        System.out.println("Hi, my name is " + name);
    }
}
