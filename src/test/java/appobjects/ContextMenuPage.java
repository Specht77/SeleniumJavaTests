package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage{

    private WebDriver driver;
    private By rectangle = By.id("hot-spot");
    WebElement figure;

    Actions actions;

    public ContextMenuPage(WebDriver driver){
        this.driver = driver;
        actions = new Actions(driver);
        figure = driver.findElement(rectangle);
    }

    public WebDriver getDriver(){
        return driver;
    }

    public void rightClick(){
        actions.contextClick(figure).perform();
    }


}
