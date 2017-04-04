package com.AE;

/**
 * Created by Angel on 12/23/16.
 */
public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating.");
    }

    @Override
    public void breathe() {
        System.out.println("Breath in, breath out, repeat");
    }
}
