package week3.day1;

public class Chrome extends Browser{
	 public void openIncognito() {
	       System.out.println("open incoginto");
}
	 public void clearCacheL() {
	       
  	   System.out.println("clear cache");
}
	 
public static void main(String[] args) {
	Chrome c=new Chrome();
	c.openURL();
	c.closeBrowser();
	c.clearCacheL();
	c.openIncognito();
}
}
