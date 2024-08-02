package com.ebay.search.test;

import com.ebay.search.EbayProject;

public class DemoEbayProject {

	public static void main(String[] args) {

		EbayProject ebay = new EbayProject();

		ebay.invokeBrowser();

		ebay.searchProduct("Rado Watch", "Watches");

		ebay.getNthProduct(9);

		// ebay.getAllProductsViaScrollownViaMouseOperation();

		ebay.getAllProductsViaScrollownViaJavaScript();

	}

}
