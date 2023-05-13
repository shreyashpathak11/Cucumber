package pageClasses;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

import base.Driver;

public class Google extends Driver {

	void google() throws IOException {

		test = reports.createTest("Google Home Page", "To Check the Google Home Page");
		driver.get("https://www.google.com/");
		test.pass("Google Home Page Launched");
	
		
	

	}

}
