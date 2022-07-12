package scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","E:\\installable\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/");
      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	WebElement katraj = driver.findElement(By.xpath("//strong[text()='Katraj Branch']"));
	JavascriptExecutor e=(JavascriptExecutor)driver;
	e.executeScript("arguments[0].scrollIntoView(true)", katraj);
	
	}
	

}
