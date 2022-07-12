package ifram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pratice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\installable\\chromedriver\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        Thread.sleep(3000);
        driver.switchTo().frame("frm2");
        driver.findElement(By.id("firstName")).sendKeys("pooja");
        Thread.sleep(1000);
        driver.findElement(By.id("lastName")).sendKeys("Renushe");
        Thread.sleep(1000);
        driver.findElement(By.id("femalerb")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("englishchbx")).click();
        driver.findElement(By.id("hindichbx")).click();
        driver.findElement(By.id("chinesechbx")).click();
        driver.findElement(By.id("spanishchbx")).click();
        driver.findElement(By.id("latinchbx")).click();
        driver.findElement(By.id("frenchchbx")).click();
        driver.findElement(By.id("email")).sendKeys("pooja123@gmail.com");


	}

}
