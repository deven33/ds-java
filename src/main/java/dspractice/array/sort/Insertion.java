package dspractice.array.sort;

import java.util.Arrays;

/**
 * @author deven
 *
 *
 *If Key element is samller than predessor then compare all predessor elemnt and sort
 */
public class Insertion {

	public static void main(String[] args) {
		int n = 5;
		int arr[] = { 3, 2, 6, 1, 5 };
		for (int i = 1; i < arr.length; i++) {
			int j = i - 1;
			int key = arr[i];
			while (j >= 0 && arr[j] > key) {
				arr[j+1]= arr[j];
				j--;
			}	
			arr[j+1]=key;
		}
		System.out.println("Big O::O(n^2)::::"+Arrays.toString(arr));
	}

}
