package com.dash.abinash.CountingSort;

/*
 * Reference :- https://www.youtube.com/watch?v=5rLrRpcBCzo
 *              https://www.youtube.com/watch?v=bbUqXF5pSD0
 */
public class CountingSortAlgorithm {
	public static void main(String[] args) throws java.lang.Exception {
		// int[] A={0,3,2,3,3,0,5,2,3}; //0<=A[j]<=5
		 //int k= 5;
		int[] A = { 12, 5, 13, 20, 16, 19, 8,234,789,250,125,897 }; // 5<=A[j]<=20
		int k = 897;

		CountingSortAlgorithm obj = new CountingSortAlgorithm();
		obj.countSort(A, k);
	}

	public void countSort(int[] A, int k) {

		int[] C = new int[k + 1];
		int[] newC = new int[k + 1];
		int[] B = new int[A.length];
		int sum;
		int count;
		for (int i = 0; i < C.length; i++) {
			count = 0;
			for (int j = 0; j < A.length; j++) {
				if (i == A[j]) {
					count++;
				}
			}
			C[i] = count;
		}

		System.out.println("Display of C array elements..");
		for (int i : C) {
			System.out.print(i + " ");
		}

		for (int i = 0; i < newC.length; i++) {
			sum = 0;
			for (int j = i; j >= 0; j--) {
				sum = sum + C[j];
			}
			newC[i] = sum;
		}
		System.out.println();
		System.out.println("Display of newC array elements..");
		for (int i : newC) {
			System.out.print(i + " ");
		}

		for (int i = A.length - 1; i >= 0; i--) {
			int index = newC[A[i]];
			B[index - 1] = A[i];
			newC[A[i]] = newC[A[i]] - 1;
		}

		System.out.println();
		System.out.println("After sorting all the elements...");
		for (int i : B) {
			System.out.print(i + " ");
		}

	}
}
