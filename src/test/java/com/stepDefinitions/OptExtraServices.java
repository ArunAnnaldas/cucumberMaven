package com.stepDefinitions;

import java.util.List;
import java.util.Map;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OptExtraServices {
	
	@Then("User should be able to select the extra services for {string}")
	public void userShouldBeAbleToSelectTheExtraServices(String ID, List<Map<String,String>> services) {
		System.out.println("Passed ID : " + ID);
		System.out.println(services.toString());
	
	}

}
