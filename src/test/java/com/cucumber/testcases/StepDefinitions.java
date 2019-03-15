package com.cucumber.testcases;

import com.cucumber.base.TestBase;
import cucumber.api.java.en.*;

public class StepDefinitions {

    TestBase cucumber = TestBase.getInstance();

    @Given("^user open \"([^\"]*)\" browser$")
    public void user_open_browser(String browser) throws Throwable {
        System.out.println("user open "+browser+" browser");
        cucumber.openBrowser(browser);
    }

    @When("^user navigates \"([^\"]*)\" url$")
    public void user_navigates_url(String url) throws Throwable {
        System.out.println("user navigates "+url);
        cucumber.navigateurl(url);
    }

    @Then("^user clicked on \"([^\"]*)\" link$")
    public void user_clicked_on_link(String prop) throws Throwable {
        System.out.println("user clicked on ");
        cucumber.click(prop);
    }

    @Then("^user enter \"([^\"]*)\" as \"([^\"]*)\"$")
    public void user_enter_as(String prop, String text) throws Throwable {
        System.out.println("user enter");
        cucumber.typeElement(prop, text);
    }

    @Then("^user clicked on \"([^\"]*)\" button$")
    public void user_clicked_on_button(String prop) throws Throwable {
        System.out.println("user clicked on");
        cucumber.click(prop);
    }

    @Then("^user validate the login page$")
    public void user_validate_the_login_page() throws Throwable {
        System.out.println("user validate the login page");

    }

    @Then("^user closed browser$")
    public void user_closed_browser() throws Throwable {
        System.out.println("user closed browser");
        cucumber.closebrowser();
    }


}
