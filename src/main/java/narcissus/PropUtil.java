package narcissus;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class PropUtil {

	/**
	 * This Method Returns value of specified locator from or.properties file
	 * @param locator
	 * @return
	 * @throws IOException
	 */
	 public static String getLocator(String locator) throws IOException
	 {
		 String fileName="/src/test/resources/or.properties";
			return getProperty(fileName,locator);
	 }
	 
	 public  static String getProperty(String fileName,String key) throws IOException
	 {
		 String dir=System.getProperty("user.dir");//Current Working Directory
			FileInputStream fis=new FileInputStream(dir+"/src/test/resources/Environment.properties");
			Properties prop=new Properties();
			prop.load(fis);
			return	prop.getProperty(key);
	 }
	 public static String getEnvironment(String key) throws IOException
	 {
		 String fileName="/src/test/resources/or.properties";
			return getProperty(fileName,key);
	 }
	 
public static void main(String[] args) throws IOException {
/*	
	
 String locator=prop.getProperty("searchForProducts");
 System.out.println(locator);
 
}*/
	
	PropUtil.getLocator("locator");
}
}
