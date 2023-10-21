package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
	public static void main(String[] args) {
	
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Ramalakshmi");
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("B");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']")).click();
		String title2 = driver.getTitle();
		System.out.println(title2);
		driver.findElement(By.linkText("Edit")).click();
		WebElement updatecompany= driver.findElement(By.id("updateLeadForm_companyName"));
		updatecompany.clear();
		updatecompany.sendKeys("AMAZON");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		String view = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if(view.contains("AMAZON(13925")) {
			System.out.println("updte successfully");
		}
		else {
			System.out.println("update not successfully");
			
			
			
		}
		
		
		
		
		
		
	}
}

