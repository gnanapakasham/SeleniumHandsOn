package com.windows.handling.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {

		ChromeDriver Driver;

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver.exe");

		Driver = new ChromeDriver();

		String url = "http://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open";

		// Maximize the browser
		Driver.manage().window().maximize();

		// Delete all the cookies
		Driver.manage().deleteAllCookies();

		// Page Load timeout
		Driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);

		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Driver.get(url);

		String parentWindow;

		parentWindow = Driver.getWindowHandle();

		System.out.println("Parent Window Handle : " + parentWindow);

		Driver.switchTo().frame("iframeResult");

		Driver.findElement(By.tagName("button")).click();

		String childWindow;

		childWindow = Driver.getWindowHandles().toArray()[1].toString();

		Driver.switchTo().window(childWindow);

		System.out.println("Title of the child window : " + Driver.getTitle());

		Driver.close();

		Driver.switchTo().window(parentWindow);

		System.out.println("Title of parent window : " + Driver.getTitle());

		Driver.close();
	}

}
