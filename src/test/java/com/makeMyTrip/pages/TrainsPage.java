package com.makeMyTrip.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.makeMyTrip.SeleniumUtilities.SeleniumWebElementsActions;
import com.makeMyTrip.stepDefinitions.Base;

public class TrainsPage extends Base {
	WebDriver driver;

	@FindBy(xpath = "(//span[text()='Trains'])[1]")
	private WebElement trains;
	@FindBy(xpath = "//span[text()='From']")
	private WebElement from;
	@FindBy(xpath = "//span[text()='To']")
	private WebElement to;
	@FindBy(xpath = "//input[@placeholder='From']")
	private WebElement fromTextBox;
	@FindBy(xpath = "//input[@placeholder='To']")
	private WebElement toTextBox;
	@FindBy(xpath = "//a[.='Search']")
	private WebElement searchBtn;

	public TrainsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnTrainsTab() throws Exception {
		SeleniumWebElementsActions.clickOnWebElement(trains);
	}

	public void searchTrain(String fromCity, String toCity) throws Exception {
		SeleniumWebElementsActions.clickOnWebElement(from);
		SeleniumWebElementsActions.enterInputToTextFile(fromTextBox, fromCity);
		driver.findElement(By.xpath("//span[text()='" + fromCity + "']")).click();
		SeleniumWebElementsActions.clickOnWebElement(to);
		SeleniumWebElementsActions.enterInputToTextFile(toTextBox, toCity);
		driver.findElement(By.xpath("//span[text()='" + toCity + "']")).click();
	}

	public void clickOnSearchBtn() throws Exception {
		SeleniumWebElementsActions.clickOnWebElement(searchBtn);
	}

	public void filters(String quickfilter) {
		String quickFilter = "//label[text()='" + quickfilter + "']";
		driver.findElement(By.xpath(quickFilter)).click();
		System.out.println(
				driver.findElement(By.xpath("//ul[@class='appliedFilters']/li[1]/span[@class='latoBold']")).getText());

	}
}
