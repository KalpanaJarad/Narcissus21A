package com.narcissus.util;

import java.io.IOException;

import narcissus.PropUtil;

public class Environment {

	public static String  getUrl(String env) throws IOException   {
     if(env.equalsIgnoreCase("dev"))
     {
    	 return PropUtil.getEnvironment("dev.url");
     }else if(env.equalsIgnoreCase("qa"))
     {
    	 return PropUtil.getEnvironment("qa.url");
     }else if(env.equalsIgnoreCase("preprod"))
     {
    	 return PropUtil.getEnvironment("preprod.url");
	}
     else
     {
    	 return "";
     }
    	 
     }
	
	public static String getUserName(String environment)
	{
		String username="";
		return username;
	}
	
	public static String getBrowserName() throws IOException
	{
		return PropUtil.getEnvironment("browserName");
	}

	

	 
	
}
