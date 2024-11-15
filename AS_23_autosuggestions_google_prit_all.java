package Assignment;
//"Assignment 23--> Launch google, Type ""Bangalore"" and from auto-suggestions print all options"

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AS_23_autosuggestions_google_prit_all
{

	public static void main(String[] args) throws InterruptedException 
	{

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.in");
		
		driver.findElement(By.name("q")).sendKeys("Banglore");
	    Thread.sleep(5000);
	    
		List<WebElement> li=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		
		System.out.println(li.size());
		for(int i=0; i<li.size();i++)
		{
			WebElement auto1 = li.get(i);
			System.out.println(auto1.getText());
		}
		


	}

}
