package week3.day2;

public class Students {
	public void getStudentInf(String id) {
		System.out.println(id+" ");

	}
	public void getStudentInf(String id,String name) {
		System.out.println(id+" "+name+" ");
	}
	public void getStudentInf(String id,String name,String email,int phonenumber) {
		System.out.println(id+" "+name+" "+email+" "+phonenumber+" ");
}
	public static void main(String[] args) {
		Students obj=new Students();
		obj.getStudentInf("testleaf");
		obj.getStudentInf("Chrome", "Rama");
		obj.getStudentInf("browser","laksh","rama123@gmail.com",689503223);
	}
	
	
	
}