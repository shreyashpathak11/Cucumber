package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Driver {

	public static WebDriver driver;
	public WebDriverWait wait;
	public static ExtentSparkReporter spark = new ExtentSparkReporter("D:\\SP Main Folder\\Java\\MyJavaProjects\\cucumber\\target\\ExtentReport.html");
	public static ExtentReports reports;
	public static ExtentTest test;

	@Test
	public static void browser() throws Exception {

		String browser = BrowserSetup.getBrowser();

		if (browser.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();
			driver.manage().window().maximize();

		} else if (browser.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();
			driver.manage().window().maximize();

		} else {

			driver = new EdgeDriver();
			driver.manage().window().maximize();

		}
	}

	public static void report() {

		reports = new ExtentReports();
		reports.attachReporter(spark);

	}

	public static void flush() {

		reports.flush();
		driver.quit();

	}

}
