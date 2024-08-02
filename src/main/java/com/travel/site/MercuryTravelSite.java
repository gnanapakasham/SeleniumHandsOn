package com.travel.site;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryTravelSite {

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

	public void defaultTripType() {

		List<WebElement> journeyTypeRadioButtons = Driver
				.findElements(By.xpath("//input[@name='frm:searchForm:journeytype']"));

		for (WebElement tempLink : journeyTypeRadioButtons) {
			if (tempLink.isSelected()) {
				System.out.println("Default journey type is : " + tempLink.getAttribute("value"));
			}
		}
	}

	public void verifyHiddenPropertyOnOneWayClick() {

		WebElement returnSection = Driver.findElement(By.id("returnJourneyExactTable"));

		// By Default status

		if (returnSection.isDisplayed()) {
			System.out.println("PASS :: By Default return section is : Displayed");
		} else {
			System.out.println("By Default return section is : Hidden");
		}

		Driver.findElement(By.xpath("//input[@value='One Way']")).click();

		if (!returnSection.isDisplayed()) {
			System.out.println("PASS :: In One way Trip :: return section is : Hidden");
		} else {
			System.out.println("In One way Trip :: return section is : Displayed");
		}
	}

}
