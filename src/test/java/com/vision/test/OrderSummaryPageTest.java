package com.vision.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.vision.generics.TestBase;
import com.vision.pageObjects.LoginPage;
import com.vision.pageObjects.OrderSummaryPage;

public class OrderSummaryPageTest extends TestBase{
	
SoftAssert sa=new SoftAssert();
	

	@Test
	public void orderSummary() {
		OrderSummaryPage osp = new OrderSummaryPage(TestBase.driver);
		LoginPage lp=new LoginPage(TestBase.driver);
		lp.positiveLoginTest();
		sa.assertTrue(osp.createPo(), "1"); 
		sa.assertTrue(osp.searchBar(), "2"); 
		sa.assertTrue(osp.poRecords(), "11"); 
		sa.assertTrue(osp.poIdLink(), "13");
		sa.assertTrue(osp.totalProgress(), "14");
		sa.assertTrue(osp.latestShipmentDate(), "15");//15
		sa.assertTrue(osp.lackingPartsColumn(), "16");//16
		sa.assertTrue(osp.latestETA(), "17");//17
		sa.assertTrue(osp.originalShipmentDate(), "20");//20
		sa.assertTrue(osp.chevronDown(), "21");//21
		sa.assertFalse(osp.chevronUp(), "22");//22
		sa.assertTrue(osp.customerFilter(), "18");//18
		sa.assertTrue(osp.stateFilter(), "19");//19
		sa.assertAll();
	}
	
	@Test
	public void rough() {
		OrderSummaryPage osp = new OrderSummaryPage(TestBase.driver);
		LoginPage lp=new LoginPage(TestBase.driver);
		lp.positiveLoginTest();
		sa.assertTrue(osp.customerFilter(), "18");//18
		sa.assertAll();	
	}
}
