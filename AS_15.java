package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AS_15 {

	public static void main(String[] args) throws InterruptedException
	{
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in/");

WebElement Language = driver.findElement(By.xpath("//span[@class='icp-nav-link-inner']"));

Actions hvrOver_Lang = new Actions(driver);
hvrOver_Lang.moveToElement(Language).perform();
Thread.sleep(500);

WebElement select_Hindi = driver.findElement(By.xpath("(//i[@class=\"icp-radio\"])[1]"));
select_Hindi.click();
	}

}
