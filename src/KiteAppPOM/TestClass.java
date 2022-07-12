package KiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\installable\\chromedriver\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://kite.zerodha.com/");
        Thread.sleep(1000);
        
        KiteLoginPage login=new KiteLoginPage(driver);
        login.sendusername();
        login.sendpassword();
        login.clickOnLoginButton();
        Thread.sleep(1000);
        
        KiteAppPinPage pIn=new KiteAppPinPage(driver);
        pIn.sendpin();
        pIn.contibutn();
        Thread.sleep(1000);
        
        KiteAppHomePage homepg=new KiteAppHomePage(driver);
        homepg.usrnmmatch();
        homepg.logoutbtn();
        
        driver.close();
	}

}
