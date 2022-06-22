package com.narcissus.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import narcissus.Keyword;

public class HomePage {
	@FindBy(css="span.mvlogo-size-app1 img[alt='ijmeetimage']")
	public WebElement ijmettLogo;


@FindBy(css="ul.navbar-nav>li:nth-child(1)>a")
 public WebElement joinMeetLink;


@FindBy(css="ul.navbar-nav>li:nth-child(2)>a")
public WebElement hostMeeting;

@FindBy(css="ul.navbar-nav li:nth-child(5) a")
public WebElement signUpBtn;

public HomePage() {
	PageFactory.initElements(Keyword.driver, this);
}
public void clickOnijMeetLogo() {
	ijmettLogo.click();
	System.out.println("clicked on logo");
}

public void clickOnJoinMeetingLink()
{
	joinMeetLink.click();
}
public String getTextOfJoinMeetingLink()
{
	return joinMeetLink.getText();
}
public String getTitle()
{
	//Keyword keyword=new Keyword();
	return Keyword.getTitle();
}
public void clickSignUp()
{
	signUpBtn.click();
}
}
