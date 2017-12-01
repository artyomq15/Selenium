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

public class PassportFavoritePage extends AbstractPage {
    private final Logger LOGGER = LogManager.getLogger(PassportFavoritePage.class);

    private PassportPageHeader passportPageHeader = new PassportPageHeader(webDriver);

    @FindBy(xpath = ElementXPath.FAVORITES_VIDEOS)
    private WebElement videos;

    @FindBy(xpath = ElementXPath.FAVORITES_COLLECTIONS)
    private WebElement collections;

    @FindBy(xpath = ElementXPath.FAVORITES_POSTERS)
    private WebElement posters;

    @FindBy(xpath = ElementXPath.FAVORITES_MARKET)
    private WebElement market;

    public PassportFavoritePage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    public void open() {
        webDriver.navigate().to(PageURL.PASSPORT_FAVORITE_PAGE);
        LOGGER.info(LogMessage.PASSPORT_GO_TO_FAVORITE);
    }

    public PassportPageHeader getPassportPageHeader() {
        return passportPageHeader;
    }

    public WebElement getVideos() {
        return videos;
    }

    public WebElement getCollections() {
        return collections;
    }

    public WebElement getPosters() {
        return posters;
    }

    public WebElement getMarket() {
        return market;
    }
}
