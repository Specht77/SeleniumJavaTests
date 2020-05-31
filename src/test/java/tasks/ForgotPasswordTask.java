package tasks;

import appobjects.EmailSentPage;
import appobjects.ForgotPasswordPage;

import appobjects.HomePage;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordTask{

    private WebDriver driver;
    private HomePage homePage;
    private ForgotPasswordPage forgotPasswordPage;
    public ForgotPasswordTask(WebDriver driver){
        this.driver = driver;
        forgotPasswordPage = homePage.clickForgotPassword();
    }


    public void setEmail(String email){
        forgotPasswordPage.getEmailElement().sendKeys(email);

    }

    public void clickRetrievePassword(){
        forgotPasswordPage.getFormSubmitElement().click();
    }

//
//    assertTrue(emailSentPage.getContentText().contains("Your e-mail's been sent!"), "Expected text is not found!");
}
