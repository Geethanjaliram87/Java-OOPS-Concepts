package sample.methodoverloading;

//Class demonstrating method overloading
class MathOperations {
 // Method to add two integers
 int add(int a, int b) {
     return a + b;
 }

 // Overloaded method to add three integers
 int add(int a, int b, int c) {
     return a + b + c;
 }
}

public class MethodOverloadingExample {
 public static void main(String[] args) {
     MathOperations math = new MathOperations();
     System.out.println("Sum of 2 and 3: " + math.add(2, 3));
     System.out.println("Sum of 1, 2, and 3: " + math.add(1, 2, 3));
 }
}
