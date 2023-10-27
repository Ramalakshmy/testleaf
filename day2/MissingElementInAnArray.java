package week3.day2;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,8};
		//1+2+3+4+6+7+8=31
		//1+2+3+4+5+6+7+8=36
		//31-36=5 missing
		int sum1=0;
		for (int i = 0; i < arr.length; i++) {
			sum1=sum1+arr[i];
			
		}
		System.out.println("sum of elements in array: "+sum1);
		int sum2=0;
		for (int i = 0; i <=8; i++) {
			sum2=sum2+i;
			
		}
		
          System.out.println("sum of range of elements in array: "+sum2);
          System.out.println("missing number is: "+(sum2-sum1));
	}
	
	
	
	
	
	

}
