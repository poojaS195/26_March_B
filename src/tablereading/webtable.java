package tablereading;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\installable\\chromedriver\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("https://vctcpune.com/selenium/practice.html#skills");
        Thread.sleep(1000);
       List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
       int totalnoofrows = rows.size();
       System.out.println(totalnoofrows);
       List<WebElement> colunm = driver.findElements(By.xpath("//table//tr[1]//th"));
       int totalnoofcolumn = colunm.size();
       System.out.println(totalnoofcolumn);
	//how to read header
       for(WebElement header:colunm)
       {
    	   System.out.print(header.getText()+" ");
       }
       //how to read all rows in table
       List<WebElement> alldata = driver.findElements(By.xpath("//table//tr"));
       Iterator<WebElement> it = alldata.iterator();
	    while(it.hasNext())
	    {
	    	
	    	System.out.print(it.next().getText()+" ");
		    System.out.println();

	    }
	    

	}
	

}
