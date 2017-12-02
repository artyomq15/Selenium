package by.bsu.selenium.action.avia;

import by.bsu.selenium.action.AbstractAction;
import by.bsu.selenium.page.avia.AviaPage;


public class AviaAction extends AbstractAction {

    public boolean findAvia(String from, String to){
        AviaPage aviaPage = new AviaPage(webDriver);
        aviaPage.open();
        aviaPage.findAvia(from, to);
        String resultFrom = aviaPage.getFromInput().getAttribute("value");
        String resultTo = aviaPage.getToInput().getAttribute("value");
        return from.equalsIgnoreCase(resultFrom) && to.equalsIgnoreCase(resultTo);
    }
}
