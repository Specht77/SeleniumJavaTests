package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {

    private WebDriver driver;
    private String frameTop = "frame-top";
    private String frameLeft = "frame-left";
    private String frameBottom = "frame-bottom";
    private By body = By.tagName("body");


    public NestedFramesPage(WebDriver driver){
        this.driver = driver;
    }


    public String switchToLeftFrame(){
        driver.switchTo().frame(frameTop);
        driver.switchTo().frame(frameLeft);
        String content = getText();
        switchToParentFrame();
        switchToParentFrame();
        return content;
    }

    public String switchToBottomFrame(){
        driver.switchTo().frame(frameBottom);
        String content = getText();
        switchToParentFrame();
        return content;
    }

    public String getText(){
        return driver.findElement(body).getText();
    }

    public void switchToParentFrame() {
            driver.switchTo().parentFrame();

    }


}
