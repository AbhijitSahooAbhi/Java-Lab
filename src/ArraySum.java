package src;

import java.util.Scanner;

public class ArraySum {
    // Inputting 2 integers from keyboard and display their sum using array
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] numbers = new int[2];
        System.out.println("Enter two integers:");
        for (int i = 0; i < 2; i++) {
            numbers[i] = sc.nextInt();
        }
        int sum = numbers[0] + numbers[1];
        System.out.println("The sum is: " + sum);
    }
}
