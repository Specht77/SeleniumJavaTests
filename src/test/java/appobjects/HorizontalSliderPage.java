package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {

    private WebDriver driver;
    private By horizontalSlider = By.xpath("//input");

    public HorizontalSliderPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickSlider(){
        driver.findElement(horizontalSlider).click();
    }

    public void moveSlider(boolean direction, int xTimes){ //false move para esquerda, true move para direita
        int i = 0;
        Keys moveTo;
        if(direction == false){
            moveTo = Keys.ARROW_LEFT;
        }
        else{
            moveTo = Keys.ARROW_RIGHT;
        }
        while(i < xTimes){
        driver.findElement(horizontalSlider).sendKeys(moveTo);
        i++;}
    }

    public String getSliderValue(){
        return driver.findElement(By.id("range")).getText();
    }

}
