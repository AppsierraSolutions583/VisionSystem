package com.vision.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vision.generics.GeneralFunctions;

public class CustomerInvoicePage extends GeneralFunctions {
	public WebDriver driver;
	public static Logger log = Logger.getLogger(CustomerInvoicePage.class);
	
	//new version dismiss message
	@FindBy(xpath = "//span[contains(text(),'Dismiss')]")
	private WebElement newVersionMsgDismiss;
	
	//Customer Invoice Page
	
	@FindBy(xpath = "//span[normalize-space()='Production']")
	private WebElement productionMenu;
	
	@FindBy(xpath = "//span[normalize-space()='Customer Invoices']")
	private WebElement customerInvoiceMenu;
	
	@FindBy(xpath = "/html/body/cristalise-root/div/div[3]/cristalise-list/div/div/div/p-table/div/div[2]/div/div[2]/table/tbody/tr[1]/td[1]/p-tableradiobutton/div/div[2]/span")
	private WebElement customerInvoiceSelectradioBtn;
	

	@FindBy(xpath = "//span[normalize-space()='Upload to Xero']")
	private WebElement uploadXero;
	
	@FindBy(xpath = "//span[normalize-space()='Yes']")
	private WebElement confirmationYes;
	
	@FindBy(xpath = "//span[normalize-space()='No']")
	private WebElement confirmationNo;
	
	@FindBy(xpath = "//span[normalize-space()='OK']")
	private WebElement backgroundProcessFailedOk;
	
	@FindBy(xpath = "//span[contains(text(),'Update Xero Invoice Number')]")
	private WebElement updateXeroInvoice;
	
	@FindBy(xpath = "//input[@id='XeroInvoiceNumber']")
	private WebElement xeroInvoiceNumber;
	
	@FindBy(xpath = "//textarea[@id='Notes']")
	private WebElement notes;
	
	
	public CustomerInvoicePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean UploadtoXero() throws InterruptedException {
		click(productionMenu);
		click(customerInvoiceMenu);
		click(customerInvoiceSelectradioBtn);
		click(uploadXero);
		click(confirmationYes);
		click(backgroundProcessFailedOk);
		boolean plTest = driver.getCurrentUrl().contains("customerinvoices");
		log.info("Customer Invoice Uploaded");
		Thread.sleep(3000L);
		return plTest;
	}
	public boolean UpdateXeroNumber() throws InterruptedException {
		click(productionMenu);
		click(customerInvoiceMenu);
		click(customerInvoiceSelectradioBtn);
		click(updateXeroInvoice);
		String xeroinvoicenum=generateRandomNumber();
		xeroInvoiceNumber.clear();
		sendKeys(xeroInvoiceNumber,xeroinvoicenum);
		sendKeys(notes,"Test");
		log.info("Xero Number Updated");
		Thread.sleep(3000L);
		return true;
	}

}
