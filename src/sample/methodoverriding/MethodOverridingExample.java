package sample.methodoverriding;

//Base class
class Vehicle {
 void start() {
     System.out.println("Vehicle starts.");
 }
}

//Derived class
class Car extends Vehicle {
 @Override
 void start() { // Overridden method
     System.out.println("Car starts.");
 }
}

public class MethodOverridingExample {
 public static void main(String[] args) {
     Vehicle myCar = new Car(); // Upcasting
     myCar.start(); // Calls overridden method in Car class
 }
}
