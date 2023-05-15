package com.vision.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.vision.generics.TestBase;
import com.vision.pageObjects.AnalyticsPage;
import com.vision.pageObjects.LoginPage;

public class AnalyticsPageTest extends TestBase {

	SoftAssert sa = new SoftAssert();

	@Test(retryAnalyzer = com.vision.generics.RetryAnalyzer.class)
	public void dashboardModule() {
		LoginPage lp = new LoginPage(TestBase.driver);
		sa.assertTrue(lp.positiveLoginTest());

		AnalyticsPage ap=new AnalyticsPage(TestBase.driver);
		ap.goToAnalytics();
		ap.totalFilter();
		
		
		sa.assertTrue(lp.signOut());

	}

}
