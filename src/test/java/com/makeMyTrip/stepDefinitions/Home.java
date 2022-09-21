package com.makeMyTrip.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.makeMyTrip.DataDrivers.readPropertiesFile;
import com.makeMyTrip.pages.TrainsPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Home {
	WebDriver driver;
	@Given("Open makemytrip website")
	public void open_makemytrip_website() throws Exception {
	    Base.initialization("Chrome", readPropertiesFile.readData("url"));
	    Base.closeNotification();
	}

	@When("Click on trains tab")
	public void click_on_trains_tab() throws Exception {
	    TrainsPage train = new TrainsPage(Base.driver);
	    train.clickOnTrainsTab();
	}

	@When("Select from and to city")
	public void select_from_and_to_city() throws Exception {
		TrainsPage train = new TrainsPage(Base.driver);
		train.searchTrain("Mumbai", "Nagpur");
	}

	@When("Click search button")
	public void click_search_button() throws Exception {
		TrainsPage train = new TrainsPage(Base.driver);
		train.clickOnSearchBtn();
	}

	@Then("Validate available filters on trains results page")
	public void validate_available_filters_on_trains_results_page() {
		TrainsPage train = new TrainsPage(Base.driver);
		train.filters("Departure after 6 PM");
	}
	
	@Then("close the browser")
	public void close_the_browser() {
		Base.driver.close();
	}
	
	@When("Select from city {string} and to city {string}")
	public void select_from_city_and_to_city(String FromCity, String ToCity) throws Exception {
		TrainsPage train = new TrainsPage(Base.driver);
		train.searchTrain(FromCity, ToCity);
	}

	@Then("Validate available filters {string} on trains results page")
	public void validate_available_filters_on_trains_results_page(String filter) {
		TrainsPage train = new TrainsPage(Base.driver);
		train.filters(filter);
	}


}
