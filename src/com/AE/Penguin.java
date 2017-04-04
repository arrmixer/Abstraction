package com.AE;

/**
 * Created by Angel on 12/23/16.
 */
public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("can't fly, I swim");
    }
}
