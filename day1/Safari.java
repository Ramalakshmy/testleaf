package week3.day1;

public class Safari extends Browser {
	public void readMode() {
		System.out.println("reader mode is on");

	}
	public void fullscreenMode() {
		System.out.println("full screen mode");  
	}
	public static void main(String[] args) {
		Safari s=new Safari();
		s.closeBrowser();
		s.navigateBack();
		s.readMode();
		s.fullscreenMode();
	}

}
