package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AS_4_Search_amazon {

	public static void main(String[] args)
	{
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.Amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("zouk bags");
		driver.findElement(By.id("a-page")).click();
		
		
		
		
	}

}
