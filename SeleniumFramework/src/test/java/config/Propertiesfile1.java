package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.TestNGDemo_PropertiesFile1;

public class Propertiesfile1 {
static String Projectpath = System.getProperty("user.dir");
static Properties prop =  new Properties();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
getProperties();
setProperties();
getProperties();

	}
public static void getProperties()

{
	try 
	{
	
	InputStream input = new FileInputStream(Projectpath+"/src/test/java/config/config.properties");
	prop.load(input);
     String browser = prop.getProperty("browser");
System.out.println(browser);
TestNGDemo_PropertiesFile1.browsername = browser;
	}
	catch (Exception exp)
	{
		System.out.println(exp.getMessage());
		System.out.println(exp.getCause());
		exp.printStackTrace();
	}
}
public static void setProperties()
{
	try {
		OutputStream output = new FileOutputStream(Projectpath+"/src/test/java/config/config.properties");
	prop.setProperty("browser", "chrome");
	prop.store(output, null);
	} 
	
	catch (Exception exp) {
		// TODO Auto-generated catch block
		System.out.println(exp.getMessage());
		System.out.println(exp.getCause());
		exp.printStackTrace();
	}
	
}
}
