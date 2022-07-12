package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listboxstudy {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver","E:\\installable\\chromedriver\\chromedriver.exe" );
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	      Thread.sleep(1000);
	     String text1 = driver.findElement(By.className("breadcrumb-item")).getText();
	     System.out.println(text1);
	     String text2 = driver.findElement(By.xpath("//h2[text()='Single value Dropdown']")).getText();
	         System.out.println(text2);
        WebElement s1 = driver.findElement(By.xpath("(//select[@class='col-lg-3'])[1]"));
         Select s=new Select(s1);
         Thread.sleep(1000);
         s.selectByIndex(0);
         Thread.sleep(1000);
         s.selectByValue("Google");
         Thread.sleep(1000);
         s.selectByVisibleText("Iphone");
         Thread.sleep(1000);
         s.selectByIndex(3);
         Thread.sleep(1000);
WebElement s3 = driver.findElement(By.id("animals"));
Select s2=new Select(s3);
s2.selectByIndex(0);
Thread.sleep(1000);
s2.selectByIndex(1);
Thread.sleep(1000);
s2.selectByIndex(2);
Thread.sleep(1000);
s2.selectByIndex(3);
         WebElement s4 = driver.findElement(By.xpath("(//select[@class='col-lg-3'])[3]"));
         Select s5=new Select(s4);
         System.out.println(s5.isMultiple());
        s5.selectByVisibleText("Pizza");
        Thread.sleep(1000);
        s5.selectByVisibleText("Donut");
        Thread.sleep(1000);
        s5.selectByVisibleText("Burger");
        Thread.sleep(1000);
        s5.selectByVisibleText("Bonda");
        Thread.sleep(1000);
        s5.deselectAll();
         
	}

}
