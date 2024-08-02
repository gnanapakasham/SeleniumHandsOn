package com.login.demo;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithChrome {

	/*
	 * Setting Size of Windows getCurrentUrl getPageSource Few Navigate Method
	 * 
	 */

	ChromeDriver Driver;

	public void invokeBrowser() {

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver.exe");

		Driver = new ChromeDriver();

		String url = "http://www.facebook.com";

		// Setting the size of Window
		// Dimension unit is pixels
		Dimension d = new Dimension(500, 700);
		Driver.manage().window().setSize(d);

		// Maximize the browser
		Driver.manage().window().maximize();

		// Delete all the cookies
		Driver.manage().deleteAllCookies();

		// Navigating to a site say facebook.com
		Driver.get(url);

		// To print the title of Facebook Login Page
		String title = Driver.getTitle();

		System.out.println("Title of the page : " + title);

		// Navigate Methods..
		// Navigate you to a particular page
		Driver.navigate().to("http://www.qatechhub.com");

		// Reload the page
		Driver.navigate().refresh();

		// Navigate Back

		Driver.navigate().back();

		// Navigate Forword
		Driver.navigate().forward();

	}

	public String getCurrentUrl() {
		return Driver.getCurrentUrl();
	}

	public void closeBrowser() {
		Driver.close();
	}

}
