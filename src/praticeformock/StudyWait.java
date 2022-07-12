package praticeformock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StudyWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\installable\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(200));
		 WebElement aboutus = driver.findElement(By.xpath("(//a[text()='About us'])[1]"));
			wait.until(ExpectedConditions.visibilityOf(aboutus));
			aboutus.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(1000));
			wait.until(ExpectedConditions.visibilityOf(aboutus));
			
	}

}
