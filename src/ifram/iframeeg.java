package ifram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframeeg {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\installable\\chromedriver.chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://skpatro.github.io/demo/iframes/");
         Thread.sleep(1000);
         
	}

}
