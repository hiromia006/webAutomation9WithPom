package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean hasLogoutLink() {
        return getWebElements(By.cssSelector("a[href='logout.htm']")).size() > 0;
    }

    public OpenNewAccountPage clickOpenAccountLink() {
        addInfo("This is Home Page");
        By accountL=By.cssSelector("a[href='openaccount.htm']");
        waitForElement(accountL);
        getWebElement(accountL).click();
        return getInstance(OpenNewAccountPage.class);
    }

    public TransferFundsPage clickTransferFundLink() {
        waitForElement(By.cssSelector("a[href='transfer.htm']"));
        getWebElement(By.cssSelector("a[href='transfer.htm']")).click();
        return getInstance(TransferFundsPage.class);
    }
}
