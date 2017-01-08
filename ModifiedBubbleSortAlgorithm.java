package com.dash.abinash.ModifiedBubbleSort;

/*
 * The below code snippet will demonstrate about the technique of modified Bubble sort algorithm.
 */
public class ModifiedBubbleSortAlgorithm {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the size of the Array :");
		int size = sc.nextInt();

		int[] inputarr = new int[size];
		System.out.println("Entering Array elements..");
		for (int i = 0; i < inputarr.length; i++) {
			System.out.println("Enter item " + i);
			inputarr[i] = sc.nextInt();
		}

		ModifiedBubbleSortAlgorithm obj = new ModifiedBubbleSortAlgorithm();
		obj.sortByBubblingOverArray(inputarr);
		System.out.println("After sorting Array elements..");
		for (int i : inputarr) {
			System.out.println(i);
		}
	}

	public void sortByBubblingOverArray(int[] inputarr) {

		System.out.println("Before sorting Array elements..");
		for (int i : inputarr) {
			System.out.println(i);
		}

		int flag;
		int temp = 0;
		for (int round = 1; round <= inputarr.length - 1; round++) {
			flag = 0;
			for (int i = 0; i <= inputarr.length - 1 - round; i++) {
				if (inputarr[i] > inputarr[i + 1]) {
					flag = 1;
					temp = inputarr[i];
					inputarr[i] = inputarr[i + 1];
					inputarr[i + 1] = temp;
				}
			}

			if (flag == 0) {
				System.out.println("No of pass happened :" + round);
				return;
			}
		}

	}

}
