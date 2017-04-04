package com.AE;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

         Parrot parrot = new Parrot("Mimita");
         parrot.breathe();
         parrot.eat();

         Penguin penguin = new Penguin("Emperor");
         penguin.eat();
         penguin.fly();


    }
}
