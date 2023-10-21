package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BrowserDriver {
	
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.findElement(By.linkText("CRM/SFA"));
		driver.findElement(By.partialLinkText("CRM")).click();
		String leadPage = driver.getTitle();
		 
		System.out.println(leadPage);
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ramalakshmi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("B");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("11/07/2001");
		
		WebElement tools = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drop1=new Select(tools);
		drop1.selectByVisibleText("Employee");
		
		WebElement marketing = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drop2=new Select(marketing);
		drop2.selectByValue("9001");
		
       WebElement compaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select drop3=new Select(compaign);
		drop3.selectByIndex(2);
		
		WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select drop4=new Select(ownership);
		drop4.selectByIndex(5);
		driver.findElement(By.name("")).click();
		
		
	 String title2 = driver.getTitle();
	 System.out.println(title2);
	
				
		
		
		
		
		
		
		
		
		
	}


	

}
