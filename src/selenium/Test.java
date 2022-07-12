package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "E:\\installable\\chromedriver\\chromedriver.exe");
              WebDriver driver=new ChromeDriver();
              driver.get("https://demoqa.com/select-menu");
              driver.manage().window().maximize();
              Thread.sleep(1000);
              driver.manage().window().minimize();

               WebElement multiselect = driver.findElement(By.id("cars"));
               Select s=new Select(multiselect);
              System.out.println(s.isMultiple());
              s.selectByValue("volvo");
              Thread.sleep(1000);

              s.selectByVisibleText("Saab");
              Thread.sleep(1000);

              s.selectByVisibleText("Opel");
              Thread.sleep(1000);

              s.selectByIndex(3);
              Thread.sleep(1000);

             // s.deselectAll();
             // s.deselectByValue("volvo");
              s.deselectByVisibleText("Volvo");
              Thread.sleep(1000);

              s.deselectByVisibleText("Saab");
              Thread.sleep(1000);
              
              s.deselectByVisibleText("Opel");
              Thread.sleep(1000);
              
              s.deselectByIndex(3);


              
              
	}

}
