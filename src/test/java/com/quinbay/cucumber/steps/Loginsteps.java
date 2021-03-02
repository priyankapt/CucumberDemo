package com.quinbay.cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps {

  @Given("^I am on Facebook login page$")
  public void goToFacebook() {



    System.out.println("Test Facebook Page");

  }

  @When("^I enter username as \"(.*)\"$")
  public void enterUserName(String userName) {
    System.out.println("UserName:" + userName);
  }

  @And("^I enter password as \"(.*)\"$")
  public void iEnterPasswordAs(String password) {
    System.out.println("UserName:" + password);
  }

  @Then("Login should fail")
  public void loginShouldFail() {
    System.out.println("Login Failed");
  }

  @Then("this is a test")
  public void m2(){

  }

}
