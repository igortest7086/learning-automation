package selenide.pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import selenide.model.User;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static java.time.Duration.ofSeconds;

public class LoginPage {

    private final String PAGE_URL = "https://github.com/login";

    private By inputLogin = By.id("login_field");
    private By inputPassword = By.id("password");
    private By buttonSubmit = By.xpath("//input[@value='Sign in']");

    public LoginPage openLoginPage() {
        Selenide.open(PAGE_URL);
        return this;
    }

    public MainPage login(User user) {
        $(inputLogin).shouldBe(visible, ofSeconds(10)).sendKeys(user.getUsername());
        $(inputPassword).shouldBe(visible, ofSeconds(10)).sendKeys(user.getPassword());
        $(buttonSubmit).shouldBe(visible, ofSeconds(10)).click();
        return new MainPage();
    }

}


