package selenium.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage extends AbstractPage {

    private final String BASE_URL = "https://github.com/";

    public By signUpForGitHubField = By.xpath("//*[@id='hero_user_email']");
    public By signUpForGitHubButton = By.xpath("//*[@id='hero_user_email']/following-sibling::button");
    public By startFreeEnterpriseTrial = By.xpath("//*[@id='hero_user_email']/../../following-sibling::a");
    public By searchOrJumpToField = By.xpath("//div/qbsearch-input");
    public By signInButton = By.xpath("//div[contains(@class, 'HeaderMenu')]/a[contains(@class, 'sign-in')]");
    public By signUpButton = By.xpath("//div[contains(@class, 'HeaderMenu')]//a[contains(@class, 'sign-up')]");
    private By linkLoggedInUserLocator = By.xpath("//meta[@name='user-login']");

    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, driver);
    }

    @Override
    public MainPage openPage() {
        driver.navigate().to(BASE_URL);
        return this;
    }

    public boolean verifyElementPresence(By element) {
        return driver.findElement(element).isDisplayed();
    }

    public String getLoggedInUserName() {
        WebElement linkLoggedInUser = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIMEOUT_SECONDS))
                .until(ExpectedConditions.presenceOfElementLocated(linkLoggedInUserLocator));
        return linkLoggedInUser.getAttribute("content");
    }

}
