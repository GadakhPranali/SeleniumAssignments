package Assignment;
//Assignment 13 Launch amazon,select a catagory as books,search a book called power of minds and press enter button using X-Path
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AS_13_Amazon_DropDown {

	public static void main(String[] args)
	{

ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in/");

WebElement drpDwon_All = driver.findElement(By.id("searchDropdownBox"));
Select s1 = new Select(drpDwon_All);
s1.selectByVisibleText("Books");

WebElement txtBox_Search = driver.findElement(By.id("twotabsearchtextbox"));
txtBox_Search.sendKeys("power of your subconscious mind book");

WebElement btn_Search = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
btn_Search.click();

	}

}
