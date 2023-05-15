package com.vision.pageObjects;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vision.generics.GeneralFunctions;

public class OrderSummaryPage extends GeneralFunctions {

	public WebDriver driver;
	public static Logger log = Logger.getLogger(AnalyticsPage.class);
	
	 @FindBy(xpath = "//span[text()='Orders']")
	 private WebElement orders;
	 
	 @FindBy(xpath = "//span[text()='Order Summary']")
	 private WebElement orderSummary;
	 
	 @FindBy(xpath = "(//div[@class='ui-card-content']/p)[1]")
	 private WebElement orderSummaryCard;
	 
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
	 
	 @FindBy(xpath = "//h1")
	 private WebElement header;
	 
	 @FindBy(xpath = "//div[@class='ui-g-4' and text()='Customer PO #']/following-sibling::div//span")
	 private WebElement custPO;
	 
	 @FindBy(xpath = "(//input)[3]")
	 private WebElement inputSearchBar;
	 
	 @FindBy(xpath = "//td[3]")
	 private List<WebElement> id;
	 
	 @FindBy(xpath = "//td[3]//span")
	 private List<WebElement> idLink;
	 
	 @FindBy(xpath = "//td[4]")
	 private List<WebElement> totalProgress;
	 
	 @FindBy(xpath = "//td[6]")
	 private List<WebElement> latestShipmentDate;
	 
	 @FindBy(xpath = "//td[7]")
	 private List<WebElement> lackingParts;
	 
	 @FindBy(xpath = "//td[8]")
	 private List<WebElement> latestEta;
	 
	 @FindBy(xpath = "//td[5]")
	 private List<WebElement> originalShipmentDate;
	 
	 @FindBy(xpath = "//td[1]/a")
	 private List<WebElement> chevronDown;
	 
	 @FindBy(xpath = "(//div[@class='p-col-2'])[1]")
	 private WebElement records1;
	 
	 @FindBy(xpath = "(//div[@class='ui-table-scrollable-wrapper ng-star-inserted'])[2]")
	 private WebElement productDetails;
	 
	 @FindBy(xpath = "(//span[@class='ui-multiselect-trigger-icon ui-clickable pi pi-chevron-down'])[1]")
	 private WebElement custFilter;
	 
	 @FindBy(xpath = "(//span[@class='ui-multiselect-trigger-icon ui-clickable pi pi-chevron-down'])[2]")
	 private WebElement stateFilter;
	 
	 @FindBy(xpath = "//td[9]")
	 private List<WebElement> custField;
	 
	 @FindBy(xpath = "//td[10]")
	 private List<WebElement> stateField;

	 
	 public OrderSummaryPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
	 
	 public boolean createPo() {
			click(orders);
			click(orderSummaryCard);
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
	 
	 public boolean searchBar() {
			click(orders);
			click(orderSummaryCard);
			try {
				Thread.sleep(3000);
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
			boolean check = collectText(id.get(0)).contains("PO-00000008");
			log.info(collectText(id.get(0)));
			return check;
		}
	 
	 public boolean poRecords() {
			click(orders);
			click(orderSummaryCard);
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
	 
	 public boolean poIdLink() {
		 click(orders);
			click(orderSummaryCard);
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			String f1 = collectText(id.get(0)).toString();
			click(idLink.get(0));
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			boolean check = collectText(header).contains(f1);
			return check;
	 }
	 
	 public boolean totalProgress() {
		 click(orders);
			click(orderSummaryCard);
			try {
				Thread.sleep(6000);
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
			boolean check = visibilityCheck(totalProgress.get(0));
			return check;
}
	 
	 public boolean latestShipmentDate() {
		 click(orders);
			click(orderSummaryCard);
			try {
				Thread.sleep(6000);
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
			boolean check = visibilityCheck(latestShipmentDate.get(0));
			return check;
}
	 
	 public boolean lackingPartsColumn() {
		 click(orders);
			click(orderSummaryCard);
			try {
				Thread.sleep(6000);
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
			boolean check = visibilityCheck(lackingParts.get(0));
			return check;
}
	 
	 public boolean latestETA() {
		 click(orders);
			click(orderSummaryCard);
			try {
				Thread.sleep(6000);
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
			boolean check = visibilityCheck(latestEta.get(0));
			return check;
}
	 
	 public boolean originalShipmentDate() {
		 click(orders);
			click(orderSummaryCard);
			try {
				Thread.sleep(6000);
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
			boolean check = visibilityCheck(originalShipmentDate.get(0));
			return check;
}
	 
	 public boolean chevronDown() {
		 click(orders);
			click(orderSummaryCard);
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			click(chevronDown.get(0));
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			boolean check = visibilityCheck(productDetails);
			return check;
	 }
	 
	 public boolean chevronUp() {
		 click(orders);
			click(orderSummaryCard);
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			click(chevronDown.get(0));
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			click(chevronDown.get(0));
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			boolean check = visibilityCheck(productDetails);
			return check;
	 }
	 
	 public boolean customerFilter() {
			click(orders);
	/*		if(visibilityCheck(orderDetails)==false){
				click(orders);
			}
			click(orderDetailsCard);*/
			click(orderSummaryCard);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			click(custFilter);
			try {
				Thread.sleep(3000);
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
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			log.info(collectText(custField.get(0)));
			boolean check = collectText(custField.get(0)).contains("APF");
			return check;
		}
	 
	 public boolean stateFilter() {
			click(orders);
	/*		if(visibilityCheck(orderDetails)==false){
				click(orders);
			}
			click(orderDetailsCard);*/
			click(orderSummaryCard);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			click(stateFilter);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			for(WebElement e:drpOptsForFilter) {
				if(collectText(e).contains("ALLOCATED")) {
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
			click(cross);
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			boolean check = collectText(stateField.get(0)).contains("ALLOCATED");
			log.info(collectText(stateField.get(0)));
			return check;
		}
}