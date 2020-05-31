package testcases;

import testcases.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HorizontalSliderTests extends BaseTests {

    private WebDriver driver;

    @Test
    public void moveSlider(){
        var horizontalPage = homePage.clickHorizontalSlider();
        //horizontalPage.clickSlider(); //não é necessario clicar para interagir
        horizontalPage.moveSlider(true, 8); // cada movimento incrementa 0,5
        horizontalPage.moveSlider(false, 2); // true move para direita, false move para esquerda
        assertEquals(horizontalPage.getSliderValue(), "3");
    }
}
