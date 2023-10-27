package week3.day1;

public class Edge extends Browser{
	
	 public void takesnap() {
	       
  	   System.out.println("take snap");
	 }
	 public void cleaCookies() {
	       
  	   System.out.println("clear the Cookies");
} 
	 
	 public void navigateBack() {
         
  	   System.out.println("go to back home page");
  	   
}
   public void closeBrowser() {
           
    	   System.out.println("browser is closed");
}
	 public static void main(String[] args) {
		Edge e=new Edge();  
		e.takesnap();
		e.cleaCookies();
		e.openURL();
		e.closeBrowser();
		e.navigateBack();
		
		
	}

}
