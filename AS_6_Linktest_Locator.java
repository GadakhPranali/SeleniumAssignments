package Assignment;
//Assignment 6WAP launch Amazon.in try to click mobile with help of Linktest Locator 


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AS_6_Linktest_Locator 
{
public static void main(String[] args)
{
	
	
	
	ChromeDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
     
     
	driver.get("https://www.Amazon.in");
     WebElement linkText_Mobiles = driver.findElement(By.linkText("Mobiles"));
	 linkText_Mobiles.click();
	
}
}
