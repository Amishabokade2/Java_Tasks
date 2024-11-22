package basicTasks;

import java.util.Scanner;


public class Factorial {
	
	public static int fact(int n) {
		if(n ==0 || n == 1) {
			return 1;
		}
		
		return n * fact(n-1);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = scanner.nextInt();
		int result = fact(number);
		System.out.println(result);
		scanner.close();

	}

}
