package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class vctcpune {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "E:\\installable\\chromedriver\\chromedriver.exe");
	      WebDriver driver= new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://vctcpune.com/selenium/practice.html");
	      Thread.sleep(1000);
//	      driver.findElement(By.name("enter-name")).sendKeys("pooja");
//	      Thread.sleep(1000);
//      driver.findElement(By.id("alertbtn")).click();
//      Thread.sleep(1000);
//      driver.findElement(By.name("enter-name")).clear();
//
//           driver.findElement(By.id("confirmbtn")).click();
//	      Thread.sleep(1000);
	      //driver.findElement(By.xpath("//input[@value='Confirm']")).click();
	            WebElement hide = driver.findElement(By.id("hide-textbox"));
                WebElement show = driver.findElement(By.id("show-textbox"));
                WebElement display = driver.findElement(By.id("displayed-text"));
	  if(display.isDisplayed())
	  {
		  System.out.println("textbox visible");
	  }
	  else
	  {
		  System.out.println("textbox not visible");

	  }
	  
	  hide.click();
	  if(display.isDisplayed())
	  {
		  System.out.println("textbox visible");

	  }
	  else
	  {
		  System.out.println("textbox not visible");

	  }
	  Thread.sleep(1000);
	  show.click();
driver.findElement(By.xpath("//h1[contains(text(),'Welcome To')]"));



	  
                
                
	}

}
