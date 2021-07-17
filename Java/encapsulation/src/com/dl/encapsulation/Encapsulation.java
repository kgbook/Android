package com.dl.encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
        var beauty = new Person("Darling", 18);
        System.out.println(beauty.toString());
        beauty.setAge(28);
        System.out.println(beauty.getName() + "'s age is " + beauty.getAge());
    }
}
