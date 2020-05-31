package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import appobjects.EmailSentPage;
import appobjects.ForgotPasswordPage;
import tasks.ForgotPasswordTask;

import static org.testng.Assert.assertTrue;

public class ForgotPasswordTests extends BaseTests {


    private WebDriver driver;
    @Test
    public void testSuccessfullPasswordRetrieve(){
        ForgotPasswordTask forgotPasswordTask = new ForgotPasswordTask(driver);
        forgotPasswordTask.setEmail("tau@tau.com");
        forgotPasswordTask.clickRetrievePassword();
//        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword(); //utiliza metodo herdado para clicar no link para a tela de recuperação de senha
//        forgotPasswordPage.setEmail("tau@tau.com");
//        EmailSentPage emailSentPage = forgotPasswordPage.clickRetrievePassword(); //clica no botao de recuperar senha
//        assertTrue(emailSentPage.getContentText().contains("Your e-mail's been sent!"), "Expected text is not found!"); //valida se o texto esperado está sendo exibido
    }


}



