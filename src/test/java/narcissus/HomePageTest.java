package narcissus;


import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.List;



import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.narcissus.base.BaseTest;

public class HomePageTest extends BaseTest{
	
	   /* 
		@Testchromedriver
		public void verifyTitleOfHomePage()
		{
			WebDriverManager.().setup();
			WebDriver driver=new ChromeDriver();
		    driver.get("https://www.testingshastra.com");
		    String expectedTitle="Testing Shastra | Training | Placement";
		    String actualTitle=driver.getTitle();
		    Assert.assertEquals(actualTitle, expectedTitle);
	     }
		
		@Test
		public void verifyTitleofHomePage()
		  {
			 String expectedTitle="Testing Shastra | Training | Placement";
			Keyword.openBrowser("Chrome");
			Keyword.launchUrl("https://www.testingshastra.com");
			Keyword.closeWindow("");
			 String actualTitle=KeywordDrivenFramework.getTitle();
			 
			 Assert.assertEquals(actualTitle, expectedTitle);
		  }
		*/
		@Test
		public void verifySearchResultsForShoes() throws IOException
		{
			Keyword.openBrowser("Chrome");
			Keyword.launchUrl("https://www.myntra.com");
		
			Keyword.enterText(Locator.searchForProducts,"Shoes");
			Keyword.clickOn(Locator.magnifier);
			Keyword.wait.forDuration(4);
			List<String> titles=Keyword.getTextOfElements(Locator.productTitles);
			System.out.println("There are"+titles.size()+"products");
			SoftAssert softly=new SoftAssert();
			for(String title : titles)
			{
				AssertJUnit.assertTrue(title.contains("Shoe") || title.contains("Shoes") ||title.contains("Sneakers")||title.contains("Running")||title.contains("Trainers"));
			}
			softly.assertAll();
		}
	}

