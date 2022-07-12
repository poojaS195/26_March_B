package ifram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ifmpractice {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\installable\\chromedriver\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        Thread.sleep(1000);
        driver.switchTo().frame("frm1");
        
        
       // driver.switchTo().frame(10);
        WebElement sel1 = driver.findElement(By.id("selectnav2"));
        sel1.click();
       Select s=new Select(sel1);
       System.out.println(s.isMultiple());
      s.selectByVisibleText("Menu");
      Thread.sleep(1000);
       s.selectByVisibleText("Home");
      Thread.sleep(1000);
      s.selectByVisibleText("Contact");
        
        
	}

}
