package misc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class countimgno {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\installable\\chromedriver\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("https://www.google.co.in/");
        Thread.sleep(1000);
       driver.findElement(By.name("q")).sendKeys("pune university");
		Thread.sleep(200);
 List<WebElement> searchResults = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
 System.out.println(searchResults.size());
 
 for(WebElement r:searchResults)// for getting text only
	{
	System.out.println(r.getText());
	}
	for(WebElement result:searchResults)// for clicking on required result
	{
	String actualText = result.getText();
	String expectedText = "pune university exam";
	if(actualText.equals(expectedText))
	{
	result.click();
	break;
	}
	}
    Thread.sleep(1000);

  driver.findElement(By.linkText("Images")).click();
  Thread.sleep(5000);

 List<WebElement> countimg = driver.findElements(By.tagName("img"));
 
 System.out.println(countimg.size());
	}
	}