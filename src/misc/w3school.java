package misc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class w3school {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\installable\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='w3-button tryit-button'])[1]")).click();
		
		
	}

}
