package com.qa.IntegrationTests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LoginTests {

	public WebDriver driver;
	
	@Before
	public void setup() {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setJavascriptEnabled(true);
		caps.setCapability("takesScreenshot", true);
		caps.setCapability(
				PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
				Constants.PHANTOMPATH
				);
		
		driver = new PhantomJSDriver(caps);
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
}
