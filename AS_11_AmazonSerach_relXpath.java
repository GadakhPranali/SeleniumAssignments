package Assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AS_11_AmazonSerach_relXpath 
{
	public static void main(String[] args) 
	{
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	WebElement Search = driver.findElement(By.xpath("//input[@name='field-keywords']"));
	Search.sendKeys("kurti");
	WebElement btn_Search = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	btn_Search.click();

	}
	
	
	
}
