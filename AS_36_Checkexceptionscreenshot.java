package Assignment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

//Try to take a screenshot in wrong location,and findout exception type
public class AS_36_Checkexceptionscreenshot 
{

	public static void main(String[] args) throws IOException
	{
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.flipkart.com");
driver.manage().window().maximize();

//1. upcasting driver to TakesScreenshot(I)
TakesScreenshot ts=driver;

//2. Utilising its abstract method called getScreenshotAS to take a screenshot 
File source =ts.getScreenshotAs(OutputType.FILE);

//3. Creating an Object of File Class and storing the screenshot at the given location
File destination= new File("C:\\Scrrenshot11\\screenshot11.png");

//4. using FileHandler class coping the file from source to destination
FileHandler.copy(source, destination);


	}

}
