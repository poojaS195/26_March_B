package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class vctcregi {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","E:\\installable\\chromedriver\\chromedriver.exe" );
                 WebDriver driver=new ChromeDriver();
                 driver.manage().window().maximize();
                 driver.get("https://vctcpune.com/selenium/practice.html");
                 driver.navigate().to("https://www.gmail.com");
                 driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("suryavanshi.po@gmail.com");
                 Thread.sleep(1000);
                 driver.findElement(By.xpath("//span[text()='Next']")).click();
                 Thread.sleep(1000);

                 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("986000562");
                 Thread.sleep(1000);

                WebElement tik = driver.findElement(By.xpath("//div[text()='Show password']"));
               System.out.println( tik.isSelected());



	}

}
