package com.parabank.parasoft.testcases;

import com.parabank.parasoft.pages.HomePage;
import com.parabank.parasoft.pages.LoginPage;
import com.parabank.parasoft.pages.OpenNewAccountPage;
import com.parabank.parasoft.util.General;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenNewAccountTest extends BaseTest {

    @Test(enabled = false)
    public void openAccountShouldSucceed() {
        LoginPage loginPage = page.getInstance(LoginPage.class);
        Assert.assertEquals(loginPage.getPageTittle(), General.LOGIN_TITTLE);

        HomePage homePage = loginPage
                .doLoginViaRegistration();
        Assert.assertTrue(homePage.hasLogoutLink());

        OpenNewAccountPage openNewAccountPage = homePage
                .clickOpenAccountLink()
                .selectAccountType(1)
                .selectAccountNumber(0)
                .clickNewAccountBtn();
        Assert.assertTrue(openNewAccountPage.hasAccountId());

    }

    @Test(priority = 1)
    public void openAccountShouldSucceed2() {
        OpenNewAccountPage newAccountPage = page.getInstance(LoginPage.class)
                .doLoginViaRegistration()
                .clickOpenAccountLink()
                .selectAccountType(1)
                .selectAccountNumber(0)
                .clickNewAccountBtn();
        Assert.assertTrue(newAccountPage.hasAccountId());

    }

    @Test(priority = 0)
    public void openAccountShouldSucceed1() {
        OpenNewAccountPage newAccountPage = page.getInstance(LoginPage.class)
                .doLoginViaRegistration()
                .clickOpenAccountLink()
                .clickNewAccountBtn();
        Assert.assertTrue(newAccountPage.hasAccountId());

    }
}
