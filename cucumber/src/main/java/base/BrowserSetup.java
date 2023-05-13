package base;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class BrowserSetup {

	static Properties prop = new Properties();

	void setBrowser() throws Exception {

		OutputStream output = new FileOutputStream(
				"D:\\SP Main Folder\\Java\\MyJavaProjects\\cucumber\\src\\main\\java\\base\\config.properties");
		prop.setProperty("browser", "chrome");
		prop.store(output, "");

	}

	static public String getBrowser() throws Exception {

		InputStream input = new FileInputStream(
				"D:\\SP Main Folder\\Java\\MyJavaProjects\\cucumber\\src\\main\\java\\base\\config.properties");
		prop.load(input);
		return prop.getProperty("browser");

	}

}
