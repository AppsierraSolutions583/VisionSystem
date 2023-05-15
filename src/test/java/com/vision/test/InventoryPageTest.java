package com.vision.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.vision.generics.TestBase;
import com.vision.pageObjects.InventoryPage;
import com.vision.pageObjects.LoginPage;


public class InventoryPageTest extends TestBase{
	SoftAssert sa=new SoftAssert();
	@Test
	public void Inventory() throws InterruptedException{
		LoginPage lp=new LoginPage(TestBase.driver);
		sa.assertTrue(lp.positiveLoginTest());



		InventoryPage ip= new InventoryPage(TestBase.driver);

		//purchasing page

		ip.VerifyPurchasingCard();
		ip.VerifyPurchasingLink();
		ip.VerifyPurchasingData();
		ip.VerifyPurchasingFields();

		//replenishment purchasing page

		sa.assertTrue(ip.VerifyReplenishmentPurchasingCard());
		sa.assertTrue(ip.VerifyReplenishmentPurchasingLink());
		//		sa.assertTrue(ip.CreateNewSheet());
		//		sa.assertTrue(ip.EditandSaveCreatedSheet());
		sa.assertTrue(ip.ExportReplenishmentPurchasing());
		sa.assertTrue(ip.VerifyColumnOnReplenishmentPurchasing());

		//supplier order page

		sa.assertTrue(ip.AddSupplierOrder());
		sa.assertTrue(ip.EditSupplierOrder());
		ip.DeleteSupplierOrder();
		ip.PrintSupplierOrder();
		//		sa.assertTrue(ip.UploadtoXero());reupload to xero issue
		sa.assertTrue(ip.UpdateXeroOrderNumber());
		//		sa.assertTrue(ip.AddBUlkEntryInSupplierOrderRow());
		//		sa.assertTrue(ip.ExportSupplierOrder());red warning issue
		ip.SearchMatchedSupplierOrder();
		ip.SearchNotMatchedSupplierOrder();

		//supplier invoice page

		sa.assertTrue(ip.VerifySUI());
		sa.assertTrue(ip.CreateSUIEntry());
		sa.assertTrue(ip.EditSUIEntry());
		ip.DeleteSUIEntry();
		//		 sa.assertTrue(ip.SupplierInvoiceRow());record not coming

		//Storage Transaction page

		//				sa.assertTrue(ip.NewTransfer()); ok button missing
		//		sa.assertTrue(ip.CompleteStoragetoStorage());commented
		//		sa.assertTrue(ip.VerifyStockTake());
		sa.assertTrue(ip.VerifyNotesStoragaeTransaction());

		//Storage page

		sa.assertTrue(ip.AddStorage());
		sa.assertTrue(ip.EditStorage());
		//		sa.assertTrue(ip.CreateChild());
		ip.ChildExport();
		ip.StockExport();
		ip.TransactionExport();
		//		sa.assertTrue(ip.DeleteWithStocks());

		//storage type page

		sa.assertTrue(ip.AddNewStorageType());
		sa.assertTrue(ip.EditStorageType());
		ip.AddChild();
		//		sa.assertTrue(ip.ExportChildren()); unique record warning issue


		//stock take page
		
		ip.VerifyStock();
		//		sa.assertTrue(ip.ExportStock());//Choose option is not there
		ip.FileCollectionTab();
		
		//product

		sa.assertTrue(ip.AddProduct());
		sa.assertTrue(ip.EditProduct());
		//		sa.assertTrue(ip.DeleteProduct());issue
		ip.CloneProduct();
		ip.UpdateAveragePrice();
		ip.ExportPurchase();
		//		sa.assertTrue(ip.ExportProduct());
		//		sa.assertTrue(ip.AttachmentExport());
		ip.UsedInExport();
		ip.ComponentExport();
		ip.ProductStockExport();
		ip.ReservationExport();
		ip.ProductTransactionExport();
		//		sa.assertTrue(ip.VerifyHistory());
		ip.SearchMatch();
		ip.SearchNoMatch();
		//		sa.assertTrue(ip.ComponentAdd());
		//		sa.assertTrue(ip.ComponentEdit());
		//		sa.assertTrue(ip.ComponentDelete());
		//		sa.assertTrue(ip.StockAddStorage());

		//product category

		sa.assertTrue(ip.AddProductCategory());
		sa.assertTrue(ip.EditProductCategory());
		ip.ExportProductCategory();
		ip.SearchMatchProductCategory();
		ip.SearchUnMatchProductCategory();
		ip.SortProductCategory();
		ip.VerifyHistoryProductCategory();
		ip.DeleteProductCategory();
	}		
}
