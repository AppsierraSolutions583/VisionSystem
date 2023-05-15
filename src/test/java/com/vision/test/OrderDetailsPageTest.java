package com.vision.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.vision.generics.TestBase;
import com.vision.pageObjects.LoginPage;
import com.vision.pageObjects.OrderDetailsPage;

public class OrderDetailsPageTest extends TestBase{
	
SoftAssert sa=new SoftAssert();
	
	@Test
	public void orderDetails() {
		OrderDetailsPage odp = new OrderDetailsPage(TestBase.driver);
		LoginPage lp=new LoginPage(TestBase.driver);
		lp.positiveLoginTest();
        sa.assertTrue(odp.createPo(), "1"); //1 2
        sa.assertTrue(odp.customerFilter(), "3"); //3 11
	    sa.assertTrue(odp.stateFilter(), "4"); //4
	    sa.assertTrue(odp.typeFilter(), "8"); //8
	    sa.assertTrue(odp.productFilter(), "9"); //9
	    sa.assertTrue(odp.productionStateFilter(), "10"); //10
		sa.assertTrue(odp.customerFilter2(), "11"); //11
	    sa.assertTrue(odp.flowFilter(), "12"); //12
		sa.assertTrue(odp.stateFilter2(),"13"); //13
		sa.assertTrue(odp.shippingInvoice(),"14"); //14
		sa.assertTrue(odp.siCustFilter(),"15");//17
		sa.assertTrue(odp.invoiceStateFilter(),"18");//18
		sa.assertTrue(odp.stateFilter3(),"19");//19
		sa.assertTrue(odp.customerInvoices(),"20");//20
		sa.assertTrue(odp.ciCustFilter(),"22");//22
		sa.assertTrue(odp.stateFilter4(),"23");//23
		sa.assertTrue(odp.searchBar(),"24");//24
		sa.assertTrue(odp.searchBar2(),"25");//25
		sa.assertTrue(odp.poRecords(),"26");//26
		sa.assertTrue(odp.woRecords(),"27");//27
		sa.assertTrue(odp.siRecords(),"28");//28
		sa.assertTrue(odp.ciRecords(),"29");//29
		sa.assertTrue(odp.clearFilters(),"30");//30
	    sa.assertAll();
	}
	
	@Test
	public void rough() {
		OrderDetailsPage odp = new OrderDetailsPage(TestBase.driver);
		LoginPage lp=new LoginPage(TestBase.driver);
		lp.positiveLoginTest(); 
		sa.assertTrue(odp.searchBar(),"24");//24
		sa.assertAll();
	}
}
