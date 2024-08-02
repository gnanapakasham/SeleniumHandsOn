package com.ebay.search.test;

import com.ebay.search.EbayProjectForLinks;

public class DemoLinks {

	public static void main(String[] args) {

		EbayProjectForLinks ebay = new EbayProjectForLinks();

		ebay.invokeBrowser();

		ebay.getLinksCount();

		ebay.getUrlFromALink();

		ebay.getAllLinksInfo();

	}

}
