package KiteUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class NewUtilityprop {

	
	
	
	public static void capturescreenshot(WebDriver driver,String tCid) throws IOException
	{
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest = new File("E:\\screenshot\\png\\myscreenshot"+tCid+".png");
		FileHandler.copy(scr, dest);
	
	}
	
	public static String getDataFromPropertiFile(String key) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream myfile=new FileInputStream("E:\\Velocity\\eclips\\26_Selenium\\MyProperties.properties");
		prop.load(myfile);
		String value = prop.getProperty(key);
		return value;
		
		
	}
}
