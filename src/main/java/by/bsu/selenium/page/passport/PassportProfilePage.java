package by.bsu.selenium.page.passport;

import by.bsu.selenium.constant.ElementXPath;
import by.bsu.selenium.constant.LogMessage;
import by.bsu.selenium.constant.PageURL;
import by.bsu.selenium.page.AbstractPage;
import org.openqa.selenium.WebDriver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PassportProfilePage extends AbstractPage{
    private final Logger LOGGER = LogManager.getLogger(PassportProfilePage.class);

    private PassportPageHeader passportPageHeader = new PassportPageHeader(webDriver);

    @FindBy(xpath = ElementXPath.USER_NAME)
    private WebElement userName;

    @FindBy(xpath = ElementXPath.LOGIN_NAME)
    private WebElement loginName;

    public PassportProfilePage(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement getUserName() {
        return userName;
    }

    public WebElement getLoginName() {
        return loginName;
    }

    @Override
    public void open() {
        webDriver.navigate().to(PageURL.PASSPORT_PROFILE_PAGE);
        LOGGER.info(LogMessage.PASSPORT_OPENED);
    }

    public String getLoginNameValue(){
        return loginName.getText();
    }

    public String getUserNameValue(){
        return userName.getText();
    }

    public PassportPageHeader getPassportPageHeader(){
        return passportPageHeader;
    }
}
