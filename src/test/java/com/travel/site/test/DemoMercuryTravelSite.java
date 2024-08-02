package com.travel.site.test;

import com.travel.site.MercuryTravelSite;

public class DemoMercuryTravelSite {

	public static void main(String[] args) {

		MercuryTravelSite mt = new MercuryTravelSite();

		mt.invokeBrowser();

		mt.defaultTripType();

		mt.verifyHiddenPropertyOnOneWayClick();

	}

}
