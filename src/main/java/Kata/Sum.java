package Kata;

public class Sum {

	public static int arrayPlusArray(int[] arr1, int[] arr2) {

		int sum = 0;
		
		for (int cur : arr1) {
			sum += cur; 
		}
		
		for (int cur : arr2) {
			sum += cur; 
		}
		
		return sum; 
	}
}