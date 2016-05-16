package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import support.TestParent;

/**
 * Created by Bharat on 09/05/2016.
 */
public class SampleTest extends TestParent {

    @Test
    public void test(){

        driver.get("http://thetestroom.com/webapp");
        HomePage homePage = new HomePage(driver);
        homePage.mainMenu().clickContactPage();
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
