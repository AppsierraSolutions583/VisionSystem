package com.vision.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vision.generics.GeneralFunctions;

public class JobListPage extends GeneralFunctions {

	public WebDriver driver;
	public static Logger log = Logger.getLogger(JobListPage.class);

	@FindBy(xpath = "//a[@href='#/hmws/joblist']/span[contains(text(),'Job List')]")
	private WebElement jobList;
	// input search
	@FindBy(xpath = "//input[@placeholder='  Search']")
	private WebElement search;

	// print work order button
	@FindBy(xpath = "//span[text()='Print Work Order']")
	private WebElement printWorkOrder;

	@FindBy(xpath = "//span[contains(text(),'Failed to Print the Work Order. Please contact sup')]")
	private WebElement printWorkOrderErrorMsg;

	@FindBy(xpath = "//button[@label='Dismiss']")
	private WebElement errorMsgDissmiss;

	// export button
	@FindBy(xpath = "//input[@placeholder='  Search']")
	private WebElement export;

	@FindBy(xpath = "(//tr[contains(@class,'JobList ui-selectable-row')])[1]/td[1]/p-tableradiobutton")
	private WebElement radioBtnWOM;

	// column selected dropdown
	@FindBy(xpath = "//span[@class='ui-multiselect-label ui-corner-all'][text()='45 columns selected']")
	private WebElement coulmnSelected;

	@FindBy(xpath = "//input[@class='ui-inputtext ui-widget ui-state-default ui-corner-all']")
	private WebElement coulmnSelectedSearch;

	@FindBy(xpath = "//input[@class='ui-inputtext ui-widget ui-state-default ui-corner-all']")
	private WebElement forSelectAllcoulmnSelected;

	@FindBy(xpath = "//span[text()='Work Order']")
	private WebElement workOrder;

	@FindBy(xpath = "//span[text()='Parent']")
	private WebElement parent;

	@FindBy(xpath = "//span[text()='Purchase Order']")
	private WebElement purchaseOrder;

	@FindBy(xpath = "//span[text()='Customer PO']']")
	private WebElement customerPO;

	@FindBy(xpath = "//span[text()='Latest ETA']")
	private WebElement lackingParts;

	@FindBy(xpath = "//span[text()='Type']")
	private WebElement type;

	@FindBy(xpath = "//span[text()='Product']")
	private WebElement product;

	@FindBy(xpath = "//span[text()='Product Name']")
	private WebElement productName;

	@FindBy(xpath = "//span[text()='Intended For WO']")
	private WebElement intendedForWo;

	@FindBy(xpath = "//span[text()='Intended For Product']")
	private WebElement intendedForProduct;

	@FindBy(xpath = "//span[text()='Customer']")
	private WebElement customer;

	@FindBy(xpath = "//span[text()='Flow']")
	private WebElement flow;

	@FindBy(xpath = "//span[text()='Production State']")
	private WebElement productionState;

	@FindBy(xpath = "//span[text()='Progress']")
	private WebElement progress;

	@FindBy(xpath = "//span[text()='Original Shipment Date']")
	private WebElement OriginalShipmentDate;

	@FindBy(xpath = "//span[text()='Updated Shipment Date']")
	private WebElement UpdatedShipmentDate;

	@FindBy(xpath = "//span[text()='Target Date']")
	private WebElement TargetDate;

	@FindBy(xpath = "//span[text()='Last Updated']")
	private WebElement LastUpdated;

	@FindBy(xpath = "//span[text()='Notes']")
	private WebElement Notes;

	@FindBy(xpath = "//span[text()='Customer Remarks']")
	private WebElement CustomerRemarks;

	@FindBy(xpath = "//span[text()='State']")
	private WebElement State;

	@FindBy(xpath = "//span[text()='Work Order Quantity']")
	private WebElement WorkOrderQuantity;

	@FindBy(xpath = "//span[text()='Material Cost (USD)']")
	private WebElement MaterialCostUSD;

	@FindBy(xpath = "//span[text()='Done Date']")
	private WebElement DoneDate;

	@FindBy(xpath = "//span[text()='Man Hours Last Uploaded Timestamp']")
	private WebElement ManHoursLastUploadedTimestamp;

	@FindBy(xpath = "//span[text()='Lacking Parts Notified']")
	private WebElement LackingPartsNotified;

	@FindBy(xpath = "//span[text()='//spanm']")
	private WebElement spanm;

	@FindBy(xpath = "//span[text()='Earliest PO Created']")
	private WebElement EarliestPOCreated;

	@FindBy(xpath = "//span[text()='Entered On']")
	private WebElement EnteredOn;

	@FindBy(xpath = "//span[text()='Engineering Received']")
	private WebElement EngineeringReceived;

	@FindBy(xpath = "//span[text()='Engineering Completed']")
	private WebElement EngineeringCompleted;

	@FindBy(xpath = "//span[text()='Picking Started On']")
	private WebElement PickingStartedOn;

	@FindBy(xpath = "//span[text()='Lacking Parts Created']")
	private WebElement LackingPartsCreated;

	@FindBy(xpath = "//span[text()='Lacking Parts Confirmed']")
	private WebElement LackingPartsConfirmed;

	@FindBy(xpath = "//span[text()='First ETA Provided']")
	private WebElement FirstETAProvided;

	@FindBy(xpath = "//span[text()='All ETAs Provided']")
	private WebElement AllETAsProvided;

	@FindBy(xpath = "//span[text()='Picking Completed On']")
	private WebElement PickingCompletedOn;

	@FindBy(xpath = "//span[text()='Production Started']")
	private WebElement ProductionStarted;

	@FindBy(xpath = "//span[text()='Production Finished']")
	private WebElement ProductionFinished;

	@FindBy(xpath = "//span[text()='First Shipment Date']")
	private WebElement FirstShipmentDate;

	@FindBy(xpath = "//span[text()='Last Shipment Date']")
	private WebElement LastShipmentDate;

	@FindBy(xpath = "//span[text()='Shipping Invoice']")
	private WebElement ShippingInvoice;

	@FindBy(xpath = "//span[text()='Mode of Transport']")
	private WebElement ModeofTransport;

	@FindBy(xpath = "//span[text()='Shipped Quantity']")
	private WebElement ShippedQuantity;

	// All order drop down
	@FindBy(xpath = "//span[text()='All Work Orders']")
	private WebElement AllWorkOrders;

	// All parent Id drop down
	@FindBy(xpath = "//span[text()='All Purchase Orders']")
	private WebElement AllPurchaseOrders;

	// All customers drop down
	@FindBy(xpath = "//span[text()='All Customer POs']")
	private WebElement AllCustomerPOs;

	// Manufacturing, MRF, Parts drop down
	@FindBy(xpath = "//span[text()='Manufacturing, MRF, Parts']")
	private WebElement ManufacturingMRFParts;

	// All Product drop down
	@FindBy(xpath = "//span[text()='All Products']")
	private WebElement AllProducts;

	// All Intended For WO drop down
	@FindBy(xpath = "//span[text()='All Intended For WO']")
	private WebElement AllIntendedForWO;

	@FindBy(xpath = "//span[text()='All Customers']")
	private WebElement AllCustomers;

	@FindBy(xpath = "//span[text()='All Flows']")
	private WebElement AllFlows;

	@FindBy(xpath = "//span[text()='174 items selected']")
	private WebElement itemsSelected;

	@FindBy(xpath = "//span[text()='All Progress']")
	private WebElement AllProgress;

	@FindBy(xpath = "//div[@title='ACTIVE']/span[text()='ACTIVE']")
	private WebElement Active;

	@FindBy(xpath = "//span[text()='All Lacking Parts Notified']")
	private WebElement AllLackingPartsNotified;

	@FindBy(xpath = "//span[text()='All Picking Completed']")
	private WebElement AllPickingCompleted;

	@FindBy(xpath = "//span[text()='All Mode of Transport']")
	private WebElement AllModeofTransport;

	@FindBy(xpath = "(//tbody)[2]/tr/td[2]/webuilib-uuid-link/span/a")
	private WebElement tableItem1WO;

	public JobListPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean goToJobList() {
		click(jobList);
		log.info("Landed on JobList page.");
		boolean flag = driver.getCurrentUrl().contains("joblist");
		return flag;
	}

	public boolean searchForJob() {
		boolean flag = false;

		click(export);
		log.info("Checked Export Btn");
		try {
			Thread.sleep(4000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sendKeys(search, "WOM-00025422");
		try {
			Thread.sleep(4000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(radioBtnWOM);
		click(printWorkOrder);
		log.info("Checked Print Btn");
		if (visibilityCheck(printWorkOrderErrorMsg)) {
			click(errorMsgDissmiss);
			flag = true;
		}

		return flag;
	}

	public void openWO() {
		click(tableItem1WO);
		try {
			Thread.sleep(4000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("Checked The WO from the table");
	}

}
