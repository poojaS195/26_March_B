import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linksstudy {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\installable\\chromedriver\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://vctcpune.com/selenium/practice.html#skills");
        Thread.sleep(1000);
        
	}

}
