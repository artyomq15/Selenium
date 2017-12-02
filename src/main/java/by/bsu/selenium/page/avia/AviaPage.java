package by.bsu.selenium.page.avia;


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

public class AviaPage extends AbstractPage{
    private final Logger LOGGER = LogManager.getLogger(AviaPage.class);

    @FindBy(name = ElementName.FROM)
    private WebElement fromInput;

    @FindBy(name = ElementName.TO)
    private WebElement toInput;

    @FindBy(xpath = ElementXPath.BUTTON)
    private WebElement button;


    public AviaPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    public void open() {
        webDriver.navigate().to(PageURL.AVIA_PAGE);
        LOGGER.info(LogMessage.AVIA_OPENED);
    }

    public void findAvia(String from, String to){
        fromInput.clear();
        fromInput.sendKeys(from);
        toInput.clear();
        toInput.sendKeys(to);
        button.submit();
        LOGGER.info(LogMessage.AVIA_PERFORMED);
    }

    public WebElement getFromInput() {
        return fromInput;
    }

    public WebElement getToInput() {
        return toInput;
    }
}
