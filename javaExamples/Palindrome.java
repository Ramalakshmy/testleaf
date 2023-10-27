package javaExamples;

public class Palindrome {
	public static void main(String[] args) {
		String data="race a car";
		String[] split = data.split("");
		for (int i = 0; i < split.length; i++) {
			System.out.print(split[i]);
			
		}
		System.out.println(" ");
		for (int i = split.length-1; i >=0; i--) {
			char[] ch = split[i].toCharArray();
			for (int j = ch.length-1; j >=0; j--) {
				System.out.print   (ch[j]);
				
			}
			
			
		}
	}

}
