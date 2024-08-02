package com.cookies;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesHandling {

	ChromeDriver Driver;

	public void invokeBrowser() {

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver.exe");

		Driver = new ChromeDriver();

		String url = "https://www.mercurytravels.co.in";

		// Maximize the browser
		Driver.manage().window().maximize();

		// Delete all the cookies
		Driver.manage().deleteAllCookies();

		// Page Load timeout
		Driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);

		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Navigating to a site say facebook.com
		Driver.get(url);

		String title = Driver.getTitle();

		System.out.println("Title of the page : " + title);

	}

	public void getAllCookies() {
		Set<Cookie> allCookies = Driver.manage().getCookies();

		for (Cookie temp : allCookies) {
			System.out.println("Name : " + temp.getName() + " and its value : " + temp.getValue());
		}
	}

	public void addACookie() {
		Cookie cookie = new Cookie("Gnana", "Prakash");

		Driver.manage().addCookie(cookie);
	}

	public void getACookie() {
		Cookie sessionId = Driver.manage().getCookieNamed("JSESSIONID");

		System.out.println("Session Id : " + sessionId.getName());
	}

}
