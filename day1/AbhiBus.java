package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBus {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.abhibus.com");
		driver.findElement(By.partialLinkText("Buses")).click();
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Onward Journey Date']")).click();
		driver.findElement(By.xpath("//span[text()='23']")).click();
		driver.findElement(By.id("search-button")).click();
		System.out.println(driver.findElement(By.xpath("(//h5[text()='Yolo Bus'])[1]")).getText());
		driver.findElement(By.xpath("//span[text()='Sleeper']")).click();
		driver.findElement(By.xpath("//button[text()='Show Seats']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[text()='DL3']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search Boarding Point']")).sendKeys("SRP Tools");
		driver.findElement(By.xpath("//p[text()='SRP Tools']")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.xpath("//div[@class='row selectedSeatDetails']")).getText());
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
