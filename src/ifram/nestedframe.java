package ifram;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class nestedframe {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\installable\\chromedriver\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
        Thread.sleep(1000);
      String str1 = driver.findElement(By.xpath("//h1[text()='Frames Examples in Selenium Webdriver']")).getText();
     System.out.println(str1);
    String str2 = driver.findElement(By.xpath("//label[text()='Topic : ']")).getText();
     System.out.println(str2);
     //switch focus to frame1
     driver.switchTo().frame("frame1");
     driver.findElement(By.tagName("input")).sendKeys("pooja");
     driver.switchTo().frame("frame3");
     driver.findElement(By.id("a")).click();
     driver.switchTo().defaultContent();
     driver.switchTo().frame("frame2");
     WebElement str3 = driver.findElement(By.id("animals"));
     Select s=new Select(str3);
     System.out.println(s.isMultiple());
  s.selectByValue("avatar");
 
   
	}

}

