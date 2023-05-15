package com.vision.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.vision.generics.TestBase;
import com.vision.pageObjects.DashboardPage;
import com.vision.pageObjects.LoginPage;

public class DashboardPageTest extends TestBase {

	SoftAssert sa = new SoftAssert();

	@Test(retryAnalyzer = com.vision.generics.RetryAnalyzer.class)
	public void dashboardModule() {
		LoginPage lp = new LoginPage(TestBase.driver);
		sa.assertTrue(lp.positiveLoginTest());

		DashboardPage dp = new DashboardPage(TestBase.driver);
		sa.assertTrue(dp.verifyDisplayOfAllElements());
		dp.applyFilters();
		sa.assertTrue(dp.searchWO());
		sa.assertTrue(dp.gotoWorkOrderFromDashboard());
		sa.assertTrue(lp.signOut());

	}

}
