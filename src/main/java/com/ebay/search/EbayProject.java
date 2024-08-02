package com.ebay.search;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class EbayProject {

	ChromeDriver Driver;

	public void invokeBrowser() {

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver.exe");

		Driver = new ChromeDriver();

		String url = "http://ebay.in";

		// Maximize the browser
		Driver.manage().window().maximize();

		// Delete all the cookies
		Driver.manage().deleteAllCookies();

		// Page Load timeout
		Driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);

		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Navigating to a site say facebook.com
		Driver.get(url);

		// To print the title of Facebook Login Page
		String title = Driver.getTitle();

		System.out.println("Title of the page : " + title);

	}

	public void searchProduct(String product, String category) {

		Driver.findElement(By.id("gh-ac")).sendKeys(product);

		Select categoryDropdown = new Select(Driver.findElement(By.id("gh-cat")));

		System.out.println(categoryDropdown.isMultiple());

		categoryDropdown.selectByVisibleText(category);

		Driver.findElement(By.xpath("//input[@value='Search']")).click();

		String result = Driver.findElement(By.className("listingscnt")).getText();

		System.out.println("Result : " + result);

	}

	public void getNthProduct(int index) {

		String xpathVar = String.format("//ul[@id='ListViewInner']/li[%d]", index);

		System.out.println(Driver.findElement(By.xpath(xpathVar)).getText());
	}

	public void getAllProducts() {
		List<WebElement> allProucts = Driver.findElements(By.xpath("//ul[@id='ListViewInner']/li"));

		for (WebElement temp : allProucts) {
			System.out.println(temp.getText());

			System.out.println("************************************************************************************");
		}

	}

	// How to perform Mouse Operations

	public void getAllProductsViaScrollownViaMouseOperation() {

		Actions action = new Actions(Driver);

		List<WebElement> allProucts = Driver.findElements(By.xpath("//ul[@id='ListViewInner']/li"));

		for (WebElement temp : allProucts) {

			action.moveToElement(temp).build().perform();

			System.out.println(temp.getText());

			System.out.println("************************************************************************************");

		}

	}

	public void getAllProductsViaScrollownViaJavaScript() {

		List<WebElement> allProucts = Driver.findElements(By.xpath("//ul[@id='ListViewInner']/li"));

		for (WebElement temp : allProucts) {

			int X = temp.getLocation().x;

			int Y = temp.getLocation().y;

			scrollDown(X, Y);

			System.out.println(temp.getText());

			System.out.println("************************************************************************************");

		}

	}

	private void scrollDown(int x, int y) {

		JavascriptExecutor jsEngine;
		String jsCommand;

		jsCommand = String.format("window.scrollTo(%d,%d)", x, y);

		jsEngine = (JavascriptExecutor) Driver;

		jsEngine.executeScript(jsCommand);
	}

}
