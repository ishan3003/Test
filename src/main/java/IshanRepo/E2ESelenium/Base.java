package IshanRepo.E2ESelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {

	public WebDriver driver;
	public void InitializeDriver() throws IOException
	{
		Properties property = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\ishan\\eclipse-workspace\\E2ESelenium\\src\\main\\java\\IshanRepo\\E2ESelenium\\Data.properties");
		property.load(fis);
		String browser = property.getProperty("browser");
		if(browser == "chrome")
		{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\ishan\\Downloads\\selenium-java-3.141.59\\chromedriver.exe")	;
		 driver = new ChromeDriver();
		 
		}
		else if (browser =="edge")
		{
			System.setProperty("webdriver.edge.driver","C:\\Users\\ishan\\Downloads\\selenium-java-3.141.59\\msedgedriver.exe");
	        driver = new EdgeDriver();
		}
	}
}
