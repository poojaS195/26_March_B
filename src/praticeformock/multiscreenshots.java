package praticeformock;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class multiscreenshots {

	public static void main(String[] args) throws InterruptedException, IOException {

System.setProperty("webdriver.chrome.driver", "E:\\installable\\chromedriver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();




driver.get("https://vctcpune.com/selenium/practice.html#skills");
driver.manage().window().maximize();
Thread.sleep(1000);
File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
String str = RandomString.make(5);

File dest=new File("E:\\screenshot\\mock\\photo"+str+".png");
FileHandler.copy(src, dest);



	}

}

