package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenNewAccountPage extends BasePage {
    public OpenNewAccountPage(WebDriver driver) {
        super(driver);
    }

    public OpenNewAccountPage selectAccountType(int index) {
        new Select(getWebElement(By.id("type"))).selectByIndex(index);
        return this;
    }

    public OpenNewAccountPage selectAccountNumber(int index) {
        new Select(getWebElement(By.id("fromAccountId"))).selectByIndex(index);
        return this;
    }

    public OpenNewAccountPage clickNewAccountBtn() {
        getWebElement(By.cssSelector("input[value='Open New Account']")).click();
        return this;
    }

    public boolean hasAccountId() {
        return getWebElements(By.id("newAccountId")).size() > 0;
    }
}
