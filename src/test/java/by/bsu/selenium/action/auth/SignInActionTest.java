package by.bsu.selenium.action.auth;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInActionTest {
    private SignInAction signInAction;

    private final String LOGIN = "qqqartemwww";
    private final String PASSWORD = "1q2w3e1Q2W3E";
    private final String WRONG_PASSWORD = "111222333qqqwwweee";

    @BeforeMethod
    public void setUp() {
        signInAction = new SignInAction();
        signInAction.initDriver();
    }

    @Test
    public void testIsSignedIn() throws Exception {
        signInAction.signIn(LOGIN, PASSWORD);
        Assert.assertTrue(signInAction.isSignedIn(LOGIN));
    }


    @Test
    public void testFailedSignIn() throws Exception {
        Assert.assertTrue(signInAction.failedSignIn(LOGIN,WRONG_PASSWORD));
    }

    @AfterMethod
    public void stopBrowser() {
        signInAction.closeDriver();
    }

}