package com.alert.mouse.events;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {

		ChromeDriver Driver;

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver.exe");

		Driver = new ChromeDriver();

		String url = "http://ebay.in";

		// Maximize the browser
		Driver.manage().window().maximize();

		// Delete all the cookies
		Driver.manage().deleteAllCookies();

		// Page Load timeout
		Driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);

		// Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Driver.get(url);

		WebElement mobileAccLink = Driver.findElement(By.linkText("Mobile & Accessories"));

		Actions action = new Actions(Driver);

		action.moveToElement(mobileAccLink).build().perform();

		WebElement sonyMobileLink = Driver.findElement(By.linkText("Sony Mobiles"));

		action.moveToElement(sonyMobileLink).click().build().perform();
	}

}
