package com.parabank.parasoft.pages;

import com.aventstack.extentreports.Status;
import com.parabank.parasoft.report.ReportTestManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class BasePage extends Page {
    public BasePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getPageTittle() {
        return driver.getTitle().trim();
    }

    @Override
    public WebElement getWebElement(By locator) {
        addInfo("WebElement going to find");
        WebElement element = null;
        try {
            element = driver.findElement(locator);
        } catch (Exception e) {
            System.out.println(locator.toString() + " Select or Locator Not Found");

        }
        addInfo("Operation Successfully");
        return element;
    }

    @Override
    public List<WebElement> getWebElements(By locator) {
        addInfo("WebElements going to find");
        List<WebElement> elements = null;
        try {
            elements = driver.findElements(locator);
        } catch (Exception e) {
            System.out.println(locator.toString() + " Select or Locator Not Found");

        }
        addInfo("Operation Successfully");
        return elements;

    }

    @Override
    public void waitForElement(By locator) {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        } catch (Exception e) {
            System.out.println(locator.toString() + " Select or Locator Not Found");
        }
    }

    public void addInfo(String message) {
        if (ReportTestManager.getTest() != null) {
            ReportTestManager.getTest().log(Status.INFO, message);
        }
    }
}
