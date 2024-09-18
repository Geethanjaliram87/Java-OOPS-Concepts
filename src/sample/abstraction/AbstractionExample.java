package sample.abstraction;

//Abstract class
abstract class Animal {
 abstract void makeSound(); // Abstract method

 void sleep() { // Regular method
     System.out.println("This animal sleeps.");
 }
}

//Concrete class
class Dog extends Animal {
 void makeSound() {
     System.out.println("Woof Woof");
 }
}

public class AbstractionExample {
 public static void main(String[] args) {
     Animal myDog = new Dog(); // Create a Dog object
     myDog.makeSound(); // Call abstract method
     myDog.sleep(); // Call regular method
 }
}
