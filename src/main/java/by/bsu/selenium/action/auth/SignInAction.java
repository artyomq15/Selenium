package by.bsu.selenium.action.auth;

import by.bsu.selenium.action.AbstractAction;
import by.bsu.selenium.page.auth.SignInPage;
import by.bsu.selenium.page.passport.PassportProfilePage;

public class SignInAction extends AbstractAction {

    public void signIn(String login, String password){
        SignInPage signInPage = new SignInPage(webDriver);
        signInPage.open();
        signInPage.signIn(login,password);
    }

    public boolean isSignedIn(String login){
        PassportProfilePage passportProfilePage = new PassportProfilePage(webDriver);
        passportProfilePage.open();
        String loginName = "";
        if (passportProfilePage.getLoginName().isEnabled()){
            loginName = passportProfilePage.getLoginNameValue();
        }
        System.out.println(loginName);
        return login.equalsIgnoreCase(loginName);
    }

    public boolean failedSignIn(String login, String password){
        SignInPage signInPage = new SignInPage(webDriver);
        signInPage.open();
        signInPage.signIn(login,password);
        return signInPage.getErrorMessage().isDisplayed();
    }

}
