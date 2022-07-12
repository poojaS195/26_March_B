package Dynamic_Wait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicit_wait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","E:\\installable\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
driver.close();
	}

}
