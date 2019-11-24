package com.s4ve;

public class Main {

    public static void main(String[] args) {
	// Challenge.
    // start with the base class of a vehicle, then create a car class that inherits from this base class
        // Finally, create another class, a specific type of car that inherits form the car class.
        // You should be able to hand steering, changing gears, and moving (speed and other words)
        // you will want to decide where to put the appropriate state and behaviours (fields and methods)
        // As mentioned above, changing gears, increasing and decreasing speed could be included.
        // for you specific type of vehicle you will want to add something specific for that type of car.


        Outlander outlander = new Outlander(36);
        outlander.accelerate(30);
        outlander.accelerate(20);
        outlander.accelerate(-42);

    }
}
// newClass Vehicle.java

package com.s4ve;

public class Vehicle {
    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;


    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + getCurrentDirection() + " degrees.");
    }

    public void move(int velocity, int direction) {
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);

    }

    public String getName() {
        return name;
    }
    public String getSize() {
        return size;
    }
    public int getCurrentVelocity() {
        return currentVelocity;
    }
    public int getCurrentDirection() {
        return currentDirection;
    }
    public void stop() {
    this.currentVelocity = 0;



    }
}

//// new class Car.java

package com.s4ve;

public class car extends Vehicle {

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public car(String name, String size, int wheels, int doors, int gears, boolean isManual) {

        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }
    public void changeGear(int currentGears) {
        System.out.println("Car.setCurrentGear(): Change to " + this.currentGear + " gear.");
        this.currentGear = currentGears;


    }
    public void changeVelocity(int speed, int direction) {
        System.out.println("Car.ChangeVelocity() : Velocity " + speed + " direction " + direction);
        move(speed, direction);
    }

}

//// new class Outlander.java
