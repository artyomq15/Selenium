package by.bsu.selenium.action.poster;

import by.bsu.selenium.action.auth.SignInAction;
import by.bsu.selenium.action.profile.PassportAction;
import by.bsu.selenium.page.passport.PassportFavoritePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PosterActionTest {
    private SignInAction signInAction;
    private PassportAction passportAction;
    private PosterAction posterAction;

    private final String LOGIN = "qqqartemwww";
    private final String PASSWORD = "1q2w3e1Q2W3E";


    @BeforeMethod
    public void setUp() {
        signInAction = new SignInAction();
        passportAction = new PassportAction();
        posterAction = new PosterAction();
        signInAction.initDriver();
        passportAction.initDriver();
        posterAction.initDriver();
    }

    @Test
    public void testPosterIsAdded() throws Exception {
        signInAction.signIn(LOGIN,PASSWORD);
        passportAction.goToFavoritesPage();
        passportAction.goToPostersPage();
        String title = posterAction.addPoster();
        passportAction.goToFavoritesPage();
        Assert.assertTrue(posterAction.posterIsAdded(title));
    }

    @AfterMethod
    public void stopBrowser() {
        signInAction.closeDriver();
    }

}