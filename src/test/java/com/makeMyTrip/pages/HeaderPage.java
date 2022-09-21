package com.makeMyTrip.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage {
	@FindBy(xpath = "(//span[text()='Flights'])[1]")
	private WebElement flights;
	@FindBy(xpath = "(//span[text()='Hotels'])[1]")
	private WebElement hotels;
	@FindBy(xpath = "//span[text()='Homestays']")
	private WebElement homestays;
	@FindBy(xpath = "//span[text()='Holiday Packages']")
	private WebElement holidayPackages;
	@FindBy(xpath = "(//span[text()='Trains'])[1]")
	private WebElement trains;
	@FindBy(xpath = "//span[text()='Buses']")
	private WebElement buses;
	@FindBy(xpath = "(//span[text()='Cabs'])[1]")
	private WebElement cabs;
	@FindBy(xpath = "//span[text()='Forex']")
	private WebElement forex;
	@FindBy(xpath = "//span[text()='Charter Flights']")
	private WebElement charterFlights;
	@FindBy(xpath = "//span[text()='Activities']")
	private WebElement activities;
	
	

}
