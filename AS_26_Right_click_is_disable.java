package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//"Assignment 26-->Check Right click is disable in any banking application ex IDFC, ICICI etc and Insepct It"
public class AS_26_Right_click_is_disable 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("login_button")).click();
		
		WebElement UserName = driver.findElement(By.name("userName"));
		UserName.sendKeys("Pranaliaaaa@1234");
		WebElement Password = driver.findElement(By.name("password"));
		Password.sendKeys("abcd@1234");
		
		WebElement Captcha = driver.findElement(By.id("loginCaptchaValue"));
		Captcha.sendKeys("12345");
		
		WebElement Login = driver.findElement(By.id("Button2"));
		Login.click();
		
	}

}
