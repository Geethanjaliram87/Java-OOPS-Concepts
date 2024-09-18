package sample.inheritance;

//Base class
class Animal {
 void eat() {
     System.out.println("This animal eats.");
 }
}

//Derived class
class Cat extends Animal {
 void meow() {
     System.out.println("Meow Meow");
 }
}

public class InheritanceExample {
 public static void main(String[] args) {
     Cat myCat = new Cat(); // Create a Cat object
     myCat.eat(); // Inherited method
     myCat.meow(); // Derived class method
 }
}
