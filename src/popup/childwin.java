package popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class childwin {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\installable\\chromedriver\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://skpatro.github.io/demo/links/");
        Thread.sleep(1000);
        String parent = driver.getWindowHandle();
        System.out.println(parent);
        driver.findElement(By.name("NewTab")).click();
        Thread.sleep(1000);

        Set<String> mainid = driver.getWindowHandles();
       Iterator<String> miter = mainid.iterator();
       String MI = miter.next();
       String CI = miter.next();
       driver.switchTo().window(CI);
       driver.findElement(By.xpath("(//input[@type='email'])[1]")).sendKeys("pooja1@gmail.com");
       Thread.sleep(1000);
       driver.switchTo().window(MI);
     WebElement mytext = driver.findElement(By.xpath("//p[text()='Click below to open link in new tab']"));
System.out.println(mytext.getText());

	}

}
