package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// "Assignment 22 -->Launch Flipkart , Type ""Mobiles"" and from auto-suggestions select last Auto-suggestion option"
public class AS_22_autosuggestions_flipkart_printlast
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.in/");
		
		driver.findElement(By.name("q")).sendKeys("Mobiles");
		 Thread.sleep(3000);
		 
		 List <WebElement> li=driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search OpXDaO']/ul/li"));
			int count=li.size();
			System.out.println(count);
			
			Thread.sleep(3000);
			li.get(count-1).click();
			
			
	}
		 
}
