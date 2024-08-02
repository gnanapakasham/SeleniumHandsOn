package com.login.demo.test;

import com.login.demo.Guru99Project;

public class DemoGuru99 {

	public static void main(String[] args) {

		Guru99Project guru = new Guru99Project();

		guru.invokeBrowser();

		guru.login("mngr71790", "majajuv");

		guru.addCustomer();

		String cusId = guru.getCustomerId();

		System.out.println("Customer Id : " + cusId);

		guru.addAccount(cusId);
		guru.closeBrowser();

	}

}
