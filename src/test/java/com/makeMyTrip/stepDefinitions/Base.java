package com.makeMyTrip.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	public static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}

	public static WebDriver initialization(String browserName, String url) {
		switch (browserName) {
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", "BrowserDrivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			break;
		case "FireFox":
			System.setProperty("webdriver.geckodriver.driver", "/BrowserDrivers/firefoxdriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			break;
		case "IE":
			System.setProperty("webdriver.ie.driver", "/BrowserDrivers/internetexplorer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			break;
		default:
			driver = null;
		}
		return driver;
	}

	public static void closeNotification() {
		WebElement frame = driver.findElement(By.id("webklipper-publisher-widget-container-notification-frame"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//i[@class='wewidgeticon we_close']")).click();
		driver.switchTo().defaultContent();
	}

}
