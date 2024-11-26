package com.fithub.fithub_test;

import com.fithub.fithub_test.Utils.ApplicationLoader;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.fithub.fithub_test.Pages.LoginPage;
import Utils.BaseTest;


public class LoginTests extends BaseTest {

    String loginURL = ApplicationLoader.getProperty("loginURL");
    LoginPage loginPage;

    @Test
    public void checkLoginWithValidCredentials() throws InterruptedException {
        driver.get(loginURL);
        Thread.sleep(5000);
        loginPage = new LoginPage(driver);

        loginPage.fillCredentials("AlisaT123", "AlisaT123");
        loginPage.clickLoginButton();
    }

}

