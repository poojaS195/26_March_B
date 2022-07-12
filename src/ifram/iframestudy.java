package ifram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframestudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\installable\\chromedriver\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ui.vision/demo/webtest/frames/");
        Thread.sleep(1000);
        driver.switchTo().frame(0);
        String text1 = driver.findElement(By.xpath("//b[text()='Frame Test Page']")).getText();
        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Pooja");
       driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("hiiii");
       
       driver.switchTo().defaultContent();
       driver.switchTo().frame(2);
       driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("hello");
    
      driver.switchTo().frame(0);
      String text2 = driver.findElement(By.xpath("//div[text()='Form Filling Demo Page']")).getText();
      System.out.println(text2);
       driver.findElement(By.xpath("(//div[@class='AB7Lab Id5V1'])[2]")).click();
//       Thread.sleep(1000);
      driver.findElement(By.xpath("(//span[@dir='auto'])[6]")).click();
      driver.switchTo().defaultContent();
      WebElement frame = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
      driver.switchTo().frame(frame);
      driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("Hiiii");
      
     
	}

}
