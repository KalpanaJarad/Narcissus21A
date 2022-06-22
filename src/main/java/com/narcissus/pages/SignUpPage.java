package com.narcissus.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import narcissus.Keyword;

public class SignUpPage {
	
	public By fullName=By.cssSelector("input#name");
	public By companyName=By.cssSelector("input#company_name");
	public By email=By.cssSelector("input#email");
	//public By signupBtn=By.cssSelector("button[type='submit']");
	@FindBy(css="button[type='submit']")
public WebElement signupBtn;
public void enterFullName(String fullName) {
	Keyword.enterText(this.fullName, fullName);
}

public void enterCompanyName(String companyName)
{
	Keyword.enterText(this.companyName, companyName);
}
public void clickOnSignupBtn() {
	
	signupBtn.click();
}
}