package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AS_3_loginfacebook {

	public static void main(String[] args) 
	{
 ChromeDriver driver = new ChromeDriver();
 driver.get("https://www.facebook.com");
 driver.manage().window().maximize();
 driver.findElement(By.id("email")).sendKeys("pranaligadakh05@gmail.com");
 driver.findElement(By.id("pass")).sendKeys("Pa55word@1234");
 driver.findElement(By.name("login")).click();
 
 
 
	}

}
