package com.vision.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vision.generics.GeneralFunctions;

public class WorkOrderPage extends GeneralFunctions {

	public WebDriver driver;
	public static Logger log = Logger.getLogger(WorkOrderPage.class);

	@FindBy(xpath = "//a[@href='#/workflow']")
	private WebElement production;

	@FindBy(xpath = "(//div[@class='ui-card-content'])[3]")
	private WebElement workOrder;
	
	@FindBy(xpath = "//span[contains(text(),'Export')]")
	private WebElement export;
	
	@FindBy(xpath = "//input[@placeholder=\"  Search\"]")
	private WebElement search;


	@FindBy(xpath = "//span[contains(text(),'New')]")
	private WebElement newWO;

	@FindBy(xpath = "//span[contains(text(),'Manufacturing WO')]")
	private WebElement menufacturingWO;

	@FindBy(xpath = "//input[@id='JobNumber']")
	private WebElement jobNumber;

	@FindBy(xpath = "//input[@id='Product']")
	private WebElement product;

	@FindBy(xpath = "//p-calendar[@id='ShipmentDate']")
	private WebElement shipmentDate;

	@FindBy(xpath = "//input[@id='WorkOrderQuantity']")
	private WebElement quantityWO;

	@FindBy(xpath = "//input[@id='IntendedForWO']")
	private WebElement intendedForWO;

	@FindBy(xpath = "//input[@id='IntendedForProduct']")
	private WebElement intendedForProduct;

	@FindBy(xpath = "//textarea[@id='Notes']")
	private WebElement notes;

	@FindBy(xpath = "//span[contains(text(),'OK')]")
	private WebElement ok;

	@FindBy(xpath = "//h3[contains(text(),'Background Process Successful')]")
	private WebElement successMsg;

	@FindBy(xpath = "//span[normalize-space()='Parts WO']")
	private WebElement newpartsWO;

	@FindBy(xpath = "//p-dropdown[@id='Customer']")
	private WebElement customerDropdown;

	@FindBy(xpath = "//input[contains(@class,\"ui-dropdown-filter ui-inputtext\")]")
	private WebElement customerSearch;

	@FindBy(xpath = "//a[contains(text(),'30')]")
	private WebElement selectDate;

	@FindBy(xpath = "//span[contains(@class,'ui-datepicker-next-icon')]")
	private WebElement nextMonth;

	@FindBy(xpath = "//span[@class='ui-menuitem-text'][normalize-space()='MRF']")
	private WebElement newMRFWO;

	@FindBy(xpath = "//webuilib-uuid-link[@id='ID']//span[@id='plainText']")
	private WebElement idWO;

	@FindBy(xpath = "//button[@id='Delete']")
	private WebElement deleteWO;
	
	

	@FindBy(xpath = "//p-dropdown[@id='Reason']")
	private WebElement reason;

	@FindBy(xpath = "//span[contains(text(),'Recall (The customer cancelled the order)')]")
	private WebElement selectReason;

	@FindBy(xpath = "//*[contains(text(),'Successfully deleted the  WorkOrder: ')]")
	private WebElement deleteSuccessMsg;

	@FindBy(xpath = "//span[contains(text(),'CLA01 - CLASSIC SPEED INC.')]")
	private WebElement selectCustomer;
	
	
	@FindBy(xpath = "//th[@id='Name-column']/p-sorticon")
	private WebElement sortID;
	
	@FindBy(xpath = "(//tbody)[2]/tr/td[2]/webuilib-uuid-link/span/a")
	private WebElement tableItem1WO;
	
	@FindBy(xpath = "//span[contains(text(),'History')]")
	private WebElement History;
	
	@FindBy(xpath = "//span[normalize-space()='Children']")
	private WebElement children;
	
	@FindBy(xpath = "//span[contains(@class,'ui-tabview-title')][normalize-space()='Timekeeping']")
	private WebElement timeKeeping;
	

	public WorkOrderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void gotoWorkOrders() {
		click(production);
		click(workOrder);
		click(newWO);
		log.info("Landed on Work Order Page.");
	}

	public void searchAndExport() {
		click(export);
		try {
			Thread.sleep(4000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sendKeys(search,"34884");
		try {
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(sortID);
		try {
			Thread.sleep(4000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(tableItem1WO);
		try {
			Thread.sleep(4000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(History);
		try {
			Thread.sleep(4000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(children);
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
		click(timeKeeping);
		try {
			Thread.sleep(2000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(export);
		try {
			Thread.sleep(4000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sendKeys(search,"MONTEROLA, REDENTOR V.");
	}
	
	
	
	
	public boolean newManufacturingWO() {

		try {
			Thread.sleep(4000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(newWO);
		click(menufacturingWO);
		try {
			Thread.sleep(4000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sendKeys(jobNumber, "");
		sendKeys(product, "313-7011-02");
		click(shipmentDate);
		click(nextMonth);
		click(selectDate);
		sendKeys(quantityWO, "2");
		sendKeys(intendedForWO, "WOM-00056968");
		sendKeys(intendedForProduct, "313-7011-02");
		sendKeys(notes, "Testing");
		click(ok);
		try {
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean flag = visibilityCheck(successMsg);
		if (flag) {
			log.info("New Manufacturing Work Order Created.");
			click(ok);
			try {
				Thread.sleep(3000L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			String idOfNewWOCreated = idWO.getText();
			log.info("The ID of the new work oder is : " + idOfNewWOCreated);
		}
		return flag;
	}

	public boolean deleteNewWO() {
		try {
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(deleteWO);
		click(reason);
		click(selectReason);
		sendKeys(notes, "Testing");
		click(ok);
		boolean flag1 = visibilityCheck(deleteSuccessMsg);

		if (flag1) {
			log.info("Work Order is Deleted.");
			click(ok);
		}
		return flag1;
	}

	public boolean newPartsWO() {
		click(newpartsWO);
		try {
			Thread.sleep(4000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(customerDropdown);
		sendKeys(customerSearch, "CLA");
		click(selectCustomer);
		click(shipmentDate);
		click(nextMonth);
		click(selectDate);
		sendKeys(notes, "Testing");
		click(ok);
		try {
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean flag = visibilityCheck(successMsg);
		if (flag) {
			log.info("New Parts Work Order Created.");
			click(ok);
			try {
				Thread.sleep(3000L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			String idOfNewWOCreated = idWO.getText();
			log.info("The ID of the new work oder is : " + idOfNewWOCreated);
		}
		
		return flag;
	}

}
