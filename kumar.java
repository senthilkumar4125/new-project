// A simple Java program to add two numbers
import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter two numbers
        System.out.print("Enter first number: ");
        int num1 = input.nextInt(); // Reads the first number

        System.out.print("Enter second number: ");
        int num2 = input.nextInt(); // Reads the second number

        // Calculate the sum of two numbers
        int sum = num1 + num2;

        // Display the result
        System.out.println("The sum is: " + sum);
        
        // Close the scanner
        input.close();
    }
}
