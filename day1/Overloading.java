package week3.day1;

public class Overloading {
	public void reportStep(String msg,String status) {
		System.out.println(msg+" "+status+" ");
		

	}
	public void reportStep(String msg,String status,boolean snap) {
		System.out.println(msg+" "+status+" "+snap+" ");

	}
	public static void main(String[] args) {
		Overloading o=new Overloading();
		o.reportStep("hi", "thanks");
		o.reportStep("hii", "thanks", true);
	}

}
