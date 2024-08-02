package com.ebay.search;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayProjectForLinks {

	ChromeDriver Driver;

	public void invokeBrowser() {

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver.exe");

		Driver = new ChromeDriver();

		String url = "http://ebay.in";

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

	public void getLinksCount() {

		List<WebElement> allLinks = Driver.findElements(By.tagName("a"));

		int countOfLinks = allLinks.size();

		System.out.println("Number of Links on a page : " + countOfLinks);

	}

	public void getUrlFromALink() {

		WebElement mobileLink = Driver.findElement(By.linkText("Mobile & Accessories"));

		String url = mobileLink.getAttribute("href");

		System.out.println("URL is : " + url);
	}

	public void getAllLinksInfo() {

		List<WebElement> allLinks = Driver.findElements(By.tagName("a"));

		for (WebElement temp : allLinks) {

			System.out.println("Link Text : " + temp.getText() + " and its Url : " + temp.getAttribute("href"));
		}

	}

}
