


	
	import java.time.Duration;
import java.util.Map;
	import org.openqa.selenium.support.CacheLookup;
	import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;

	import org.openqa.selenium.support.ui.WebDriverWait;

import narcissus.Keyword;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	public class SignUpPage {
	    private Map<String, String> data;
	    private WebDriver driver;
	    private int timeout = 15;

	    @FindBy(id = "password")
	    @CacheLookup
	    private WebElement aPassword;

	    @FindBy(css = "a[href='https://ijmeet.com/about_us?csrt=16879755456375720918']")
	    @CacheLookup
	    private WebElement aboutUs;

	    @FindBy(id = "company_name")
	    @CacheLookup
	    private WebElement companyName;

	    @FindBy(css = "#navbarContent ul.navbar-nav.ml-auto li:nth-of-type(3) a.nav-link.font-weight-bold")
	    @CacheLookup
	    private WebElement contactSales;

	    @FindBy(css = ".en div:nth-of-type(3) footer.container.cutomer-bottom-footer div:nth-of-type(2) div:nth-of-type(2) ul.list-unstyled.text-small li:nth-of-type(2) a.text-muted")
	    @CacheLookup
	    private WebElement contactUs;

	    @FindBy(id = "email")
	    @CacheLookup
	    private WebElement emailId;

	    @FindBy(css = ".en div:nth-of-type(3) footer.container.cutomer-bottom-footer div:nth-of-type(2) div:nth-of-type(4) ul.list-unstyled.text-small li:nth-of-type(2) a.text-muted")
	    @CacheLookup
	    private WebElement facebook;

	    @FindBy(id = "name")
	    @CacheLookup
	    private WebElement fullName;

	    @FindBy(css = ".en div:nth-of-type(3) footer.container.cutomer-bottom-footer div:nth-of-type(2) div:nth-of-type(4) ul.list-unstyled.text-small li:nth-of-type(3) a.text-muted")
	    @CacheLookup
	    private WebElement google;

	    @FindBy(css = "a[href='https://ijmeet.com/host_meeting?csrt=16879755456375720918']")
	    @CacheLookup
	    private WebElement hostMeeting;

	    @FindBy(css = ".en div:nth-of-type(3) footer.container.cutomer-bottom-footer div:nth-of-type(2) div:nth-of-type(4) ul.list-unstyled.text-small li:nth-of-type(4) a.text-muted")
	    @CacheLookup
	    private WebElement instagram;

	    @FindBy(css = "a[href='https://ijmeet.com/app?csrt=16879755456375720918']")
	    @CacheLookup
	    private WebElement joinMeeting;

	    @FindBy(id = "contact")
	    @CacheLookup
	    private WebElement mobileNumber;

	    @FindBy(id = "g-recaptcha-response")
	    @CacheLookup
	    private WebElement mobileNumberCompanyNameA;

	    private final String pageLoadedText = "share while doing meeting, discuss and chat among the team";

	    private final String pageUrl = "/";

	    @FindBy(css = "a[href='https://ijmeet.com/privacy?csrt=16879755456375720918']")
	    @CacheLookup
	    private WebElement privacyPolicy;

	    @FindBy(css = "a.nav-link.nav-right-cutom-bg.font-weight-bold")
	    @CacheLookup
	    private WebElement signIn;

	    @FindBy(css = "a.nav-link.nav-right-cutom-bg-1.font-weight-bold")
	    @CacheLookup
	    private WebElement signUp1;

	    @FindBy(css = "div:nth-of-type(2) a.btn.btn-outline-primary.btn-block")
	    @CacheLookup
	    private WebElement signUp2;

	    @FindBy(css = "a.btn.btn-primary.btn-primary1.com-md-3.w-100.m-0")
	    @CacheLookup
	    private WebElement signUp3;

	    @FindBy(css = "div:nth-of-type(2) a.btn.btn-outline-primary.btn-block")
	    @CacheLookup
	    private WebElement signUp4;

	    @FindBy(css = "button.btn.btn-primary-submint-bt.w-100")
	    @CacheLookup
	    private WebElement submit;

	    @FindBy(css = ".en div:nth-of-type(3) footer.container.cutomer-bottom-footer div:nth-of-type(2) div:nth-of-type(2) ul.list-unstyled.text-small li:nth-of-type(1) a.text-muted")
	    @CacheLookup
	    private WebElement support;

	    @FindBy(css = "a[href='https://ijmeet.com/terms_conditions?csrt=16879755456375720918']")
	    @CacheLookup
	    private WebElement termsConditions;

	    @FindBy(css = ".en div:nth-of-type(3) footer.container.cutomer-bottom-footer div:nth-of-type(2) div:nth-of-type(4) ul.list-unstyled.text-small li:nth-of-type(1) a.text-muted")
	    @CacheLookup
	    private WebElement twitter;
	    @FindBy(css="label#name-error-server")
        private WebElement fullNameErr;
	    public SignUpPage() {
	    	PageFactory.initElements(Keyword.driver, this);
	    }

	    public SignUpPage(WebDriver driver) {
	        this();
	        this.driver = driver;
	    }

	    public SignUpPage(WebDriver driver, Map<String, String> data) {
	        this(driver);
	        this.data = data;
	    }

	    public SignUpPage(WebDriver driver, Map<String, String> data, int timeout) {
	        this(driver, data);
	        this.timeout = timeout;
	    }

	    /**
	     * Click on About Us Link.
	     *
	     * @return the SignUpPage class instance.
	     */
	    public SignUpPage clickAboutUsLink() {
	        aboutUs.click();
	        return this;
	    }

	    /**
	     * Click on Contact Sales Link.
	     *
	     * @return the SignUpPage class instance.
	     */
	    public SignUpPage clickContactSalesLink() {
	        contactSales.click();
	        return this;
	    }

	    /**
	     * Click on Contact Us Link.
	     *
	     * @return the SignUpPage class instance.
	     */
	    public SignUpPage clickContactUsLink() {
	        contactUs.click();
	        return this;
	    }

	    /**
	     * Click on Facebook Link.
	     *
	     * @return the SignUpPage class instance.
	     */
	    public SignUpPage clickFacebookLink() {
	        facebook.click();
	        return this;
	    }

	    /**
	     * Click on Google Link.
	     *
	     * @return the SignUpPage class instance.
	     */
	    public SignUpPage clickGoogleLink() {
	        google.click();
	        return this;
	    }

	    /**
	     * Click on Host Meeting Link.
	     *
	     * @return the SignUpPage class instance.
	     */
	    public SignUpPage clickHostMeetingLink() {
	        hostMeeting.click();
	        return this;
	    }

	    /**
	     * Click on Instagram Link.
	     *
	     * @return the SignUpPage class instance.
	     */
	    public SignUpPage clickInstagramLink() {
	        instagram.click();
	        return this;
	    }

	    /**
	     * Click on Join Meeting Link.
	     *
	     * @return the SignUpPage class instance.
	     */
	    public SignUpPage clickJoinMeetingLink() {
	        joinMeeting.click();
	        return this;
	    }

	    /**
	     * Click on Privacy Policy Link.
	     *
	     * @return the SignUpPage class instance.
	     */
	    public SignUpPage clickPrivacyPolicyLink() {
	        privacyPolicy.click();
	        return this;
	    }

	    /**
	     * Click on Sign In Link.
	     *
	     * @return the SignUpPage class instance.
	     */
	    public SignUpPage clickSignInLink() {
	        signIn.click();
	        return this;
	    }

	    /**
	     * Click on Sign Up Link.
	     *
	     * @return the SignUpPage class instance.
	     */
	    public SignUpPage clickSignUp1Link() {
	        signUp1.click();
	        return this;
	    }

	    /**
	     * Click on Sign Up Link.
	     *
	     * @return the SignUpPage class instance.
	     */
	    public SignUpPage clickSignUp2Link() {
	        signUp2.click();
	        return this;
	    }

	    /**
	     * Click on Sign Up Link.
	     *
	     * @return the SignUpPage class instance.
	     */
	    public SignUpPage clickSignUp3Link() {
	        signUp3.click();
	        return this;
	    }

	    /**
	     * Click on Sign Up Link.
	     *
	     * @return the SignUpPage class instance.
	     */
	    public SignUpPage clickSignUp4Link() {
	        signUp4.click();
	        return this;
	    }

	    /**
	     * Click on Submit Button.
	     *
	     * @return the SignUpPage class instance.
	     */
	    public SignUpPage clickSubmitButton() {
	        submit.click();
	        return this;
	    }

	    /**
	     * Click on Support Link.
	     *
	     * @return the SignUpPage class instance.
	     */
	    public SignUpPage clickSupportLink() {
	        support.click();
	        return this;
	    }

	    /**
	     * Click on Terms Conditions Link.
	     *
	     * @return the SignUpPage class instance.
	     */
	    public SignUpPage clickTermsConditionsLink() {
	        termsConditions.click();
	        return this;
	    }

	    /**
	     * Click on Twitter Link.
	     *
	     * @return the SignUpPage class instance.
	     */
	    public SignUpPage clickTwitterLink() {
	        twitter.click();
	        return this;
	    }

	    /**
	     * Fill every fields in the page.
	     *
	     * @return the SignUpPage class instance.
	     */
	    public SignUpPage fill() {
	        setFullNameTextField();
	        setEmailIdTextField();
	        setMobileNumberTextField();
	        setCompanyNameTextField();
	        setAPasswordTextField();
	        setMobileNumberCompanyNameATextareaField();
	        return this;
	    }

	    /**
	     * Fill every fields in the page and submit it to target page.
	     *
	     * @return the SignUpPage class instance.
	     */
	    public SignUpPage fillAndSubmit() {
	        fill();
	        return submit();
	    }

	    /**
	     * Set default value to A.password Text field.
	     *
	     * @return the SignUpPage class instance.
	     */
	    public SignUpPage setAPasswordTextField() {
	        return setAPasswordTextField(data.get("A_PASSWORD"));
	    }

	    /**
	     * Set value to A.password Text field.
	     *
	     * @return the SignUpPage class instance.
	     */
	    public SignUpPage setAPasswordTextField(String aPasswordValue) {
	        aPassword.sendKeys(aPasswordValue);
	        return this;
	    }

	    /**
	     * Set default value to Company Name Text field.
	     *
	     * @return the SignUpPage class instance.
	     */
	    public SignUpPage setCompanyNameTextField() {
	        return setCompanyNameTextField(data.get("COMPANY_NAME"));
	    }

	    /**
	     * Set value to Company Name Text field.
	     *
	     * @return the SignUpPage class instance.
	     */
	    public SignUpPage setCompanyNameTextField(String companyNameValue) {
	        companyName.sendKeys(companyNameValue);
	        return this;
	    }

	    /**
	     * Set default value to Email Id Text field.
	     *
	     * @return the SignUpPage class instance.
	     */
	    public SignUpPage setEmailIdTextField() {
	        return setEmailIdTextField(data.get("EMAIL_ID"));
	    }

	    /**
	     * Set value to Email Id Text field.
	     *
	     * @return the SignUpPage class instance.
	     */
	    public SignUpPage setEmailIdTextField(String emailIdValue) {
	        emailId.sendKeys(emailIdValue);
	        return this;
	    }

	    /**
	     * Set default value to Full Name Text field.
	     *
	     * @return the SignUpPage class instance.
	     */
	    public SignUpPage setFullNameTextField() {
	        return setFullNameTextField(data.get("FULL_NAME"));
	    }

	    /**
	     * Set value to Full Name Text field.
	     *
	     * @return the SignUpPage class instance.
	     */
	    public SignUpPage setFullNameTextField(String fullNameValue) {
	        fullName.sendKeys(fullNameValue);
	        return this;
	    }

	    /**
	     * Set default value to Mobile Number Company Name A Textarea field.
	     *
	     * @return the SignUpPage class instance.
	     */
	    public SignUpPage setMobileNumberCompanyNameATextareaField() {
	        return setMobileNumberCompanyNameATextareaField(data.get("MOBILE_NUMBER_COMPANY_NAME_A"));
	    }

	    /**
	     * Set value to Mobile Number Company Name A Textarea field.
	     *
	     * @return the SignUpPage class instance.
	     */
	    public SignUpPage setMobileNumberCompanyNameATextareaField(String mobileNumberCompanyNameAValue) {
	        mobileNumberCompanyNameA.sendKeys(mobileNumberCompanyNameAValue);
	        return this;
	    }

	    /**
	     * Set default value to Mobile Number Text field.
	     *
	     * @return the SignUpPage class instance.
	     */
	    public SignUpPage setMobileNumberTextField() {
	        return setMobileNumberTextField(data.get("MOBILE_NUMBER"));
	    }

	    /**
	     * Set value to Mobile Number Text field.
	     *
	     * @return the SignUpPage class instance.
	     */
	    public SignUpPage setMobileNumberTextField(String mobileNumberValue) {
	        mobileNumber.sendKeys(mobileNumberValue);
	        return this;
	    }

	    /**
	     * Submit the form to target page.
	     *
	     * @return the SignUpPage class instance.
	     */
	    public SignUpPage submit() {
	        clickSubmitButton();
	        SignUpPage target = new SignUpPage(driver, data, timeout);
	        PageFactory.initElements(driver, target);
	        return target;
	    }
	    
	    
	    public void SignUpPage1()
	    {
	    	 PageFactory.initElements(Keyword.driver, this);
	    }

	    /**
	     * Verify that the page loaded completely.
	     *
	     * @return the SignUpPage class instance.
	     */
	    public SignUpPage verifyPageLoaded() {
	        (new WebDriverWait(driver, Duration.ofSeconds(timeout))).until(new ExpectedCondition<Boolean>() {
	            public Boolean apply(WebDriver d) {
	                return d.getPageSource().contains(pageLoadedText);
	            }
	        });
	        return this;
	    }
	    
	    public String getFullNameErrorMsg()
	    {
		return fullNameErr.getText();
	   }

	    /**
	     * Verify that current page URL matches the expected URL.
	     *
	     * @return the SignUpPage class instance.
	     */
	    public SignUpPage verifyPageUrl() {
	        (new WebDriverWait(driver, Duration.ofSeconds(timeout))).until(new ExpectedCondition<Boolean>() {
	            public Boolean apply(WebDriver d) {
	                return d.getCurrentUrl().contains(pageUrl);
	            }
	        });
	        return this;
	    }
	
	}

