package sample.encapsulation;

//Class demonstrating encapsulation
class Person {
 private String name; // Private variable

 // Getter method
 public String getName() {
     return name;
 }

 // Setter method
 public void setName(String name) {
     this.name = name;
 }
}

public class EncapsulationExample {
 public static void main(String[] args) {
     Person person = new Person();
     person.setName("John Doe"); // Set name using setter
     System.out.println("Person's name is: " + person.getName()); // Get name using getter
 }
}
