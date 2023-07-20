package week1.day3;

import java.util.Arrays;

public class ArrayMinAndMaxValue {
	public static void main(String[] args) {
	
		int [] amount = {45,567,67,8787,5657,23,19};
		int length = amount.length;
		Arrays.sort(amount);
		int minval = amount[0];
		System.out.println("The minimum value of this array is: "+minval);
		int i=amount[length-1];
		System.out.println("The maximum value of this array is: "+i);
		int j=amount[length-2];
		System.out.println("The second largest value of this array is: "+j);
		}
	}

