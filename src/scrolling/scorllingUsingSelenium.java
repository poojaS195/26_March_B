package scrolling;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scorllingUsingSelenium {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","E:\\installable\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/");
       driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	JavascriptExecutor e=(JavascriptExecutor)driver;
	e.executeScript("window.scrollBy(80,900)");
	
	}

}
