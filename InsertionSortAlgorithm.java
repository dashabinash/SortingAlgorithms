package com.dash.abinash.InsertionSort;

/*
 * The below code snippet will demonstrate about the technique of Insertion sort alforithm.
 */
public class InsertionSortAlgorithm {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the size of the Array :");
		int size = sc.nextInt();

		int[] inputarr = new int[size];
		System.out.println("Entering Array elements..");
		for (int i = 0; i < inputarr.length; i++) {
			System.out.println("Enter item for position :" + " " + i);
			inputarr[i] = sc.nextInt();
		}

		InsertionSortAlgorithm obj = new InsertionSortAlgorithm();
		obj.sortByInsertingOverArray(inputarr);

	}

	public void sortByInsertingOverArray(int[] inputarr) {

		System.out.println("Display of Array elements before sorting..");
		for (int i : inputarr) {
			System.out.println(i);
		}

		int temp;
		int j;
		for (int i = 1; i < inputarr.length; i++) {
			temp = inputarr[i];
			for (j = i - 1; j >= 0 && temp < inputarr[j]; j--) {
				inputarr[j + 1] = inputarr[j];
			}
			inputarr[j + 1] = temp;

		}
		System.out.println("Display of Array elements after sorting..");
		for (int i : inputarr) {
			System.out.println(i);
		}
	}
}
