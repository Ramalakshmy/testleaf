package week1.day2;

import java.util.Arrays;

public class SmallestNo {
	public static void main(String[] args) {
		int[]num= {23,45,67,32,89,22};
		int n=num.length;
		Arrays.sort(num);
		System.out.println("The smallest number is "+num[1]); 
	}
	

}
