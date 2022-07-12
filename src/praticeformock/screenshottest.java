package praticeformock;

import java.io.File;
import java.util.logging.FileHandler;

import org.apache.pdfbox.util.filetypedetector.FileType;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshottest {

	public static void main(String[] args) {

System.setProperty("webdriver.chromedriver.driver", "E:\\installable\\chromedriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://vctcpune.com/selenium/practice.html#skills");
	File srs=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest=new File("E:\\screenshot\\praticescreenshot.png");


FileHandler.copy(srs, dest);
	
	
	}

}
