package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordPage {

    private WebDriver driver;

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "form_submit")
    private WebElement formSubmit;

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getEmailElement(){
        return driver.findElement(By.id("email"));
    }

    public WebElement getFormSubmitElement(){
        return driver.findElement(By.id("form_submit"));
        //return new EmailSentPage(driver);
    }

}
