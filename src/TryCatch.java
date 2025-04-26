package src;

public class TryCatch {
    // use try-catch to handle exceptions
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int index = 10; // This index is out of bounds for the array

        try {
            // Attempt to access an element at an invalid index
            System.out.println("Accessing element: " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the exception
            System.out.println("Error: " + e.getMessage());
        } 
}
}