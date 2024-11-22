package dataStructuresTasks;

public class SecondLargest {

	public static void main(String[] args) {
		int arr[] = {10, 20, 4, 45, 99};
		
		int n = arr.length;
		
		boolean swapped = false;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i-1; j++) {
				if(arr[j] < arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
			
			if(!swapped) {
				break;
			}
		}
		
		System.out.println("Second largest element : " + arr[1] );

	}

}
