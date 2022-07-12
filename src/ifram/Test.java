package ifram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\installable\\chromedriver\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	       driver.manage().window().maximize();
	       Thread.sleep(1000);
	       driver.switchTo().frame("iframeResult");
	       driver.findElement(By.xpath("//button[@type='button']")).click();
	System.out.println("hiii this is pooja");
	}

}
