package com.vision.pageObjects;

import java.sql.Timestamp;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.time.StopWatch;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vision.generics.GeneralFunctions;

public class PurchaseOrderPage extends GeneralFunctions {

	public WebDriver driver;
	public static Logger log = Logger.getLogger(PurchaseOrderPage.class);

	@FindBy(xpath = "//a[@href='#/workflow']")
	private WebElement production;

	@FindBy(xpath = "(//div[@class='ui-card-content'])[2]")
	private WebElement purchaseOrder;

	@FindBy(xpath = "//h1[text()='Purchase Orders ']")
	private WebElement verifypurchaseOrderPage;

	@FindBy(xpath = "//span[contains(text(),'New')]")
	private WebElement newPO;

	@FindBy(xpath = "//p-dropdown[@id='Customer']")
	private WebElement customer;

	@FindBy(xpath = "//button[@id='exportButton']/parent::div/input")
	private WebElement search;
	
	
	@FindBy(xpath = "//input[contains(@class,'ui-dropdown-filter')]")
	private WebElement search1;
	
	@FindBy(xpath = "//thead/tr[1]/th[2]/p-sorticon[1]/i[1]")
	private WebElement sortID;

	@FindBy(xpath = "//button[@id='exportButton']")
	private WebElement export;

	@FindBy(xpath = "//span[contains(text(),'CLA01 - CLASSIC SPEED INC.')]")
	private WebElement selectCustomer;

	@FindBy(xpath = "//input[@id='CustomerReference']")
	private WebElement customerPO;

	@FindBy(xpath = "//p-calendar[@id='Date']")
	private WebElement issuedDate;

	@FindBy(xpath = "//span[contains(text(),'Today')]")
	private WebElement today;

	@FindBy(xpath = "//p-calendar[@id='DateReceived']")
	private WebElement receiveDate;

	@FindBy(xpath = "//p-calendar[@id='ExpectedDelivery']")
	private WebElement expectedDelivery;

	@FindBy(xpath = "//a[contains(text(),'30')]")
	private WebElement selectDate;

	@FindBy(xpath = "//span[contains(@class,'ui-datepicker-next-icon')]")
	private WebElement nextMonth;

	@FindBy(xpath = "//textarea[@id='DeliveryInstructions']")
	private WebElement instruction;

	@FindBy(xpath = "//span[contains(text(),'OK')]")
	private WebElement ok;

	@FindBy(xpath = "//span[text()='Purchase Order: ']/parent::h1")
	private WebElement verifyPO;

	@FindBy(xpath = "//button[@id='Delete']")
	private WebElement deletePO;

	@FindBy(xpath = "//span[contains(text(),'Yes')]")
	private WebElement yes;

	@FindBy(xpath = "//h3[contains(text(),'Background Process Successful')]")
	private WebElement deleteSuccessMsg;

	// filter
	@FindBy(xpath = "//span[text()='13 columns selected']")
	private WebElement columnSelected;

	@FindBy(xpath = "//span[text()='ID']")
	private WebElement id;

	@FindBy(xpath = "//span[text()='Customer PO #']")
	private WebElement customerPo;

	@FindBy(xpath = "//span[text()='Ordering Customer']")
	private WebElement orderingCustomer;

	@FindBy(xpath = "//span[text()='Billing Customer']")
	private WebElement billingCustomer;

	@FindBy(xpath = "//span[text()='Billing Address']")
	private WebElement billingAddress;

	@FindBy(xpath = "//span[text()='Shipping Customer']")
	private WebElement shippingCustomer;

	@FindBy(xpath = "//span[text()='Shipping Address']")
	private WebElement shippingAddress;

	@FindBy(xpath = "//span[text()='Date Issued']")
	private WebElement dateIssued;

	@FindBy(xpath = "//span[text()='Date Received']")
	private WebElement dateReceived;

	@FindBy(xpath = "//span[text()='Expected Delivery']")
	private WebElement poExpectedDelivery;

	@FindBy(xpath = "//span[text()='State']")
	private WebElement state;

	@FindBy(xpath = "(//button[@id='New'])[2]")
	private WebElement addNew;

	@FindBy(xpath = "(//button[@id='New'])[2]")
	private WebElement addNewTxt;

	@FindBy(xpath = "//input[@id='Product']")
	private WebElement addNewProduct;

	@FindBy(xpath = "//input[@id='Quantity']")
	private WebElement addNewQuantity;

	@FindBy(xpath = "//p-dropdown[@id='ContactPerson']")
	private WebElement addNewCPerson;

	@FindBy(xpath = "//button[@id='OK']")
	private WebElement addNewOk;

	@FindBy(xpath = "//div[@class='ui-table-scrollable-body']//tbody[@class='ui-table-tbody']/tr")
	private List<WebElement> tableRows;

	@FindBy(xpath = "//span[contains(text(),'CHASSIS BACK TO CHASSIS FRONT')]")
	private WebElement verifyRow1;

	@FindBy(xpath = "//button[@id='Generate Work Orders']")
	private WebElement generateWO;

	@FindBy(xpath = "//span[contains(text(),'The Work Order(s) below will be automatically gene')]")
	private WebElement generateWOTxt;

	@FindBy(xpath = "//span[contains(text(),'Yes')]")
	private WebElement Yes;

	@FindBy(xpath = "//h3[contains(text(),'Background Process Successful')]")
	private WebElement SuccessTxt;

	@FindBy(xpath = "//h3[contains(text(),'Generate Work Orders')]/following::p/b[2]")
	private WebElement SuccessTxtPONumber;

	@FindBy(xpath = "(//span[text()='Work Orders'])[2]")
	private WebElement workOrdersTable;

	@FindBy(xpath = "(//a[@href=\"#/hmws/products/313-7029-01\"]//parent::span//parent::webuilib-uuid-link/parent::td/parent::tr/td[2]//span/a)[2]")
	private WebElement workOrdersTableItem1;

	@FindBy(xpath = "(//div[@class='ui-table-scrollable-body']//tbody[@class='ui-table-tbody']/tr[2]/td[2]//a)[2]")
	private WebElement workOrdersTableItem2;

	@FindBy(xpath = "//button[@id='Finalize']")
	private WebElement finalize;

	@FindBy(xpath = "//label[contains(text(),'Select value')]")
	private WebElement Flow;

	@FindBy(xpath = "//span[contains(text(),'PRO1')]")
	private WebElement selectFlow;

	@FindBy(xpath = "//p[contains(text(),'Successfully finalized the WorkOrder: ')]/a/b")
	private WebElement successWONumber;

	@FindBy(xpath = "//button[@id='Upload']")
	private WebElement upload;

	@FindBy(xpath = "//h2[text()='Work Order: Upload Man Hours ']")
	private WebElement uploadWait;

	@FindBy(xpath = "//input[@id='FilePath']")
	private WebElement filePath;

	@FindBy(xpath = "//*[text()='Successfully executed Upload WorkOrder: ']")
	private WebElement uploadSuccess;

	@FindBy(xpath = "//button[@id='PRODUCTION ENGINEERING']")
	private WebElement productionEngg;

	@FindBy(xpath = "//button[@id='ASSEMBLY DRAWING']")
	private WebElement assemblyDrawing;

	@FindBy(xpath = "//button[@id='PARTS PICKING']")
	private WebElement PartsPicking;

	@FindBy(xpath = "//p[text()='Successful Parts Picking for WOM-00059752']")
	private WebElement PartsPickingSuccess;

	@FindBy(xpath = "//p-dropdown[@id='Flow']")
	private WebElement wireMarking;

	@FindBy(xpath = "//button[@id='UpdatePickList']")
	private WebElement updatePickList;

	@FindBy(xpath = "//td[@id=\'PickedQuantity4']")
	private WebElement pickQ4;

	@FindBy(xpath = "//td[@id='PickedQuantity3\']")
	private WebElement pickQ3;

	@FindBy(xpath = "//td[@id='PickedQuantity5']")
	private WebElement pickQ5;

	@FindBy(xpath = "//*[text()='Successful Update Picklist for WOM-00059752']")
	private WebElement pickSuccessMessage;

	@FindBy(xpath = "//span[contains(text(),'Failed to generate the Picklist because there is n')]")
	private WebElement partsPickingErrorMsg;

	@FindBy(xpath = "//*[@id=\"WIRE MARKING\"]")
	private WebElement wireM;

	@FindBy(xpath = "//*[@id=\"QuantityFinished\"]")
	private WebElement finishedQ;

	@FindBy(xpath = "//p-sidebar/div/a")
	private WebElement close;

	@FindBy(xpath = "(//tbody)[2]/tr/td[2]/webuilib-uuid-link/span/a")
	private WebElement tableItem1PO;

	@FindBy(xpath = "//button[@id='Clone']")
	private WebElement clone;

	@FindBy(xpath = "//span[contains(text(),'History')]")
	private WebElement history;

	@FindBy(xpath = "(//span[contains(text(),'Details')])[2]")
	private WebElement detailsTab;

	@FindBy(xpath = "(//tbody)[2]/tr/td[1]//span/a")
	private WebElement firstrowTable;

	@FindBy(xpath = "(//span[text()='Shipping Invoices'])[2]")
	private WebElement shippingInvoice;

	@FindBy(xpath = "//span[@class='ui-tabview-title ng-star-inserted'][normalize-space()='Work Orders']")
	private WebElement wkOrder;

	@FindBy(xpath = "//span[text()='Purchase Orders']")
	private WebElement pOrder;

	@FindBy(xpath = "//tbody/tr[1]/td[2]/*")
	private WebElement pO1;

	@FindBy(xpath = "//span[contains(text(),'History')]")
	private WebElement history1;

	@FindBy(xpath = "//button[@id='Edit']")
	private WebElement edit;

	@FindBy(xpath = "//button[@id='Delete']")
	private WebElement delete;

	@FindBy(xpath = "//span[contains(text(),'DEACTIVATED')]")
	private WebElement deactivated;
	
	@FindBy(xpath = "//tbody/tr[1]/td[4]//span/a")
	private WebElement orderingCustomer1;
	
	@FindBy(xpath = "//tbody/tr[1]/td[5]//span/a")
	private WebElement billingCustomer1;
	
	
	@FindBy(xpath = "//tbody/tr[1]/td[6]//span/a")
	private WebElement billingAddress1;
	
	@FindBy(xpath = "//tbody/tr[1]/td[7]//span/a")
	private WebElement shippingCustomer1;
	
	@FindBy(xpath = "//tbody/tr[1]/td[8]//span/a")
	private WebElement shippingAddress1;
	
	
	
	
	
	
	
	
	

	public PurchaseOrderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean gotoPurchaseOrders() {
		click(production);
		click(purchaseOrder);
		boolean flag = visibilityCheck(verifypurchaseOrderPage);
		log.info("Landed on Purchase Order Page.");
		return flag;

	}

	public boolean editAndDeletePO() {
		click(pO1);

		click(history);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(edit);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(ok);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(delete);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(yes);
		try {
			Thread.sleep(4000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(ok);
		log.info("Edit and Delete is done.");
		boolean flag = visibilityCheck(deactivated);
		return flag;
	}

	public void searchAndSortAndExportPO() {

		try {
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		clickWithJS(sortID);
		try {
			Thread.sleep(4000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("Sorting with ID Done");
		
		click(export);
		try {
			Thread.sleep(4000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("Export Done");
		
		sendKeys(search, "14904");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("Searched For PO");
		click(orderingCustomer1);
		try {
			Thread.sleep(4000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("Checked Ordering Customer");
		driver.navigate().back();
		sendKeys(search, "14904");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		click(billingCustomer1);
		try {
			Thread.sleep(4000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("Checked Billing Customer");
		driver.navigate().back();
		
		sendKeys(search, "14904");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		click(billingAddress1);
		try {
			Thread.sleep(4000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("Checked Billing Address");
		driver.navigate().back();
		
		sendKeys(search, "14904");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		click(shippingCustomer1);
		try {
			Thread.sleep(4000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("Checked Shipping Customer");
		driver.navigate().back();
		
		sendKeys(search, "14904");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		click(shippingAddress1);
		try {
			Thread.sleep(4000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("Checked Shipping Address");
		driver.navigate().back();
		
		sendKeys(search, "14904");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		click(tableItem1PO);
		try {
			Thread.sleep(4000L);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		click(export);
		try {
			Thread.sleep(4000L);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		click(history);
		log.info("Checked History");
		try {
			Thread.sleep(2000L);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		click(detailsTab);
		log.info("Checked Details tab");
		click(firstrowTable);
		try {
			Thread.sleep(2000L);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		click(shippingInvoice);
		try {
			Thread.sleep(2000L);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		log.info("Checked Shipping Invoice");
		click(wkOrder);
		try {
			Thread.sleep(5000L);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	driver.navigate().back();
	click(tableItem1PO);
	}

	public boolean cloneAnddeletePO() {
		try {
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(clone);
		click(yes);
		log.info("Work Order is Cloned.");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(deletePO);
		click(yes);
		boolean flag1 = visibilityCheck(deleteSuccessMsg);
		click(ok);
		log.info("Work Order is Deleted.");
		click(clone);
		click(yes);
		log.info("Deactivated Work Order is Cloned.");

		return flag1;
	}

	
	
	
	
	public boolean newPurchaseOrder(String Cus, String CusPO) {

		boolean flag = false;

		click(newPO);
		try {
			Thread.sleep(4000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(customer);

		sendKeys(search, Cus);
		WebElement customerName = driver.findElement(By.xpath("//span[contains(text(),'" + Cus + "')]"));
		click(customerName);
		sendKeys(customerPO, CusPO);
		click(issuedDate);
		click(today);
//		click(receiveDate);
//		click(today);
		click(expectedDelivery);
		try {
			Thread.sleep(2000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(nextMonth);
		try {
			Thread.sleep(2000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(selectDate);
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		log.info(timestamp);
		sendKeys(instruction, timestamp.toString());
		click(ok);

		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		log.info("New Purchase Order Created.");

		if (visibilityCheck(verifyPO)) {
			flag = true;

			stopWatch.stop();
			String idOfNewPOCreated = collectText(verifyPO);
			log.info("The ID of the new Purchase oder is : " + idOfNewPOCreated);
			log.info("Time Taken to create a PO is : " + stopWatch.getTime(TimeUnit.SECONDS) + " Seconds");
		}

		return flag;
	}

	
	public boolean addNewPORow(String product, String quantity) {
		try {
			Thread.sleep(7000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		click(addNewTxt);
		
		sendKeys(addNewProduct, product);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		addNewProduct.sendKeys(Keys.ARROW_DOWN);
		addNewProduct.sendKeys(Keys.ENTER);
		sendKeys(addNewQuantity, quantity);
		try {
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	//	click(addNewOk);
		log.info("Purchase Row Added");
		try {
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;

	}

	public boolean generateWorkOrder() {
		boolean flag = false;
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(generateWO);
		explicitWait(generateWOTxt, 20);
		click(Yes);
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		explicitWait(SuccessTxt, 60);
		if (visibilityCheck(SuccessTxt)) {
			flag = true;
			stopWatch.stop();
			String dummy = collectText(SuccessTxtPONumber);
			log.info("2 Work Orders Generated for Purchase Order : " + dummy);
			log.info("Time Taken to create the Work Order is : " + stopWatch.getTime(TimeUnit.SECONDS) + " Seconds");
			click(ok);
		}
		return flag;
	}

	public void openWO1() {
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(workOrdersTable);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		click(workOrdersTableItem1);
	}

	public void openWO2() {
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(workOrdersTable);
		click(workOrdersTableItem2);
	}

	public boolean finalizeWOforPO() {
		boolean flag = false;
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(finalize);
//		WebElement ele = driver.findElement(By.xpath("//h2[text()='Work Order: Finalize ']"));
//		explicitWait(ele, 10);
		try {
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		click(Flow);
		// sendKeys(Flow, Keys.ENTER);
		try {
			Thread.sleep(2000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sendKeys(search1, "PRO1");
		click(selectFlow);
		try {
			Thread.sleep(2000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		clickWithJS(ok);
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		String dummy = collectText(successWONumber);
		stopWatch.stop();
		flag = visibilityCheck(successWONumber);
		log.info("Work Order Finalize Successful for : " + dummy);
		log.info("Time Taken to Finalize the Work Order is : " + stopWatch.getTime(TimeUnit.SECONDS) + " Seconds");
		click(ok);

		return flag;
	}

	public void processWO() {
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		click(productionEngg);
		click(yes);
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		explicitWait(SuccessTxt, 300);
		stopWatch.stop();
		log.info("Successfully Executed Production Engineering.");
		log.info("Time Taken for Production Engineering : " + stopWatch.getTime(TimeUnit.SECONDS) + " Seconds");
		click(ok);
		try {
			Thread.sleep(4000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(assemblyDrawing);
		click(yes);
		click(PartsPicking);
		boolean flag = visibilityCheck(partsPickingErrorMsg);
		try {
			Thread.sleep(2000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(close);
		String Filepath = System.getProperty("user.dir")
				+ "\\src\\test\\resources\\Assets\\PRO1_313-7029-01_v140_20220209_230311.xml";
		click(upload);
		explicitWait(uploadWait, 10);
		try {
			Thread.sleep(7000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		click(filePath);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		uploadFile(Filepath);
		click(ok);
		explicitWait(uploadSuccess, 15);

		click(PartsPicking);
		click(ok);
		click(yes);
		explicitWait(PartsPickingSuccess, 10);
		boolean flag3 = visibilityCheck(PartsPickingSuccess);
		
		click(updatePickList);
		click(pickQ3);
		sendKeys(pickQ3, "6");
		click(pickQ4);
		sendKeys(pickQ4, "33");
		click(pickQ5);
		sendKeys(pickQ5, "156");
		click(ok);
	
		click(ok);
		click(wireM);
		sendKeys(finishedQ, "3");
		click(ok);

	}

}
