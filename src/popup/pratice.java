package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pratice {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\installable\\chromedriver\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        Thread.sleep(1000);
      driver.findElement(By.name("alert")).click();
   Alert alt = driver.switchTo().alert();
   alt.accept();
   Thread.sleep(1000);
   driver.findElement(By.name("confirmation")).click();
   Thread.sleep(1000);
   Alert al = driver.switchTo().alert();
al.accept();
Thread.sleep(1000);
driver.findElement(By.name("prompt")).click();
Alert a = driver.switchTo().alert();
a.sendKeys("pooja");
al.accept();
 WebElement se = driver.findElement(By.id("sub-menu"));
 se.click();
//Select s=new Select(se);
//s.selectByVisibleText("CherCher Tech");
//s.selectByVisibleText("Google");
//s.selectByVisibleText("Bing");
	}

}
