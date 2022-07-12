package SetsizeAndPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\installable\\chromedriver\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("https://kite.zerodha.com/");
        Thread.sleep(1000);
        Point current = driver.manage().window().getPosition();
        System.out.println(current);
        Point p=new Point(100,200);
        driver.manage().window().setPosition(p);
        Thread.sleep(1000);
       Dimension size = driver.manage().window().getSize();
       System.out.println(size);
       Dimension d=new Dimension(10, 100);
       driver.manage().window().setSize(d);
       
        
	}

}
