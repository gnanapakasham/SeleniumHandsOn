package com.invoke.browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithChrome {

	ChromeDriver Driver;

	public void invokeBrowser() {

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver.exe");

		Driver = new ChromeDriver();

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
		Driver.close();
	}

}
