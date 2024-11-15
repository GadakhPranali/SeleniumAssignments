package Assignment;
//"Assignment 30 Print attribute values for particular attribute name."

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AS_30_Print_values_perticuler_attribute 
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
			String url = list_li.getAttribute("class");
			System.out.println(url);
		}
	}
}
