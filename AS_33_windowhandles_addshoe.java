package Assignment;
//"Assignment 33 Launch Amazon.in , search ""Shoe"" click on 1st shoe and add to cart"

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AS_33_windowhandles_addshoe
{
	public static void main(String[] args) 
	{
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.Amazon.in");
		driver.manage().window().maximize();
		WebElement serach_shoe= driver.findElement(By.id("twotabsearchtextbox"));
		serach_shoe.sendKeys("Shoe"+Keys.ENTER);
		//Click 1s shoe
		WebElement First_shoe = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
		First_shoe.click();
		// control parent to the child 
		Set<String>s1=driver.getWindowHandles();
		Iterator<String> i1= s1.iterator();
		String parentid =i1.next();
		String childid=i1.next();
		driver.switchTo().window(childid);
		
		
		//Add to cart
		driver.findElement(By.id("add-to-cart-button")).click();		
		
			
		
}
	
	
	
}
