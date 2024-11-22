package dataStructuresTasks;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 1, 4, 2};
		
		Set<Integer> nums = new HashSet<>();
		for (Integer number : arr) {
			if(!nums.add(number)) {
				System.out.println("Duplicate element found :" + number);
			}
		}

	}

}
