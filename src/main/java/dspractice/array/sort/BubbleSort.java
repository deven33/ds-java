package dspractice.array.sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int n = 5;
		int arr[] = { 3, 2, 6, 1, 5 };
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int t = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}
		}
		System.out.print("Big O:: O(n^2):::: ");
		System.out.println(Arrays.toString(arr));	
	}

}
