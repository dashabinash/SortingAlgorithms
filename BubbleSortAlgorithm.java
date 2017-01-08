package com.dash.abinash.BubbleSort;

/*
 * The below algorithm will demonstrate about the sorting of array elements using Bubble sort technique.
 */
/*
 * Time complexcity :-
 */
public class BubbleSortAlgorithm {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the size of the Array :");
		int size = sc.nextInt();

		int[] inputarr = new int[size];
		System.out.println("Entering Array elements..");
		for (int i = 0; i < inputarr.length; i++) {
			System.out.println("Enter item " + i);
			inputarr[i] = sc.nextInt();
		}

		BubbleSortAlgorithm obj = new BubbleSortAlgorithm();
		obj.sortByBubblingOverArray(inputarr);
	}

	public void sortByBubblingOverArray(int[] inputarr) throws Exception {

		if (inputarr != null) {
			System.out.println("Before sorting Array elements ..");
			for (int i : inputarr) {
				System.out.println(i);
			}

			int temp = 0;

			for (int round = 1; round <= inputarr.length - 1; round++) {
				for (int i = 0; i <= inputarr.length - 1 - round; i++) {
					if (inputarr[i] > inputarr[i + 1]) {
						temp = inputarr[i];
						inputarr[i] = inputarr[i + 1];
						inputarr[i + 1] = temp;
					}
				}
			}

			System.out.println("After sorting Array elements ..");
			for (int i : inputarr) {
				System.out.println(i);
			}
		} else {
			throw new Exception("Passed array is null .");
		}

	}
}

/*
 * Advantages :
 * 
 * 
 * Disadvantages :
 */
