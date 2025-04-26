package src;
interface MyInterface {
    // Define a method in the interface
    void displayMessage();
}
class Demo implements MyInterface {
    // Implement the method from the interface
    public void displayMessage() {
        System.out.println("Hello from the implementing class!");
    }
}
public class InterfaceDemo  {
    public static void main(String[] args) {
        // Create an instance of the class that implements the interface
        Demo myClass = new Demo();
        
        // Call the method from the interface
        myClass.displayMessage();
    }
}
