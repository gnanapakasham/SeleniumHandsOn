package com.login.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Guru99Project {

	ChromeDriver Driver;

	public void invokeBrowser() {

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver.exe");

		Driver = new ChromeDriver();

		String url = "http://demo.guru99.com/v4";

		// Maximize the browser
		Driver.manage().window().maximize();

		// Delete all the cookies
		Driver.manage().deleteAllCookies();

		// Navigating to a site say facebook.com
		Driver.get(url);

		// To print the title of guru99 title
		String title = Driver.getTitle();

		System.out.println("Title of the page : " + title);

	}

	/*
	 * Login to Guru99 Bank Demo WebSite
	 */

	public void login(String username, String password) {

		// Searching a web element - textbox - using name locator
		WebElement user = Driver.findElement(By.name("uid"));
		// Writing into that textbox
		user.sendKeys(username);

		Driver.findElement(By.name("password")).sendKeys(password);

		Driver.findElement(By.name("btnLogin")).click();
	}

	// To Add Customer
	public void addCustomer() {
		Driver.findElement(By.linkText("New Customer")).click();

		Driver.findElement(By.name("name")).sendKeys("Gnanaprakasham");

		Driver.findElement(By.xpath("//input[@value='f']")).click();

		Driver.findElement(By.name("dob")).sendKeys("07-06-1994");

		Driver.findElement(By.name("addr")).sendKeys("Chennai");
		Driver.findElement(By.name("city")).sendKeys("Chennai");
		Driver.findElement(By.name("state")).sendKeys("TamilNadu");
		Driver.findElement(By.name("pinno")).sendKeys("637018");
		Driver.findElement(By.name("telephoneno")).sendKeys("4798654567");

		String randomEmailId = "ss" + System.currentTimeMillis() + "@xyz.com";

		System.out.println(randomEmailId);

		Driver.findElement(By.name("emailid")).sendKeys(randomEmailId);

		Driver.findElement(By.name("password")).sendKeys("sdfsashd");

		Driver.findElement(By.name("sub")).click();

	}

	public String getCustomerId() {
		return Driver.findElement(By.xpath("//table[@id='customer']/tbody/tr[4]/td[2]")).getText();
	}

	public void addAccount(String customerId) {
		Driver.findElement(By.linkText("New Account")).click();

		Driver.findElement(By.name("cusid")).sendKeys(customerId);

		WebElement selectAccType = Driver.findElement(By.name("selaccount"));
		Select dropdown = new Select(selectAccType);

		boolean flag = dropdown.isMultiple();

		System.out.println(flag);
		dropdown.selectByVisibleText("Current");

	}

	public void closeBrowser() {
		Driver.close();
	}

}
