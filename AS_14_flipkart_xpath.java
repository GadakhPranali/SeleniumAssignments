package Assignment;
// "Assignment14 WAP in flipkart click on fashion menu using Xpath using text message"
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AS_14_flipkart_xpath
{

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.in");
        driver.findElement(By.xpath("(//span[.='Fashion'])[2]")).click();
	}

}
