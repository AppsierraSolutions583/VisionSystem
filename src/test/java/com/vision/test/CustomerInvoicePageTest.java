package com.vision.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.vision.generics.TestBase;
import com.vision.pageObjects.CustomerInvoicePage;
import com.vision.pageObjects.LoginPage;


public class CustomerInvoicePageTest extends TestBase{
	
	SoftAssert sa=new SoftAssert();
	@Test
	public void CustomerInvoice() throws InterruptedException {
		LoginPage lp=new LoginPage(TestBase.driver);
		lp.positiveLoginTest();
		CustomerInvoicePage cp=new CustomerInvoicePage(TestBase.driver);
//		cp.UploadtoXero();
		cp.UpdateXeroNumber();
		
	}

}
