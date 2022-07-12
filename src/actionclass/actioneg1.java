package actionclass;

import org.apache.xml.security.stax.ext.XMLSecurityConstants.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actioneg1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\installable\\chromedriver\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        Thread.sleep(1000);
        WebElement Seleniumbutton = driver.findElement(By.linkText("Selenium"));
	Actions act=new Actions(driver);
	//act.moveToElement(Seleniumbutton).perform();
	//act.click().perform();
	WebElement rightbutton = driver.findElement(By.xpath("//span[text()='right click me']"));
	act.moveToElement(rightbutton).contextClick().build().perform();
	act.contextClick(rightbutton).perform();
	WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	act.doubleClick(doubleclick).perform();
	
	}

}
