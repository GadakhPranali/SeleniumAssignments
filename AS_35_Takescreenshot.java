package Assignment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AS_35_Takescreenshot 
{

	public static void main(String[] args) throws IOException 
	{
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.flipkart.com");
driver.manage().window().maximize();

TakesScreenshot ts=driver;
File source =ts.getScreenshotAs(OutputType.FILE);
File destination= new File("C:\\Scrrenshot\\screenshot11.png");
FileHandler.copy(source, destination);

	}

}
