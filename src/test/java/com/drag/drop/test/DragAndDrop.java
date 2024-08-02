package com.drag.drop.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		ChromeDriver Driver;

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver.exe");

		Driver = new ChromeDriver();

		String url = "https://jqueryui.com/droppable/";

		// Maximize the browser
		Driver.manage().window().maximize();

		// Delete all the cookies
		Driver.manage().deleteAllCookies();

		// Page Load timeout
		Driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);

		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Driver.get(url);

		WebElement frame = Driver.findElement(By.className("demo-frame"));

		Driver.switchTo().frame(frame);

		WebElement source = Driver.findElement(By.id("draggable"));

		WebElement destination = Driver.findElement(By.id("droppable"));

		WebElement textElement = Driver.findElement(By.xpath("//div[@id='droppable']/p"));
		String text = textElement.getText();

		System.out.println("Text : " + text);

		String targetBgColor = destination.getCssValue("color");

		System.out.println(targetBgColor);
		Actions action = new Actions(Driver);

//		action.dragAndDrop(source, destination).build().perform();

		action.moveToElement(source).clickAndHold(source).moveToElement(destination).release().build().perform();

		System.out.println("After Drag and drop text is : " + textElement.getText());

		System.out.println("Color after Drag and Drop : " + destination.getCssValue("color"));

		Driver.switchTo().defaultContent();

		// Driver.close();
	}

}
