package com.vision.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.vision.generics.TestBase;
import com.vision.pageObjects.LoginPage;
import com.vision.pageObjects.ShippingInvoicePage;

public class ShippingInvoicePageTest extends TestBase {

	SoftAssert sa = new SoftAssert();

	@Test
	public void ShippingInvoice() throws InterruptedException {
		LoginPage lp = new LoginPage(TestBase.driver);
		lp.positiveLoginTest();
		ShippingInvoicePage sp = new ShippingInvoicePage(TestBase.driver);

		sp.AddShippingInvoice();
		sp.SIDetailsCustomer();
		sp.SIDetailsBillingAddress();
		sp.SIDetailsShippingAddress();

		// issue
		// sp.PurchaseOrderRowSelect();

		sp.PurchaseOrderRowExport();
		sp.PurchaseOrderRowSort();
		sp.PrintShippingInvoiceReport();
		// sp.PrintShipmentDeliveryReceipt();

		// issue
		// sp.Finalize();
		// sp.GenerateCustomerInvoiceYes();
		// sp.GenerateCustomerInvoiceNo();

		sp.CustomerInvoice();
		sp.CustomerInvoiceExport();
		sp.CustomerInvoiceSearch();
	}

}
