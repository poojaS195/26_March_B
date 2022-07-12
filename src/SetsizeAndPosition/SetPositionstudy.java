package SetsizeAndPosition;




import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPositionstudy {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\installable\\chromedriver\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(1000);
       System.out.println(driver.manage().window().getPosition());
        Point p=new Point(200,10);
       driver.manage().window().setPosition(p);
	}

}
