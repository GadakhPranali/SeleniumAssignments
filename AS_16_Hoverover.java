package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//"Assignment 16 WAP on Hoverover using ""https://grotechminds.com/hoverover/"" website"
public class AS_16_Hoverover
{

	public static void main(String[] args) 
	{

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://grotechminds.com/hoverover/");
		
		WebElement demo1_btn = driver.findElement(By.xpath("//div[@class='has_eae_slider elementor-element elementor-element-1857001 e-con-full e-flex e-con e-child']"));
		
		Actions demo1_P3 = new Actions(driver);   //error - Element should have been "select" but was "div"
		demo1_P3.moveToElement(demo1_btn).perform();
		demo1_btn.click();   //select practice 1 here
	}
		
}
