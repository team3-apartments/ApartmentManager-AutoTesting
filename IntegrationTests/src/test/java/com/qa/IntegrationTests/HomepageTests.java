package com.qa.IntegrationTests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomepageTests {

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
	
	@Test
	public void phantomTest() {
		driver.get("https://www.bing.com/");
		assertEquals("", "Bing", driver.getTitle());
	}
	
	@Given("^I have logged in and have navigated to 'apartments' page$")
	public void i_have_logged_in_and_have_navigated_to_apartments_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I change filter to rooms state 'vacant'$")
	public void i_change_filter_to_rooms_state_vacant() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I am shown only vacant 'apartments'$")
	public void i_am_shown_only_vacant_apartments() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@Given("^I have logged in and have navigated to 'apartments/rooms' page$")
	public void i_have_logged_in_and_have_navigated_to_apartments_rooms_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I change a value of anything the 'update' button is shown and I click it$")
	public void i_change_a_value_of_anything_the_update_button_is_shown_and_I_click_it() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should be notified and shown my changes$")
	public void i_should_be_notified_and_shown_my_changes() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@Given("^I have logged in$")
	public void i_have_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click 'view apartments'$")
	public void i_click_view_apartments() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I can view a table of of apartments and its details$")
	public void i_can_view_a_table_of_of_apartments_and_its_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click on a 'apartment'$")
	public void i_click_on_a_apartment() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I am shown a detailed breakdown of the 'apartment'$")
	public void i_am_shown_a_detailed_breakdown_of_the_apartment() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I am shown the room state$")
	public void i_am_shown_the_room_state() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	
}
