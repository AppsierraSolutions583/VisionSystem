package com.vision.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.vision.generics.TestBase;
import com.vision.pageObjects.LoginPage;
import com.vision.pageObjects.OutstandingOrdersPage;

public class OutstandingOrdersPageTest extends TestBase {

	SoftAssert sa = new SoftAssert();

	@Test(retryAnalyzer = com.vision.generics.RetryAnalyzer.class)
	public void outStandingOrders() {
		LoginPage lp = new LoginPage(TestBase.driver);
		sa.assertTrue(lp.positiveLoginTest());

		OutstandingOrdersPage op=new OutstandingOrdersPage(TestBase.driver);
		op.gotoOutstanding();
		op.searchPO();
		op.gotoI();
		op.checktabs();
		
		sa.assertTrue(lp.signOut());

	}

}
