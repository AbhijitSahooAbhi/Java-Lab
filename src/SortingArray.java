package src;
import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {
    
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);
        System.out.println("Sorted numbers in ascending order:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

}
