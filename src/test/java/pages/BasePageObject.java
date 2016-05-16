package pages;

import org.openqa.selenium.WebDriver;
import support.Constants;
import support.LHSMenuComponent;


public abstract class BasePageObject {

    protected static WebDriver driver;
    LHSMenuComponent menuComponent;

    public BasePageObject(WebDriver driver){
        this.driver = driver;
        menuComponent = new LHSMenuComponent(driver);
    }

    public abstract String getPageTitle();

    public WebDriver getDriver(){
        return driver;
    }

    public HomePage navigateToWebApp(){
        driver.navigate().to(Constants.WEBAPP_URL);
        return new HomePage(driver);
    }

    public LHSMenuComponent mainMenu(){
        return menuComponent;
    }
}
