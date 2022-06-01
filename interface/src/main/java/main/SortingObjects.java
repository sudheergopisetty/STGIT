package main;

import java.util.Arrays;

public class SortingObjects {

	public static void main(String[] args) {
		int[] intArray = {6,2,9,4,5};
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		Arrays.sort(intArray);
		System.out.println("g");
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}

}
