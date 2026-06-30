package org.zigwheels.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends StandardCode {
    public HomePage(WebDriver driver) {

        super(driver);
    }

    @FindBy(xpath = "//span[contains(@class,'c-p') and contains(.,'NEW BIKES')]")
    WebElement newBikes;
    @FindBy(xpath = "//a[text()='Upcoming Bikes']")
    WebElement upcomingBikes;

    public void clickNewBikes(){
        super.clickByJS(newBikes);
    }

    public void clickUpcmngBikes(){
        super.clickByJS(upcomingBikes);
    }
}