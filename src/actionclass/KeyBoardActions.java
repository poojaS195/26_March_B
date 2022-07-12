package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\installable\\chromedriver\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("https://vctcpune.com/selenium/practice.html");
        Thread.sleep(1000);
       WebElement textbox = driver.findElement(By.id("autocomplete"));
       Actions act=new Actions(driver);
       act.sendKeys(textbox,"pooja renushe").perform();
       WebElement dropdown = driver.findElement(By.name("dropdown-class-example"));
       act.click(dropdown).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
       
	}

}
