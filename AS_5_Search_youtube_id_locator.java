package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AS_5_Search_youtube_id_locator {
	

	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.id("search")); 
		
//		WebElement Search = driver.findElement(By.id("search")); 
		search.sendKeys("Growtech Minds");
		search.sendKeys(Keys.ENTER);

	}

}
