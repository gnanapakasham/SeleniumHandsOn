package com.invoke.browser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingWithFirefox {

	// Creating an instance of Browser - Firefox Browser
	FirefoxDriver Driver;

	public void invokeBrowser() {

		System.setProperty("webdriver.geckodriver.driver", "E:\\firefox\\geckodriver.exe");

		Driver = new FirefoxDriver();

		String url = "http://www.facebook.com";

		// Maximize the browser
		Driver.manage().window().maximize();

		// Delete all the cookies
		Driver.manage().deleteAllCookies();

		// Navigating to a site say facebook.com
		Driver.get(url);

		// To print the title of Facebook Login Page
		String title = Driver.getTitle();

		System.out.println("Title of the page : " + title);

	}

	public void closeBrowser() {
		// To close one single Active Window
		Driver.close();
		// To close all windows opened by selenium
		Driver.quit();
	}
}
