package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//"Assignment 24-->Launch Amazon.in , Type ""Shoe"" and from auto-suggestions print all the options"
public class AS_24_autosuggestions_amazon_print_all 
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoe");
		Thread.sleep(5000);
		
		List<WebElement> li=driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div/div"));
		
		System.out.println(li.size());
		for(int i=0; i<li.size();i++)
		{
			WebElement auto1 = li.get(i);
			System.out.println(auto1.getText());
		}
	}

}
