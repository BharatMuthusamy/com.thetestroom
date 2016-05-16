package support;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class TestParent {

    protected static WebDriver driver;

    @BeforeTest
    public static void setUp(){
        driver = DriverHelper.getDriverToUse();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterTest
    public static void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }
}
