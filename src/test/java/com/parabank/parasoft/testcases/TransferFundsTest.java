package com.parabank.parasoft.testcases;

import com.parabank.parasoft.pages.LoginPage;
import com.parabank.parasoft.pages.TransferFundsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TransferFundsTest extends BaseTest {
    @Test
    public void transferFundsShouldSucceed() {
        TransferFundsPage fundsPage = page.getInstance(LoginPage.class)
                .doLoginViaRegistration()
                .clickTransferFundLink()
                .clickTransferFundsLink();
        Assert.assertTrue(fundsPage.hasCompleteTransfer());
    }
}
