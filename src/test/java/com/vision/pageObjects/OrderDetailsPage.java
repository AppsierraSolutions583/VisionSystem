package com.vision.pageObjects;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vision.generics.GeneralFunctions;

public class OrderDetailsPage  extends GeneralFunctions {

	public WebDriver driver;
	public static Logger log = Logger.getLogger(AnalyticsPage.class);
	
	 @FindBy(xpath = "//span[text()='Orders']")
	 private WebElement orders;
	 
	 @FindBy(xpath = "//span[text()='Order Details']")
	 private WebElement orderDetails;
	 
	 @FindBy(xpath = "(//div[@class='ui-card-content']/p)[2]")
	 private WebElement orderDetailsCard;
	 
	 @FindBy(xpath = "//span[text()='New']")
	 private WebElement newButton;
	 
	 @FindBy(xpath = "(//span[@class='ui-dropdown-trigger-icon ui-clickable pi pi-caret-down'])[1]")
	 private WebElement orderingCustDrp;
	 
	 @FindBy(xpath = "//p-dropdownitem/li")
	 private List<WebElement> drpOpts;
	 
	 @FindBy(xpath = "//p-multiselectitem/li")
	 private List<WebElement> drpOptsForFilter;
	 
	 @FindBy(xpath = "//span[@class='pi pi-times']")
	 private WebElement cross;
	 
	 @FindBy(xpath = "(//span[@class='ui-dropdown-trigger-icon ui-clickable pi pi-caret-down'])[2]")
	 private WebElement billingCustDrp;
	 
	 @FindBy(xpath = "(//span[@class='ui-dropdown-trigger-icon ui-clickable pi pi-caret-down'])[3]")
	 private WebElement billingAddressDrp;
	 
	 @FindBy(xpath = "(//span[@class='ui-dropdown-trigger-icon ui-clickable pi pi-caret-down'])[4]")
	 private WebElement shippingCustDrp;
	 
	 @FindBy(xpath = "(//span[@class='ui-dropdown-trigger-icon ui-clickable pi pi-caret-down'])[5]")
	 private WebElement shippingAddressDrp;
	 
	 @FindBy(xpath = "//input[@placeholder='Customer PO #']")
	 private WebElement custPoInput;
	 
	 @FindBy(xpath = "(//span[@class='ui-button-icon-left ui-clickable fa fa-calendar'])[1]")
	 private WebElement dateIssued;
	 
	 @FindBy(xpath = "(//span[@class='ui-button-icon-left ui-clickable fa fa-calendar'])[2]")
	 private WebElement dateReceived;
	 
	 @FindBy(xpath = "(//span[@class='ui-button-icon-left ui-clickable fa fa-calendar'])[3]")
	 private WebElement expectedDelivery;
	 
	 @FindBy(xpath = "//span[text()='Today']")
	 private WebElement today;
	 
	 @FindBy(xpath = "//span[text()='OK']")
	 private WebElement OK;
	 
	 @FindBy(xpath = "//span[text()='Dismiss']")
	 private WebElement dismiss;
	 
	 @FindBy(xpath = "//h1/span")
	 private WebElement header;
	 
	 @FindBy(xpath = "//div[@class='ui-g-4' and text()='Customer PO #']/following-sibling::div//span")
	 private WebElement custPO;
	 
	 @FindBy(xpath = "//td[4]")
	 private List<WebElement> custField;
	 
	 @FindBy(xpath = "//td[5]")
	 private List<WebElement> stateField;
	 
	 @FindBy(xpath = "//td[@class='WorkOrderType ui-resizable-column ng-star-inserted']")
	 private List<WebElement> typeField;
	 
	 @FindBy(xpath = "//td[@class='Product ui-resizable-column ng-star-inserted']")
	 private List<WebElement> productField;
	 
	 @FindBy(xpath = "//td[@class='ProductionState ui-resizable-column ng-star-inserted']")
	 private List<WebElement> productionStateField;
	 
	 @FindBy(xpath = "//td[@class='Flow ui-resizable-column ng-star-inserted']")
	 private List<WebElement> flowField;
	 
	 @FindBy(xpath = "//td[16]")
	 private List<WebElement> stateField2;
	 
	 @FindBy(xpath = "((//div[@class='ui-table-scrollable-view'])[2]/div//tbody)[2]//td[6]")
	 private List<WebElement> invoiceStateField;
	 
	 @FindBy(xpath = "((//div[@class='ui-table-scrollable-view'])[2]/div//tbody)[2]//td[12]")
	 private List<WebElement> stateField3;
	 
	 @FindBy(xpath = "((//div[@class='ui-table-scrollable-view'])[2]/div//tbody)[2]//td[9]")
	 private List<WebElement> stateField4;
	 
	 @FindBy(xpath = "((//div[@class='ui-table-scrollable-view'])[2]/div//tbody)[2]//td[3]")
	 private List<WebElement> custField3;
	 
	 @FindBy(xpath = "((//div[@class='ui-table-scrollable-view'])[2]/div//tbody)[2]//td[4]")
	 private List<WebElement> custField4;
	 
	 @FindBy(xpath = "//td[12]")
	 private List<WebElement> custField2;
	 
	 @FindBy(xpath = "(//span[@class='ui-multiselect-trigger-icon ui-clickable pi pi-chevron-down'])[2]")
	 private WebElement custFilter;
	 
	 @FindBy(xpath = "(//span[@class='ui-multiselect-trigger-icon ui-clickable pi pi-chevron-down'])[3]")
	 private WebElement stateFilter;
	 
	 @FindBy(xpath = "(//span[@class='ui-multiselect-trigger-icon ui-clickable pi pi-chevron-down'])[5]")
	 private WebElement typeFilter;
	 
	 @FindBy(xpath = "(//span[@class='ui-multiselect-trigger-icon ui-clickable pi pi-chevron-down'])[6]")
	 private WebElement productFilter;
	 
	 @FindBy(xpath = "(//span[@class='ui-multiselect-trigger-icon ui-clickable pi pi-chevron-down'])[7]")
	 private WebElement productionStateFilter;
	 
	 @FindBy(xpath = "(//span[@class='ui-multiselect-trigger-icon ui-clickable pi pi-chevron-down'])[8]")
	 private WebElement custFilter2;
	 
	 @FindBy(xpath = "(//span[@class='ui-multiselect-trigger-icon ui-clickable pi pi-chevron-down'])[9]")
	 private WebElement flowFilter;
	 
	 @FindBy(xpath = "(//span[@class='ui-multiselect-trigger-icon ui-clickable pi pi-chevron-down'])[10]")
	 private WebElement stateFilter2;
	 
	 @FindBy(xpath = "(//span[@class='ui-multiselect-trigger-icon ui-clickable pi pi-chevron-down'])[5]")
	 private WebElement custFilter3;
	 
	 @FindBy(xpath = "(//span[@class='ui-multiselect-trigger-icon ui-clickable pi pi-chevron-down'])[6]")
	 private WebElement invoiceStateFilter;
	 
	 @FindBy(xpath = "(//span[@class='ui-multiselect-trigger-icon ui-clickable pi pi-chevron-down'])[7]")
	 private WebElement stateFilter3;
	 
	 @FindBy(xpath = "(//span[@class='ui-multiselect-trigger-icon ui-clickable pi pi-chevron-down'])[6]")
	 private WebElement stateFilter4;
	 
	 @FindBy(xpath = "(//div[@class='ng-trigger ng-trigger-overlayAnimation ng-tns-c12-190 ui-multiselect-panel ui-widget ui-widget-content ui-corner-all ui-shadow ng-star-inserted']//input)[2]")
	 private WebElement productFilterInput;
	 
	 @FindBy(xpath = "(//span[text()='Shipping Invoices'])[2]")
	 private WebElement shippingInvoices;
	 
	 @FindBy(xpath = "((//div[@class='ui-table-scrollable-view'])[2]/div//tbody)[2]//td[2]")
	 private List<WebElement> invoiceNumberField;
	 
	 @FindBy(xpath = "(//span[text()='Customer Invoices'])[2]")
	 private WebElement customerInvoices;
	 
	 @FindBy(xpath = "(//input)[3]")
	 private WebElement inputSearchBar;
	 
	 @FindBy(xpath = "(//input[@placeholder='  Search'])[2]")
	 private WebElement inputSearchBar2;
	 
	 @FindBy(xpath = "//td[2]")
	 private List<WebElement> id;
	 
	 @FindBy(xpath = "((//div[@class='ui-table-scrollable-view'])[2]/div//tbody)[2]//td[2]")
	 private List<WebElement> id2;
	 
	 @FindBy(xpath = "(//div[@class='p-col-2'])[1]")
	 private WebElement records1;
	 
	 @FindBy(xpath = "(//div[@class='p-col-2'])[2]")
	 private WebElement records2;
	 
	 @FindBy(xpath = "(//span[@class='fa fa-times-circle'])[1]/following-sibling::span")
	 private WebElement filter;
	    
		public OrderDetailsPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		public boolean createPo() {
			click(orders);
			click(orderDetailsCard);
			click(newButton);
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			click(orderingCustDrp);
			for(WebElement e:drpOpts) {
				if(collectText(e).contains("APF")) {
					click(e);
					break;
				}
			}
	/*		click(billingCustDrp);
			for(WebElement e:drpOpts) {
				if(collectText(e).contains("AWL")) {
					click(e);
					break;
				}
			}*/
			click(billingAddressDrp);
			for(WebElement e:drpOpts) {
				if(collectText(e).contains("2025")) {
					click(e);
					break;
				}
			}
	/*		click(shippingCustDrp);
			for(WebElement e:drpOpts) {
				if(collectText(e).contains("APF")) {
					click(e);
					break;
				}
			}*/
			click(shippingAddressDrp);
			for(WebElement e:drpOpts) {
				if(collectText(e).contains("2025")) {
					click(e);
					break;
				}
			}
			sendKeys(custPoInput, "00012345");
			click(dateIssued);
			click(today);
			click(dateIssued);
			click(today);
			click(dateReceived);
			click(today);
			click(expectedDelivery);
			click(today);
			click(OK);
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			boolean check = collectText(custPO).contains("00012345");
			return check;
		}
		
		public boolean customerFilter() {
			click(orders);
	/*		if(visibilityCheck(orderDetails)==false){
				click(orders);
			}
			click(orderDetailsCard);*/
			click(orderDetailsCard);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			click(custFilter);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			for(WebElement e:drpOptsForFilter) {
				if(collectText(e).contains("APF")) {
					click(e);
					break;
				}
			}
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			click(cross);
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			boolean check = collectText(custField.get(0)).contains("APF");
			log.info(collectText(custField.get(0)));
			return check;
		}
		
		public boolean stateFilter() {
			click(orders);
		/*	if(visibilityCheck(orderDetails)==false){
				click(orders);
			}
			click(orderDetailsCard);*/
			click(orderDetailsCard);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			click(stateFilter);
			for(WebElement e:drpOptsForFilter) {
				if(collectText(e).contains("ACTIVE")) {  //removing active ones 
					click(e);
					break;
				}
			}
			click(cross);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			boolean check = collectText(stateField.get(0)).contains("ALLOCATED");
			log.info(collectText(stateField.get(0)));
			return check;
		}
		
		
	
		public boolean typeFilter() {
			click(orders);
			click(orderDetailsCard);
			try {
				Thread.sleep(12000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			clickWithJS(typeFilter);
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			for(WebElement e:drpOptsForFilter) {
				if(collectText(e).contains("Manufacturing")) {  
					click(e);
					click(e);
					break;
				}
			}
			clickWithJS(cross);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			log.info(collectText(typeField.get(0)));
			boolean check = collectText(typeField.get(0)).contains("Manufacturing");
			return check;
		}
		
		public boolean productFilter() {
			click(orders);
			click(orderDetailsCard);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			clickWithJS(productFilter);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		//	sendKeys(productFilterInput, "HMWS");
			for(WebElement e:drpOptsForFilter) {
				if(collectText(e).contains("01-1")) {   
					click(e);
					break;
				}
			}
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			clickWithJS(cross);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			boolean check = collectText(productField.get(0)).contains("01-1");
			log.info(collectText(productField.get(0)));
			return check;
		}
		
		public boolean productionStateFilter() {
			click(orders);
			click(orderDetailsCard);
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			clickWithJS(productionStateFilter);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			for(WebElement e:drpOptsForFilter) {
				if(collectText(e).contains("APPLICATOR")) {   
					click(e);
					break;
				}
			}
			clickWithJS(cross);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			boolean check = collectText(productionStateField.get(0)).contains("APPLICATOR");
			log.info(collectText(productionStateField.get(0)));
			return check;
		}
		
		public boolean customerFilter2() {
			click(orders);
			click(orderDetailsCard);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			clickWithJS(custFilter2);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			for(WebElement e:drpOptsForFilter) {
				if(collectText(e).contains("HMW05")) {   
					click(e);
					break;
				}
			}
			clickWithJS(cross);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			boolean check = collectText(custField2.get(0)).contains("HMW05");
			log.info(collectText(custField2.get(0)));
			return check;
		}
		
		public boolean flowFilter() {
			click(orders);
			click(orderDetailsCard);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			clickWithJS(flowFilter);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			for(WebElement e:drpOptsForFilter) {
				if(collectText(e).contains("PRO1")) {   
					click(e);
					break;
				}
			}
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			clickWithJS(cross);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			boolean check = collectText(flowField.get(0)).contains("PRO1");
			log.info(collectText(flowField.get(0)));
			return check;
		}
		
		public boolean stateFilter2() {
			click(orders);
			click(orderDetailsCard);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			clickWithJS(stateFilter2);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			for(WebElement e:drpOptsForFilter) {
				if(collectText(e).contains("ACTIVE")) {   
					click(e);
					click(e);
					break;
				}
			}
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			clickWithJS(cross);
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			boolean check = collectText(stateField2.get(0)).contains("ACTIVE");
			log.info(collectText(stateField2.get(0)));
			return check;
		}
		
		public boolean shippingInvoice() {
			click(orders);
		//	click(orders);
		/*	if(visibilityCheck(orderDetails)==false){
				click(orders);
			}
			click(orderDetailsCard);*/
			click(orderDetailsCard);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			clickWithJS(shippingInvoices);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			boolean check = collectText(invoiceNumberField.get(0)).contains("SI-");
			log.info(collectText(invoiceNumberField.get(0)));
			return check;
		}
		
		public boolean siCustFilter() {
			click(orders);
			click(orderDetailsCard);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			clickWithJS(shippingInvoices);
			try {
				Thread.sleep(8000);
			} catch (InterruptedException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			clickWithJS(custFilter3);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			for(WebElement e:drpOptsForFilter) {
				if(collectText(e).contains("APEM01")) {   
					click(e);
					break;
				}
			}
			clickWithJS(cross);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			boolean check = collectText(custField3.get(0)).contains("APEM01");
			log.info(collectText(custField3.get(0)));
			return check;
		}
		
		public boolean invoiceStateFilter() {
			click(orders);
			click(orders);
			click(orderDetailsCard);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			clickWithJS(shippingInvoices);
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			clickWithJS(invoiceStateFilter);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			for(WebElement e:drpOptsForFilter) {
				if(collectText(e).contains("Draft")) {   
					click(e);
					break;
				}
			}
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			clickWithJS(cross);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			boolean check = collectText(invoiceStateField.get(0)).contains("Draft");
			log.info(collectText(invoiceStateField.get(0)));
			return check;
		}
		
		public boolean stateFilter3() {
			click(orders);
			click(orderDetailsCard);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			clickWithJS(shippingInvoices);
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			clickWithJS(stateFilter3);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			for(WebElement e:drpOptsForFilter) {
				if(collectText(e).contains("ACTIVE")) {   
					click(e);
					click(e);
					break;
				}
			}
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			clickWithJS(cross);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			boolean check = collectText(stateField3.get(0)).contains("ACTIVE");
			log.info(collectText(stateField3.get(0)));
			return check;
		}
		
		public boolean customerInvoices() {
			click(orders);
			click(orderDetailsCard);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			clickWithJS(customerInvoices);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			boolean check = collectText(invoiceNumberField.get(0)).contains("CI-");
			log.info(collectText(invoiceNumberField.get(0)));
			return check;
		}
		
		public boolean ciCustFilter() {
			click(orders);
			click(orderDetailsCard);
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			clickWithJS(customerInvoices);
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			clickWithJS(custFilter3);
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			for(WebElement e:drpOptsForFilter) {
				if(collectText(e).contains("APEM01")) {   
					click(e);
					break;
				}
			}
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			clickWithJS(cross);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			boolean check = collectText(custField4.get(0)).contains("APEM01");
			log.info(collectText(custField4.get(0)));
			return check;
		}
		
		public boolean stateFilter4() {
			click(orders);
			click(orderDetailsCard);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			clickWithJS(customerInvoices);
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			clickWithJS(stateFilter4);
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			for(WebElement e:drpOptsForFilter) {
				if(collectText(e).contains("ACTIVE")) {   
					click(e);
					click(e);
					break;
				}
			}
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			clickWithJS(cross);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			boolean check = collectText(stateField4.get(0)).contains("ACTIVE");
			log.info(collectText(stateField4.get(0)));
			return check;
		}
		
		public boolean searchBar() {
			click(orders);
			click(orderDetailsCard);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			sendKeys(inputSearchBar, "PO-00000008");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			log.info(collectText(id.get(0)));
			boolean check = collectText(id.get(0)).contains("PO-00000008");
			return check;
		}
		
		public boolean searchBar2() {
			click(orders);
			click(orderDetailsCard);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			clickWithJS(customerInvoices);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			sendKeys(inputSearchBar2, "CI-00010980");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			boolean check = collectText(id2.get(0)).contains("CI-00010980");
			log.info(collectText(id2.get(0)));
			return check;
		}
		
		public boolean poRecords() {
			click(orders);
			click(orderDetailsCard);
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	    boolean check = visibilityCheck(records1);
	    log.info(collectText(records1));
		return check;
		}
		
		public boolean woRecords() {
			click(orders);
			click(orderDetailsCard);
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	    boolean check = visibilityCheck(records2);
	    log.info(collectText(records2));
		return check;
		}
		
		public boolean siRecords() {
			click(orders);
			if(visibilityCheck(orderDetails)==false){
				click(orders);
			}
			click(orderDetailsCard);
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			clickWithJS(shippingInvoices);
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	    boolean check = visibilityCheck(records2);
	    log.info(collectText(records2));
		return check;
		}
		
		public boolean ciRecords() {
			click(orders);
			click(orderDetailsCard);
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			clickWithJS(customerInvoices);
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	    boolean check = visibilityCheck(records2);
	    log.info(collectText(records2));
		return check;
		}
		
		public boolean clearFilters() {
			boolean flag = false;
			click(orders);
		//	click(orders);
			click(orderDetailsCard);
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			click(custFilter);
			for(WebElement e:drpOptsForFilter) {
				if(collectText(e).contains("APF")) {
					click(e);
					break;
				}
			}
			click(cross);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			boolean check1 = collectText(filter).contains("Clear filters: Customer");
			log.info(collectText(filter));
			click(filter);
			boolean check2 = collectText(filter).contains("Reset filters");
			log.info(collectText(filter));
			if(check1==true && check2==true)
			flag = true;
			return flag;
		}
}
