package arraymaxsum;

import java.util.Scanner;

public class ArrayMaxSum {
	private static Scanner inputArray;
	
	public static void main(String[] args) {
		System.out.println("输入数组个数:");
		inputArray = new Scanner(System.in);
		int length = inputArray.nextInt();
		int[] array = new int[length];
		System.out.println("输入数字:");
		for(int i = 0; i < length; i++) {
			array[i] = inputArray.nextInt();
		}
		int result = arrayMaxSum(array);
		//System.out.println(array[2]);
		System.out.println("最大子数组和:"+result);
		
	}
	
	public static int arrayMaxSum(int[] array) {
		if (array.length == 0 || array == null) {
			return 0;
		}
		int sum = 0;
		int max = 0;
		for(int i = 0; i < array.length; i++) {
			if(sum <= 0) {
				
				sum = array[i];
			}
			else {
				sum += array[i];	
			}
			if(sum>max) {
				max = sum;	
			}
		}
		return max;
	}
}
