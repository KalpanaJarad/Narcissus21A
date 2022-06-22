package narcissus;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyword {

	public static WebDriver driver=null;
	public static Waits wait=null;
	/**
	 * This keyword can be used to launch specified browser
	 * @param browserName to launch
	 */
	public  static void openBrowser(String browserName)
	{
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
	        else if(browserName.equalsIgnoreCase("Firefox"))
	    {
		    WebDriverManager.firefoxdriver().setup();
		    driver=new FirefoxDriver();
	    }
		
	     else if(browserName.equalsIgnoreCase("Safari"))
		 {
			    WebDriverManager.safaridriver().setup();
			    driver=new SafariDriver();
		 } 
	     else
	     {
	    	 System.err.println("Invalid browser name"+browserName);
	     }
		
		 wait=new Waits();
	}
	/**
	 * This keyword can be used to launch the specified url;
	 */
	public static void launchUrl(String url)
	{
		driver.get(url);
	}
	
	/**
	 * This keyword can be used to return {@code String} representation of the current
	 * @return
	 */
	public static String getTitle()
	{
		return driver.getTitle();
	}
	
	public static void clickOn(WebElement element)
	{
		element.click();
	}
	
	public static void clickOn(String locator)
	{
		WebElement element = getWebElement(locator);
		element.click();
	
	

	}
	private static WebElement getWebElement(String locator) {
		//driver.findElement(By.xpath("//*contains(text(),'"+elemenText+"')")).click();
		String locatorType=locator.split("##")[0];
		String locatorValue=locator.split("##")[1];
		WebElement element=null;
		if(locatorType.equalsIgnoreCase("xpath"))
		{
		//driver.findElement(By.cssSelector("input[placeholder*='Search for products']")).sendKeys(text,Keys.ENTER);
	    element=  driver.findElement(By.xpath(locatorValue));
		}
		else if(locatorType.equalsIgnoreCase("id"))
		{
		    element=  driver.findElement(By.id(locatorValue));

		}
		else if(locatorType.equalsIgnoreCase("css"))
		{
			element=driver.findElement(By.cssSelector(locatorValue));
		}
		else if(locatorType.equalsIgnoreCase("name"))
		{
			      element=driver.findElement(By.name(locatorValue));
		}
		else if(locatorType.equalsIgnoreCase("class"))
		{
			      element=driver.findElement(By.className(locatorValue));
		}	
		else if(locatorType.equalsIgnoreCase("tagName"))
		{
			      element=driver.findElement(By.tagName(locatorValue));
		}
		else if(locatorType.equalsIgnoreCase("linkedText"))
		{
			      element=driver.findElement(By.linkText(locatorValue));
		}
		else if(locatorType.equalsIgnoreCase("partialLinkedText"))
		{
			      element=driver.findElement(By.partialLinkText(locatorValue));
		}
		return element;
	}
	
	public static void clickOn(By element)
	{
		driver.findElement(element).click();
	} 
	
	public static void closeWindow( String title)
	{
		/*String currentWindow=driver.getWindowHandle();
		Set<String> allWindows=driver.getWindowHandles();
		for(String window : allWindows)
		{
			driver.switchTo().window(window);
			if(driver.getTitle().equalsIgnoreCase(title))
			{
				driver.close();
			}
		}*/
	}
	
	public static void maximaizeWindow()
	{
		driver.manage().window().maximize();
	}
	
	
	
	public static void quitAllWindows()
	{
		driver.quit();
	}
	
	public static void enterText(String locator, String text)
	{
		WebElement element = getWebElement(locator);
		element.sendKeys(text);
	}
	

	public static List<String> getTextOfElements(By cssSelector )
	{
		List<String> productTexts=new ArrayList<>();
		List<WebElement> productTitles=driver.findElements(cssSelector);
		for(WebElement productTitle:productTitles)
		{
			productTexts.add( productTitle.getText());
		}
		return  productTexts;
	}
	private static List<WebElement> getWebElements(String locator)
	{
		String locatorType=locator.split("##")[0];
		String locatorValue=locator.split("##")[1];
		List<WebElement> element=new ArrayList<>();
		if(locatorType.equalsIgnoreCase("xpath"))
		{
		//driver.findElement(By.cssSelector("input[placeholder*='Search for products']")).sendKeys(text,Keys.ENTER);
	    element=  driver.findElements(By.xpath(locatorValue));
		}
		else if(locatorType.equalsIgnoreCase("id"))
		{
		    element=  driver.findElements(By.id(locatorValue));

		}
		else if(locatorType.equalsIgnoreCase("css"))
		{
			element=driver.findElements(By.cssSelector(locatorValue));
		}
		else if(locatorType.equalsIgnoreCase("name"))
		{
			      element=driver.findElements(By.name(locatorValue));
		}
		else if(locatorType.equalsIgnoreCase("class"))
		{
			      element=driver.findElements(By.className(locatorValue));
		}	
		else if(locatorType.equalsIgnoreCase("tagName"))
		{
			      element=driver.findElements(By.tagName(locatorValue));
		}
		else if(locatorType.equalsIgnoreCase("linkedText"))
		{
			      element=driver.findElements(By.linkText(locatorValue));
		}
		else if(locatorType.equalsIgnoreCase("partialLinkedText"))
		{
			      element=driver.findElements(By.partialLinkText(locatorValue));
		}
		return element;
	}
	
	public static List<String> getTextOfElements(String locator)
	{
		List<WebElement> elements=getWebElements(locator);
		List<String> elementTexts=new ArrayList<>();
		for(WebElement element:elements)
		{
			elementTexts.add(element.getText());
		}
		return elementTexts;
	}

	public static void enterText(By locator,String text)
	{
		driver.findElement(locator).sendKeys(text);
	}
	public void closeBrowser() {
		driver.close();
		System.out.println("Browser is closed sucessfully");
		
	}
	
}
