package basicTasks;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of terms : ");
		int n = scanner.nextInt();
		
		int first = 0;
		int second = 1;
		
		for(int i=0; i<n; i++) {
			System.out.print(first + " ");
			
			int third = first + second;
			first = second;
			second = third;
		}
		
		scanner.close();

	}

}
