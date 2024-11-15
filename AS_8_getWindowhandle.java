package Assignment;
//Assignment8 WAP for getWindowhandle()
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AS_8_getWindowhandle
{

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		
		String parent_Tab_ID = driver.getWindowHandle();
		WebElement partial_linkText_Services = driver.findElement(By.partialLinkText("Service"));
		partial_linkText_Services.click();
		
		Set<String> child_Tab_ID = driver.getWindowHandles();
		System.out.println("Parent tab ID "+parent_Tab_ID); //Parent tab ID 5A709E513C91589579655FAD3B09032E
        System.out.println("Child tab ID "+child_Tab_ID);	//Child tab ID [5A709E513C91589579655FAD3B09032E]

	}

}
