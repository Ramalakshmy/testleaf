package week3.day2;


public class FindCharCount {
	public static void main(String[] args) {
		String data="Aadhaar Card";
		char targetChar='a';
		int count=0;
		for (int i = 0; i <data.length(); i++) {
			if (data.charAt(i)==targetChar) {
				count++;
				
				
			}
			
		}
		System.out.println(targetChar+":its present:"+count);
		
	}

}
