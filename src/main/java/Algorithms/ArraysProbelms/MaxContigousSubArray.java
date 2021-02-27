package Algorithms.ArraysProbelms;

public class MaxContigousSubArray {

	public static void main(String[] args) {

		int[] arr = { -2, -3,-3, -2, 7,8,-5, -3 };

		int sum = findMaxSumContigous(arr);

		System.out.println(sum); 
	}

	private static int findMaxSumContigous(int[] arr) {

		int sum = 0, currentsum = 0, Maxsum = Integer.MIN_VALUE;

		int max_ending = 0;

		for (int i = 0; i < arr.length; i++) {

			currentsum = currentsum+arr[i];
			if (Maxsum < currentsum)
				Maxsum=currentsum;
			
			if(currentsum<0)
				currentsum=0;

		}

		return Maxsum;
	}

}
