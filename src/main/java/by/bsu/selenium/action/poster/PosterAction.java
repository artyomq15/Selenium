package by.bsu.selenium.action.poster;


import by.bsu.selenium.action.AbstractAction;
import by.bsu.selenium.constant.ElementXPath;
import by.bsu.selenium.page.afisha.PostersPage;
import by.bsu.selenium.page.passport.PassportFavoritePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PosterAction extends AbstractAction {

    public String addPoster(){
        PostersPage postersPage = new PostersPage(webDriver);
        List<WebElement> posters = postersPage.getPostersList();
        WebElement posterToAdd = posters.get(0);
        String title = posterToAdd.findElement(new By.ByCssSelector("h2")).getText();
        postersPage.addPoster(posterToAdd);
        return title;
    }


    public boolean posterIsAdded(String name) {
        PassportFavoritePage passportFavoritePage = new PassportFavoritePage(webDriver);
        List<WebElement> posters = passportFavoritePage.getPostersList();
        if (posters.size() == 0) {
            return false;
        }
        for (WebElement poster : posters) {
            String title = poster.findElement(new By.ByXPath(ElementXPath.MY_POSTERS_NAME)).getText();
            if (name.equalsIgnoreCase(title)){
                return true;
            }
        }
        return false;
    }

}

