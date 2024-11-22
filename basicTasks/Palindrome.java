package basicTasks;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = scanner.nextInt();
		int original_num = num;
		int reverse_of_num = 0;
		
		while(num !=0) {
			int digit = num % 10;
			reverse_of_num = reverse_of_num * 10 + digit;
			num = num / 10;
		}
		
		if(original_num == reverse_of_num) {
			System.out.println(original_num + " is a palindrome number");
		}
		else {
			System.out.println(original_num + " is not a palindrome number");
		}

		scanner.close();
	}

}
