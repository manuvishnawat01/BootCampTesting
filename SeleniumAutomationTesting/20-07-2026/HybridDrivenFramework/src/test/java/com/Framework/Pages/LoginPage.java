package com.Framework.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

    WebDriver driver;

    // Create Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(how = How.ID, using = "log_email")
    WebElement email;

    @FindBy(how = How.NAME, using = "log_password")
    WebElement password;

    @FindBy(how = How.XPATH, using = "//input[@name='log_submit']")
    WebElement loginbtn;

    // Create Method
    public void login_EasyCal(String uname, String pass) {

        email.sendKeys(uname);
        password.sendKeys(pass);
        loginbtn.click();
    }
}


