package com.parabank.parasoft.pages;

import com.thedeanda.lorem.LoremIpsum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage fillUsername(String username) {
        getWebElement(By.cssSelector("input[name='username']")).sendKeys(username);
        return this;
    }

    public LoginPage fillPassword(String password) {
        getWebElement(By.cssSelector("input[name='password']")).sendKeys(password);
        return this;
    }

    public HomePage clickLoginBtn() {
        getWebElement(By.cssSelector("input[value='Log In']")).click();
        return getInstance(HomePage.class);
    }

    public LoginPage clickLoginLinkBtn() {
        getWebElement(By.cssSelector("input[value='Log In']")).click();
        return this;
    }

    public CustomerLookupPage ClickForgetLink() {
        getWebElement(By.cssSelector("a[href='lookup.htm']")).click();
        return getInstance(CustomerLookupPage.class);
    }

    public RegisterPage clickRegistrationLink() {
        getWebElement(By.cssSelector("a[href='register.htm']")).click();
        return getInstance(RegisterPage.class);
    }

    public boolean hasError() {
        return getWebElements(By.className("error")).size() > 0;
    }

    public HomePage doLogin(String username, String password) {
        return fillUsername(username)
                .fillPassword(password)
                .clickLoginBtn();
    }

    public HomePage doLoginViaRegistration() {
        String username = LoremIpsum.getInstance().getName();
        return getInstance(LoginPage.class)
                .clickRegistrationLink()
                .fillFirstName(LoremIpsum.getInstance().getFirstName())
                .fillLastName(LoremIpsum.getInstance().getLastName())
                .fillAddress(LoremIpsum.getInstance().getTitle(3))
                .fillCity(LoremIpsum.getInstance().getCity())
                .fillState(LoremIpsum.getInstance().getCity())
                .fillZipCode(LoremIpsum.getInstance().getZipCode())
                .fillPhone(LoremIpsum.getInstance().getPhone())
                .fillSsn("522-83-1308")
                .fillUsername(username)
                .fillPassword(username)
                .fillConfirmPassword(username)
                .clickRegisterBtn();

    }
}
