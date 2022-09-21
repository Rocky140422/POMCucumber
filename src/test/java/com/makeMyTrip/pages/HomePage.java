package com.makeMyTrip.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(xpath = "//li[text()='OneWay']")
	private WebElement oneWay;
	@FindBy(xpath = "//li[text()='Round Trip']")
	private WebElement roundTrip;
	@FindBy(xpath = "//li[text()='Multi City']")
	private WebElement multiCity;
	@FindBy(xpath = "//span[text()='From']")
	private WebElement from;
	@FindBy(xpath = "//span[text()='To']")
	private WebElement to;
	@FindBy(xpath = "//span[text()='DEPARTURE']")
	private WebElement departure;
	@FindBy(xpath = "//span[text()='RETURN']")
	private WebElement reTurn;
	@FindBy(xpath = "//span[@class='lbl_input latoBold appendBottom5']")
	private WebElement travellers;
	@FindBy(xpath = "//a[.='Search']")
	private WebElement search;
	@FindBy(xpath = "//li[.='Regular  Fares']")
	private WebElement regularFares;
	@FindBy(xpath = "//li[contains(.,'NEWArmed Forces  FaresArmed Forces FaresApplicable for serving and retired perso')]")
	private WebElement newArmedForces;
	@FindBy(xpath = "//p[.='Student  Fares']")
	private WebElement studentFares;
	@FindBy(xpath = "//p[.='Senior Citizen  Fares']")
	private WebElement seniorCitizen;
	@FindBy(xpath = "//p[.='Doctors & Nurses  Fares']")
	private WebElement doctorsAndNurses;

}