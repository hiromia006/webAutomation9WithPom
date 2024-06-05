package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TransferFundsPage extends BasePage {
    public TransferFundsPage(WebDriver driver) {
        super(driver);
    }

    public TransferFundsPage clickTransferFundsLink() {
        getWebElement(By.cssSelector("input[value='Transfer']")).click();
        return this;
    }

    public boolean hasCompleteTransfer() {
        return getWebElements(By.cssSelector("div[id='showResult'] h1[class='title']")).size() > 0;
    }
}
