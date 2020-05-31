package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import appobjects.AlertsPage;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {

    private WebDriver driver;

    @Test
    public void testContextClick(){
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.rightClick();
        var alertsPage = new AlertsPage(contextMenuPage.getDriver());
        assertEquals(alertsPage.alert_getText(), "You selected a context menu", "Result text incorrect");
    }

}
