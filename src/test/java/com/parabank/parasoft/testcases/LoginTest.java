package com.parabank.parasoft.testcases;

import com.parabank.parasoft.pages.HomePage;
import com.parabank.parasoft.pages.LoginPage;
import com.parabank.parasoft.util.General;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void doLoginWithUsernameShouldFail() {
        LoginPage loginPage = page.getInstance(LoginPage.class);
        loginPage = loginPage
                .fillUsername("daasdsa")
                .clickLoginLinkBtn();
        Assert.assertTrue(loginPage.hasError());

        LoginPage loginPage2 = page.getInstance(LoginPage.class)
                .fillUsername("daasdsa")
                .clickLoginLinkBtn();
        Assert.assertTrue(loginPage2.hasError());
    }


    @Test
    public void doLoginWithPasswordShouldFail() {
        LoginPage loginPage = page.getInstance(LoginPage.class);
        loginPage = loginPage
                .fillPassword("daasdsa")
                .clickLoginLinkBtn();
        Assert.assertTrue(loginPage.hasError());
    }

    @Test
    public void doLoginShouldFail() {
        LoginPage loginPage = page.getInstance(LoginPage.class);
        loginPage = loginPage
                .clickLoginLinkBtn();
        Assert.assertTrue(loginPage.hasError());
    }

    @Test
    public void doLoginShouldSucceed() {
        HomePage overviewPage = page.getInstance(LoginPage.class)
                .fillUsername(getUsername())
                .fillPassword(getPassword())
                .clickLoginBtn();
        Assert.assertTrue(overviewPage.hasLogoutLink());
    }

    @Test
    public void checkTittle() {
        LoginPage loginPage = page.getInstance(LoginPage.class);
        Assert.assertEquals(loginPage.getPageTittle(), General.LOGIN_TITTLE);
    }
}
