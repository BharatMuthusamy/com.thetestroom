package pages;

import org.openqa.selenium.WebDriver;


public class HomePage extends BasePageObject {


    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getPageTitle() {
        return null;
    }
}
