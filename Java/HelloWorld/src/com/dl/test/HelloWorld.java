package com.dl.test;

abstract class Lover {
    protected String name = "Darling";
    public int age = 29;

    public abstract void declareLove();

    public void sayName() {
        System.out.println(name);
    }

    void sayAge() {
        System.out.println(age);
    }
}

class Mary extends Lover {
    public void declareLove() {
        System.out.println(name + ", I love you!");
    }
}

public class HelloWorld {
    public static void main(String[] args) {
        var obj = new Mary();
        obj.declareLove();
        obj.sayName();
        obj.sayAge();
//        System.out.println("name:" + obj.name);
        System.out.println("age:" + obj.age);
    }
}
