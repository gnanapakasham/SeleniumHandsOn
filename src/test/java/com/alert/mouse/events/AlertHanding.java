package com.alert.mouse.events;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHanding {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver Driver;

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver.exe");

		Driver = new ChromeDriver();

		String url = "https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert";

		// Maximize the browser
		Driver.manage().window().maximize();

		// Delete all the cookies
		Driver.manage().deleteAllCookies();

		// Page Load timeout
		Driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);

		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Driver.get(url);

		Driver.switchTo().frame("iframeResult");

		// Switch back to main page from frame
		// Driver.switchTo().defaultContent();

		Driver.findElement(By.tagName("button")).click();

		Thread.sleep(3000);

		Alert alert = Driver.switchTo().alert();

		System.out.println(alert.getText());

		// Accept an alert
		alert.accept();

		// Reject an alert
		// alert.dismiss();

	}

}
