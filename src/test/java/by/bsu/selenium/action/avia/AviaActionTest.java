package by.bsu.selenium.action.avia;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class AviaActionTest {
    private AviaAction aviaAction;

    private final String FROM = "Минск";
    private final String TO = "Саратов";

    @BeforeMethod
    public void setUp() {
        aviaAction = new AviaAction();

        aviaAction.initDriver();
    }

    @Test
    public void testFindAvia() throws Exception {
        Assert.assertTrue(aviaAction.findAvia(FROM, TO));
    }

    @AfterMethod
    public void stopBrowser() {
        aviaAction.closeDriver();
    }

}
