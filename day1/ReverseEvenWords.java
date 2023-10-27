package week3.day1;

public class ReverseEvenWords {
	public static void main(String[] args) {
		String test = "I am a software tester"; 
		String[] split = test.split(test);
		for (int i = 0; i < split.length; i++) {
			if (i%2!=0) {
				char[] ch = split[i].toCharArray();
				String rev=" ";
				for (int j = ch.length-1; j >=0; j--) {
					rev=rev+ch[j];
				
				}
				System.out.println(rev+" ");
				
				
			}
			else {
				
				System.out.println(split[i]+" ");
			}
			
		}
	}

}
