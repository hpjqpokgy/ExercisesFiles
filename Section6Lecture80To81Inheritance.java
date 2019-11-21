package com.s4ve;

public class Main {

    public static void main(String[] args) {
        Animal animal= new Animal("Animal", 1,1,5,5 );

        Dog dog = new Dog("Balmond ",8,28,2,4,1,20, "Long Silky");
        dog.eat();
        dog.walk();
        dog.run();

    }
}






package com.s4ve;

public class Animal {
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public void eat() {
        System.out.println("Animal.eat() called ");

    }

    public void move(int speed) {
        System.out.println("Animal.move() called. Animal moving at " + speed);

    }

    public void move () {

    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}






package com.s4ve;

import org.w3c.dom.ls.LSOutput;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called");

    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() called ");
        super.move(5);

    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called");
    }
        @Override
        public void move(int speed) {
            System.out.println("Dog.move() called");
            moveLegs(speed);
            super.move(speed);
        }
    }
