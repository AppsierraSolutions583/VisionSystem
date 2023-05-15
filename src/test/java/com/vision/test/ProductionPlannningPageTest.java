package com.vision.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.vision.generics.TestBase;
import com.vision.pageObjects.LoginPage;
import com.vision.pageObjects.ProductionPlanningPage;

public class ProductionPlannningPageTest extends TestBase {
	SoftAssert sa=new SoftAssert();
	@Test(retryAnalyzer = com.vision.generics.RetryAnalyzer.class)
	public void ProductionPlannningPage(){
		ProductionPlanningPage ppp = new ProductionPlanningPage(TestBase.driver);
		LoginPage lp=new LoginPage(TestBase.driver);
		lp.positiveLoginTest();
		sa.assertTrue(ppp.ProductionPlanningOpen());
		sa.assertTrue(ppp.ProductionPlanningMinute());
		sa.assertTrue(ppp.ProductionPlanningHour());
		sa.assertTrue(ppp.ProductionPlanningWeek());
		sa.assertTrue(ppp.ProductionPlanningMonth());
		sa.assertTrue(ppp.ProductionPlanningSelectWorkOrder());
		sa.assertTrue(ppp.ProductionPlanningSelectCustomer());
		sa.assertTrue(ppp.ProductionPlanningSelectFlow());
		sa.assertTrue(ppp.ProductionPlanningShow());
		sa.assertTrue(ppp.ProductionPlanningExpandTask());
		sa.assertTrue(ppp.ProductionPlanningRefresh());
		sa.assertTrue(ppp.ProductionPlanningShowResourceUsage());
		sa.assertTrue(ppp.ProductionPlanningPlusTaskName());
	}
}
