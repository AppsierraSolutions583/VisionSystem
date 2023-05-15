package com.vision.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.vision.generics.TestBase;
import com.vision.pageObjects.LackingPartsPage;
import com.vision.pageObjects.LoginPage;

public class LackingPartsPageTest extends TestBase {
	
	SoftAssert sa=new SoftAssert();
	
	@Test(retryAnalyzer = com.vision.generics.RetryAnalyzer.class)
	public void lackingParts() {
		LackingPartsPage lpp = new LackingPartsPage(TestBase.driver);
		LoginPage lp=new LoginPage(TestBase.driver);
		lp.positiveLoginTest();
		sa.assertTrue(lpp.lackingPartsCard(), "1");  //1
		sa.assertTrue(lpp.lackingPartsLink(), "2");  //2
		sa.assertTrue(lpp.newSheet(), "3");          //3 //8
		sa.assertTrue(lpp.lastUpdatedDateAndTime(), "6"); //6 7
		sa.assertTrue(lpp.toolbarsInDraftState(), "9"); //9 10 12
		sa.assertTrue(lpp.sheetInCloseState(), "11"); //11 78
		sa.assertTrue(lpp.sheetInApprovalState(), "5");  //5 13
		sa.assertTrue(lpp.columnsOnLackingParts(), "15"); //15
		sa.assertTrue(lpp.editButton(), "14"); //14 16
		sa.assertTrue(lpp.enabledFieldsInEdit(), "17"); // 17 18
	    sa.assertTrue(lpp.disabledFieldsInEdit(), "19"); // 19
		sa.assertTrue(lpp.hmwsPart(), "20"); // 20
		sa.assertTrue(lpp.itemName(), "21"); // 21 
		sa.assertTrue(lpp.workOrderTooltip(), "21"); //23 
	//	sa.assertTrue(lpp.purchaseOrder(), "24"); // inconsistent.
		sa.assertTrue(lpp.customer(), "25"); //25
		sa.assertTrue(lpp.earliestShipDate(), "26"); //26
		sa.assertTrue(lpp.currentStock(), "27");   // 27
		sa.assertTrue(lpp.qtyOnOrder(), "28");  //28
		sa.assertTrue(lpp.lackingQty(), "29");  // 29
		sa.assertTrue(lpp.moq(), "30");  //30 31
		sa.assertTrue(lpp.moqInvalid(), "32"); // 32
		sa.assertTrue(lpp.qtyToBeOrdered(), "33"); //33 34
		sa.assertTrue(lpp.qtyToBeOrderedInvalid(), "35"); //35
		sa.assertTrue(lpp.remarks(), "36");  //  36
		sa.assertTrue(lpp.supplier(), "37"); // 37
	//	sa.assertTrue(lpp.eta(), "38");//38 date gets selected but not visible in field. and now column only removed
		sa.assertTrue(lpp.currency(), "41");  // 41
		sa.assertTrue(lpp.unitPrice(), "42"); // 42 43
		sa.assertTrue(lpp.unitPriceInvalid(), "44");//44
		sa.assertTrue(lpp.amount(), "45");  //45
		sa.assertTrue(lpp.phpUnitPrice(), "46"); //46
		sa.assertTrue(lpp.phpAmount(), "47"); //47
		sa.assertTrue(lpp.audUnitPrice(), "48"); //48
		sa.assertTrue(lpp.audAmount(), "49");  //49
		sa.assertTrue(lpp.commentByKw(), "51") ;  //51 
		
		sa.assertTrue(lpp.statePending(), "56"); //56
		sa.assertTrue(lpp.stateApproved(), "57"); //57 63
		sa.assertTrue(lpp.stateActionNeeded(), "58"); //58 65
		sa.assertTrue(lpp.stateReject(), "59"); //59 64
		sa.assertTrue(lpp.saveChanges(), "60"); //60
		sa.assertTrue(lpp.approvalToDraft(), "62");//62
		sa.assertTrue(lpp.draftToApproval(), "61");//61
		sa.assertTrue(lpp.approveWithoutSupplier(), "66"); //66
	//	sa.assertTrue(lpp.approveEdit(), "67"); //67 //not getting 'PENDING' bug
	//	sa.assertTrue(lpp.rejectEdit(), "68"); //68 //not getting 'PENDING' bug
		sa.assertTrue(lpp.actionNeededEdit(), "69"); //69
		
		sa.assertTrue(lpp.qtyToBeOrdPurchasing(), "73"); //73
		sa.assertTrue(lpp.unitPricePurchasing(),"74"); //74
		sa.assertTrue(lpp.totalPricePurchasing(), "75"); //75
		sa.assertTrue(lpp.alignmentInPurchasing(), "76"); //76 77
		
	//	sa.assertTrue(lpp.etaEdit(),"84"); // 84 eta column only removed.
		sa.assertTrue(lpp.unconfirmedQty(),"87"); //87
	//	sa.assertTrue(lpp.createdAndConfirmedDates(),"88"); // 88 no dates on screen bug.
		sa.assertTrue(lpp.sourcing(), "89"); // 89
		
	//	sa.assertTrue(lpp.supplierOrder(), "52"); //52 53
	//	sa.assertTrue(lpp.generateWoForApproved(), "70"); //70 cant generate without error
	//	sa.assertTrue(lpp.generateWoForApprovedError(), "71"); //71
		sa.assertAll();
	}
	


}
