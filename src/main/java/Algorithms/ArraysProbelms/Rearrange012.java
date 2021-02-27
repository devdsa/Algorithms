package Algorithms.ArraysProbelms;

public class Rearrange012 {

	public static void main(String args[]) {

		int arr[] = { 2,1,1,0,0,0 };

		for (int i = 0; i < arr.length; i++) {
			System.out.print("  " + arr[i]);
		}

		System.out.println(" ");
		Rearrange(arr);
		System.out.println(" ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("  " + arr[i]);
		}

	}

	private static void Rearrange(int[] arr) {

		int i = 0;
		int low = 0;

		int high = arr.length -1;

		while (i <= high) {

			if (arr[i] == 0) {
				int temp = arr[low];
				arr[low++] = arr[i];
				arr[i++] = temp;

			} else if (arr[i] == 2) {
				int temp = arr[high];
				arr[high--] = arr[i];
				arr[i] = temp;

			} else if (arr[i] == 1) {

				i++;
			}

		}

	}

}
