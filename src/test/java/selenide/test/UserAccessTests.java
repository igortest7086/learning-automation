package selenide.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenide.model.User;
import selenide.pages.LoginPage;
import selenide.pages.MainPage;
import selenide.service.UserCreator;

public class UserAccessTests {
    @Test
    public void elementsPresentOnRepositoryPage() {
        MainPage mainPage = new MainPage();
        mainPage.openMainPage()
                .verifyElementPresence(mainPage.signUpForGitHubField)
                .verifyElementPresence(mainPage.signUpForGitHubButton)
                .verifyElementPresence(mainPage.startFreeEnterpriseTrial)
                .verifyElementPresence(mainPage.searchOrJumpToField)
                .verifyElementPresence(mainPage.signInButton)
                .verifyElementPresence(mainPage.signUpButton);
    }


    @Test
    public void oneCanLoginGitHub() {
        User testUser = UserCreator.withCredentialsFromProperty();
        LoginPage loginPage = new LoginPage();
        String loggedInUserName = loginPage
                .openLoginPage()
                .login(testUser)
                .getLoggedInUserName();
        Assert.assertEquals(loggedInUserName, testUser.getUsername());

    }

    @Test
    public void oneCanLoginGitHubWithEmptyPassword() {
        User testUser = UserCreator.withEmptyPassword();
        LoginPage loginPage = new LoginPage();
        String loggedInUserName = loginPage
                .openLoginPage()
                .login(testUser)
                .getLoggedInUserName();
        Assert.assertEquals(loggedInUserName, testUser.getUsername());

    }
    
}
