package com.vision.pageObjects;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vision.generics.GeneralFunctions;

public class LackingPartsPage  extends GeneralFunctions {

	public WebDriver driver;
	public static Logger log = Logger.getLogger(AnalyticsPage.class);
	
	//production
    @FindBy(xpath = "//span[text()='Production']")
    private WebElement production;
    
    //production down arrow
    @FindBy(xpath = "//span[text()='Production']/following-sibling::i")
    private WebElement productionDownArrow;
    
    //lacking parts card
    @FindBy(xpath = "//div[@class='ui-card-content' and contains(text(),'Lacking')]")
    private WebElement lackingPartsCard;
    
  //confirmation popup
    @FindBy(xpath = "//span[text()='Confirmation']")
    private WebElement confirmation;
    
    //lacking parts link
    @FindBy(xpath = "//span[text()='Lacking Parts']")
    private WebElement lackingPartsLink;
    
    //edit button at top
    @FindBy(xpath = "//span[text()='Edit']")
    private WebElement editButton;
    
    //save button at top
    @FindBy(xpath = "//span[text()='Save']")
    private WebElement saveButton;
    
  //discard button at top
    @FindBy(xpath = "//span[text()='Discard']")
    private WebElement discardButton;
    
  //submit for approval button at top
    @FindBy(xpath = "//span[text()='Submit For Approval']")
    private WebElement submitForApprovalButton;
    
  //close sheet button at top
    @FindBy(xpath = "//span[text()='Close Sheet']")
    private WebElement closeSheetButton;
    
    // yes button 
    @FindBy(xpath = "//span[text()='Yes']")
    private WebElement yesButton;
    
    // no button 
    @FindBy(xpath = "//span[text()='No']")
    private WebElement noButton;
	
    // ok button 
    @FindBy(xpath = "//span[text()='OK']")
    private WebElement okButton;
    
    // cross button 
    @FindBy(xpath = "//div[@class='ui-toast-message-content']/a")
    private WebElement crossButton;
    
    // last updated date and time
    @FindBy(xpath = "//h4")
    private WebElement lastUpdatedDateAndTime;
    
    // header
    @FindBy(xpath = "//h1")
    private WebElement header;
    
 // hmws part
    @FindBy(xpath = "//th[text()=' HMWS Part # ']")
    private WebElement hmwsPart;
    
    // hmws part field
    @FindBy(xpath = "//td[1]//span")
    private List<WebElement> hmwsPartField;
    
    // hmws part field
    @FindBy(xpath = "//td[1]//span/a")
    private List<WebElement> hmwsPartValue;
    
 // item name
    @FindBy(xpath = "//th[text()=' Item Name ']")
    private WebElement itemName;
    
 // item name part field
    @FindBy(xpath = "//td[3]")
    private List<WebElement> itemNameField;
    
 // work orders
    @FindBy(xpath = "//th[text()=' Work Orders ']")
    private WebElement workOrders;
    
 //purchase order 
    @FindBy(xpath = "//th[text()=' Purchase Order ']")
    private WebElement purchaseOrder;
    
 // customer
    @FindBy(xpath = "//th[text()=' Customer ']")
    private WebElement customer;
    
 // earliest shipment date
    @FindBy(xpath = "//th[text()=' Earliest Shipment Date ']")
    private WebElement earliestShipmentDate;
    
 // current stock
    @FindBy(xpath = "//th[text()=' Current Stock ']")
    private WebElement currentStock;
    
    // current stock field
    @FindBy(xpath = "//td[10]//span")
    private List<WebElement> currentStockField;
    
 // qty on order
    @FindBy(xpath = "//th[text()=' Qty on Order ']")
    private WebElement qtyOnOrder;
    
 // current stock field
    @FindBy(xpath = "//td[11]//span")
    private List<WebElement> qtyOnOrderField;
    
 // lacking quantity
    @FindBy(xpath = "//th[text()=' Lacking Quantity ']")
    private WebElement lackingQuantity;
    
 // lacking qty field
    @FindBy(xpath = "//td[12]//span")
    private List<WebElement> lackingQtyField;
    
 // unconfirmed quantity
    @FindBy(xpath = "//th[text()=' Unconfirmed Quantity ']")
    private WebElement unconfirmedQuantity;
    
 // unconfirmed qty field
    @FindBy(xpath = "//td[13]//span")
    private List<WebElement> unconfirmedQtyField;
    
 // moq
    @FindBy(xpath = "//th[text()=' MOQ ']")
    private WebElement moq;
    
 // moq field
    @FindBy(xpath = "//td[14]//span")
    private List<WebElement> moqField;
    
 // invalid data format
    @FindBy(xpath = "//div[@role='dialog']")
    private WebElement invalidFormat;
    
 // moq input
    @FindBy(xpath = "//td[14]//input")
    private List<WebElement> moqInput;
    
 // qty to be ordered
    @FindBy(xpath = "//th[text()=' Quantity To Be Ordered ']")
    private WebElement qtyToBeOrdered;
    
 // remarks
    @FindBy(xpath = "//th[text()=' Remarks ']")
    private WebElement remarks;
    
 // supplier
    @FindBy(xpath = "//th[text()=' Supplier ']")
    private WebElement supplier;
    
 // eta
    @FindBy(xpath = "//th[text()=' ETA ']")
    private WebElement eta;
    
 // supplier part #
    @FindBy(xpath = "//th[text()=' Supplier Part # ']")
    private WebElement supplierPart;
    
 // supplier part # input
    @FindBy(xpath = "//td[19]//input")
    private List<WebElement> supplierPartInput;
    
 // oem part #
    @FindBy(xpath = "//th[text()=' OEM Part # ']")
    private WebElement oemPart;
    
 // oem part # input
    @FindBy(xpath = "//td[20]//input")
    private List<WebElement> oemPartInput;
    
 // currency
    @FindBy(xpath = "//th[text()=' Currency ']")
    private WebElement currency;
    
 // unit price
    @FindBy(xpath = "//th[text()=' Unit Price ']")
    private WebElement unitPrice;
    
 // unit price field
    @FindBy(xpath = "//td[22]//span")
    private List<WebElement> unitPriceField;
    
 // amount
    @FindBy(xpath = "//th[text()=' Amount ']")
    private WebElement amount;
    
 // php unit price
    @FindBy(xpath = "//th[text()=' PHP Unit Price ']")
    private WebElement phpUnitPrice;
    
 // php amount
    @FindBy(xpath = "//th[text()=' PHP Amount ']")
    private WebElement phpAmount ;
    
 // aud amount
    @FindBy(xpath = "//th[text()=' AUD Amount ']")
    private WebElement audAmount;
    
 // aud unit price
    @FindBy(xpath = "//th[text()=' AUD Unit Price ']")
    private WebElement audUnitPrice;
    
 // comment by kw
    @FindBy(xpath = "//th[text()=' Comments By KW ']")
    private WebElement commentByKw;
    
 // comment by kw input
    @FindBy(xpath = "//td[28]//input")
    private List<WebElement> commentsByKwInput;
    
 // supplier order
    @FindBy(xpath = "//th[text()=' Supplier Order ']")
    private WebElement supplierOrder ;
    
 // supplier order generation error
    @FindBy(xpath = "//th[text()=' Supplier Order Generation Error ']")
    private WebElement supplierOrderGenerationError;
    
 // state
    @FindBy(xpath = "//th[text()=' State ']")
    private WebElement state;
    
 // state field
    @FindBy(xpath = "//td[31]//span")
    private List<WebElement> stateField;
    
 // work orders info
    @FindBy(xpath = "//span[@class='fa fa-info-circle']")
    private List<WebElement> workOrdersInfo;
    
 // work orders id
    @FindBy(xpath = "//span[@id='toolTipParentElement']")
    private List<WebElement> workOrdersId;
    
 // work orders field
    @FindBy(xpath = "//td[4]")
    private List<WebElement> workOrdersField;
    
 // purchase order
    @FindBy(xpath = "//td[5]")
    private List<WebElement> allocatedPO;
    
 // purchase order on lp screen
    @FindBy(xpath = "//td[1]")
    private WebElement poOnScreen;
    
 // purchase order value on lp screen
    @FindBy(xpath = "//td[1]//span/a")
    private List<WebElement> poOnScreenValue;
    
 // purchase order rows on lp screen
    @FindBy(xpath = "//li[@role='presentation'][5]/a")
    private WebElement poRowsOnScreen;
    
    // customer
    @FindBy(xpath = "//td[6]")
    private List<WebElement> allocatedCust;
    
 // customer on screen
    @FindBy(xpath = "//b[text()='Customer:']/following-sibling::webuilib-uuid-link/span")
    private WebElement customerOnScreen;
    
 // allocated shipment date
    @FindBy(xpath = "//td[7]")
    private List<WebElement> allocatedShipmentDate;
    
    // shipment date on screen
    @FindBy(xpath = "//b[text()='Shipment Date:']/following-sibling::webuilib-uuid-link/span")
    private WebElement shipDateOnScreen;
    
    // remakrs field
    @FindBy(xpath = "//td[17]")
    private List<WebElement> remarksField;
    
 // remakrs input field
    @FindBy(xpath = "//td[17]//input")
    private List<WebElement> remarksInput;
    
 // supplier field
    @FindBy(xpath = "//td[18]/webuilib-uuid-link/span")
    private List<WebElement> supplierField;
    
 // supplier drp arrow
    @FindBy(xpath = "//td[18]/div/p-dropdown/div/div[2]")
    private List<WebElement> supplierDrp;
    
 // supplier drp opts
    @FindBy(xpath = "//p-dropdownitem/li/span")
    private List<WebElement> supplierDrpOpts;
    
 // currency drp arrow
    @FindBy(xpath = "//td[21]/div/p-dropdown/div/div[2]")
    private List<WebElement> currencyDrp;
    
 // currency drp opts
    @FindBy(xpath = "//p-dropdownitem/li")
    private List<WebElement> currencyDrpOpts;
    
 // currency field
    @FindBy(xpath = "//td[21]/webuilib-uuid-link/span")
    private List<WebElement> currencyField;
    
 // quanity to be ordered input field
    @FindBy(xpath = "//td[16]//input")
    private List<WebElement> qtyToBeOrderedInput;
    
 // quanity to be ordered field
    @FindBy(xpath = "//td[16]//span")
    private List<WebElement> qtyToBeOrderedField;
    
 // unit price input field
    @FindBy(xpath = "//td[22]//input")
    private List<WebElement> unitPriceInput;
    
 // amount field
    @FindBy(xpath = "//td[23]//span")
    private List<WebElement> amountField;
    
 // php unit field
    @FindBy(xpath = "//td[25]//span")
    private List<WebElement> phpUnitField;
    
 // php amount field
    @FindBy(xpath = "//td[25]//span")
    private List<WebElement> phpAmountField;
    
 // aud unit price field
    @FindBy(xpath = "//td[26]//span")
    private List<WebElement> audUnitPriceField;
    
 // aud amount field
    @FindBy(xpath = "//td[27]//span")
    private List<WebElement> audAmountField;
    
 // async msg
    @FindBy(xpath = "//div[@class='ui-toast-message-content']")
    private WebElement asyncMsg;
    
    // generate new sheet button
    @FindBy(xpath = "//button[@id='New Sheet']")
    private WebElement generateNewSheet;
    
 // sheet
    @FindBy(xpath = "//p-table")
    private WebElement sheet;
    
 // approve button
    @FindBy(xpath = "//span[text()='Approve']")
    private WebElement approve;
    
 // action needed button
    @FindBy(xpath = "//span[text()='Action Needed']")
    private WebElement actionNeeded;
    
 // reject button
    @FindBy(xpath = "//span[text()='Reject']")
    private WebElement reject;
    
 // back to agent button
    @FindBy(xpath = "//span[text()='Back to Agent']")
    private WebElement backToAgent;
    
 // eta field
    @FindBy(xpath = "//td[19]//span")
    private List<WebElement> etaField;
    
 // eta input field
    @FindBy(xpath = "//td[19]//input")
    private List<WebElement> etaInput;
    
 // lp date created field
    @FindBy(xpath = "//td[8]//span")
    private List<WebElement> lpcreatedField;
    
 // lp date confirmed field
    @FindBy(xpath = "//td[9]//span")
    private List<WebElement> lpconfirmedField;
    
    @FindBy(xpath = "//div[text()='Lacking Parts Created']/following-sibling::div")
    private WebElement lpcreatedInWo;
    
    @FindBy(xpath = "//div[text()='Lacking Parts Confirmed']/following-sibling::div")
    private WebElement lpconfirmedInWo;
	
    @FindBy(xpath = "//span[text()='Progress']")
    private WebElement progress;
    
    @FindBy(xpath = "(//td[3])[21]")
    private WebElement sourcingField;
    
    @FindBy(xpath = "//div[@class='ui-tooltip-text ui-shadow ui-corner-all']")
    private WebElement woTooltip;
    
    @FindBy(xpath = "//td[28]//input")
    private List<WebElement> commentByKwInput;
    
    @FindBy(xpath = "//td[28]")
    private List<WebElement> commentByKwField;
    
    @FindBy(xpath = "//span[text()='Generate Orders']")
    private WebElement generateOrders;
	
    @FindBy(xpath = "//td[30]//span")
    private List<WebElement> supplierOrderField;
    
	public LackingPartsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean lackingPartsCard() {
		click(production);
		click(lackingPartsCard);
		boolean lackingPartsVfy = driver.getCurrentUrl().contains("lackingparts");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return lackingPartsVfy;
	}
	
	public boolean lackingPartsLink() {
		click(productionDownArrow);
	/*	while(visibilityCheck(confirmation)==true)
    		click(yesButton);*/
		click(lackingPartsLink);
		boolean lackingPartsVfy = driver.getCurrentUrl().contains("lackingparts");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return lackingPartsVfy;
	}
	
	public boolean lastUpdatedDateAndTime() {
		//boolean flag = false;
		click(productionDownArrow);
	/*	while(visibilityCheck(confirmation)==true)
    		click(yesButton);*/
		click(lackingPartsLink);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		click(editButton);
		click(saveButton);
		click(yesButton);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		click(okButton);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		boolean lastDate = visibilityCheck(lastUpdatedDateAndTime);
	//	boolean lastDate = collectText(lastUpdatedDateAndTime).contains("2022-08-26");
	//	boolean lastTime = collectText(lastUpdatedDateAndTime).contains("15:34");
		//log.info(collectText(lastUpdatedDateAndTime).contains("15:34"));
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return lastDate;
		/*if(lastDate==true && lastTime==true){
		flag = true;
		}
		log.info(flag);
		return flag;*/
	}
	
	public boolean toolbarsInDraftState() {
		boolean flag = false;
		click(productionDownArrow);
	/*	while(visibilityCheck(confirmation)==true)
    		click(yesButton);*/
		click(lackingPartsLink);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
		
		if(collectText(header).contains("APPROVAL")) {
			approvalToDraftState();
		}
		if(collectText(header).contains("CLOSED")) {
			closedToDraftState();
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		boolean hr = collectText(header).contains("DRAFT");
		boolean edit = visibilityCheck(editButton);
		boolean submit = visibilityCheck(submitForApprovalButton);
		boolean close = visibilityCheck(closeSheetButton);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(editButton);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean save = visibilityCheck(saveButton);
		boolean discard = visibilityCheck(discardButton);
	/*	log.info(hr);
		log.info(collectText(header));
		log.info(edit);
		log.info(submit);
		log.info(close);
		log.info(save);
		log.info(discard);*/
		if(hr==true && edit==true && save==true && discard==true 
				&& submit==true && close==true){
		flag = true;
		}
	/*	if(edit==true && save==true && discard==true 
				&& submit==true && close==true){
		flag = true;
		}*/
		log.info(flag);
		return flag;
		
	}
	
	public boolean columnsOnLackingParts() {
		boolean flag = false;
		click(productionDownArrow);
		if(visibilityCheck(confirmation)==true) {
    		click(yesButton);
		}
		click(productionDownArrow);
		click(lackingPartsLink);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if(collectText(header).contains("CLOSE")) {
			closedToDraftState();
		//	draftToApprovalState();
		}
		boolean hmwsVfy = visibilityCheck(hmwsPart);
		boolean itemNameVfy = visibilityCheck(itemName);
		boolean workOrdersVfy = visibilityCheck(workOrders);
		boolean purchaseOrderVfy = visibilityCheck(purchaseOrder);
	/*	boolean earliestShipDateVfy = visibilityCheck(earliestShipmentDate);
		boolean currentStockVfy = visibilityCheck(currentStock);
		boolean qtyOnOrderVfy = visibilityCheck(qtyOnOrder);
		boolean lackingQtyVfy = visibilityCheck(lackingQuantity);
		boolean moqVfy = visibilityCheck(moq);
		boolean qtyToBeOrderedVfy = visibilityCheck(qtyToBeOrdered);
		boolean remarksVfy = visibilityCheck(remarks);
		boolean supplierVfy = visibilityCheck(supplier);
		boolean etaVfy = visibilityCheck(eta);
		boolean supplierPartVfy = visibilityCheck(supplierPart);
		boolean oemPartVfy = visibilityCheck(oemPart);
		boolean currencyVfy = visibilityCheck(currency);
		boolean unitPriceVfy = visibilityCheck(unitPrice);
		boolean amountVfy = visibilityCheck(amount);
		boolean phpUnitPriceVfy = visibilityCheck(phpUnitPrice);
		boolean phpAmountVfy = visibilityCheck(phpAmount);
		boolean audAmountVfy = visibilityCheck(audAmount);
		boolean audUnitPriceVfy = visibilityCheck(audUnitPrice);
		boolean commentByKwVfy = visibilityCheck(commentByKw);
		boolean supplierOrderVfy = visibilityCheck(supplierOrder);
		boolean soGenErrorVfy = visibilityCheck(supplierOrderGenerationError);
		boolean stateVfy = visibilityCheck(state);*/
		
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	/*	if(hmwsVfy==true && itemNameVfy==true && workOrdersVfy==true && purchaseOrderVfy==true && earliestShipDateVfy==true 
	&& currentStockVfy==true && qtyOnOrderVfy==true && lackingQtyVfy==true && moqVfy==true && qtyToBeOrderedVfy==true 
	&& remarksVfy==true && supplierVfy==true && etaVfy==true && supplierPartVfy==true && oemPartVfy==true && currencyVfy==true 
	&& unitPriceVfy==true && amountVfy==true &&  phpUnitPriceVfy==true &&  phpAmountVfy==true && audAmountVfy==true 
	&& audUnitPriceVfy==true && commentByKwVfy==true && supplierOrderVfy==true && soGenErrorVfy==true && stateVfy==true) {
			flag=true;
		}*/
		if(hmwsVfy==true && itemNameVfy==true && workOrdersVfy==true && purchaseOrderVfy==true) {
						flag=true;
					}
		log.info(flag);
		return flag;
	}
	
	public boolean editButton() {
		boolean flag = false;
		click(productionDownArrow);
	/*   if(visibilityCheck(confirmation)==true) {
    		click(yesButton);
		}
	   click(productionDownArrow);*/
		click(lackingPartsLink);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
		if(collectText(header).contains("CLOSE")) {
			closedToDraftState();
		//	draftToApprovalState();
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(editButton);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean saveVfy = visibilityCheck(saveButton);
		boolean discardVfy = visibilityCheck(discardButton);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(saveVfy==true && discardVfy==true) {
			flag = true;
		}
		log.info(flag);
		return flag;
	}
	
	public boolean enabledFieldsInEdit() {
		boolean flag = false;
		click(productionDownArrow);
		if(visibilityCheck(confirmation)==true)
    		click(yesButton);
		click(productionDownArrow);
		click(lackingPartsLink); 
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
		if(collectText(header).contains("CLOSE")) {
			closedToDraftState();
		//	draftToApprovalState();
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(editButton);
		 //if input visibility check not working, try checking for field visibility then after edit the 
		//field should disappear.
		
	//	boolean flag1 = visibilityCheck(moqInput.get(0));  
	//	boolean flag2 = visibilityCheck(qtyToBeOrderedInput.get(0));
	/*	boolean flag3 = visibilityCheck(remarksInput.get(0));
		boolean flag5 = visibilityCheck(supplierDrp.get(0));
		boolean flag6 = visibilityCheck(supplierPartInput.get(0));
		boolean flag7 = visibilityCheck(oemPartInput.get(0));
		boolean flag8 = visibilityCheck(currencyDrp.get(0));
		boolean flag9 = visibilityCheck(unitPriceInput.get(0));
		boolean flag10 = visibilityCheck(commentsByKwInput.get(0));*/
	//	click(editButton);
		boolean flag11 = visibilityCheck(moqInput.get(0));
		boolean flag12 = visibilityCheck(qtyToBeOrderedInput.get(0));
		boolean flag13 = visibilityCheck(remarksInput.get(0));
		boolean flag15 = visibilityCheck(supplierDrp.get(0));
		boolean flag16 = visibilityCheck(supplierPartInput.get(0));
		boolean flag17 = visibilityCheck(oemPartInput.get(0));
		boolean flag18 = visibilityCheck(currencyDrp.get(0));
		boolean flag19 = visibilityCheck(unitPriceInput.get(0));
		boolean flag20 = visibilityCheck(commentsByKwInput.get(0));
	/*	if(flag1==false && flag2==false && flag11==true && flag12==true ) {
			flag=true;
		}*/
		if(flag11==true && flag12==true && flag13==true && flag15==true && flag16==true && flag17==true
				&& flag18==true && flag19==true && flag20==true) {
			flag=true;
		}
		log.info(flag);
		return flag;
		
	}
	
	public boolean disabledFieldsInEdit() {
		boolean flag = false;
		click(productionDownArrow);
		if(visibilityCheck(confirmation)==true)
    		click(yesButton);
		click(productionDownArrow);
		click(lackingPartsLink);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
		if(collectText(header).contains("CLOSE")) {
			closedToDraftState();
		//	draftToApprovalState();
		}
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
		boolean f1 = visibilityCheck(hmwsPartField.get(0));
		boolean f2 = visibilityCheck(itemNameField.get(0));
		boolean f3 = visibilityCheck(workOrdersField.get(0));
		boolean f4 = visibilityCheck(allocatedPO.get(0));
		boolean f5 = visibilityCheck(allocatedCust.get(0));
		boolean f6 = visibilityCheck(allocatedShipmentDate.get(0));
		boolean f7 = visibilityCheck(qtyOnOrderField.get(0));
		boolean f8 = visibilityCheck(lackingQtyField.get(0));
		boolean f9 = visibilityCheck(amountField.get(0));
		boolean f10 = visibilityCheck(phpUnitField.get(0));
		boolean f11 = visibilityCheck(phpAmountField.get(0));
		boolean f12 = visibilityCheck(audAmountField.get(0));
		boolean f13 = visibilityCheck(audUnitPriceField.get(0));
		click(editButton);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean f14 = visibilityCheck(hmwsPartField.get(0));
		boolean f15 = visibilityCheck(itemNameField.get(0));
		boolean f16 = visibilityCheck(workOrdersField.get(0));
		boolean f17 = visibilityCheck(allocatedPO.get(0));
		boolean f18 = visibilityCheck(allocatedCust.get(0));
		boolean f19 = visibilityCheck(allocatedShipmentDate.get(0));
		boolean f20 = visibilityCheck(qtyOnOrderField.get(0));
		boolean f21 = visibilityCheck(lackingQtyField.get(0));
		boolean f22 = visibilityCheck(amountField.get(0));
		boolean f23 = visibilityCheck(phpUnitField.get(0));
		boolean f24 = visibilityCheck(phpAmountField.get(0));
		boolean f25 = visibilityCheck(audAmountField.get(0));
		boolean f26 = visibilityCheck(audUnitPriceField.get(0));
		
		if(f1==true && f2==true && f3==true && f4==true && f5==true && f6==true && f7==true && f8==true && f9==true
				&& f10==true && f11==true && f12==true && f13==true && f14==true && f15==true && f16==true 
				&& f17==true && f18==true && f19==true && f20==true && f21==true && f22==true && f23==true && f24==true
				&& f25==true && f26==true) {
			flag=true;
		}
		/*if(f3==true && f4==true ) {
			flag=true;
		}*/
		log.info(flag);
		return flag;
	}
	
	public boolean purchaseOrder() {
		click(productionDownArrow);
		if(visibilityCheck(confirmation)==true) {
    		click(yesButton);
		}
		click(productionDownArrow);
		click(lackingPartsLink);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
		
		if(collectText(header).contains("APPROVAL")) {
			approvalToDraftState();
		}
		if(collectText(header).contains("CLOSED")) {
			closedToDraftState();
		}
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	//	if(workOrdersId.size() > 1)
       boolean flag=false;
       boolean f0 = false;
		boolean f1 = false;
		String wo = collectText(workOrdersId.get(0));
		String po = collectText(allocatedPO.get(0));
		click(workOrdersInfo.get(0));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(poRowsOnScreen);
		//no po
		if(visibilityCheck(poOnScreenValue.get(0))==false) {
			f0 = true;
			log.info("no po");
		}
		//multiple po
		if(poOnScreenValue.size() > 1) {
			f1 = true;
			log.info("multiple");
		}
	   //single po
		boolean poScreen = collectText(poOnScreenValue.get(0)).contains(po);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if(f1==true || poScreen==true || f0==true) {
			flag=true;
		}
		return flag;
	}
	
	public boolean customer() {
		click(productionDownArrow);
	/*	if(visibilityCheck(confirmation)==true) {
    		click(yesButton);
    	}
		click(productionDownArrow);*/
		click(lackingPartsLink);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
		
		if(collectText(header).contains("APPROVAL")) {
			approvalToDraftState();
		}
		if(collectText(header).contains("CLOSED")) {
			closedToDraftState();
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean flag = false;
		boolean f0 = false;
		String wo = collectText(workOrdersId.get(0));
		String cust = collectText(allocatedCust.get(0));
		//multiple cust
				if(cust.contains("MULTIPLE")) {
					f0 = true;
					log.info("multiple");
				}
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		click(workOrdersInfo.get(0));
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = visibilityCheck(customerOnScreen);
		boolean custScreen = collectText(customerOnScreen).contains(cust);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		log.info("check: " + check);
		log.info("cust screen: " + custScreen);
		log.info("f0: " + f0);
		if(check==true && (custScreen==true || f0==true)==true) {
			flag = true;
		}
		return flag;
	}
	
	public boolean earliestShipDate() {
		click(productionDownArrow);
	/*	if(visibilityCheck(confirmation)==true)
    		click(yesButton);
		click(productionDownArrow);*/
		click(lackingPartsLink);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
		
		if(collectText(header).contains("APPROVAL")) {
			approvalToDraftState();
		}
		if(collectText(header).contains("CLOSED")) {
			closedToDraftState();
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//	String wo = collectText(workOrdersId.get(11));
	//	String date = collectText(allocatedShipmentDate.get(0));
	//	click(workOrdersInfo.get(0));
	//	boolean dateScreen = collectText(shipDateOnScreen).contains(date);
		boolean check = visibilityCheck(allocatedShipmentDate.get(0));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//return dateScreen;
		return check;
	}
	
	public boolean remarks() {
		boolean flag = false;
		click(productionDownArrow);
		if(visibilityCheck(confirmation)==true) {
    		click(yesButton);
    	}
		click(productionDownArrow);
		click(lackingPartsLink);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
		
		if(collectText(header).contains("APPROVAL")) {
			approvalToDraftState();
		}
		if(collectText(header).contains("CLOSED")) {
			closedToDraftState();
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
/*		String remarks = collectText(remarksField.get(1));
		boolean flag1 = remarks.equals("");*/
		click(editButton);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		sendKeys(remarksInput.get(1), "test");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		click(saveButton);
		click(yesButton);
		click(okButton);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String remarks2 = collectText(remarksField.get(1));
		boolean flag2 = remarks2.equals("test");
	/*	if(flag1==true && flag2==true) {
			flag = true;
		}*/
		if(flag2==true) {
			flag = true;
		}
		return flag;
	}
	
	public boolean supplier() {
		boolean flag = false;
		click(productionDownArrow);
	/*	if(visibilityCheck(confirmation)==true)
    		click(yesButton);
		click(productionDownArrow);*/
		click(lackingPartsLink);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
		
		if(collectText(header).contains("APPROVAL")) {
			approvalToDraftState();
		}
		if(collectText(header).contains("CLOSED")) {
			closedToDraftState();
		}
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
//		boolean flag1 = visibilityCheck(supplierDrp.get(0));
		click(editButton);
		boolean flag2 = visibilityCheck(supplierDrp.get(0));
		click(supplierDrp.get(0));
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for(WebElement e:supplierDrpOpts) {
			if(collectText(e).equalsIgnoreCase("ONL - ONLINE COMPONENTS [USD]")) {
		/*		Actions act = new Actions(driver);
				act.click(e).perform();*/
				click(e);
				break;
			}
		}
		click(saveButton);
		click(yesButton);
		click(okButton);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String f = collectText(supplierField.get(0));
		boolean flag3 = f.contains("ONL");
	/*	if(flag1==false && flag2==true && flag3==true) {
			flag = true;
		}*/
		if(flag2==true && flag3==true) {
			flag = true;
		}
		return flag;
	}
	
	public boolean eta() {
		click(productionDownArrow);
		if(visibilityCheck(confirmation)==true)
    		click(yesButton);
		click(productionDownArrow);
		click(lackingPartsLink);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
		
		if(collectText(header).contains("APPROVAL")) {
			approvalToDraftState();
		}
		if(collectText(header).contains("CLOSED")) {
			closedToDraftState();
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String mon ="September";
		String yr ="2022";
		String date = "20";
		click(editButton);
		click(etaInput.get(0));
		while(true) {
			By month = By.xpath("//div[@class='ui-datepicker-title']/span[1]");
			By year = By.xpath("//div[@class='ui-datepicker-title']/span[2]");
			if(collectText(driver.findElement(month)).equals(mon) && collectText(driver.findElement(year)).equals(yr)) 
				break;
			else {
				By rightArrow = By.xpath("//span[@class='ui-datepicker-next-icon pi pi-chevron-right']");
				click(driver.findElement(rightArrow));
			}
		}
		
		By day = By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for(WebElement e:driver.findElements(day)) {
			String dt = collectText(e);
			if(dt.equals(date)) {
				click(e);
				break;
			}
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean flag = collectText(etaInput.get(0)).equals("2022-09-20");
		log.info(collectText(etaInput.get(0)));
		log.info(flag);
		return flag;
	}
	
	public boolean currency() {
		boolean flag = false;
		click(productionDownArrow);
	/*	if(visibilityCheck(confirmation)==true)
    		click(yesButton);
		click(productionDownArrow);*/
		click(lackingPartsLink);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
		
		if(collectText(header).contains("APPROVAL")) {
			approvalToDraftState();
		}
		if(collectText(header).contains("CLOSED")) {
			closedToDraftState();
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	//	boolean flag1 = visibilityCheck(currencyDrp.get(0));
		click(editButton);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		boolean flag2 = visibilityCheck(currencyDrp.get(0));
		click(currencyDrp.get(0));
		for(WebElement e:currencyDrpOpts) {
			if(collectText(e).equalsIgnoreCase("AUD")) {
				click(e);
				break;
			}
		}
		click(saveButton);
		click(yesButton);
		click(okButton);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String f = collectText(currencyField.get(0));
		boolean flag3 = f.contains("AUD");
	/*	if(flag1==false && flag2==true && flag3==true) {
			flag = true;
		}*/
		if(flag2==true && flag3==true) {
			flag = true;
		}
		return flag;
	}
	
	public boolean amount() {
		click(productionDownArrow);
		if(visibilityCheck(confirmation)==true) {
    		click(yesButton);
    	//	break;
		}
		click(productionDownArrow);
		click(lackingPartsLink);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
		
		if(collectText(header).contains("APPROVAL")) {
			approvalToDraftState();
		}
		if(collectText(header).contains("CLOSED")) {
			closedToDraftState();
		}
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		click(editButton);
		sendKeys(qtyToBeOrderedInput.get(0), "1");
		sendKeys(unitPriceInput.get(0), "1");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		click(currencyDrp.get(0));
		for(WebElement e:currencyDrpOpts) {
			if(collectText(e).equalsIgnoreCase("USD")) {
				click(e);
				break;
			}
		}
		String amt = collectText(amountField.get(0));
		boolean a = amt.contains("1.00");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return a;
	}
	
	public boolean phpUnitPrice() {
		click(productionDownArrow);
		if(visibilityCheck(confirmation)==true) {
    		click(yesButton);
    		//break;
    		}
		click(productionDownArrow);
		click(lackingPartsLink);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
		
		if(collectText(header).contains("APPROVAL")) {
			approvalToDraftState();
		}
		if(collectText(header).contains("CLOSED")) {
			closedToDraftState();
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		click(editButton);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		sendKeys(qtyToBeOrderedInput.get(0), "1");
		sendKeys(unitPriceInput.get(0), "1");
		click(currencyDrp.get(0));
		for(WebElement e:currencyDrpOpts) {
			if(collectText(e).equalsIgnoreCase("USD")) {
				click(e);
				break;
			}
		}
		String php = collectText(phpUnitField.get(0));
		boolean a = php.contains("50.70");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return a;
	}
	
	public boolean phpAmount() {
		click(productionDownArrow);
		if(visibilityCheck(confirmation)==true) {
    		click(yesButton);
	//	break;
	}
		click(productionDownArrow);
		click(lackingPartsLink);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
		
		if(collectText(header).contains("APPROVAL")) {
			approvalToDraftState();
		}
		if(collectText(header).contains("CLOSED")) {
			closedToDraftState();
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		click(editButton);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		sendKeys(qtyToBeOrderedInput.get(0), "1");
		sendKeys(unitPriceInput.get(0), "1");
		click(currencyDrp.get(0));
		for(WebElement e:currencyDrpOpts) {
			if(collectText(e).equalsIgnoreCase("USD")) {
				click(e);
				break;
			}
		}
		String php = collectText(phpAmountField.get(0));
		boolean a = php.contains("50.70");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return a;
	}
	
	public boolean audUnitPrice() {
		click(productionDownArrow);
		if(visibilityCheck(confirmation)==true) {
    		click(yesButton);
    	//	break;
		}
		click(productionDownArrow);
		click(lackingPartsLink);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
		
		if(collectText(header).contains("APPROVAL")) {
			approvalToDraftState();
		}
		if(collectText(header).contains("CLOSED")) {
			closedToDraftState();
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		click(editButton);
		sendKeys(qtyToBeOrderedInput.get(0), "1");
		sendKeys(unitPriceInput.get(0), "1");
		click(currencyDrp.get(0));
		for(WebElement e:currencyDrpOpts) {
			if(collectText(e).equalsIgnoreCase("USD")) {
				click(e);
				break;
			}
		}
		String php = collectText(audUnitPriceField.get(0));
		boolean a = php.contains("1.5794");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return a;
	}
	
	public boolean audAmount() {
		click(productionDownArrow);
		if(visibilityCheck(confirmation)==true) {
    		click(yesButton);
    	//	break;
		}
		click(productionDownArrow);
		click(lackingPartsLink);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
		
		if(collectText(header).contains("APPROVAL")) {
			approvalToDraftState();
		}
		if(collectText(header).contains("CLOSED")) {
			closedToDraftState();
		}
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		click(editButton);
		sendKeys(qtyToBeOrderedInput.get(0), "1");
		sendKeys(unitPriceInput.get(0), "1");
		click(currencyDrp.get(0));
		for(WebElement e:currencyDrpOpts) {
			if(collectText(e).equalsIgnoreCase("USD")) {
				click(e);
				break;
			}
		}
		String php = collectText(audAmountField.get(0));
		boolean a = php.contains("1.58");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return a;
	}
	
	public boolean commentByKw() {
		boolean flag = false;
		click(productionDownArrow);
		if(visibilityCheck(confirmation)==true) 
    		click(yesButton);
		click(productionDownArrow);
		click(lackingPartsLink);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
		
		if(collectText(header).contains("APPROVAL")) {
			approvalToDraftState();
		}
		if(collectText(header).contains("CLOSED")) {
			closedToDraftState();
		}
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		click(editButton);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		boolean f1 = visibilityCheck(commentByKwInput.get(0));
		sendKeys(commentByKwInput.get(0), "kw comment");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		click(saveButton);
		click(yesButton);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		click(okButton);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean f2 = collectText(commentByKwField.get(0)).contains("kw comment");
		if(f1==true && f2==true)
		flag = true;
		return flag;	
	}
	
	 public boolean supplierOrder() {
		 boolean flag = false;
	    	click(productionDownArrow);
	    	if(visibilityCheck(confirmation)==true)
	    		click(yesButton);
	    	click(productionDownArrow);
			click(lackingPartsLink);
		//	click(generateNewSheet);
			while(collectText(header).contains("no item")) {
				//waiting for header to not contain "no item created"
			}
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			if(collectText(header).contains("DRAFT")) {
				toClosedState();
			}
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			
			if(collectText(header).contains("CLOSED")) {
				closedToDraftState();
			}
			try {
				Thread.sleep(7000);
			} catch (InterruptedException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			if(collectText(header).contains("DRAFT")) {
				draftToApprovalState();
			}
			if(collectText(header).contains("CLOSED")) {
				closedToDraftState();
				draftToApprovalState();
			}
             try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			click(itemNameField.get(1));
			click(editButton);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			click(approve);
			click(saveButton);
			click(yesButton);
			click(okButton);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			approvalToDraftState();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			click(generateOrders);
			click(yesButton);
			try {
				Thread.sleep(7000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			click(okButton);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			boolean f1 = visibilityCheck(supplierOrderField.get(1));
			log.info(visibilityCheck(supplierOrderField.get(1)));
			click(supplierOrderField.get(1));
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			boolean f2 = driver.getCurrentUrl().contains("supplierorders");
			log.info("f1: " + f1);
			log.info("f2: " + f2);
			if(f1==true && f2==true)
			flag=true;
			return flag;
	 }
	
	public boolean saveChanges() {
		click(productionDownArrow);
		if(visibilityCheck(confirmation)==true)
    		click(yesButton);
		click(productionDownArrow);
		click(lackingPartsLink);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		click(editButton);
		click(saveButton);
		click(yesButton);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = visibilityCheck(asyncMsg);
		click(okButton);
		return check;
	}
	
	public boolean newSheet() {
		boolean flag = false;
		click(productionDownArrow);
	/*	while(visibilityCheck(confirmation)==true)
    		click(yesButton);*/
		click(lackingPartsLink);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
		if(collectText(header).contains("DRAFT") || collectText(header).contains("APPROVAL")) {
			toClosedState();
		}
	//	click(closeSheetButton);//clicking close sheet because by default there is a sheet in draft state.
	//	click(yesButton);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		boolean f1 = visibilityCheck(generateNewSheet);
		click(generateNewSheet);
		click(yesButton);
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean f2 = visibilityCheck(asyncMsg);
		click(okButton);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean f3 = visibilityCheck(sheet);
		log.info("f1: " + f1);
		log.info("f2: " + f2);
		log.info("f3: " + f3);
		if(f1==true && f2==true && f3==true)
			flag=true;
		log.info(flag);
		return flag;
	}
	
    public boolean sheetInCloseState() {
    	boolean flag = false;
		click(productionDownArrow);
		if(visibilityCheck(confirmation)==true) {
    		click(yesButton);
    }
         click(productionDownArrow);
		click(lackingPartsLink);
	//	click(closeSheetButton);
	//	click(yesButton);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
		
		if(collectText(header).contains("APPROVAL") || collectText(header).contains("DRAFT")) {
			toClosedState();
		}
       try {
		Thread.sleep(5000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
		boolean f1 = visibilityCheck(editButton);
		log.info(f1);
		boolean f2 = visibilityCheck(submitForApprovalButton);
		log.info(f2);
		boolean f3 = visibilityCheck(closeSheetButton);
		log.info(f3);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closedToDraftState();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		click(closeSheetButton);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		By confirm = By.xpath("//div[@role='dialog']");
		boolean f4 = visibilityCheck(driver.findElement(confirm));
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(noButton);
	//	click(yesButton);
	//	click(okButton);
		if(f1==false && f2==false && f3==false && f4==true)
			flag=true;
		log.info(flag);
		return flag;
    }
    
    public boolean sheetInApprovalState() {
    	boolean flag = false;
		click(productionDownArrow);
	/*	while(visibilityCheck(confirmation)==true)
    		click(yesButton);*/
		click(lackingPartsLink);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
		
		if(collectText(header).contains("CLOSED")) {
			closedToDraftState();
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if(collectText(header).contains("DRAFT")) {
			draftToApprovalState();
		}
		
		boolean f0 = visibilityCheck(generateNewSheet);
		click(editButton);
		boolean f1 = visibilityCheck(approve);
		log.info(f1);
		boolean f2 = visibilityCheck(actionNeeded);
		log.info(f2);
		boolean f3 = visibilityCheck(reject);
		log.info(f3);
		boolean f4 = visibilityCheck(saveButton);
		boolean f5 = visibilityCheck(discardButton);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	/*	if(f1==true && f2==true && f3==true && f4==true && f5==true)
			flag=true;*/
		if(f0==false && f1==true && f2==true && f3==true && f4==true && f5==true)
			flag=true;
		log.info(flag);
		return flag;
    }
    
    public boolean hmwsPart() {
    	click(productionDownArrow);
    	if(visibilityCheck(confirmation)==true) {
    		click(yesButton);
    	}
    	click(productionDownArrow);
		click(lackingPartsLink);
	//	click(generateNewSheet);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
		
		if(collectText(header).contains("APPROVAL")) {
			approvalToDraftState();
		}
		if(collectText(header).contains("CLOSED")) {
			closedToDraftState();
		}
	//	boolean flag = collectText(hmwsPartValue.get(0)).contains("AL1015");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean flag = visibilityCheck(hmwsPartValue.get(0));
		return flag;
		}
    
    public boolean itemName() {
    	click(productionDownArrow);
    /*	if(visibilityCheck(confirmation)==true) {
    		click(yesButton);
    	}
    	click(productionDownArrow);*/
		click(lackingPartsLink);
	//	click(generateNewSheet);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
		
		if(collectText(header).contains("APPROVAL")) {
			approvalToDraftState();
		}
		if(collectText(header).contains("CLOSED")) {
			closedToDraftState();
		}
	//	boolean flag = collectText(itemNameField.get(0)).contains("PARK BRAKE ALARM");
		boolean flag = visibilityCheck(itemNameField.get(0));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
		  }
    
    public boolean workOrderTooltip() {
    	click(productionDownArrow);
  /*  	if(visibilityCheck(confirmation)==true) {
    		click(yesButton);
    	}
    	click(productionDownArrow);*/
		click(lackingPartsLink);
	//	click(generateNewSheet);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
		
		if(collectText(header).contains("APPROVAL")) {
			approvalToDraftState();
		}
		if(collectText(header).contains("CLOSED")) {
			closedToDraftState();
		}
		 Actions act = new Actions(driver); 
		 act.moveToElement(workOrdersId.get(0)).perform();
		 try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean tooltip = visibilityCheck(woTooltip);
		return tooltip;
    }
    
    public boolean currentStock() {
    	click(productionDownArrow);
    /*	if(visibilityCheck(confirmation)==true) {
    		click(yesButton);
    	}
    	click(productionDownArrow);*/
		click(lackingPartsLink);
	//	click(generateNewSheet);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
		
		if(collectText(header).contains("APPROVAL")) {
			approvalToDraftState();
		}
		if(collectText(header).contains("CLOSED")) {
			closedToDraftState();
		}
	//	boolean flag = collectText(currentStockField.get(0)).contains("0.000");
		boolean flag = visibilityCheck(currentStockField.get(0));
		return flag;	
    }
    
    public boolean qtyOnOrder() {
    	click(productionDownArrow);
   /* 	if(visibilityCheck(confirmation)==true) {
    		click(yesButton);
    	}
    	click(productionDownArrow);*/
		click(lackingPartsLink);
	//	click(generateNewSheet);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
		
		if(collectText(header).contains("APPROVAL")) {
			approvalToDraftState();
		}
		if(collectText(header).contains("CLOSED")) {
			closedToDraftState();
		}
	//	boolean flag = collectText(qtyOnOrderField.get(0)).contains("1.000");
		boolean flag = visibilityCheck(qtyOnOrderField.get(0));
		return flag;	
    }
    
    public boolean lackingQty() {
    	click(productionDownArrow);
   /* 	if(visibilityCheck(confirmation)==true) {
    		click(yesButton);
    	}
    	click(productionDownArrow);*/
		click(lackingPartsLink);
	//	click(generateNewSheet);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
		
		if(collectText(header).contains("APPROVAL")) {
			approvalToDraftState();
		}
		if(collectText(header).contains("CLOSED")) {
			closedToDraftState();
		}
//		boolean flag = collectText(lackingQtyField.get(0)).contains("0.000");
		boolean flag = visibilityCheck(lackingQtyField.get(0));
		return flag;	
    }
    
    public boolean moq() {
    	click(productionDownArrow);
 /*   if(visibilityCheck(confirmation)==true) {
    		click(yesButton);
    	}
    	click(productionDownArrow);*/
		click(lackingPartsLink);
	//	click(generateNewSheet);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
		
		if(collectText(header).contains("APPROVAL")) {
			approvalToDraftState();
		}
		if(collectText(header).contains("CLOSED")) {
			closedToDraftState();
		}
		boolean flag = collectText(moqField.get(0)).equals("0.000");
		return flag;	
    }
    
    public boolean moqInvalid() {
    	click(productionDownArrow);
   /* 	if(visibilityCheck(confirmation)==true) {
    		click(yesButton);
    	}
    	click(productionDownArrow);*/
		click(lackingPartsLink);
	//	click(generateNewSheet);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
		
		if(collectText(header).contains("APPROVAL")) {
			approvalToDraftState();
		}
		if(collectText(header).contains("CLOSED")) {
			closedToDraftState();
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		click(editButton);
		sendKeys(moqInput.get(0), "abc");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(saveButton);
		boolean flag = visibilityCheck(invalidFormat);
		click(okButton);
		return flag;	
    }
    
    public boolean qtyToBeOrdered() {
    	boolean flag = false;
    	click(productionDownArrow);
    	if(visibilityCheck(confirmation)==true) {
    		click(yesButton);
    	}
    	click(productionDownArrow);
		click(lackingPartsLink);
	//	click(generateNewSheet);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
		
		if(collectText(header).contains("APPROVAL")) {
			approvalToDraftState();
		}
		if(collectText(header).contains("CLOSED")) {
			closedToDraftState();
		}
		String lq = collectText(lackingQtyField.get(0)); 
		double d = Double.parseDouble(lq);
		log.info(d);
		String qty = collectText(qtyToBeOrderedField.get(0));
		double d1 = Double.parseDouble(qty);
		log.info(d);
		if(d==d1) {
			flag = true;
		}
		log.info(flag);
		return flag;
    }
    
    public boolean qtyToBeOrderedInvalid() {
    	click(productionDownArrow);
    /*	if(visibilityCheck(confirmation)==true)
    		click(yesButton);
    	click(productionDownArrow);*/
		click(lackingPartsLink);
	//	click(generateNewSheet);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
		
		if(collectText(header).contains("APPROVAL")) {
			approvalToDraftState();
		}
		if(collectText(header).contains("CLOSED")) {
			closedToDraftState();
		}
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(editButton);
		sendKeys(qtyToBeOrderedInput.get(0), "abc");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(saveButton);
		boolean flag = visibilityCheck(invalidFormat);
		click(okButton);
		return flag;	
    }
    
    public boolean unitPrice() {
    	click(productionDownArrow);
    /*	if(visibilityCheck(confirmation)==true) {
    		click(yesButton);
    	}
    	click(productionDownArrow);*/
		click(lackingPartsLink);
	//	click(generateNewSheet);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
		
		if(collectText(header).contains("APPROVAL")) {
			approvalToDraftState();
		}
		if(collectText(header).contains("CLOSED")) {
			closedToDraftState();
		}
		boolean flag = collectText(unitPriceField.get(1)).equals("0.0000");
	//	boolean flag = visibilityCheck(unitPriceField.get(0));
		return flag;	
    }
    
    public boolean unitPriceInvalid() {
    	click(productionDownArrow);
    /*	if(visibilityCheck(confirmation)==true)
    		click(yesButton);
    	click(productionDownArrow);*/
		click(lackingPartsLink);
	//	click(generateNewSheet);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}

		if(collectText(header).contains("APPROVAL")) {
			approvalToDraftState();
		}
		if(collectText(header).contains("CLOSED")) {
			closedToDraftState();
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		click(editButton);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		sendKeys(unitPriceInput.get(0), "abc");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(saveButton);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean flag = visibilityCheck(invalidFormat);
		click(okButton);
		return flag;	
    }
    
    public boolean statePending() {
    	click(productionDownArrow);
    	if(visibilityCheck(confirmation)==true)
    		click(yesButton);
    	click(productionDownArrow);
		click(lackingPartsLink);
	//	click(generateNewSheet);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
		
		if(collectText(header).contains("DRAFT")) {
			draftToApprovalState();
		}
		if(collectText(header).contains("CLOSED")) {
			closedToDraftState();
			draftToApprovalState();
		}
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean flag = collectText(stateField.get(0)).equals("PENDING");
		log.info(flag);
		return flag;
    }
    
    public boolean stateApproved() {
    	click(productionDownArrow);
    	if(visibilityCheck(confirmation)==true)
    		click(yesButton);
    	click(productionDownArrow);
		click(lackingPartsLink);
	//	click(generateNewSheet);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
		
		if(collectText(header).contains("DRAFT")) {
			draftToApprovalState();
		}
		if(collectText(header).contains("CLOSED")) {
			closedToDraftState();
			draftToApprovalState();
		}
		click(stateField.get(0));
		click(editButton);
		click(approve);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean flag = collectText(stateField.get(0)).equals("APPROVED");
		log.info(flag);
		return flag;
    }
    
    public boolean stateActionNeeded() {
    	click(productionDownArrow);
    	if(visibilityCheck(confirmation)==true)
    		click(yesButton);
    	click(productionDownArrow);
		click(lackingPartsLink);
	//	click(generateNewSheet);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
		
		if(collectText(header).contains("DRAFT")) {
			draftToApprovalState();
		}
		if(collectText(header).contains("CLOSED")) {
			closedToDraftState();
			draftToApprovalState();
		}
		click(stateField.get(0));
		click(editButton);
		click(actionNeeded);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean flag = collectText(stateField.get(0)).equals("ACTION NEEDED");
		log.info(flag);
		return flag;
    }
	
    public boolean stateReject() {
    	click(productionDownArrow);
    	if(visibilityCheck(confirmation)==true)
    		click(yesButton);
    	click(productionDownArrow);
		click(lackingPartsLink);
	//	click(generateNewSheet);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
		
		if(collectText(header).contains("DRAFT")) {
			draftToApprovalState();
		}
		if(collectText(header).contains("CLOSED")) {
			closedToDraftState();
			draftToApprovalState();
		}
		click(stateField.get(0));
		click(editButton);
		click(reject);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean flag = collectText(stateField.get(0)).equals("REJECTED");
		log.info(flag);
		return flag;
    }
    
    public boolean approvalToDraft() {
    	click(productionDownArrow);
    	if(visibilityCheck(confirmation)==true)
    		click(yesButton);
    	click(productionDownArrow);
		click(lackingPartsLink);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
		
		if(collectText(header).contains("DRAFT")) {
			draftToApprovalState();
		}
		if(collectText(header).contains("CLOSED")) {
			closedToDraftState();
			draftToApprovalState();
		}
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		approvalToDraftState();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(header).contains("DRAFT");
		log.info(check);
		return check;
    }
    
    public boolean draftToApproval() {
    	click(productionDownArrow);
    	if(visibilityCheck(confirmation)==true)
    		click(yesButton);
    	click(productionDownArrow);
		click(lackingPartsLink);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
		
		if(collectText(header).contains("DRAFT")) {
			draftToApprovalState();
		}
		if(collectText(header).contains("CLOSED")) {
			closedToDraftState();
		}
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		draftToApprovalState();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(header).contains("APPROVAL");
		log.info("approval shown: " + check);
		return check;
    }
    
    public boolean approveWithoutSupplier() {
    	click(productionDownArrow);
    	if(visibilityCheck(confirmation)==true)
    		click(yesButton);
    	click(productionDownArrow);
		click(lackingPartsLink);
	//	click(generateNewSheet);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
	
		if(collectText(header).contains("DRAFT")) {
			draftToApprovalState();
		}
		if(collectText(header).contains("CLOSED")) {
			closedToDraftState();
			draftToApprovalState();
		}
		click(stateField.get(2));
		click(editButton);
		click(approve);
		click(saveButton);
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		boolean check = visibilityCheck(invalidFormat);
		click(noButton);
    	return check;
    }
    
    public boolean approveEdit() {
    	click(productionDownArrow);
    	if(visibilityCheck(confirmation)==true)
    		click(yesButton);
    	click(productionDownArrow);
		click(lackingPartsLink);
	//	click(generateNewSheet);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
	
		if(collectText(header).contains("DRAFT")) {
			draftToApprovalState();
		}
		if(collectText(header).contains("CLOSED")) {
			closedToDraftState();
			draftToApprovalState();
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		click(itemNameField.get(0));
		click(editButton);
		click(approve);
		click(saveButton);
		click(yesButton);
		click(okButton);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		approvalToDraftState();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(itemNameField.get(0));
		click(editButton);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		sendKeys(commentByKwInput.get(0), "edit approve");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		click(saveButton);
		click(yesButton);
		click(okButton);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(stateField.get(0)).contains("PENDING");
		log.info(collectText(stateField.get(0)));
/*		click(editButton);
		boolean check = collectText(stateInput)*/
		return check;
    }
    
    public boolean rejectEdit() {
    	click(productionDownArrow);
    	if(visibilityCheck(confirmation)==true)
    		click(yesButton);
    	click(productionDownArrow);
		click(lackingPartsLink);
	//	click(generateNewSheet);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
	
		if(collectText(header).contains("DRAFT")) {
			draftToApprovalState();
		}
		if(collectText(header).contains("CLOSED")) {
			closedToDraftState();
			draftToApprovalState();
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		click(itemNameField.get(4));
		click(editButton);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		click(reject);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		click(saveButton);
		click(yesButton);
		click(okButton);
		approvalToDraftState();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(itemNameField.get(4));
		click(editButton);
		sendKeys(commentByKwInput.get(4), "edit reject");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		click(saveButton);
		click(yesButton);
		click(okButton);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(stateField.get(4)).contains("PENDING");
		log.info(collectText(stateField.get(4)));
/*		click(editButton);
		boolean check = collectText(stateInput)*/
		return check;
    }
    
    public boolean actionNeededEdit() {
    	click(productionDownArrow);
    	if(visibilityCheck(confirmation)==true)
    		click(yesButton);
    	click(productionDownArrow);
		click(lackingPartsLink);
	//	click(generateNewSheet);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e3) {
		// TODO Auto-generated catch block
		e3.printStackTrace();
	}
		if(collectText(header).contains("DRAFT")) {
			draftToApprovalState();
		}
		if(collectText(header).contains("CLOSED")) {
			closedToDraftState();
			draftToApprovalState();
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		click(itemNameField.get(0));
		click(editButton);
		click(actionNeeded);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		click(saveButton);
		click(yesButton);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		click(okButton);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		approvalToDraftState();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(itemNameField.get(0));
		click(editButton);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		sendKeys(commentByKwInput.get(0), "edit action needed");
		click(saveButton);
		click(yesButton);
		click(okButton);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = collectText(stateField.get(0)).contains("ACTION NEEDED");
		log.info(collectText(stateField.get(0)));
/*		click(editButton);
		boolean check = collectText(stateInput)*/
		return check;
    }
		
    public boolean generateWoForApproved() {
    	boolean flag = false;
    	click(productionDownArrow);
    	if(visibilityCheck(confirmation)==true)
    		click(yesButton);
    	click(productionDownArrow);
		click(lackingPartsLink);
	//	click(generateNewSheet);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
		if(collectText(header).contains("DRAFT")) {
			toClosedState();
		}
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if(collectText(header).contains("CLOSED")) {
			closedToDraftState();
		}
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if(collectText(header).contains("DRAFT")) {
			draftToApprovalState();
		}
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		click(itemNameField.get(0));
		click(editButton);
		click(approve);
		click(saveButton);
		click(yesButton);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		click(okButton);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		approvalToDraftState();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//	click(editButton);
		click(generateOrders);
		click(yesButton);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		click(okButton);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(collectText(stateField.get(0)).contains("GENERATED")) 
			flag = true;
		return flag;
		}
    
    public boolean generateWoForApprovedError() {
    	boolean flag = false;
    	click(productionDownArrow);
    	if(visibilityCheck(confirmation)==true)
    		click(yesButton);
    	click(productionDownArrow);
		click(lackingPartsLink);
	//	click(generateNewSheet);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
		if(collectText(header).contains("DRAFT")) {
			toClosedState();
		}
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		if(collectText(header).contains("CLOSED")) {
			closedToDraftState();
		}
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		if(collectText(header).contains("DRAFT")) {
			draftToApprovalState();
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		click(itemNameField.get(0));
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		click(editButton);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		click(approve);
		click(saveButton);
		click(yesButton);
		try {
			Thread.sleep(13000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		click(okButton);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		approvalToDraftState();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//	click(editButton);
		click(generateOrders);
		click(yesButton);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		click(okButton);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		if(collectText(stateField.get(0)).contains("ACTION NEEDED")) 
			flag = true;
		return flag;
		}
    
    public boolean qtyToBeOrdPurchasing() {
    	click(productionDownArrow);
    	if(visibilityCheck(confirmation)==true)
    		click(yesButton);
    	click(productionDownArrow);
		click(lackingPartsLink);
	//	click(generateNewSheet);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
		
		if(collectText(header).contains("CLOSED")) {
			closedToDraftState();
		}
		if(collectText(header).contains("DRAFT")) {
			draftToApprovalState();
		}
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		click(itemNameField.get(0));
		click(editButton);
		click(approve);
		click(saveButton);
		click(yesButton);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		click(okButton);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		approvalToDraftState();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(editButton);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(qtyToBeOrderedInput.get(0));
		boolean flag =   visibilityCheck(qtyToBeOrderedInput.get(0));
		return flag;
    }
    
    public boolean unitPricePurchasing() {
    	click(productionDownArrow);
    	if(visibilityCheck(confirmation)==true)
    		click(yesButton);
    	click(productionDownArrow);
		click(lackingPartsLink);
	//	click(generateNewSheet);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
		if(collectText(header).contains("CLOSED")) {
			closedToDraftState();
		}
		if(collectText(header).contains("DRAFT")) {
			draftToApprovalState();
		}
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		click(itemNameField.get(0));
		click(editButton);
		click(approve);
		click(saveButton);
		click(yesButton);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		click(okButton);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		approvalToDraftState();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(editButton);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean flag =   visibilityCheck(unitPriceInput.get(0));
		return flag;
    }
    
    public boolean totalPricePurchasing() {
    	click(productionDownArrow);
    	if(visibilityCheck(confirmation)==true)
    		click(yesButton);
    	click(productionDownArrow);
		click(lackingPartsLink);
	//	click(generateNewSheet);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
		if(collectText(header).contains("CLOSED")) {
			closedToDraftState();
		}
		if(collectText(header).contains("DRAFT")) {
			draftToApprovalState();
		}
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		click(itemNameField.get(0));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		click(editButton);
		click(approve);
		click(saveButton);
		click(yesButton);
		click(okButton);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		approvalToDraftState();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(editButton);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean flag =   visibilityCheck(amountField.get(0));
		return flag;
    }
    
    public boolean alignmentInPurchasing() {
    	boolean flag = false;
    	click(productionDownArrow);
    	if(visibilityCheck(confirmation)==true)
    		click(yesButton);
    	click(productionDownArrow);
		click(lackingPartsLink);
	//	click(generateNewSheet);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
		if(collectText(header).contains("CLOSED")) {
			closedToDraftState();
		}
		if(collectText(header).contains("DRAFT")) {
			draftToApprovalState();
		}
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		click(itemNameField.get(0));
		click(editButton);
		click(approve);
		click(saveButton);
		click(yesButton);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		click(okButton);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		approvalToDraftState();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(editButton);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//	click(moqInput.get(0));
		boolean f1 = visibilityCheck(moqInput.get(0));
		boolean f2 = visibilityCheck(qtyToBeOrderedInput.get(0));
		boolean f3 = visibilityCheck(supplierPartInput.get(0));
		boolean f4 = visibilityCheck(oemPartInput.get(0));
		boolean f5 = visibilityCheck(unitPriceInput.get(0));
		if(f1==true && f2==true && f3==true && f4==true && f5==true)
		flag = true;
		return flag;
    }
    
   /* public boolean showLP() {
    	click(productionDownArrow);
    	if(visibilityCheck(confirmation)==true)
    		click(yesButton);
    	click(productionDownArrow);
		click(lackingPartsLink);
	//	click(generateNewSheet);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
	//	boolean check = visibilityCheck(hmwsPartField);
		for(WebElement e:hmwsPartField) {
			collectText(e);
			break;
		}
    }*/
    
    public boolean etaEdit() {
    	click(productionDownArrow);
    	if(visibilityCheck(confirmation)==true)
    		click(yesButton);
    	click(productionDownArrow);
		click(lackingPartsLink);
	//	click(generateNewSheet);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
		if(collectText(header).contains("APPROVAL")) {
			approvalToDraftState();
		}
		if(collectText(header).contains("CLOSED")) {
			closedToDraftState();
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		String mon ="September";
		String yr ="2022";
		String date = "20";
		click(editButton);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		click(etaInput.get(0));
		while(true) {
			By month = By.xpath("//div[@class='ui-datepicker-title']/span[1]");
			By year = By.xpath("//div[@class='ui-datepicker-title']/span[2]");
			if(collectText(driver.findElement(month)).equals(mon) && collectText(driver.findElement(year)).equals(yr)) 
				break;
			else {
				By rightArrow = By.xpath("//span[@class='ui-datepicker-next-icon pi pi-chevron-right']");
				click(driver.findElement(rightArrow));
			}
		}
		
		By day = By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for(WebElement e:driver.findElements(day)) {
			String dt = collectText(e);
			if(dt.equals(date)) {
				click(e);
				break;
			}
		}
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(saveButton);
		click(yesButton);
		click(okButton);
	//	click(workOrdersInfo.get(0));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Actions act = new Actions(driver);
		act.moveToElement(workOrdersId.get(0)).perform();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean eta = collectText(woTooltip).contains("ETA: 2022-09-20");
		log.info(collectText(woTooltip));
		return eta;
    }
    
    public boolean unconfirmedQty() {
    	click(productionDownArrow);
    /*	if(visibilityCheck(confirmation)==true)
    		click(yesButton);
    	click(productionDownArrow);*/
		click(lackingPartsLink);
	//	click(generateNewSheet);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
//		boolean f1 = visibilityCheck(unconfirmedQuantity);
		for(WebElement e:unconfirmedQtyField) {
			log.info(collectText(e)); 
		}
		boolean f2 = visibilityCheck(unconfirmedQtyField.get(0));
		return f2;
    }
    
    public boolean createdAndConfirmedDates() {
    	boolean flag = false;
    	click(productionDownArrow);
    	if(visibilityCheck(confirmation)==true)
    		click(yesButton);
    	click(productionDownArrow);
		click(lackingPartsLink);
	//	click(generateNewSheet);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
		if(collectText(header).contains("APPROVAL")) {
			approvalToDraftState();
		}
		if(collectText(header).contains("CLOSED")) {
			closedToDraftState();
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String d1 = collectText(lpcreatedField.get(2));
		String d2 = collectText(lpconfirmedField.get(2));
		log.info(d1);
		log.info(d2);
		click(workOrdersInfo.get(17));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(progress);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean f1 = collectText(lpcreatedInWo).contains(d1);
		log.info(collectText(lpcreatedInWo));
		boolean f2 = collectText(lpconfirmedInWo).contains(d2);
		log.info(collectText(lpconfirmedInWo));
		if(f1==true && f2==true) {
			flag = true;
		}
		return flag;
    }
    
    public boolean sourcing() {
    	click(productionDownArrow);
    /*	if(visibilityCheck(confirmation)==true)
    		click(yesButton);
    	click(productionDownArrow);*/
		click(lackingPartsLink);
	//	click(generateNewSheet);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean check = visibilityCheck(sourcingField);
		return check;
    }
    
    public void rough() {
    	click(productionDownArrow);
		click(lackingPartsLink);
	//	click(generateNewSheet);
		while(collectText(header).contains("no item")) {
			//waiting for header to not contain "no item created"
		}
    
	if(collectText(header).contains("APPROVAL")) {
		toClosedState();
	}
	if(collectText(header).contains("DRAFT")) {
		toClosedState();
	}
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	closedToDraftState();
/*	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
		
    }
    
    public void closedToDraftState() {
    	while(visibilityCheck(generateNewSheet)==true) {
    		click(generateNewSheet);
    		click(yesButton);
    		break;
    	}
    	try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	if(visibilityCheck(asyncMsg)==true) {
    	click(okButton);
    	//break;
    }
    }
    
    public void approvalToDraftState() {
    	while(visibilityCheck(backToAgent)==true) {
    		click(backToAgent);
    		click(yesButton);
    		break;
    	}
    }
    
    public void draftToApprovalState() {
    	while(visibilityCheck(submitForApprovalButton)==true) {
    		click(submitForApprovalButton);
    		click(yesButton);
    		break;
    	}
    }
    
    public void toClosedState() {
    	while(visibilityCheck(closeSheetButton)==true) {
    		click(closeSheetButton);
    		click(yesButton);
    		break;
    	}
    }
    
}
