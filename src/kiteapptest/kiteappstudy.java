package kiteapptest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class kiteappstudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\installable\\chromedriver\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://kite.zerodha.com/");
        Thread.sleep(1000);
        WebElement username = driver.findElement(By.id("userid"));
WebElement password = driver.findElement(By.id("password"));
	WebElement sublit = driver.findElement(By.xpath("//button[@type='submit']"));
	username.sendKeys("ELR321");
	password.sendKeys("Dhana1111");
	sublit.click();
    Thread.sleep(1000);
   WebElement pin = driver.findElement(By.id("pin"));
WebElement continu = driver.findElement(By.xpath("//button[@type='submit']"));
pin.sendKeys("982278");
continu.click();
Thread.sleep(1000);
WebElement usernm = driver.findElement(By.xpath("//span[@class='user-id']"));
String actualid = usernm.getText();
String exceptedid = "ELR321";
if(actualid.equals(exceptedid))
{
	System.out.println("id matching");
}
else
{
	System.out.println("id not matching");
}
usernm.click();
Thread.sleep(1000);
driver.findElement(By.xpath("//a[@target='_self']")).click();
Thread.sleep(1000);
driver.close();
	}

}
