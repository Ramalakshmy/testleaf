package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ramalakshmi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("B");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ramalakshmi");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Selenium");
		driver.findElement(By.name("description")).sendKeys("Testleaf,one of the best selenium");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ramu6374968@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		driver.getTitle();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.getTitle();
		
	}

}