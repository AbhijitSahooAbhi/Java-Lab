package src;

public class ThrowKeyword {
    // Demonstrating the use of the throw keyword
    public static void main(String[] args) {
        int age = 15;

        checkAge(age);
        }

        // Method to check age and throw an exception if it's less than 18
        public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be at least 18.");
        }
        System.out.println("Age is valid.");
        }
    }
