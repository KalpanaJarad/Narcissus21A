package com.narcissus.base;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.narcissus.util.Environment;

import narcissus.Keyword;

public class BaseTest {
	public static Keyword keyword=new Keyword();
   @BeforeMethod
	public void setUp() throws IOException
	{
		Keyword.openBrowser(Environment.getBrowserName());
		String env=System.getProperty("env").toLowerCase();
		
		Keyword.launchUrl(Environment.getUrl(env));
     }
   @AfterMethod
   public void tearDown()
   {
	   keyword.closeBrowser();
   }
}
