package com.right.click.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickOperation {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver Driver;

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver.exe");

		Driver = new ChromeDriver();

		String url = "http://swisnl.github.io/jQuery-contextMenu/demo.html";

		// Maximize the browser
		Driver.manage().window().maximize();

		// Delete all the cookies
		Driver.manage().deleteAllCookies();

		// Page Load timeout
		Driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);

		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Driver.get(url);

		WebElement rightClickLink = Driver.findElement(By.xpath("//span[contains(text(), 'right click me')]"));

		Actions action = new Actions(Driver);

		action.contextClick(rightClickLink).build().perform();

		Driver.findElement(
				By.xpath("//ul[@class='context-menu-list context-menu-root']" + "/li/span[contains(text(),'Edit')]"))
				.click();

		Alert alert = Driver.switchTo().alert();

		System.out.println("Message from alert : " + alert.getText());

		Thread.sleep(3000);

		alert.accept();

	}

}
