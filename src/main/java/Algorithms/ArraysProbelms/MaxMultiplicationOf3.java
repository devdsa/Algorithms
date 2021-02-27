package Algorithms.ArraysProbelms;

public class MaxMultiplicationOf3 {

	public static void main(String args[]) {

		int num[] = { 1, 2, 3, 4, 5, 1 };

		int multiplication = MaxTripleMultiplication(num);

		System.out.println(multiplication);

	}

	private static int MaxTripleMultiplication(int[] num) {
		int first, second, third;
		first = second = third = Integer.MIN_VALUE;

		for (int i = 0; i < num.length; i++) {
			if (first < num[i]) {
				third = second;
				second = first;
				first = num[i];
				
				

			} else if (second < num[i]) {
				third = second;
				second = num[i];

				

			} else if (third < num[i]) {
				third = num[i];
			}

		}

		return first * second * third;
	}

}
