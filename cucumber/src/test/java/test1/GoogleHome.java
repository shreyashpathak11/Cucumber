package test1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;

import base.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleHome extends Driver {

	@Given("google URL has been Launched")
	public void google_url_has_been_launched() throws Exception {

		Driver.browser();
		Driver.report();
		test = reports.createTest("Google Home Page", "To Check the Google Home Page");
		driver.get("https://www.google.com/");
		test.pass("Google Home Page Launched");

	}

	@When("user clicks on Search Field")
	public void user_clicks_on_search_field() throws Exception {

		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).click();
		File input = driver.findElement(By.xpath("//textarea[@class='gLFyf']")).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(input,
				new File("D:\\SP Main Folder\\Java\\MyJavaProjects\\cucumber\\src\\main\\java\\screenshots\\abc.png"));

	}

	@When("user Type Text in the search field")
	public void user_type_text_in_the_search_field() throws Exception {

		driver.findElement(By.xpath("//textarea[@class='gLFyf']"))
				.sendKeys("Cricket");
		File text = driver.findElement(By.xpath("//textarea[@class='gLFyf']")).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(text,
				new File("D:\\SP Main Folder\\Java\\MyJavaProjects\\cucumber\\src\\main\\java\\screenshots\\abc1.png"));

	}

	@When("user Press Enter")
	public void user_press_enter() {

		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys(Keys.ENTER);

	}

	@Then("search should happens")
	public void search_should_happens() {

		Driver.flush();
		test.pass("Test Case Passed");

	}

}
