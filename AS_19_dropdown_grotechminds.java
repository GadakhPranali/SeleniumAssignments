package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//"Assignment 19-->WAP on DropDown handling using ""https://grotechminds.com/registration/"" 
// website for Skills, Country and Relegion dropdowns"
public class AS_19_dropdown_grotechminds
{

	public static void main(String[] args)
	{
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://grotechminds.com/registration/");


WebElement e1 = driver.findElement(By.id("Skills"));
Select s1=new Select(e1);
//s1.selectByIndex(1);
//s1.selectByValue("select1");
s1.selectByVisibleText("Non-Technical Skills");
 
	}

}
