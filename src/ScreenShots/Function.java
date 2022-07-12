package ScreenShots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Function {

	public static void main(String[] args) throws InterruptedException, IOException {
      System.setProperty("webdriver.chrome.driver", "E:\\installable\\chromedriver.chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://vctcpune.com/selenium/practice.html#skills");
         Thread.sleep(1000);
         driver.manage().window().maximize();
         File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         File destination = new File("E:\\screenshot.fun.png");
         FileHandler.copy(source, destination);
	}

}
