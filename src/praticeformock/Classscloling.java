package praticeformock;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classscloling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\installable\\chromedriver\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://demoqa.com/select-menu");
	       driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	       JavascriptExecutor e=(JavascriptExecutor)driver;
	       e.executeScript("window.scrollBy(500,800)");
	       
	}

}
