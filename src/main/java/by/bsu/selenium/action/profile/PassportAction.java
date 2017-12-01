package by.bsu.selenium.action.profile;

import by.bsu.selenium.action.AbstractAction;
import by.bsu.selenium.page.passport.PassportFavoritePage;


import by.bsu.selenium.page.passport.PassportProfilePage;

public class PassportAction extends AbstractAction{

    public void goToPassportPage(){
        PassportProfilePage passportProfilePage = new PassportProfilePage(webDriver);
        passportProfilePage.open();
    }

    public boolean goToFavoritesPage(){
        PassportProfilePage passportProfilePage = new PassportProfilePage(webDriver);
        PassportFavoritePage passportFavoritePage = new PassportFavoritePage(webDriver);

        passportProfilePage.open();

        passportProfilePage.getPassportPageHeader().goToFavorites();

        return passportFavoritePage.getVideos().isDisplayed() &&
                passportFavoritePage.getCollections().isDisplayed() &&
                passportFavoritePage.getPosters().isDisplayed() &&
                passportFavoritePage.getMarket().isDisplayed();
    }


}
