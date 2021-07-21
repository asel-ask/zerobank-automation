package com.zerobank.stepdefinitions;

import com.zerobank.pages.OnlineBanking;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class LoginStepDefs {

    OnlineBanking onlineBanking =new OnlineBanking();

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        Driver.get().get(ConfigurationReader.get("url"));
        String username=ConfigurationReader.get("username");
        String password=ConfigurationReader.get("password");
        new LoginPage().login(username,password);
        for (WebElement mainMenuOption : onlineBanking.mainMenuOptions) {
            System.out.println(mainMenuOption.getText());
        }
    }
/*
    @When("the user clicks on Savings link on the Account Summary page")
    public void the_user_clicks_on_Savings_link_on_the_Account_Summary_page() {
        onlineBanking.checkngAccountActivity.click();
        onlineBanking.navigate("summary");
        onlineBanking.savings.click();
    }

    @Then("the {string} page should be displayed")
    public void the_page_should_be_displayed(String string) {
        for (WebElement tab : onlineBanking.accountTabs) {
            Assert.assertTrue(tab.getText().equals(string));
            break;
        }
    }

    @And("Account drop down should have {string} selected")
    public void account_drop_down_should_have_selected(String string) {

    }

 */



}
