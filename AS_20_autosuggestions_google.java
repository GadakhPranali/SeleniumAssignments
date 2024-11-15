package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//"Assignment 20--> Launch google, Type ""Bangalore"" and from auto-suggestions select 6th Auto-suggestion option"
public class AS_20_autosuggestions_google
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.in");
		
		driver.findElement(By.id("APjFqb")).sendKeys("Bangalore");
	    Thread.sleep(3000);
	    
		WebElement optn_6 = driver.findElement(By.xpath("(//div[@class='OBMEnb']/ul/li)[5]"));
		optn_6.click();
	}

}
