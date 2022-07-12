package ifram;

import java.awt.Point;

import org.checkerframework.common.reflection.qual.NewInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoqaframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\installable\\chromedriver\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("https://demoqa.com/frames");
        Thread.sleep(1000);
        //driver.manage().window().setPosition(ne Point)
        driver.switchTo().frame("frame1");
        String text1 = driver.findElement(By.xpath("(//h1[text()='This is a sample page'])[1]")).getText();
System.out.println(text1);
driver.switchTo().defaultContent();
driver.switchTo().frame("frame1");
driver.switchTo().frame(8);
String text2 = driver.findElement(By.xpath("//iframe[@id='frame2']")).getText();
System.out.println(text2);

	}

}
