package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {

    @FindBy(xpath = "//div/ul[@id='pages-nav']/li")
    public List<WebElement> mainMenuOptions;

    @FindBy(id = "account_activity_link")
    public WebElement checkngAccountActivity;

    @FindBy(id="transfer_funds_link")
    public WebElement transferFunds;

    @FindBy(id = "money_map_link")
    public WebElement myMoneyMap;

    @FindBy(xpath = "//div/ul[@class='nav nav-tabs']/li")
    public List<WebElement> accountTabs;



    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

   public void navigate(String endsOfWords){
        WebElement options=Driver.get().findElement(By.xpath("//li[contains(@id,'"+endsOfWords+"')]"));
        options.click();
   }

   
/*
    public void waitUntilLoaderScreenDisappear() {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.get(), 5);
            wait.until(ExpectedConditions.invisibilityOf(loaderMask));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 */
}
