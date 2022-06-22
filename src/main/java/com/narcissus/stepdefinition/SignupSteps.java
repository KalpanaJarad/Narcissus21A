package com.narcissus.stepdefinition;

import com.narcissus.pages.HomePage;
import com.narcissus.pages.SignUpPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import narcissus.Keyword;

public class SignupSteps {

	@Given(" Chrome browaser should be opened and user is on signup page")
	public void launchSignupPage()
	{
		Keyword.openBrowser("Chrome");
		Keyword.launchUrl("https://www.ijmeet.com");
		HomePage home=new HomePage();
		home.clickSignUp();
		//SignUpPage signup=new SignUpPage();
		//signup.clickOnSignupBtn();		
	}
	@When("user leaves full name empty and clicks on Signup button")
	public void enterBlankFullName()
	{
		SignUpPage signup=new SignUpPage();
		signup.clickOnSignupBtn();	
	}
	@Then("user should see an error message")
	public void verifyError()
	{
		SignUpPage signup=new SignUpPage();
		signup.g
	}
}
