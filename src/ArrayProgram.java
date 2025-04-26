package src;

public class ArrayProgram {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {18, 26, 28, 61, 64};

        // Print the elements of the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Calculate the sum of the elements in the array
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of array elements: " + sum);
    }   
}
