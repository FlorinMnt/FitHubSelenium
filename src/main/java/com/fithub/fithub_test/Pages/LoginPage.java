package com.fithub.fithub_test.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.fithub.fithub_test.Utils.BasePage;

public class LoginPage extends BasePage {

    // search elements
    @FindBy(xpath = "//*[@id = 'email']")//cautare cu xpath pentru a cauta dupa id
    WebElement emailTextBox;

    @FindBy(id = "password")
    WebElement passwordTextBox;

    @FindBy(xpath = "//*[@type='submit']")
    WebElement loginButton;

    // constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // methods
    public void fillCredentials(String email, String password) {
        emailTextBox.sendKeys(email);
        passwordTextBox.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }
}
