package com.stepDefinitions;

import org.assertj.core.api.SoftAssertions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BalanceEnquiry extends OptExtraServices{
	
	@Before("@checkBalance")
	public void beforeStep() {
		//Normally the following things get initialized
		//Logging, DB, Driver initialization
		System.out.println("-------------Executing Before Step-------------");
	}
	
	@After("@checkBalance")
	public void afterStep() {
		//Teardown steps for each scneario
		System.out.println("-------------Executing After Step-------------");
	}

	@Given("User navigates to the bank website")
	public void userNavigatesToTheBankWebsite() {
		System.out.println("User navigates to the bank webSite");
	}

	@Given("User enters valid {string} and {string} with ID as {string}")
	public void userEntersValidAnd(String userName, String password, String ID) {
		System.out.println("User enters valid username : " + userName + " and password : " + password +" with ID : " + ID);
	}

	@When("User clicks on Login")
	public void userLogsIn() {
		System.out.println("User clicks on Login");
	}

	@And("Navigate to Bank Summary Section")
	public void userNavigatesToTheBankSummary() {
		System.out.println("Navigate to Bank Summary Section");
		//assertThat("BankSumary").isEqualTo("BSummary");
		
		SoftAssertions softAssertion = new SoftAssertions();
		softAssertion.assertThat("BankSumary").isEqualTo("BSummary");
		softAssertion.assertThat(12000.12).isEqualTo(12000.13);
		softAssertion.assertAll();
		
	}

	@Then("User should be able to see the bank balance linked with the account")
	public void validate() {
		System.out.println("User should be able to see the bank balance linked with the account");
	}

}
