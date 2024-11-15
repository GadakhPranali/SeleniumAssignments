package Assignment;
//"Assignment 29  Print all the links present in Google home page."
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AS_29_Printall_links 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		
		for(int i=0; i<list.size(); i++)
		{
			WebElement list_li =	list.get(i);
			String url = list_li.getAttribute("href");
			System.out.println(url);
		}
	}

}
