package com.Stepdefintion;

import org.openqa.selenium.WebDriver;

import com.Adactine_Project.Baseclass;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefintion extends Baseclass {
	public static WebDriver driver;
	
	

	
	@Given("^user is launching the application$")
	public void user_is_launching_the_application()  {
		driver.get("http://automationpractice.com/index.php");
	}
	    
	

	@When("^user is enter the username in the username field$")
	public void user_is_enter_the_username_in_the_username_field()  {
	    
	}

	@And("^user is enter the password in the password field$")
	public void user_is_enter_the_password_in_the_password_field()  {
	    
	}

	@Then("^user is click on login$")
	public void user_is_click_on_login()  {
	    

}}