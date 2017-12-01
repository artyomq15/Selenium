package by.bsu.selenium.action.profile;

import by.bsu.selenium.action.auth.SignInAction;
import by.bsu.selenium.page.passport.PassportFavoritePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class PassportActionTest {
    private SignInAction signInAction;
    private PassportAction passportAction;

    private final String LOGIN = "qqqartemwww";
    private final String PASSWORD = "1q2w3e1Q2W3E";

    @BeforeMethod
    public void setUp() {
        signInAction = new SignInAction();
        passportAction = new PassportAction();
        signInAction.initDriver();
        passportAction.initDriver();
    }

    @Test
    public void testGoToFavoritesPage() throws Exception {
        signInAction.signIn(LOGIN,PASSWORD);
        passportAction.goToPassportPage();
        Assert.assertTrue(passportAction.goToFavoritesPage());
    }

    @AfterMethod
    public void stopBrowser() {
        signInAction.closeDriver();
    }

}