package by.bsu.selenium.page.afisha;

import by.bsu.selenium.constant.ElementXPath;
import by.bsu.selenium.constant.LogMessage;
import by.bsu.selenium.page.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;


public class PostersPage extends AbstractPage{
    private final Logger LOGGER = LogManager.getLogger(PostersPage.class);

    @FindBy(xpath = ElementXPath.POSTERS_ON_PAGE)
    private WebElement postersOnPage;

    public PostersPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    public void open() {

    }

    public List<WebElement> getPostersList(){
        By postersList = new By.ByXPath(ElementXPath.POSTER);
        LOGGER.info(LogMessage.GETTING_POSTERS_FROM_POSTER_PAGE);
        return postersOnPage.findElements(postersList);
    }

    public void addPoster(WebElement poster){
        poster.click();
        WebElement webElement = webDriver.findElement(new By.ByXPath("/html/body/div[6]/div/div/div/div/div/main/div[2]/div[5]/button"));
        webElement.click();
    }
}
