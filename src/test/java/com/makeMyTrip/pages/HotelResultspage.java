package com.makeMyTrip.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelResultspage {
	@FindBy(xpath="//input[@id='city']") private WebElement city;
	@FindBy(xpath="//input[@id='checkin']") private WebElement checkIn;
	@FindBy(xpath="//input[@id='checkout']") private WebElement checkOut;
	@FindBy(xpath="//input[@id='guest']") private WebElement guest;
	@FindBy(xpath="//button[@id='hsw_search_button']") private WebElement search;
	@FindBy(xpath="//label[.='Rated Excellent by Travellers']") private WebElement filter;
}
