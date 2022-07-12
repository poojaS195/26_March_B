package SelfPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class childwindowhandletesting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\installable\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
//		WebElement text = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
//		text.getText();
	driver.getWindowHandles();

	}

}
