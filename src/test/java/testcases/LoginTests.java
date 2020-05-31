package testcases;

import testcases.BaseTests;
import org.testng.annotations.Test;
import appobjects.LoginPage;
import appobjects.SecureAreaPage;

import static org.testng.Assert.*;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfullLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication(); //utiliza metodo herdado para clicar no link para a tela de login
        loginPage.setUsername("tomsmith"); //preenche campo username
        loginPage.setPassword("SuperSecretPassword!"); //preenche campo password
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton(); //clica no botao login
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"), "Alert text is incorret"); //valida se o texto esperado está sendo exibido
    }


}