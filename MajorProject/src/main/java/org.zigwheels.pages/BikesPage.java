package org.zigwheels.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BikesPage extends StandardCode {

    public BikesPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//a[text()='Honda']")
    WebElement hondaLink;

    public void clickHondaBrand() {

        waitForElementToBeClickable(hondaLink);
        scrollIntoView(hondaLink);
        clickByJS(hondaLink);
    }
}