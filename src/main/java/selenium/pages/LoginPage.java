package selenium.pages;

import org.apache.hc.client5.http.impl.classic.MainClientExec;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import selenium.model.User;


public class LoginPage extends AbstractPage{

    private final Logger logger = LogManager.getRootLogger();
    private final String PAGE_URL = "https://github.com/login";

    @FindBy (id = "login_field")
    private WebElement inputLogin;

    @FindBy (id = "password")
    private WebElement inputPassword;

    @FindBy (xpath = "//input[@value='Sign in']")
    private WebElement buttonSubmit;



    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public LoginPage openPage() {
        driver.navigate().to(PAGE_URL);
        logger.info("Login page opened");
        return this;
    }

    public MainPage login(User user) {
        inputLogin.sendKeys(user.getUsername());
        inputPassword.sendKeys(user.getPassword());
        buttonSubmit.click();
        logger.info("Login performed");
        return new MainPage(driver);
    }



}
