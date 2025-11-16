package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class LoginPage extends Form {
    private final ITextBox userName = getElementFactory().getTextBox(By.id("user-name"), "UserName");
    private final ITextBox userPass = getElementFactory().getTextBox(By.id("password"), "password");
    private final IButton loginBtn = getElementFactory().getButton(By.id("login-button"), "Login Button");

    public LoginPage(){
        super(By.id("login-button"), "Login Page");
    }

    public boolean isLoginPageDisplayed(){
        return state().waitForDisplayed();
    }

    public void setUsername(String Username){
        userName.clearAndType(Username);
    }

    public void setUserPass(String Password){
        userPass.clearAndType(Password);
    }

    public void clickLoginBtn(){
        loginBtn.click();
    }

}
