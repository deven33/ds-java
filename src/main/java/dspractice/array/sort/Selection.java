package dspractice.array.sort;

import java.util.Arrays;

public class Selection {

	public static void main(String[] args) {
		int n = 5;
		int arr[] = { 3, 2, 6, 1, 5 };
		for (int i = 0; i < n - 1; i++) {
			int min_pos = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[min_pos] > arr[j]) {
					min_pos = j;
				}
			}

			// Sawpping ooutside j loop
			int t = arr[min_pos];
			arr[min_pos] = arr[i];
			arr[i] = t;
		}
		System.out.println(Arrays.toString(arr));
	}

}
