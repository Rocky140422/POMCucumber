package com.makeMyTrip.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightResultsPage {
	@FindBy(xpath="//div[@class='filterWrapper']/div[1]//label[1]//span[@class='box']") private WebElement refundableFares;
	@FindBy(xpath="//div[@class='filterWrapper']/div[1]//label[2]//span[@class='check']") private WebElement nonStop;
	@FindBy(xpath="//div[@class='filterWrapper']/div[1]//label[3]//span[@class='check']") private WebElement indigo;
	@FindBy(xpath="//div[@class='filterWrapper']/div[1]//label[4]//span[@class='check']") private WebElement morningDepartures;
	
}
