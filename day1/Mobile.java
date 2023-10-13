package week1.day1;

public class Mobile {
	public void makecall() {
		String mobileModel="redmi";
		float mobileWeight=2.1f;
		System.out.println(mobileModel);
		System.out.println(mobileWeight);
		
	}
	public void sendMsg() {
		int mobileCost=18000;
		boolean isFullCharged=true;
		System.out.println(mobileCost);
		System.out.println(isFullCharged);
		
		
	}
	public static void main(String[] args) {
		Mobile details=new Mobile();
		System.out.println();
		details.makecall();
		details.sendMsg();

		

	
	}

}
