package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PVRCinemas {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.pvrcinemas.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search city']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//span[text()='Chennai']")).click();
		driver.findElement(By.xpath("//span[@class='icon-glow cursor_pointer']")).click();
		driver.findElement(By.xpath("//a[text()='Movie Library']")).click();
		driver.findElement(By.xpath("//select[@name='genre']"));
		driver.findElement(By.xpath("//option[text()='Chennai']")).click();
		driver.findElement(By.xpath("//option[text()='ANIMATION']")).click();
		driver.findElement(By.xpath("//option[text()='ENGLISH']")).click();
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[text()='Paw Patrol']")).click();
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		driver.findElement(By.xpath("//option[text()='PVR Heritage RSL ECR Chennai']")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Rama");
		driver.findElement(By.xpath("(//span[@class='day-unit ng-star-inserted'])[1]")).click();
		driver.findElement(By.xpath("//input[@name='noOfTickets']")).sendKeys("3");
		
		driver.findElement(By.xpath("//option[text()='03:00 PM - 06:00 PM']")).click();
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9632157092");
		driver.findElement(By.xpath("//select[@name='food']")).sendKeys("pizza");
		driver.findElement(By.xpath("//label[@class='custom-control custom-radio']")).click();
		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
		driver.close();
		
	
	}

}
