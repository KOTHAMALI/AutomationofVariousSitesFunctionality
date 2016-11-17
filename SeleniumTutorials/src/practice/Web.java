package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Web {

    private static WebDriver driver = null;
    private static final String dragAndDrop = "http://html5demos.com/drag";
    private static final String w3URL = "http://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm";
    private static final String  URL = "https://facebook.com/";
    private static final String expedia = "https://www.expedia.com/";
    private static final String yahoo = "https://www.yahoo.com";
    private static final String dhtxl = "https://dhtmlx.com/";
    
    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        Web.driver = driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @BeforeClass
    public void intializeWebDriver() {
       
        
        System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
          //driver.get(URL);
        driver.get(dhtxl);
          //driver.get(expedia);
    }
    
    @AfterClass
    public void tearDown() {
        if(driver != null) {
            driver.manage().deleteAllCookies();
            driver.quit();
        }
    }
}