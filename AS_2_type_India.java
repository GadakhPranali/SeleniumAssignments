package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AS_2_type_India 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
driver.get("https://www.google.com/");
driver.findElement(By.id("APjFqb")).sendKeys("INDIA");
driver.manage().window().maximize();

	}

}
