package Assignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// "Assignment 32  ---> Launch naukri.com and click on Google and Move control to child window"
public class AS_32_windowhandle_naukari 
{
public static void main(String[] args) 
{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand_Login_Register&gad_source=1&gclid=Cj0KCQjw05i4BhDiARIsAB_2wfB_iBpyW0N05KOLG3MtFuwEoTBizQ1vGqaMgdWznQ_uQ0vocYroqC4aAv9REALw_wcB&gclsrc=aw.ds");
	driver.manage().window().maximize();
	driver.findElement(By.name("google-register")).click();
	
	Set<String> s1 = driver.getWindowHandles();
	System.out.println(s1);
	
	Iterator<String> i1 = s1.iterator();
	String parent_id = i1.next();
	String child_id = i1.next();
	driver.switchTo().window(child_id);
	
	driver.findElement(By.id("identifierId")).sendKeys("pranali@gmail.com");
	
}
}
