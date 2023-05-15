package com.vision.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.vision.generics.TestBase;
import com.vision.pageObjects.LoginPage;
import com.vision.pageObjects.WorkOrderPage;

public class WorkOrderPageTest extends TestBase {

	SoftAssert sa=new SoftAssert();
	

	@Test(retryAnalyzer = com.vision.generics.RetryAnalyzer.class)
	public void newWorkOrderTest() {
		LoginPage lp=new LoginPage(TestBase.driver);
		sa.assertTrue(lp.positiveLoginTest());
		
		WorkOrderPage wp=new WorkOrderPage(TestBase.driver);
		wp.gotoWorkOrders();

		sa.assertTrue(wp.newManufacturingWO());
		sa.assertTrue(wp.deleteNewWO());
		wp.gotoWorkOrders();
		sa.assertTrue(wp.newPartsWO());
		sa.assertTrue(wp.deleteNewWO());
		wp.gotoWorkOrders();
		wp.searchAndExport();
		sa.assertTrue(lp.signOut());
		sa.assertAll();
	}
	
	

}
