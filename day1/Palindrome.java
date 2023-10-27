package week3.day1;

public class Palindrome {
	public static void main(String[] args) {
		String value="madam";
		char[] ch = value.toCharArray();
		String rev="";
		for (int i = ch.length-1; i >=0; i--) {
			rev=rev+ch[i];	
		}
		System.out.println(rev);
		if (value.equalsIgnoreCase(rev)) {
			System.out.println("The given is string a palindrome");
			
		} else {
			System.out.println("The given is string not a palidrome");

		}
		
	
		
		
		
	}

}
