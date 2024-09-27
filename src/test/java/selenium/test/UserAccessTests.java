package selenium.test;

import org.apache.hc.core5.util.Asserts;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import selenium.model.User;
import selenium.pages.LoginPage;
import selenium.pages.MainPage;
import selenium.service.UserCreator;

public class UserAccessTests extends CommonConditions {

//    @Test
//    public void elementsPresentOnRepositoryPage(){
//        MainPage mainPage = new MainPage(driver)
//                .openPage();
//        SoftAssert softAssert = new SoftAssert();
//        softAssert.assertTrue(mainPage.verifyElementPresence(mainPage.signUpForGitHubField));
//        softAssert.assertTrue(mainPage.verifyElementPresence(mainPage.signUpForGitHubButton));
//        softAssert.assertTrue(mainPage.verifyElementPresence(mainPage.startFreeEnterpriseTrial));
//        softAssert.assertTrue(mainPage.verifyElementPresence(mainPage.searchOrJumpToField));
//        softAssert.assertTrue(mainPage.verifyElementPresence(mainPage.signInButton));
//        softAssert.assertTrue(mainPage.verifyElementPresence(mainPage.signUpButton));
//        softAssert.assertAll();
//    }
//
//    @Test
//    public void oneCanLoginGitHub() {
//        User testUser = UserCreator.withCredentialsFromProperty();
//        String loggedInUserName = new LoginPage(driver)
//                .openPage()
//                .login(testUser)
//                .getLoggedInUserName();
//        Assert.assertEquals(loggedInUserName, testUser.getUsername());
//    }
//
//    @Test
//    public void oneCanLoginGitHubWithEmptyPassword() {
//        User testUser = UserCreator.withEmptyPassword();
//        String loggedInUserName = new LoginPage(driver)
//                .openPage()
//                .login(testUser)
//                .getLoggedInUserName();
//        Assert.assertEquals(loggedInUserName, testUser.getUsername());
//    }

}
