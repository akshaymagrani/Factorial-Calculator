/*
Task 2: Factorial Calculator

Write a Java program to calculate the factorial of a number entered by the user. The factorial of a number is the product of all positive integers up to that number (e.g., 5! = 5 * 4 * 3 * 2 * 1 = 120).

Requirements:

    Use Scanner to accept input from the user.
    Ensure the program handles both valid and invalid inputs (e.g., negative numbers).
    Calculate the factorial using a for loop.
    Display an appropriate message if the user enters a negative number.
*/
import java.util.Scanner;

public class FactorialCalculator {
	static int Factorial(int num) {
/*		
  		if (num == 1) {
			return 1;
		} else {
			return num * Factorial(num - 1);
		}
*/	
		int result = 1;
		for (int i = 1; i <= num; i++) {
			result *= i;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scanF = new Scanner(System.in);
		
		System.out.println("Enter a number to get its factorial: ");
		int number = scanF.nextInt();
		
		while (number < 0) {
            System.out.println("The entered number must be non-negative. Please enter a valid number: ");
            number = scanF.nextInt();
        }
		
		int factorial = Factorial(number);
		
		System.out.println("Factorial of " + number + ": " + factorial);
		
		scanF.close();
	}

}
