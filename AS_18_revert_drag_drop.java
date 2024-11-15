package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//"Assignment 18WAP on Drag and Drop using ""https://grotechminds.com/drag-and-drop/"" website And Revert the dragged element at its original position"
public class AS_18_revert_drag_drop 
{
		public static void main(String[] args) throws InterruptedException 
		{
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://grotechminds.com/drag-and-drop/");
	
	WebElement e1=	driver.findElement(By.id("container-4"));//element which is drag 
	WebElement e2=  driver.findElement(By.id("div2"));// drop position
	
	Actions a1=new Actions(driver);
	a1.dragAndDrop(e1, e2).perform();
	Thread.sleep(3000);
	
	a1.dragAndDrop(e2, e1).perform();
	

	}

}
