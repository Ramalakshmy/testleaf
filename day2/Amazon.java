package week3.day2;

public class Amazon extends CarnaraBank{
	
	public void upiPayments() {
		System.out.println(" UPI payments");
	}

	public void cardPayments() {
		System.out.println("card payments");
	}

	public void internetBanking() {
		System.out.println("Internet banking");
		
	}

	public void cashOnDelivery() {
		System.out.println("Cash on delivery");
		
	}
	public static void main(String[] args) {
		Amazon obj=new Amazon();
		obj.cardPayments();
		obj.cashOnDelivery();
		obj.recordPaymentDetails();
		obj.internetBanking();
		obj.upiPayments();
	}
	
}