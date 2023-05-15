package com.vision.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vision.generics.GeneralFunctions;

public class ProductionPage extends GeneralFunctions{
	public WebDriver driver;
	public static Logger log = Logger.getLogger(ProductionPage.class);
	
	//new version dismiss message
	@FindBy(xpath = "//span[contains(text(),'Dismiss')]")
	private WebElement newVersionMsgDismiss;
	
	@FindBy(xpath="")
	private WebElement productionDemo;
	
	//production menu
	@FindBy(xpath="/html/body/cristalise-root/div/div[2]/div[1]/div[1]/cristalise-menu/div/ul/ul/li[6]/a/span")
	private WebElement productionMenu;
	
	//purchase order menu
	@FindBy(xpath="/html/body/cristalise-root/div/div[2]/div[1]/div[1]/cristalise-menu/div/ul/ul/li[6]/ul/ul/li[2]/a")
	private WebElement productionPurchaseOrderMenu;
	
	@FindBy(xpath="//*[@id=\"New\"]/span[2]")
	private WebElement productionNewBtn;
	
	@FindBy(xpath="//*[@id=\"Customer\"]/div/div[2]/span")
	private WebElement productionOrderingCustomerDropdown ;
	
	@FindBy(xpath="//*[@id=\"Customer\"]/div/div[3]/div[2]/ul/p-dropdownitem[5]/li/span")
	private WebElement productionOrderingCustomerDropdownValue;
	
	@FindBy(xpath="//*[@id=\"BillingAddress\"]/div/div[2]")
	private WebElement productionBillingAddressDropdown ;
	
	@FindBy(xpath="//*[@id=\"BillingAddress\"]/div/div[3]/div[2]/ul/p-dropdownitem[2]/li/span")
	private WebElement productionBillingAddressDropdownValue;
	
	@FindBy(xpath="//*[@id=\"ShippingAddress\"]/div/div[2]/span")
	private WebElement productionShippingAddressDropdown ;
	
	@FindBy(xpath="//*[@id=\"ShippingAddress\"]/div/div[3]/div[2]/ul/p-dropdownitem[2]/li/span")
	private WebElement productionShippingAddressDropdownValue;
	
	@FindBy(xpath="//*[@id=\"CustomerReference\"]")
	private WebElement productionCustomerPO ;
	
	@FindBy(xpath="//*[@id=\"Date\"]/span/input")
	private WebElement productionDateIssued;
	
	@FindBy(xpath="//*[@id=\"ExpectedDelivery\"]/span/input")
	private WebElement productionExpectedDelivery;
	
	@FindBy(xpath="//*[@id=\"DeliveryInstructions\"]")
	private WebElement productionDeliveryInstructions;
	
	@FindBy(xpath="//*[@id=\"InvoiceNeeded\"]/div/span")
	private WebElement productionInvoiceNeeded;
	
	@FindBy(xpath="//*[@id=\"OK\"]/span[2]")
	private WebElement productionOkBtn;
	
	@FindBy(xpath="//*[@id=\"Dismiss\"]/span[2]")
	private WebElement productionDismissBtn;
	
	@FindBy(xpath="/html/body/cristalise-root/div/div[3]/cristalise-list/div/div/div/p-table/div/div[2]/div/div[2]/table/tbody/tr[1]/td[1]/p-tableradiobutton/div/div[2]/span")
	private WebElement productionPurchaseOrderSelectRadioBtn;
	
	@FindBy(xpath="//*[@id=\"Edit\"]/span[2]")
	private WebElement productionPurchaseOrderEditBtn;
	
	@FindBy(xpath="//*[@id=\"Delete\"]/span[2]")
	private WebElement productionPurchaseOrderDeleteBtn;
	
	@FindBy(xpath="//span[normalize-space()='Yes']")
	private WebElement productionPurchaseOrderDeleteYes;
	
	@FindBy(xpath="//span[normalize-space()='No']")
	private WebElement productionPurchaseOrderDeleteNo;
	
	@FindBy(xpath="//span[normalize-space()='OK']")
	private WebElement productionPurchaseOrderDeleteOk;
	
	
	@FindBy(xpath="//span[normalize-space()='Export']")
	private WebElement productionPurchaseOrderExportBtn;
	
	@FindBy(xpath="//input[@class='ng-star-inserted']")
	private WebElement productionPurchaseOrderSearch;
	
	@FindBy(xpath="/html/body/cristalise-root/div/div[3]/cristalise-list/div/div/div/p-table/div/div[2]/div/div[2]/table/tbody/tr[1]/td[2]/webuilib-uuid-link/span/a")
	private WebElement productionPurchaseOrderSelectId;
	
	@FindBy(xpath="//*[@id=\"Ordering Customer\"]/span/a")
	private WebElement productionPurchaseOrderOrderingCustomer;
	
	@FindBy(xpath="//*[@id=\"Billing Customer\"]/span/a")
	private WebElement productionPurchaseOrderBillingCustomer;
	
	@FindBy(xpath="//*[@id=\"Billing Address\"]/span/a")
	private WebElement productionPurchaseOrderBillingAddress;
	
	@FindBy(xpath="//*[@id=\"Shipping Customer\"]/span/a")
	private WebElement productionPurchaseOrderShippingCustomer;
	
	@FindBy(xpath="//*[@id=\"Shipping Address\"]/span/a")
	private WebElement productionPurchaseOrderShippingAddress;
	
	@FindBy(xpath="//*[@id=\"exportButton\"]/span[2]")
	private WebElement productionPurchaseOrderCollectionExportBtn;
	
	
	@FindBy(xpath="//*[@id=\"Clone\"]/span[2]")
	private WebElement productionPurchaseOrderCloneBtn;
	
	@FindBy(xpath="//span[normalize-space()='Yes']")
	private WebElement productionPurchaseOrderCloneYes;
	
	@FindBy(xpath="//*[@id=\"Generate Work Orders\"]/span[2]")
	private WebElement productionPurchaseOrderGenerateWorkOrderBtn;
	
	@FindBy(xpath="//span[normalize-space()='Yes']")
	private WebElement productionPurchaseOrderGenerateWorkOrderYes;
	
	@FindBy(xpath="//span[normalize-space()='No']")
	private WebElement productionPurchaseOrderGenerateWorkOrderNo;
	
	
	@FindBy(xpath="//span[normalize-space()='OK']")
	private WebElement productionPurchaseOrderGenerateWorkOrderOk;
	
	
	
	
	
	public boolean AddPurchaseOrder() throws InterruptedException {
		click(productionMenu);
		click(productionPurchaseOrderMenu);
		click(productionNewBtn);
		click(productionOrderingCustomerDropdown);
		click(productionOrderingCustomerDropdownValue);
		Thread.sleep(3000L);
		click(productionBillingAddressDropdown);
		click(productionBillingAddressDropdownValue);
		Thread.sleep(3000L);
		click(productionShippingAddressDropdown);
		click(productionShippingAddressDropdownValue);
		sendKeys(productionCustomerPO, "Test");
		sendKeys(productionDeliveryInstructions, "Test");
		click(productionInvoiceNeeded);
		click(productionOkBtn);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains("purchaseorders");
		log.info("Purchase Order Added");
		try {
			Thread.sleep(3000L);
			newVersionMsgDismiss.click();
		} catch (Exception e) {
		}
		return plTest;
	}
	
	public boolean EditPurchaseOrder() throws InterruptedException {
		click(productionMenu);
		click(productionPurchaseOrderMenu);
		click(productionPurchaseOrderSelectRadioBtn);
		click(productionPurchaseOrderEditBtn);
		Thread.sleep(3000L);
		productionCustomerPO.clear();
		sendKeys(productionCustomerPO, "Test Customer PO");
		productionDeliveryInstructions.clear();
		sendKeys(productionDeliveryInstructions, "Test Delivery Instructions");
		click(productionInvoiceNeeded);
		click(productionOkBtn);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains("purchaseorders");
		log.info("Purchase Order Edited");
		try {
			Thread.sleep(3000L);
			newVersionMsgDismiss.click();
		} catch (Exception e) {
		}
		return plTest;
	}
	
	public boolean DeleteNoPurchaseOrder() {
		click(productionMenu);
		click(productionPurchaseOrderMenu);
		click(productionPurchaseOrderSelectRadioBtn);
		click(productionPurchaseOrderDeleteBtn);
		click(productionPurchaseOrderDeleteNo);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains("purchaseorders");
		log.info("Purchase Order Not Deleted");
		try {
			Thread.sleep(3000L);
			newVersionMsgDismiss.click();
		} catch (Exception e) {
		}
		return plTest;
	}
	public boolean DeleteYesPurchaseOrder() {
		click(productionMenu);
		click(productionPurchaseOrderMenu);
		click(productionPurchaseOrderSelectRadioBtn);
		click(productionPurchaseOrderDeleteBtn);
		click(productionPurchaseOrderDeleteYes);
		click(productionPurchaseOrderDeleteOk);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains("purchaseorders");
		log.info("Purchase Order Deleted");
		try {
			Thread.sleep(3000L);
			newVersionMsgDismiss.click();
		} catch (Exception e) {
		}
		return plTest;
	}
	public boolean ExportPurchaseOrder() throws InterruptedException {
		click(productionMenu);
		click(productionPurchaseOrderMenu);
		Thread.sleep(5000L);
		click(productionPurchaseOrderExportBtn);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains("purchaseorders");
		log.info("Purchase Order Exported");
		try {
			Thread.sleep(3000L);
			newVersionMsgDismiss.click();
		} catch (Exception e) {
		}
		return plTest;
	}
	public boolean SearchPurchaseOrder() throws InterruptedException {
		click(productionMenu);
		click(productionPurchaseOrderMenu);
		Thread.sleep(5000L);
		click(productionPurchaseOrderSearch);
		sendKeys(productionPurchaseOrderSearch,"PO-00015432");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains("purchaseorders");
		log.info("Purchase Order Search Input Field Work Successfully");
		try {
			Thread.sleep(3000L);
			newVersionMsgDismiss.click();
		} catch (Exception e) {
		}
		return plTest;
	}
	public boolean OrderingCustomerLinkPurchaseOrder() {
		click(productionMenu);
		click(productionPurchaseOrderMenu);
		click(productionPurchaseOrderSelectId);
		click(productionPurchaseOrderOrderingCustomer);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains("companies/APEM01");
		log.info(" Ordering Customer Link Work Successfully");
		try {
			Thread.sleep(3000L);
			newVersionMsgDismiss.click();
		} catch (Exception e) {
		}
		return plTest;
	}
	
	public boolean BillingCustomerLinkPurchaseOrder() {
		click(productionMenu);
		click(productionPurchaseOrderMenu);
		click(productionPurchaseOrderSelectId);
		click(productionPurchaseOrderBillingCustomer);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains("companies/APEM01");
		log.info("Billing Customer Link Work Successfully");
		try {
			Thread.sleep(3000L);
			newVersionMsgDismiss.click();
		} catch (Exception e) {
		}
		return plTest;
	}
	
	public boolean BillingAddressLinkPurchaseOrder() {
		click(productionMenu);
		click(productionPurchaseOrderMenu);
		click(productionPurchaseOrderSelectId);
		click(productionPurchaseOrderBillingAddress);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains("addresses/AD0001");
		log.info(" Billing Address Link Work Successfully");
		try {
			Thread.sleep(3000L);
			newVersionMsgDismiss.click();
		} catch (Exception e) {
		}
		return plTest;
	}
	
	public boolean ShippingCustomerLinkPurchaseOrder() {
		click(productionMenu);
		click(productionPurchaseOrderMenu);
		click(productionPurchaseOrderSelectId);
		click(productionPurchaseOrderShippingCustomer);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains("companies/APEM01");
		log.info("Shipping Customer Link Work Successfully");
		try {
			Thread.sleep(3000L);
			newVersionMsgDismiss.click();
		} catch (Exception e) {
		}
		return plTest;
	}
	public boolean ShippingAddressLinkPurchaseOrder() {
		click(productionMenu);
		click(productionPurchaseOrderMenu);
		click(productionPurchaseOrderSelectId);
		click(productionPurchaseOrderShippingAddress);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains("addresses/AD0001");
		log.info("Shipping Address Link Work Successfully");
		try {
			Thread.sleep(3000L);
			newVersionMsgDismiss.click();
		} catch (Exception e) {
		}
		return plTest;
	}
	public boolean ExportCollectionPurchaseOrder() {
		click(productionMenu);
		click(productionPurchaseOrderMenu);
		click(productionPurchaseOrderSelectId);
		click(productionPurchaseOrderCollectionExportBtn);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains("purchaseorders");
		log.info(" Purchase Order Row Export Button Work Successfully");
		try {
			Thread.sleep(3000L);
			newVersionMsgDismiss.click();
		} catch (Exception e) {
		}
		return plTest;
	}
	
	public boolean ClonePurchaseOrder() {
		click(productionMenu);
		click(productionPurchaseOrderMenu);
		click(productionPurchaseOrderSelectRadioBtn);
		click(productionPurchaseOrderCloneBtn);
		click(productionPurchaseOrderCloneYes);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains("purchaseorders");
		log.info("Purchase Order Clone Button Work Successfully");
		try {
			Thread.sleep(3000L);
			newVersionMsgDismiss.click();
		} catch (Exception e) {
		}
		return plTest;
	}
	
	public boolean GenerateWorkorderPurchaseOrder() {
		click(productionMenu);
		click(productionPurchaseOrderMenu);
		click(productionPurchaseOrderSelectRadioBtn);
		click(productionPurchaseOrderGenerateWorkOrderBtn);
		click(productionPurchaseOrderGenerateWorkOrderYes);
		click(productionPurchaseOrderGenerateWorkOrderOk);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains("purchaseorders");
		log.info(" Purchase Order Generate Work Order Button Work Successfully");
		try {
			Thread.sleep(3000L);
			newVersionMsgDismiss.click();
		} catch (Exception e) {
		}
		return plTest;
	}
	
	public ProductionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
