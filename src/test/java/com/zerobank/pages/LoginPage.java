package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "user_login")
    public WebElement usernameInputBox;

    @FindBy(id = "user_password")
    public WebElement passwordInputBox;

    @FindBy(name = "submit")
    public WebElement signInButton;

    @FindBy(id = "primary-button")
    public WebElement backToSafetyBtn;

    public void login(String username, String password){
        usernameInputBox.sendKeys(username);
        passwordInputBox.sendKeys(password);
        signInButton.click();
        backToSafetyBtn.click();
//        Alert changePassword= Driver.get().switchTo().alert();
//        changePassword.accept();
    }


}
