package week1.day1;

public class Student {
	String studentName="Rama";
	int rollNo=23104;
	String collegeName="SHASC";
	int markScored=542;
	int cgpa=80;
	
public void student() {
	System.out.println(studentName);
	System.out.println(rollNo);
	System.out.println(collegeName);
	System.out.println(markScored);
	
	
}
public static void main(String[] args) {
	Student details=new Student();
	System.out.println();
	details.student();


}
}