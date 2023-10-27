package javaExamples;

import org.openqa.selenium.devtools.v114.input.Input;

public class LastStringLength {

	public static void main(String[] args) {
		String input="Hello World";
		int length = input.length();
		
		String[] split = input.split(" ");
		int arrlen = split.length;
		System.out.println("The last word of the input is: "+split[arrlen-1]);
		char[] ch = split[arrlen-1].toCharArray();
		int lastlen = ch.length;
		System.out.println("The last word is: "+lastlen);
		
		String input1="fly me to the moon";
		int length1 = input1.length();
		String[] split1 = input1.split(" ");
		int arrlen1 = split1.length;
		System.out.println("The last word of the input is: "+split1[arrlen1-1]);
		char[] ch1 = split1[arrlen1-1].toCharArray();
		int lastlen1 = ch1.length;
		System.out.println("The last word is: "+lastlen1);
		
		String input2="iuffy is still joyboy";
		int length2 = input2.length();
		String[] split2 = input2.split(" ");
		int arrlen2 = split2.length;
		System.out.println("The last word of the input is: "+split2[arrlen2-1]);
		char[] ch2 = split2[arrlen2-1].toCharArray();
		int lastlen2 = ch2.length;
		System.out.println("The last word is: "+lastlen2);
		
	}

	
	
}
