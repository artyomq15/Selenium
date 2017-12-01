package by.bsu.selenium.page.passport;

import by.bsu.selenium.constant.ElementXPath;
import by.bsu.selenium.constant.LogMessage;
import by.bsu.selenium.page.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PassportPageHeader extends AbstractPage {
    private final Logger LOGGER = LogManager.getLogger(PassportProfilePage.class);

    @FindBy(xpath = ElementXPath.PROFILE_MAIN_BUTTON)
    private WebElement mainButton;

    @FindBy(xpath = ElementXPath.PROFIlE_PURCHASES_BUTTON)
    private WebElement purchasesButton;

    @FindBy(xpath = ElementXPath.PROFILE_FAVORITES_BUTTON)
    private WebElement favoritesButton;

    public PassportPageHeader(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    public void open() {

    }

    public void goToMain() {
        mainButton.click();
        LOGGER.info(LogMessage.PASSPORT_GO_TO_PROFILE);
    }

    public void goToPurchases() {
        purchasesButton.click();
        LOGGER.info(LogMessage.PASSPORT_GO_TO_PURCHASES);
    }

    public void goToFavorites() {
        favoritesButton.click();
        LOGGER.info(LogMessage.PASSPORT_GO_TO_FAVORITE);
    }

}
