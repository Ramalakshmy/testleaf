package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)		
	String[] arr= {"HCL","Wipro","Aspire System","CTS"};
	List<String>values=new ArrayList<String>();
	values.add("HCL");
	values.add("Wipro");
	values.add("Aspire Systems");
	values.add("CTS");
	System.out.println(values);
	Collections.sort(values);
	for (int i = 0; i < values.size(); i++) {
		System.out.println(values.get(i));
		
	}
		
	}
	
}
	

	 


