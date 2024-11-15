package Assignment;
//"Assignment 31 How to handle fileupload popup"

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AS_31_handle_fileupload_popup 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		
		
		//firstname
		driver.findElement(By.id("fname")).sendKeys("Pranali");
		
		//Lastname
		driver.findElement(By.id("lname")).sendKeys("Pranali");
		
		//Email
		driver.findElement(By.id("email")).sendKeys("pranali123@gmai.com");
		
		//Password
		driver.findElement(By.xpath("//input[@class=\"password form-control \"]")).sendKeys("Pa55word@1234");
		
		//radiobutto gender
		driver.findElement(By.id("Female")).click();
		
		//dropdown sselect
		WebElement dropdown = driver.findElement(By.id("Skills"));
		Select skills = new Select(dropdown);
		skills.selectByValue("select1");
		
		//dropdown country
		
		WebElement dropdown_country = driver.findElement(By.id("Country"));
		Select Country = new Select(dropdown_country);
		Country.selectByValue("India");
		
		//Permanant address
		driver.findElement(By.xpath("//textarea[@class=\"Present-Address form-control\"]")).sendKeys("Flat c 501 Pune 456789");
		
		//Permanant address
		driver.findElement(By.id("Permanent-Address")).sendKeys("Sangmner c421 Nagar");
		
		//pincode
		driver.findElement(By.id("Pincode")).sendKeys("456789");
		
		//Religion
		WebElement Religion_dropdown = driver.findElement(By.id("Relegion"));
		Select Religion =new Select(Religion_dropdown);
		Religion.selectByIndex(1);
		
		//choose file 
		WebElement fileUpload = driver.findElement(By.id("file"));
		fileUpload.sendKeys("C:\\Scrrenshot\\screenshot11.png");
		Thread.sleep(3000);
		
		//relocate
		driver.findElement(By.id("relocate")).click();
		
		//Submit btn
		WebElement btn_Submit = driver.findElement(By.name("Submit"));
		btn_Submit.click();		
	}
	
}
