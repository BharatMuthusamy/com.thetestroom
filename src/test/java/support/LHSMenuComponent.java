package support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AboutPage;
import pages.AdoptionPage;
import pages.ContactPage;
import pages.HomePage;

/**
 * Created by Bharat on 09/05/2016.
 */
public class LHSMenuComponent {

    private WebDriver driver;
    private WebElement mainMenu;
    private WebDriverWait wait;

    public LHSMenuComponent(WebDriver driver){
        this.driver = driver;
        mainMenu = driver.findElement(By.cssSelector("td.left_link h1"));
        wait = new WebDriverWait(driver,10);
    }

    public HomePage clickHomePage(){
        wait.until(ExpectedConditions.visibilityOf(mainMenu));
        mainMenu.findElement(By.linkText("HOME")).click();
        return new HomePage(driver);
    }

    public AdoptionPage clickAdoptionPage(){
        wait.until(ExpectedConditions.visibilityOf(mainMenu));
        mainMenu.findElement(By.linkText("ADOPTION")).click();
        return new AdoptionPage(driver);
    }

    public AboutPage clickAboutPage(){
        wait.until(ExpectedConditions.visibilityOf(mainMenu));
        mainMenu.findElement(By.linkText("ABOUT")).click();
        return new AboutPage(driver);
    }

    public ContactPage clickContactPage(){
        wait.until(ExpectedConditions.visibilityOf(mainMenu));
        mainMenu.findElement(By.linkText("CONTACT")).click();
        return new ContactPage(driver);
    }
}
