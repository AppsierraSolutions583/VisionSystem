package com.vision.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.vision.generics.TestBase;
import com.vision.pageObjects.LoginPage;
import com.vision.pageObjects.ProductionPage;

public class ProductionPageTest extends TestBase{
	SoftAssert sa=new SoftAssert();
	@Test(retryAnalyzer = com.vision.generics.RetryAnalyzer.class)
	public void ProductionPages() throws InterruptedException{
		ProductionPage pp = new ProductionPage(TestBase.driver);
		LoginPage lp=new LoginPage(TestBase.driver);
		lp.positiveLoginTest();
		sa.assertTrue(pp.AddPurchaseOrder());
		pp.AddPurchaseOrder();
		sa.assertTrue(pp.EditPurchaseOrder());
		pp.EditPurchaseOrder();
		sa.assertTrue(pp.DeleteNoPurchaseOrder());
		sa.assertTrue(pp.DeleteYesPurchaseOrder());
		sa.assertTrue(pp.ExportPurchaseOrder());
		sa.assertTrue(pp.SearchPurchaseOrder());
		sa.assertTrue(pp.OrderingCustomerLinkPurchaseOrder());
		sa.assertTrue(pp.BillingCustomerLinkPurchaseOrder());
		sa.assertTrue(pp.BillingAddressLinkPurchaseOrder());
		sa.assertTrue(pp.ShippingCustomerLinkPurchaseOrder());
		sa.assertTrue(pp.ShippingAddressLinkPurchaseOrder());
		sa.assertTrue(pp.ExportCollectionPurchaseOrder());
		sa.assertTrue(pp.ClonePurchaseOrder());
		sa.assertTrue(pp.GenerateWorkorderPurchaseOrder());	
}
}