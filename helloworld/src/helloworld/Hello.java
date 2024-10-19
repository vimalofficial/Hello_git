package helloworld;

//Define the class Hello
public class Hello {

 // Instance method to print the message
 public void printMessage() {
     System.out.println("Hello, World!");
 }

 // Main method to run the program
 public static void main(String[] args) {
     // Create an object (instance) of the Hello class
     Hello hello = new Hello();
     
     // Call the printMessage method using the object
     hello.printMessage();
 }
}
