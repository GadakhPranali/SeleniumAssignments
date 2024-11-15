package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//"Assignment 25-->Launch Flipkart , Type ""Mobiles"" and  from auto-suggestions print all the options"
public class AS_25_autosuggestions_flipkart_prit_all
{ 

	public static void main(String[] args) throws InterruptedException
	{
ChromeDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.flipkart.in/");

WebElement txtBox_Search = driver.findElement(By.name("q"));
txtBox_Search.sendKeys("Mobiles");
Thread.sleep(1000);

List<WebElement> li = driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search OpXDaO']/ul/li"));

for(int i=0; i<li.size(); i++)
{
	WebElement auto1 = li.get(i);
	System.out.println(auto1.getText());
}

	}
	
}
