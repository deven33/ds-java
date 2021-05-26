package dspractice.search.binarysearch;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { -22, 4, 2, 7, 1 };
		// Value to be searched
		int t = 0;
		// Sort Array
		int index = binarySearch(arr, t);
		if (index != -1) {
			System.out.println("found");
		} else {
			System.out.println("Not Found");
		}

	}

	private static int binarySearch(int[] arr, int t) {
		Arrays.sort(arr);
		int start = 0;
		int end = arr.length;

		while (start < end) {
			int mid = (start + end) / 2;
			if (arr[mid] == t) {
				return mid;
			} else if (arr[mid] < t) {
				start = mid + 1;
			} else {
				end = mid;
			}
		}
		return -1;
	}

}
