package ScreenShots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class multiplescreenshots {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "E:\\installable\\chromedriver\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://demoqa.com/select-menu");
	       driver.manage().window().maximize();
	       Thread.sleep(1000);
	      File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     String str=RandomString.make(3);
	      File destination = new File("E:\\screenshot\\multiple\\snap"+str+".png");
	     FileHandler.copy(source, destination);
	     
	     
	}

}
