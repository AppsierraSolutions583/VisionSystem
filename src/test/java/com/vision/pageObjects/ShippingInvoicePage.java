package com.vision.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vision.generics.GeneralFunctions;

public class ShippingInvoicePage extends GeneralFunctions {
	public WebDriver driver;
	public static Logger log = Logger.getLogger(ShippingInvoicePage.class);
	//new version dismiss message
	@FindBy(xpath = "//span[contains(text(),'Dismiss')]")
	private WebElement newVersionMsgDismiss;
		
	//Shipping Invoice Page
		
	@FindBy(xpath = "//body/cristalise-root[1]/div[1]/div[2]/div[1]/div[1]/cristalise-menu[1]/div[1]/ul[1]/ul[1]/li[6]/a[1]/span[1]")
	private WebElement productionMenu;
	
	@FindBy(xpath = "/html/body/cristalise-root/div/div[2]/div[1]/div[1]/cristalise-menu/div/ul/ul/li[6]/ul/ul/li[6]/a")
	private WebElement shippingInvoiceMenu;
	
	@FindBy(xpath = "//button[@id='New']")
	private WebElement NewBtn;
	
	@FindBy(xpath = "//*[@id=\"Customer\"]/div/div[2]/span")
	private WebElement customerDropdown;
	
	@FindBy(xpath = "//span[normalize-space()='BANSHU - BANSHU ELECTRIC EQUIPMENT CO. LTD.']")
	private WebElement customerDropdownValue;
	
	@FindBy(xpath = "//*[@id=\"BillingAddress\"]/div/div[2]/span")
	private WebElement billingAddressDropdown;
	
	@FindBy(xpath = "//span[contains(text(),'25-1 NISHITANI, HIRAOKACHO, KAKOGAWA-SHI, HYOGO JA')]")
	private WebElement billingAddressDropdownValue;
	
	@FindBy(xpath = "//input[@id='BillingPhoneNumber']")
	private WebElement billingPhoneNumber;
	
	@FindBy(xpath = "//input[@id='BillingContact']")
	private WebElement billingContact;
	
	@FindBy(xpath = "//*[@id=\"ShippingAddress\"]/div/div[2]/span")
	private WebElement shippingAddressDropdown;
	
	@FindBy(xpath = "//span[contains(text(),'25-1 NISHITANI, HIRAOKACHO, KAKOGAWA-SHI, HYOGO JA')]")
	private WebElement shippingAddressDropdownValue;
	
	@FindBy(xpath = "//input[@id='ShippingPhoneNumber']")
	private WebElement shippingPhoneNumber;
	
	@FindBy(xpath = "//input[@id='ShippingContact']")
	private WebElement shippingContact;
	
	@FindBy(xpath = "//*[@id=\"Description\"]/div/div[2]/span")
	private WebElement descriptionDropdown;
	
	@FindBy(xpath = "//span[normalize-space()='AUTOMOTIVE WIRING HARNESSES/ PARTS']")
	private WebElement descriptionDropdownValue;
	
	@FindBy(xpath = "//*[@id=\"ShipmentDate\"]/span/button/span[1]")
	private WebElement shipmentDate;
	
	@FindBy(xpath = "//*[@id=\"ShipmentDate\"]/span/div/div[1]/div[2]/table/tbody/tr[2]/td[2]/a")
	private WebElement shipmentDateValue;
	
	@FindBy(xpath = "//*[@id=\"Currency\"]/div/div[2]/span")
	private WebElement currencyDropdown;
	
	@FindBy(xpath = "//li[@aria-label='USD']")
	private WebElement currencyDropdownValue;
	
	@FindBy(xpath = "//*[@id=\"Courier\"]/div/div[2]/span")
	private WebElement courrier;
	
	@FindBy(xpath = "//li[@aria-label='DHL EXPRESS']")
	private WebElement courrierValue;
	
	@FindBy(xpath = "//input[@id='TrackingNumber']")
	private WebElement trackingNumber;
	
	@FindBy(xpath = "//*[@id=\"PackingDetails\"]")
	private WebElement packingDetails;
	
	@FindBy(xpath = "//*[@id=\"Weight\"]")
	private WebElement weight;
	
	@FindBy(xpath = "//*[@id=\"Dimensions\"]")
	private WebElement dimension;
	
	@FindBy(xpath = "//*[@id=\"ModeOfTransport\"]/div/div[2]/span")
	private WebElement modeOftransportDropdown;
	
	@FindBy(xpath = "//li[@aria-label='Sea']")
	private WebElement modeOftransportDropdownValue;
	
	@FindBy(xpath = "/html/body/cristalise-root/div/div[3]/cristalise-list/div/div/div/p-table/div/div[2]/div/div[2]/table/tbody/tr[1]/td[2]/webuilib-uuid-link/span/a")
	private WebElement invoiceNumberSelect;
	
	@FindBy(xpath = "//*[@id=\"Customer\"]/span/a")
	private WebElement customerLink;
	
	@FindBy(xpath = "//*[@id=\"Billing Address\"]/span/a")
	private WebElement billingAddressLink;
	
	@FindBy(xpath = "//*[@id=\"Shipping Address\"]/span/a")
	private WebElement shippingAddressLink;
	
	@FindBy(xpath = "//*[@id=\"Select\"]/span[2]")
	private WebElement porSelect;
	
	@FindBy(xpath = "//*[@id=\"PurchaseOrder\"]/div/div[2]/span")
	private WebElement purchaseOrderDropdown;
	
	@FindBy(xpath = "//*[@id=\"PurchaseOrder\"]/div/div[3]/div[2]/ul/p-dropdownitem[3]/li/span")
	private WebElement purchaseOrderDropdownValue;
	
	@FindBy(xpath = "//*[@id=\"OK\"]/span[2]")
	private WebElement ok;
	
	@FindBy(xpath = "//*[@id=\"Dismiss\"]/span[2]")
	private WebElement dismiss;
	
	@FindBy(xpath = "//*[@id=\"exportButton\"]/span[2]")
	private WebElement export;
	
	@FindBy(xpath = "//thead/tr[1]/th[1]")
	private WebElement purchaseOrderSort;
	
	
	@FindBy(xpath = "/html/body/cristalise-root/div/div[3]/cristalise-list/div/div/div/p-table/div/div[2]/div/div[2]/table/tbody/tr[10]/td[2]/webuilib-uuid-link/span/a")
	private WebElement invoiceSelect;
	
	
	@FindBy(xpath = "//thead/tr[2]/th[6]/p-multiselect[1]/div[1]/div[3]/span[1]")
	private WebElement invoiceStatefilter;
	
	@FindBy(xpath = "//body/div[1]/div[2]/ul[1]/cdk-virtual-scroll-viewport[1]/div[1]/p-multiselectitem[2]/li[1]/div[1]/div[1]")
	private WebElement invoiceStatefilterValue;
	
	@FindBy(xpath = "//body/div[1]/div[1]/a[1]/span[1]")
	private WebElement invoiceState;
	
	
	@FindBy(xpath = "//*[@id=\"Print\"]/div/button[2]/span[1]")
	private WebElement print;
	
	@FindBy(xpath = "//*[@id=\"Print\"]/div/div/ul/li[1]/a/span")
	private WebElement shippingInvoicePrint;
	
	@FindBy(xpath = "//*[@id=\"Print\"]/div/div/ul/li[2]/a/span")
	private WebElement shipmentDeliberyReceipt;
	
	@FindBy(xpath = "//*[@id=\"Finalize\"]/span[2]")
	private WebElement finalize;
	
	@FindBy(xpath = "/html/body/cristalise-root/div/div[3]/cristalise-list/div/div/div/p-table/div/div[2]/div/div[2]/table/tbody/tr[1]/td[2]/webuilib-uuid-link/span/a")
	private WebElement invoiceSelect1;
	
	@FindBy(xpath = "//*[@id=\"Generate Customer Invoice\"]/span[2]")
	private WebElement generateCustomerInvoice;
	
	@FindBy(xpath = "//span[normalize-space()='Yes']")
	private WebElement generateCustomerInvoiceYes;
	
	
	@FindBy(xpath = "//span[normalize-space()='No']")
	private WebElement generateCustomerInvoiceNo;
	
	@FindBy(xpath = "//span[@class='ui-tabview-title ng-star-inserted'][normalize-space()='Customer Invoices']")
	private WebElement CustomerInvoiceTab;
	
	@FindBy(xpath = "(//span[contains(@class,'ui-button-text ui-clickable')][normalize-space()='Export'])[2]")
	private WebElement CustomerInvoiceExport;
	
	@FindBy(xpath = "(//input[contains(@placeholder,'Search')])[3]")
	private WebElement CustomerInvoiceSearch;
	
	
	

	public ShippingInvoicePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public boolean AddShippingInvoice() throws InterruptedException {
		click(productionMenu);
		click(shippingInvoiceMenu);
		click(NewBtn);
		click(customerDropdown);
		click(customerDropdownValue);
		click(billingAddressDropdown);
		click(billingAddressDropdownValue);
		sendKeys(billingPhoneNumber,"42344235545");
		sendKeys(billingContact,"4352545");
		click(shippingAddressDropdown);
		click(shippingAddressDropdownValue);
		sendKeys(shippingPhoneNumber,"3466286");
		sendKeys(shippingContact,"76524692");
		click(descriptionDropdown);
		click(descriptionDropdownValue);
		click(shipmentDate);
		click(shipmentDateValue);
		click(currencyDropdown);
		click(currencyDropdownValue);
		click(courrier);
		click(courrierValue);
		sendKeys(trackingNumber,"6744529");
		sendKeys(packingDetails,"bcwebcwuebcewbebf");
		sendKeys(weight,"45");
		sendKeys(dimension,"rgieru");
		click(modeOftransportDropdown);
		click(modeOftransportDropdownValue);
		click(ok);
		log.info("Shipping Invoice Added");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}
	
	public boolean SIDetailsCustomer() throws InterruptedException {
		click(productionMenu);
		click(shippingInvoiceMenu);
		click(invoiceNumberSelect);
		click(customerLink);
		log.info("SI Details Customer Verified");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}
	
	public boolean SIDetailsBillingAddress() throws InterruptedException {
		click(productionMenu);
		click(shippingInvoiceMenu);
		click(invoiceNumberSelect);
		click(billingAddressLink);
		log.info("Billing Adress Verified");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}
	
	public boolean SIDetailsShippingAddress() throws InterruptedException {
		click(productionMenu);
		click(shippingInvoiceMenu);
		click(invoiceNumberSelect);
		click(shippingAddressLink);
		log.info("Shipping Address Verified");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}
	public boolean PurchaseOrderRowSelect() throws InterruptedException {
		click(productionMenu);
		click(shippingInvoiceMenu);
		click(invoiceNumberSelect);
		click(porSelect);
		click(purchaseOrderDropdown);
		click(purchaseOrderDropdownValue);
		click(ok);
		log.info("Purchase order row selected");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}
	
	public boolean PurchaseOrderRowExport() throws InterruptedException {
		click(productionMenu);
		click(shippingInvoiceMenu);
		click(invoiceNumberSelect);
		Thread.sleep(3000L);
		click(export);
		log.info("Purchase order row exported");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}
	
	public boolean PurchaseOrderRowSort() throws InterruptedException {
		click(productionMenu);
		click(shippingInvoiceMenu);
		click(invoiceNumberSelect);
		click(purchaseOrderSort);
		log.info("Purchase order row Sorted");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}
	public boolean PrintShippingInvoiceReport() throws InterruptedException {
		click(productionMenu);
		click(shippingInvoiceMenu);
		clickWithJS(invoiceStatefilter);
		click(invoiceStatefilterValue);
		click(invoiceState);
		click(invoiceSelect);
		click(print);
		click(shippingInvoicePrint);
		log.info("Shipping Invoice Report Generated");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}
	public boolean PrintShipmentDeliveryReceipt() throws InterruptedException {
		click(productionMenu);
		click(shippingInvoiceMenu);
		click(invoiceStatefilter);
		click(invoiceStatefilterValue);
		click(invoiceState);
		click(invoiceSelect);
		click(print);
		click(shipmentDeliberyReceipt);
		log.info("Delivery Receipt Printed");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}
	public boolean Finalize() throws InterruptedException {
		click(productionMenu);
		click(shippingInvoiceMenu);
		click(invoiceSelect1);
		click(finalize);
		click(ok);
		log.info("Finalized");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}
	public boolean GenerateCustomerInvoiceYes() throws InterruptedException {
		click(productionMenu);
		click(shippingInvoiceMenu);
		click(invoiceSelect1);
		click(generateCustomerInvoice);
		click(generateCustomerInvoiceYes);
		log.info("Customer Invoice Generated");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}
	
	public boolean GenerateCustomerInvoiceNo() throws InterruptedException {
		click(productionMenu);
		click(shippingInvoiceMenu);
		click(invoiceSelect1);
		click(generateCustomerInvoice);
		click(generateCustomerInvoiceNo);
		log.info("Customer Invoice Not Generated");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}
	public boolean CustomerInvoice() throws InterruptedException {
		click(productionMenu);
		click(shippingInvoiceMenu);
		click(invoiceSelect1);
		click(CustomerInvoiceTab);
		log.info("See All generated Customer Invoice");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}
	
	public boolean CustomerInvoiceExport() throws InterruptedException {
		click(productionMenu);
		click(shippingInvoiceMenu);
		click(invoiceSelect1);
		click(CustomerInvoiceTab);
		click(CustomerInvoiceExport);	
		log.info("Customer Invoice Export");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}
	public boolean CustomerInvoiceSearch() throws InterruptedException {
		click(productionMenu);
		click(shippingInvoiceMenu);
		click(invoiceSelect1);
		click(CustomerInvoiceTab);
		sendKeys(CustomerInvoiceSearch,"CI-00009950");
		log.info("Customer Invoice Search");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}
}
