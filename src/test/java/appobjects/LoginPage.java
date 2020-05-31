package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By usernameField = By.id("username"); //instanciando elemento que irei interagir
    private By passwordField = By.id("password"); //instanciando elemento que irei interagir
    private By loginbutton = By.cssSelector("#login button"); //instanciando elemento que irei interagir

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setUsername(String username){ //preenche o campo username
        driver.findElement(usernameField).sendKeys(username);
    }

    public void setPassword(String password){ //preenche o campo senha
        driver.findElement(passwordField).sendKeys(password);
    }

    public SecureAreaPage clickLoginButton(){ //clica no botao Login e retorna a tela seguinte
        driver.findElement(loginbutton).click();
        return new SecureAreaPage(driver);
    }





}
