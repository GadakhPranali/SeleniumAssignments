package Assignment;
//"Assignment 21-->Launch Amazon.in , Type ""Shoe"" and from auto-suggestions select 2nd Auto-suggestion option"

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AS_21_autosuggestions_amazon_printsecond
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoe");
		 Thread.sleep(3000);
		 
		List<WebElement> li=driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div/div"));
		int count =li.size();
		System.out.println(count);
			
		Thread.sleep(3000);
		li.get(1).click();
		
	}

}
