package com.login.demo.test;

import com.login.demo.WorkingWithChrome;

public class DemoChrome {

	public static void main(String[] args) {

		WorkingWithChrome wc = new WorkingWithChrome();

		wc.invokeBrowser();

		String newUrl = wc.getCurrentUrl();

		System.out.println(newUrl);

		wc.closeBrowser();

	}

}
