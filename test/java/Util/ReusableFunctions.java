package Util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReusableFunctions {

	
	// Read data from properties file
	public static String readProperties(String readData) throws IOException{  
		Properties myProp = new Properties();
		FileInputStream inputstream = new FileInputStream(".//config/config.properties");
		myProp.load(inputstream);
		readData = myProp.getProperty(readData);
		return readData;
		
	} 
}
