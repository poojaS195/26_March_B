package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\installable\\chromedriver\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");
        Thread.sleep(1000);
        driver.findElement(By.id("alertButton")).click();
      //  Alert alt = driver.switchTo().alert();
       driver.findElement(By.id("timerAlertButton")).click();
	}

}
