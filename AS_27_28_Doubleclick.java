package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class AS_27_28_Doubleclick
{

	public static void main(String[] args) throws InterruptedException
	{
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com/");

WebElement gmail_Link = driver.findElement(By.linkText("Gmail"));
Thread.sleep(500);

Actions click = new Actions(driver);
//Double click action
//click.doubleClick(gmail_Link).perform();


//For right click operation 
click.contextClick(gmail_Link).perform();
	}

}
