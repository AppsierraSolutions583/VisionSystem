package com.vision.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.vision.generics.TestBase;
import com.vision.pageObjects.LoginPage;
import com.vision.pageObjects.PurchaseOrderPage;

public class PurchaseOrderPageTest extends TestBase {

	SoftAssert sa = new SoftAssert();

	@Test(retryAnalyzer = com.vision.generics.RetryAnalyzer.class)
	public void newPurchaseOrderTest() {
		LoginPage lp = new LoginPage(TestBase.driver);
		sa.assertTrue(lp.positiveLoginTest());

		PurchaseOrderPage po = new PurchaseOrderPage(TestBase.driver);
//		sa.assertTrue(po.gotoPurchaseOrders());
//		sa.assertTrue(po.editAndDeletePO());
//		sa.assertTrue(po.gotoPurchaseOrders());
//		po.searchAndSortAndExportPO();
// 		sa.assertTrue(po.cloneAnddeletePO());

		sa.assertTrue(po.gotoPurchaseOrders());
		sa.assertTrue(po.newPurchaseOrder("CAMI", "CAM"));	
		log.info("TC123 start");
		po.addNewPORow("313-7029-01", "3");
		log.info("TC123 passed");
		
		po.addNewPORow("313-03-100-03M", "10");
		sa.assertTrue(po.generateWorkOrder());
		
		po.openWO1();
		sa.assertTrue(po.finalizeWOforPO());
		po.processWO();

		sa.assertTrue(lp.signOut());

	}

}
