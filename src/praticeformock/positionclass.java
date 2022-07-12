package praticeformock;

import java.awt.Point;
import java.awt.Window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class positionclass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\installable\\chromedriver\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://demoqa.com/select-menu");
	       System.out.println(driver.manage().window().getPosition());
	       Point p=new Point(100,200);
	       driver.manage().window().setPosition(p);

	}

}
