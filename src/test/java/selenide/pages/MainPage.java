package selenide.pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static java.time.Duration.ofSeconds;

public class MainPage {
    private final String BASE_URL = "https://github.com/";

    public By signUpForGitHubField = By.xpath("//*[@id='hero_user_email']");
    public By signUpForGitHubButton = By.xpath("//*[@id='hero_user_email']/following-sibling::button");
    public By startFreeEnterpriseTrial = By.xpath("//*[@id='hero_user_email']/../../following-sibling::a");
    public By searchOrJumpToField = By.xpath("//div/qbsearch-input");
    public By signInButton = By.xpath("//div[contains(@class, 'HeaderMenu')]/a[contains(@class, 'sign-in')]");
    public By signUpButton = By.xpath("//div[contains(@class, 'HeaderMenu')]//a[contains(@class, 'sign-up')]");
    private By linkLoggedInUserLocator = By.xpath("//meta[@name='user-login']");

    public MainPage openMainPage() {
        Selenide.open(BASE_URL);
        return this;
    }

    public MainPage verifyElementPresence(By element) {
        $(element).shouldBe(visible, ofSeconds(10));
        return this;
    }

    public String getLoggedInUserName() {
        return $(linkLoggedInUserLocator)
                .getAttribute("content");
    }

}
