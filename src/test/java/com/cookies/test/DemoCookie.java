package com.cookies.test;

import com.cookies.CookiesHandling;

public class DemoCookie {

	public static void main(String[] args) {
		CookiesHandling cook = new CookiesHandling();

		cook.invokeBrowser();

		cook.addACookie();
		cook.getAllCookies();

		cook.getACookie();
	}

}
