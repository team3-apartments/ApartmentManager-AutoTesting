package com.qa.IntegrationTests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

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
	
	@Given("^the correct 'user name' and 'password'$")
	public void the_correct_user_name_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click 'login'$")
	public void i_click_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I can browse a table of 'apartments'$")
	public void i_can_browse_a_table_of_apartments() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^the incorrect 'user name' and 'password'$")
	public void the_incorrect_user_name_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I am prompted to enter correct administrator 'user name' and 'password'$")
	public void i_am_prompted_to_enter_correct_administrator_user_name_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^no 'user name' and 'password'$")
	public void no_user_name_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I am prompted prompted to enter a 'user name' and 'password'$")
	public void i_am_prompted_prompted_to_enter_a_user_name_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I don't click 'login'$")
	public void i_don_t_click_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I am not shown anything new$")
	public void i_am_not_shown_anything_new() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
