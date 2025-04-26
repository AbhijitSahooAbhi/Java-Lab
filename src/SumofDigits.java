package src;
import java.util.Scanner;
public class SumofDigits {
    //Enter a number from key board and display sum of digits of the number using array 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        int[] digits = new int[10];
        int i = 0;

        while (num > 0) {
            digits[i] = num % 10;
            sum += digits[i];
            num /= 10;
            i++;
        }

        System.out.println("Sum of digits: " + sum);
    }

}
