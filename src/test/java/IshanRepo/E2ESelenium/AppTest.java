package IshanRepo.E2ESelenium;

import static org.testng.AssertJUnit.assertTrue;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        System.setProperty("webdriver.chrome.driver", "‪C:\\Users\\ishan\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wps.com/en-IN/download/");
    }
}
