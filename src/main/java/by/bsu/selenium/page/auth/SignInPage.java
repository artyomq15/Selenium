package by.bsu.selenium.page.auth;

import by.bsu.selenium.constant.ElementName;
import by.bsu.selenium.constant.ElementXPath;
import by.bsu.selenium.constant.LogMessage;
import by.bsu.selenium.constant.PageURL;
import by.bsu.selenium.page.AbstractPage;
import org.openqa.selenium.WebDriver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends AbstractPage {
    private final Logger LOGGER = LogManager.getLogger(SignInPage.class);

    @FindBy(name = ElementName.LOGIN)
    private WebElement inputLogin;

    @FindBy(name = ElementName.PASSWORD)
    private WebElement inputPassword;

    @FindBy(xpath = ElementXPath.SIGN_IN_BUTTON)
    private WebElement buttonSignIn;

    @FindBy(xpath = ElementXPath.ERROR_SIGN_IN_MESSAGE)
    private WebElement errorMessage;

    public SignInPage(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement getInputLogin() {
        return inputLogin;
    }

    public WebElement getInputPassword() {
        return inputPassword;
    }

    public WebElement getButtonSignIn() {
        return buttonSignIn;
    }

    public WebElement getErrorMessage() {
        return errorMessage;
    }

    @Override
    public void open() {
        webDriver.navigate().to(PageURL.SIGN_IN_PAGE);
        LOGGER.info(LogMessage.SIGN_IN_OPENED);
    }

    public void signIn(String login, String password){
        inputLogin.sendKeys(login);
        inputPassword.sendKeys(password);
        buttonSignIn.click();
        LOGGER.info(LogMessage.SIGN_IN_PERFORMED);
    }

    public String getErrorMessageValue(){
        return errorMessage.getText();
    }


}
