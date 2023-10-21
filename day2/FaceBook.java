package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FaceBook {

	public static void main(String[] args) {
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://en-gb.facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("//a[text()='Create new account']")).click();
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Rama");
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Moorthi");
			driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("rama@12345@gmail.com");
			driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("rama@12345@gmail.com");
			driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("rama#12345");
			
			WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
			Select day1=new Select(day);
			day1.selectByVisibleText("11");
			
			WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
			Select month1=new Select(month);
			month1.selectByIndex(9);
			
			WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
			Select year1=new Select(year);
			year1.selectByValue("2001");
			
			driver.findElement(By.xpath("//input[@value='2']")).click();
			
			driver.findElement(By.xpath("//button[@name='websubmit']")).click();
			driver.close();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		

	}

}
