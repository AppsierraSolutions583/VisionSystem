package com.vision.pageObjects;



import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vision.generics.GeneralFunctions;

public class InventoryPage extends GeneralFunctions{
	public WebDriver driver;
	public static Logger log = Logger.getLogger(InventoryPage.class);

	//	purchsasing page

	@FindBy(xpath = "//span[contains(text(),'Inventory')]")
	private WebElement inventory;

	@FindBy(xpath = "//div[@class='ui-card-content'][normalize-space()='Purchasing']")
	private WebElement purchasing;

	@FindBy(xpath = "//th[@id='Name-column']")
	private WebElement id;

	@FindBy(xpath = "//th[@id='Type-column']")
	private WebElement Type;

	@FindBy(xpath = "//th[@id='DateCreated-column']")
	private WebElement dateCreatedon;

	@FindBy(xpath = "//th[@id='LastUpdatedDate-column']")
	private WebElement lastUpdateDateOn;

	@FindBy(xpath = "//th[@id='State-column']")
	private WebElement state;


	@FindBy(xpath = "//body/cristalise-root[1]/div[1]/div[2]/div[1]/div[1]/cristalise-menu[1]/div[1]/ul[1]/ul[1]/li[7]/ul[1]/ul[1]/li[1]/a[1]/span[1]")
	private WebElement purchasinglink;


	//	replpenishment page
	@FindBy(xpath = "//div[contains(text(),'Replenishment Purchasing')]")
	private WebElement replenishmentPurchasingCard;

	@FindBy(xpath = "//div[contains(text(),'Replenishment Purchasing')]")
	private WebElement replenishmentPurchasinglink;

	@FindBy(xpath = "//span[contains(text(),'New Sheet')]")
	private WebElement newSheetBtn;

	@FindBy(xpath = "//span[normalize-space()='Yes']")
	private WebElement yesBtn;

	@FindBy(xpath = "//span[contains(text(),'OK')]")
	private WebElement okBtn;

	@FindBy(xpath = "/html/body/cristalise-root/div/p-confirmdialog/div/div[3]/button[1]/span[2]")
	private WebElement yes2;

	@FindBy(xpath = "//span[contains(text(),'Submit For Approval')]")
	private WebElement submitForApprovalBtn;

	@FindBy(xpath = "//span[contains(text(),'Back to Agent')]")
	private WebElement backtoAgenet;

	@FindBy(xpath = "//span[contains(text(),'Close Sheet')]")
	private WebElement closeSheet;

	@FindBy(xpath = "//button[@id='Edit']")
	private WebElement EditBtn;

	@FindBy(xpath = "//span[contains(text(),'Save')]")
	private WebElement SaveBtn;

	@FindBy(xpath = "//span[contains(text(),'Export')]")
	private WebElement ExportBtn;


	@FindBy(xpath = "//th[contains(text(),'HMWS Part #')]")
	private WebElement Hmws;

	@FindBy(xpath = "//th[contains(text(),'Item Name')]")
	private WebElement ItemName;

	@FindBy(xpath = "//th[normalize-space()='Product Type']")
	private WebElement ProductType;

	@FindBy(xpath = "//th[normalize-space()='Product Category']")
	private WebElement ProductCategory;

	@FindBy(xpath = "//th[normalize-space()='Last Month Usage']")
	private WebElement LastMonthUsage;

	@FindBy(xpath = "//th[normalize-space()='4 Months Average Usage']")
	private WebElement MonthAverageUsage4;

	@FindBy(xpath = "//th[normalize-space()='6 Months Average Usage']")
	private WebElement MonthAverageUsage6;

	@FindBy(xpath = "//th[normalize-space()='Quantity In Stock']")
	private WebElement QuantityInStock;

	@FindBy(xpath = "//th[normalize-space()='Reserved Quantity']")
	private WebElement ReserveQuantity;

	@FindBy(xpath = "//th[normalize-space()='Quantity On Order']")
	private WebElement QuantityOnOrder;

	@FindBy(xpath = "//th[normalize-space()='Replenishment Quantity']")
	private WebElement ReplenishmentQuantity;

	@FindBy(xpath = "//th[normalize-space()='MOQ']")
	private WebElement MOQ;

	@FindBy(xpath = "//th[normalize-space()='Lead Time (days)']")
	private WebElement LeadTimedays;

	@FindBy(xpath = "//th[normalize-space()='Quantity To Be Ordered']")
	private WebElement QuantityToBeOrdered;

	@FindBy(xpath = "//th[normalize-space()='Remarks']")
	private WebElement Remarks;

	@FindBy(xpath = "//th[normalize-space()='Supplier']")
	private WebElement Supplier;

	@FindBy(xpath = "//th[normalize-space()='Supplier Part #']")
	private WebElement SupplierPart;

	@FindBy(xpath = "//th[normalize-space()='OEM Part #']")
	private WebElement OEMPart;

	@FindBy(xpath = "//th[normalize-space()='Currency']")
	private WebElement Currency;


	@FindBy(xpath = "//th[normalize-space()='Unit Price']")
	private WebElement UnitPrice;


	@FindBy(xpath = "//th[normalize-space()='Amount']")
	private WebElement Amount;

	@FindBy(xpath = "//th[normalize-space()='PHP Unit Price']")
	private WebElement PHPUnitPrice;

	@FindBy(xpath = "//th[normalize-space()='PHP Amount']")
	private WebElement PHPAmount;

	@FindBy(xpath = "//th[normalize-space()='Comments By KW']")
	private WebElement CommentsByKW;

	@FindBy(xpath = "//th[normalize-space()='Supplier Order']")
	private WebElement SupplierOrder;

	@FindBy(xpath = "//th[normalize-space()='Supplier Order Generation Error']")
	private WebElement SupplierOrderGenerationError;

	@FindBy(xpath = "//th[normalize-space()='State']")
	private WebElement State;

	//supplier order

	@FindBy(xpath = "//div[contains(text(),'Supplier Orders')]")
	private WebElement supplierOrder;

	@FindBy(xpath = "//p-dropdown[@id='Supplier']/div/label")
	private WebElement supplierDropdown;

	@FindBy(xpath = "//span[contains(text(),'BD - BuyDeutsch')]")
	private WebElement supplierDropdownValue;

	@FindBy(xpath = "//p-dropdown[@id='Purpose']/div/label")
	private WebElement purposeDropdown;

	@FindBy(xpath = "//ul[@role='listbox']/P-dropdownitem[2]")
	private WebElement purposeDropdownValue;

	@FindBy(xpath = "//p-dropdown[@id='Currency']/div/label")
	private WebElement currencyDropdown;

	@FindBy(xpath = "//li[@aria-label='USD']")
	private WebElement currencyDropdownValue;

	@FindBy(xpath = "//textarea[@id='DeliveryInstructions']")
	private WebElement deliveryInstruction;

	@FindBy(xpath = "//span[contains(text(),'Edit')]")
	private WebElement editBtn;

	@FindBy(xpath = "//span[contains(text(),'Print')]")
	private WebElement printBtn;

	@FindBy(xpath = "//span[contains(text(),'Upload to Xero')]")
	private WebElement uploadtoXeroBtn;

	@FindBy(xpath = "//span[contains(text(),'Update Xero Order Number')]")
	private WebElement updateXeroNumberBtn;

	@FindBy(xpath = "//input[@id='XeroOrderNumber']")
	private WebElement xeroOrderNumber;

	@FindBy(xpath = "//textarea[@id='Notes']")
	private WebElement notes;

	@FindBy(xpath = "//tbody/tr[1]/td[2]/webuilib-uuid-link[1]")
	private WebElement selectSupplierOrder;

	@FindBy(xpath = "//span[normalize-space()='Supplier Order Rows']")
	private WebElement supplierOrderRowTab;

	@FindBy(xpath = "//span[contains(text(),'Bulk Entry')]")
	private WebElement bulkEntryBtn;

	@FindBy(xpath = "//span[contains(text(),'Export')]")
	private WebElement exportBtn;

	@FindBy(xpath = "//input[@class='ng-star-inserted']")
	private WebElement search;

	//supplier invoice page

	@FindBy(xpath = "//div[contains(text(),'Supplier Invoices')]")
	private WebElement supplierInvoice;


	@FindBy(xpath = "//*[@id=\"Supplier\"]")
	private WebElement supplier;

	@FindBy(xpath = "//*[@id=\"Currency\"]/div/label")
	private WebElement currency;


	@FindBy(xpath = "//*[@id=\"Currency\"]/div/div[3]/div[2]/ul/p-dropdownitem[2]/li")
	private WebElement currencyValue;



	@FindBy(xpath = "//*[@id=\"ExternalReference1\"]")
	private WebElement externalReference1;

	@FindBy(xpath = "//*[@id=\"ExternalReference2\"]")
	private WebElement externalReference2;

	@FindBy(xpath = "//*[@id=\"InvoicedDate\"]/span/button/span[1]")
	private WebElement invoiceDate;

	@FindBy(xpath = "//*[@id=\"InvoicedDate\"]/span/div/div[2]/div/div[1]/button/span")
	private WebElement invoiceDateValue;


	@FindBy(xpath = "//tbody/tr[1]/td[1]/p-tableradiobutton[1]/div[1]/div[2]/span[1]")
	private WebElement selectInvoiceRow;

	@FindBy(xpath = "//tbody/tr[1]/td[1]/p-tableradiobutton[1]/div[1]/div[2]/span[1]")
	private WebElement selectInvoiceRowSelected;

	@FindBy(xpath = "//span[normalize-space()='Supplier Invoice Rows']")
	private WebElement supplierInvoiceRowTab;


	@FindBy(xpath = "//span[normalize-space()='Select']")
	private WebElement selectBtnsupplierInvoiceRow;

	@FindBy(xpath = "//span[@class='ui-dropdown-trigger-icon ui-clickable pi pi-caret-down']")
	private WebElement supplierOrderDropdown;

	@FindBy(xpath = "//body/cristalise-root[1]/div[1]/div[3]/webuilib-item-details[1]/div[1]/div[1]/p-tabview[1]/div[1]/div[1]/p-tabpanel[2]/div[1]/webuilib-item-collection[1]/webuilib-item-toolbar[1]/p-sidebar[1]/div[1]/div[1]/webuilib-item-job-form[1]/div[1]/form[1]/div[1]/div[1]/dynamic-primeng-form[1]/dynamic-primeng-form-control[1]/div[1]/dynamic-primeng-form-group[1]/div[1]/dynamic-primeng-form-control[1]/div[1]/dynamic-primeng-dropdown[1]/div[1]/p-dropdown[1]/div[1]/div[3]/div[2]/ul[1]/p-dropdownitem[5]/li[1]")
	private WebElement supplierOrderValue;

	@FindBy(xpath = "//span[contains(text(),'Inspection')]")
	private WebElement inspectionBtn;

	@FindBy(xpath = "//span[contains(text(),'Inspection')]")
	private WebElement bulkBtn;

	@FindBy(xpath = "//div[contains(text(),'Storage Transactions')]")
	private WebElement storageTransactionMenu;

	@FindBy(xpath = "//*[@id=\"New Transfer\"]/span[2]")
	private WebElement newTransferBtn;

	@FindBy(xpath = "//*[@id=\"Product\"]")
	private WebElement product;

	@FindBy(xpath = "//*[@id=\"StorageSource\"]")
	private WebElement storageSource;

	@FindBy(xpath = "//*[@id=\"StorageDestination\"]")
	private WebElement storageDestination;

	@FindBy(xpath = "//*[@id=\"Quantity\"]")
	private WebElement quantity;

	@FindBy(xpath = "//thead/tr[2]/th[3]/p-multiselect[1]/div[1]/div[3]")
	private WebElement stateDropdown;

	@FindBy(xpath = "//body/div[1]/div[2]/ul[1]/cdk-virtual-scroll-viewport[1]/div[1]/p-multiselectitem[3]/li[1]/span[1]")
	private WebElement stateDropdownValue;

	@FindBy(xpath = "//body/div[1]/div[1]/a[1]/span[1]")
	private WebElement stateDropdownSelected;


	@FindBy(xpath = "//thead/tr[2]/th[4]/p-multiselect[1]/div[1]/div[3]/span[1]")
	private WebElement directionDropdown;

	@FindBy(xpath = "//body/div[1]/div[2]/ul[1]/cdk-virtual-scroll-viewport[1]/div[1]/p-multiselectitem[5]/li[1]/span[1]")
	private WebElement directionDropdownValue;

	@FindBy(xpath = "//body/div[1]/div[1]/a[1]/span[1]")
	private WebElement directionDropdownSelected;

	@FindBy(xpath = "/html/body/cristalise-root/div/div[3]/cristalise-list/div/div/div/p-table/div/div[2]/div/div[2]/table/tbody/tr[1]/td[1]/p-tableradiobutton/div/div[2]/span")
	private WebElement selectIDRadioBtn;

	@FindBy(xpath = "//*[@id=\"Complete\"]/span[2]")
	private WebElement completeBtn;


	@FindBy(xpath = "//div[contains(text(),'Storages')]")
	private WebElement storageCard;

	@FindBy(xpath = "//tbody/tr[1]/td[2]/webuilib-uuid-link[1]/span[1]/a[1]")
	private WebElement storageName;


	@FindBy(xpath = "//span[contains(text(),'Add Product')]")
	private WebElement addProductBtn;

	@FindBy(xpath = "//input[@id='Product']")
	private WebElement productName1;


	@FindBy(xpath = "//input[@id='MemberName']")
	private WebElement productName;

	@FindBy(xpath = "//input[@id='Quantity']")
	private WebElement qty;

	@FindBy(xpath = "//span[@class='ui-dropdown-trigger-icon ui-clickable pi pi-caret-down']")
	private WebElement reasonDropdown;

	@FindBy(xpath = "//span[contains(text(),'Replenishment of stock in Production')]")
	private WebElement reasonDropdownValue;

	@FindBy(xpath = "//input[@id='WorkOrder']")
	private WebElement workOrder;

	@FindBy(xpath = "//textarea[@id='Notes']")
	private WebElement stockNotes;


	@FindBy(xpath = "//th[@id='Notes-column']")
	private WebElement notesColumn;

	@FindBy(xpath = "//div[contains(text(),'Storages')]")
	private WebElement storageMenu;

	@FindBy(xpath = "//span[contains(text(),'New')]")
	private WebElement newBtn;

	@FindBy(xpath = "//h2[contains(text(),'New Supplier Invoice')]")
	private WebElement newSupplierInnvoice;


	@FindBy(xpath = "//*[@id=\"Name\"]")
	private WebElement name;

	@FindBy(xpath = "//*[@id=\"StorageType\"]/div/div[2]/span")
	private WebElement storageType;


	@FindBy(xpath = "//span[contains(text(),'Warehouse')]")
	private WebElement storageTypeValue;

	@FindBy(xpath = "//span[contains(text(),'Slot')]")
	private WebElement storageTypeValue1;

	@FindBy(xpath = "//*[@id=\"StockAccounting\"]/div/label")
	private WebElement stockAccounting;

	@FindBy(xpath = "//li[@aria-label='Regular']//span[@class='ng-star-inserted'][normalize-space()='Regular']")
	private WebElement stockAccountingValue;

	@FindBy(xpath = "//input[@id='Note']")
	private WebElement note;

	@FindBy(xpath = "//span[normalize-space()='OK']")
	private WebElement ok;

	@FindBy(xpath = "//span[normalize-space()='Dismiss']")
	private WebElement dismiss;

	@FindBy(xpath = "//tbody/tr[1]/td[1]/p-tableradiobutton[1]/div[1]/div[2]/span[1]")
	private WebElement selectRadioBtn;


	@FindBy(xpath = "/html/body/cristalise-root/div/div[3]/cristalise-list/div/div/div/p-table/div/div[2]/div/div[2]/table/tbody/tr[1]/td[2]/webuilib-uuid-link/span/a")
	private WebElement selectChild;

	@FindBy(xpath = "//*[@id=\"Edit\"]/span[2]")
	private WebElement edit;

	@FindBy(xpath = "//*[@id=\"Create Child\"]/span[2]")
	private WebElement createChild;

	@FindBy(xpath = "//*[@id=\"exportButton\"]/span[2]")
	private WebElement childExport;

	@FindBy(xpath = "//span[normalize-space()='Stocks']")
	private WebElement stockTab;

	@FindBy(xpath = "//body/cristalise-root[1]/div[1]/div[3]/webuilib-item-details[1]/div[1]/div[1]/p-tabview[1]/div[1]/div[1]/p-tabpanel[1]/div[1]/div[1]/div[2]/p-panel[1]/div[1]/div[2]/div[1]/p-tabview[1]/div[1]/div[1]/p-tabpanel[2]/div[1]/webuilib-item-collection[1]/webuilib-item-toolbar[1]/div[1]/p-toolbar[1]/div[1]/div[2]/button[1]/span[2]")
	private WebElement stockExport;

	@FindBy(xpath = "//span[normalize-space()='Transactions']")
	private WebElement transactionTab;

	@FindBy(xpath = "//body/cristalise-root[1]/div[1]/div[3]/webuilib-item-details[1]/div[1]/div[1]/p-tabview[1]/div[1]/div[1]/p-tabpanel[1]/div[1]/div[1]/div[2]/p-panel[1]/div[1]/div[2]/div[1]/p-tabview[1]/div[1]/div[1]/p-tabpanel[3]/div[1]/webuilib-item-collection[1]/webuilib-item-toolbar[1]/div[1]/p-toolbar[1]/div[1]/div[1]/button[1]/span[2]")
	private WebElement transactionExport;

	@FindBy(xpath = "//*[@id=\"Delete\"]/span[2]")
	private WebElement deleteBtn;


	@FindBy(xpath = "//span[normalize-space()='Yes']")
	private WebElement yesDelete;

	@FindBy(xpath = "//span[normalize-space()='Dismiss']")
	private WebElement dismissBtn;

	@FindBy(xpath = "//div[contains(text(),'Storage Types')]")
	private WebElement storageTypeMenu;

	@FindBy(xpath = "//*[@id=\"Add Child\"]/span[2]")
	private WebElement addChildBtn;

	@FindBy(xpath = "//*[@id=\"exportButton\"]/span[2]")
	private WebElement exportChildren;

	@FindBy(xpath = "//div[contains(text(),'Stock Take')]")
	private WebElement stockTakeMenu;

	@FindBy(xpath = "//span[@class='ui-button-text ui-clickable'][normalize-space()='Stock Take']")
	private WebElement stockTakeBtn;

	@FindBy(xpath = "//*[@id=\"Stock Take\"]/div/div/ul/li[1]/a/span[2]")
	private WebElement exportStock;

	@FindBy(xpath = "//*[@id=\"Location\"]/div/div[2]/span")
	private WebElement location;


	@FindBy(xpath = "//*[@id=\"Location\"]/div/div[4]/div[2]/ul/p-multiselectitem[1]/li/span")
	private WebElement locationValue1;

	@FindBy(xpath = "//*[@id=\"Location\"]/div/div[4]/div[2]/ul/p-multiselectitem[3]/li/span")
	private WebElement locationValue2;

	@FindBy(xpath = "//*[@id=\"Stock Take\"]/div/div/ul/li[2]/a/span[2]")
	private WebElement importStock;

	@FindBy(xpath = "/html/body/cristalise-root/div/div[3]/cristalise-list/div/div/div/p-table/div/div[2]/div/div[2]/table/tbody/tr[1]/td[2]/webuilib-uuid-link/span/a")
	private WebElement selectStockTake;

	//	Product Page

	@FindBy(xpath = "//span[contains(text(),'Products')]")
	private WebElement productMenu;


	@FindBy(xpath = "//input[@id='Name']")
	private WebElement itemCode;

	@FindBy(xpath = "//input[@id='ItemName']")
	private WebElement itemName;

	@FindBy(xpath = "//input[@id='Description']")
	private WebElement description;

	@FindBy(xpath = "//input[@id='CustomerReferenceNumber']")
	private WebElement customerReferenceNumber;

	@FindBy(xpath = "//p-dropdown[@id='Type']/div/label")
	private WebElement type;

	@FindBy(xpath = "//li[@aria-label='Bracket']//span[@class='ng-star-inserted'][normalize-space()='Bracket']")
	private WebElement typeValue;

	@FindBy(xpath = "//p-dropdown[@id='Category']/div/label")
	private WebElement categories;


	@FindBy(xpath = "//li[@aria-label='BRACKETS']//span[@class='ng-star-inserted'][normalize-space()='BRACKETS']")
	private WebElement categoriesValue;

	@FindBy(xpath = "//li[@role='option']")
	private WebElement categoriesValue1;


	@FindBy(xpath = "//p-dropdown[@id='Sourcing']/div/label")
	private WebElement sourcing;

	@FindBy(xpath = "//li[@aria-label='Regular']//span[@class='ng-star-inserted'][normalize-space()='Regular']")
	private WebElement sourcingValue;

	@FindBy(xpath = "//input[@id='Weight']")
	private WebElement weight;

	@FindBy(xpath = "//input[@id='UOM']")
	private WebElement uom;

	@FindBy(xpath = "//input[@id='OEMPartNumber']")
	private WebElement oemPartNumber;

	@FindBy(xpath = "//input[@id='Brand']")
	private WebElement brand;

	@FindBy(xpath = "//div[@class='ng-tns-c26-167 ui-dropdown ui-widget ui-state-default ui-corner-all ui-helper-clearfix ui-dropdown-open']//span[@class='ui-dropdown-trigger-icon ui-clickable pi pi-caret-down']")
	private WebElement replenish;

	@FindBy(xpath = "//span[contains(text(),'Supplied by Customer to Factory')]")
	private WebElement replenishValue;

	@FindBy(xpath = "//span[contains(text(),'Export')]")
	private WebElement exportBtn2;


	@FindBy(xpath = "//tbody/tr[1]/td[2]/webuilib-uuid-link[1]/span[1]")
	private WebElement selectProduct;

	@FindBy(xpath = "//span[normalize-space()='Attachments']")
	private WebElement attachement;

	@FindBy(xpath = "//span[contains(text(),'Used In')]")
	private WebElement usedInTab;


	@FindBy(xpath = "//span[contains(text(),'Components')]")
	private WebElement componentsTab;

	@FindBy(xpath = "//span[contains(text(),'Reservations')]")
	private WebElement reservationTab;

	@FindBy(xpath = "//body/cristalise-root[1]/div[1]/div[3]/webuilib-item-details[1]/div[1]/div[1]/p-tabview[1]/div[1]/ul[1]/li[6]/a[1]/span[2]")
	private WebElement transactionsTab;


	@FindBy(xpath = "//span[normalize-space()='Add']")
	private WebElement addBtn;


	@FindBy(xpath = "//span[contains(text(),'History')]")
	private WebElement historyTab;


	@FindBy(xpath = "//span[@class='ui-button-text ui-clickable'][normalize-space()='Yes']")
	private WebElement yesDeleteBtn;

	@FindBy(xpath = "//span[contains(text(),'Dismiss')]")
	private WebElement DismissBtn;

	@FindBy(xpath = "//span[contains(text(),'Clone')]")
	private WebElement cloneBtn;


	@FindBy(xpath = "//span[normalize-space()='Add Storage']")
	private WebElement addStorageBtn;


	@FindBy(xpath = "//span[@class='ui-dropdown-trigger-icon ui-clickable pi pi-caret-down']")
	private WebElement reason;

	@FindBy(xpath = "//span[normalize-space()='Damaged parts (Inside Store)']")
	private WebElement reasonValue;


	@FindBy(xpath = "//span[contains(text(),'Update Average Price')]")
	private WebElement updateAveragePrice;

	@FindBy(xpath = "//input[@id='AveragePrice']")
	private WebElement averagePrice;

	@FindBy(xpath = "//span[contains(text(),'Export Purchases')]")
	private WebElement exportPurchase;

	@FindBy(xpath = "//span[@class='ui-button-text ui-clickable'][normalize-space()='Yes']")
	private WebElement yes;

	@FindBy(xpath = "//body/cristalise-root[1]/div[1]/div[3]/cristalise-list[1]/div[1]/div[1]/webuilib-item-toolbar[1]/p-dialog[1]/div[1]/div[3]/p-footer[1]/div[1]/button[1]/span[2]")
	private WebElement yes1;

	@FindBy(xpath = "//span[normalize-space()='No']")
	private WebElement no;

	@FindBy(xpath = "//div[contains(text(),'Product Categories')]")
	private WebElement productCategoryMenu;

	@FindBy(xpath = "//*[@id=\"StockDeduction\"]/div/div[2]/span")
	private WebElement stockDeductionSelect;

	@FindBy(xpath = "//*[@id=\"StockDeduction\"]/div/div[3]/div[2]/ul/p-dropdownitem[2]/li/span")
	private WebElement stockDeductionSelectValue;

	@FindBy(xpath = "//*[@id=\"BOMUpload\"]/div/div[2]/span")
	private WebElement bomUploadSelect;

	@FindBy(xpath = "//*[@id=\"BOMUpload\"]/div/div[3]/div[2]/ul/p-dropdownitem[2]/li/span")
	private WebElement bomUploadSelectValue;


	@FindBy(xpath = "//span[contains(text(),\"ProductCategory 'test' already exists\")]")
	private WebElement productCategoriesAlreadyExist;



	@FindBy(xpath = "//tbody/tr[1]/td[1]/p-tableradiobutton[1]/div[1]/div[2]/span[1]")
	private WebElement selectProductCategories;


	@FindBy(xpath = "//input[@class='ng-star-inserted']")
	private WebElement inputSearch;

	@FindBy(xpath = "//tbody/tr[1]/td[2]/webuilib-uuid-link[1]/span[1]")
	private WebElement selectProductValue;

	@FindBy(xpath = "//*[@id=\"Name-column\"]")
	private WebElement nameColumn;


	@FindBy(xpath = "//*[@id=\"Name\"]")
	private WebElement newName;
	
	@FindBy(xpath = "//b[contains(text(),'ID:')]")
	private WebElement idCheck;
	
	

	public InventoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//	purchasing page

	public void VerifyPurchasingCard() throws InterruptedException {
		click(inventory);
		click(purchasing);
		log.info(" Purchasing Card verified.");
		Thread.sleep(4000L);
	}
	public void VerifyPurchasingLink() throws InterruptedException {
		click(inventory);
		click(purchasing);
		clickWithJS(purchasinglink);
		log.info(" Purchasinglink verified.");
		Thread.sleep(4000L);
	}
	public void VerifyPurchasingData() throws InterruptedException {
		click(inventory);
		click(purchasing);
		log.info(" Verify Purchasing Data.");
		Thread.sleep(4000L);
		
	}
	public void VerifyPurchasingFields() throws InterruptedException {
		click(inventory);
		click(purchasing);
		log.info(id.isDisplayed());
		log.info(Type.isDisplayed());
		log.info(dateCreatedon.isDisplayed());
		log.info(lastUpdateDateOn.isDisplayed());
		log.info(state.isDisplayed());
		log.info(" Verify Purchasing Fields.");
		Thread.sleep(4000L);

	}

	//	replenishment page

	public boolean VerifyReplenishmentPurchasingCard() throws InterruptedException{
		click(inventory);
		click(replenishmentPurchasingCard);
		boolean plTest = driver.getCurrentUrl().contains("replenishmentPurchasing");
		log.info(" Verify Purchasing Data.");
		Thread.sleep(4000L);
		return plTest;
	}
	public boolean VerifyReplenishmentPurchasingLink() throws InterruptedException {
		click(inventory);
		click(replenishmentPurchasinglink);
		boolean plTest = driver.getCurrentUrl().contains("replenishmentPurchasing");
		log.info(" ReplinishmentPurchasing Link Verified");
		Thread.sleep(4000L);
		return plTest;
	}

	public boolean CreateNewSheet() throws InterruptedException {
		click(inventory);
		click(replenishmentPurchasingCard);
		Thread.sleep(3000L);
		System.out.println(newSheetBtn.isDisplayed());
		if(newSheetBtn.isDisplayed()==true) {
			clickWithJS(newSheetBtn);
			Thread.sleep(3000L);
			click(yesBtn);
			Thread.sleep(20000L);
			clickWithJS(okBtn);
			Thread.sleep(3000L);
			click(submitForApprovalBtn);
			click(yesBtn);
			Thread.sleep(3000L);
			clickWithJS(closeSheet);
			click(yesBtn);
		}else {
			clickWithJS(closeSheet);
			click(yesBtn);
			clickWithJS(newSheetBtn);
			Thread.sleep(3000L);
			click(yesBtn);
			Thread.sleep(20000L);
			clickWithJS(okBtn);
			Thread.sleep(3000L);
			click(submitForApprovalBtn);
			click(yesBtn);
			Thread.sleep(3000L);
			clickWithJS(closeSheet);
			click(yesBtn);
		}
		boolean plTest = driver.getCurrentUrl().contains("replenishmentPurchasing");
		log.info(" New Sheet Added.");
		Thread.sleep(3000L);
		return plTest;
	}

	public boolean EditandSaveCreatedSheet() throws InterruptedException {
		click(inventory);
		click(replenishmentPurchasingCard);
		Thread.sleep(3000L);
		clickWithJS(newSheetBtn);
		Thread.sleep(3000L);
		click(yesBtn);
		Thread.sleep(20000L);
		clickWithJS(okBtn);
		Thread.sleep(3000L);
		log.info(EditBtn.isDisplayed());
		log.info(submitForApprovalBtn.isDisplayed());
		click(EditBtn);
		click(SaveBtn);
		click(yesBtn);
		click(okBtn);
		Thread.sleep(3000L);
		click(closeSheet);
		click(yesBtn);
		boolean plTest = driver.getCurrentUrl().contains("replenishmentPurchasing");
		log.info(" ReplinishmentPurchasing Edit and Saved");
		return plTest;
	}
	public boolean ExportReplenishmentPurchasing() {
		click(inventory);
		click(replenishmentPurchasingCard);
		click(ExportBtn);
		boolean plTest = driver.getCurrentUrl().contains("replenishmentPurchasing");
		log.info(" ReplinishmentPurchasing Exported");
		return plTest;
	}

	public boolean VerifyColumnOnReplenishmentPurchasing() throws InterruptedException {
		click(inventory);
		click(replenishmentPurchasingCard);
		log.info(Hmws.isDisplayed());
		System.out.println(Hmws.getText());
		//		log.info(ItemName.isDisplayed());
		//		System.out.println(ItemName.getText());
		//		log.info(ProductType.isDisplayed());
		//		System.out.println(ProductType.getText());
		//		log.info(ProductCategory.isDisplayed());
		//		System.out.println(ProductCategory.getText());
		//		log.info(LastMonthUsage.isDisplayed());
		//		System.out.println(LastMonthUsage.getText());
		//		log.info(MonthAverageUsage4.isDisplayed());
		//		System.out.println(MonthAverageUsage4.getText());
		//		log.info(MonthAverageUsage6.isDisplayed());
		//		System.out.println(MonthAverageUsage6.getText());
		//		log.info(QuantityInStock.isDisplayed());
		//		System.out.println(QuantityInStock.getText());
		//		log.info(ReserveQuantity.isDisplayed());
		//		System.out.println(ReserveQuantity.getText());
		//		log.info(QuantityOnOrder.isDisplayed());
		//		System.out.println(QuantityOnOrder.getText());
		//		log.info(ReplenishmentQuantity.isDisplayed());
		//		System.out.println(ReplenishmentQuantity.getText());
		//		log.info(MOQ.isDisplayed());
		//		System.out.println(MOQ.getText());
		//		log.info(LeadTimedays.isDisplayed());
		//		System.out.println(LeadTimedays.getText());
		//		log.info(QuantityToBeOrdered.isDisplayed());
		//		System.out.println(QuantityToBeOrdered.getText());
		//		log.info(Remarks.isDisplayed());
		//		System.out.println(Remarks.getText());
		//		log.info(Supplier.isDisplayed());
		//		System.out.println(Supplier.getText());
		//		log.info(SupplierPart.isDisplayed());
		//		System.out.println(SupplierPart.getText());
		//		log.info(OEMPart.isDisplayed());
		//		System.out.println(OEMPart.getText());
		//		log.info(Currency.isDisplayed());
		//		System.out.println(Currency.getText());
		//		log.info(UnitPrice.isDisplayed());
		//		System.out.println(UnitPrice.getText());
		//		log.info(Amount.isDisplayed());
		//		System.out.println(Amount.getText());
		//		log.info(PHPUnitPrice.isDisplayed());
		//		System.out.println(PHPUnitPrice.getText());
		//		log.info(PHPAmount.isDisplayed());
		//		System.out.println(PHPAmount.getText());
		//		log.info(CommentsByKW.isDisplayed());
		//		System.out.println(CommentsByKW.getText());
		//		log.info(SupplierOrder.isDisplayed());
		//		System.out.println(SupplierOrder.getText());
		//		log.info(SupplierOrderGenerationError.isDisplayed());
		//		System.out.println(SupplierOrderGenerationError.getText());
		//		log.info(State.isDisplayed());
		//		System.out.println(State.getText());
		log.info(" Verify All Column on ReplinishmentPurchasing");
		Thread.sleep(3000L);
		return true;
	}
	//supplier order page
	public boolean AddSupplierOrder() throws InterruptedException {
		click(inventory);
		click(supplierOrder);
		click(newBtn);
		click(supplierDropdown);
		click(supplierDropdownValue);
		click(currencyDropdown);
		click(currencyDropdownValue);
		sendKeys(deliveryInstruction,"testing");
		click(okBtn);
		boolean check = driver.getCurrentUrl().contains("SPO");
		System.out.println(check);
		log.info("Supplier Order Added");
		Thread.sleep(4000L);
		return check;
	}
	public boolean EditSupplierOrder() throws InterruptedException {
		click(inventory);
		click(supplierOrder);
		click(selectRadioBtn);
		click(editBtn);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(supplierDropdown);
		click(supplierDropdownValue);
		click(currencyDropdown);
		click(currencyDropdownValue);
		deliveryInstruction.clear();
		sendKeys(deliveryInstruction,"testing");
		//		click(purposeDropdown);
		//		click(purposeDropdownValue);
		//		Thread.sleep(3000L);
		click(okBtn);
		boolean check = driver.getCurrentUrl().contains("SPO");
		System.out.println(check);
		log.info("Supplier Order Edited");
		return true;
	}
	public void DeleteSupplierOrder() throws InterruptedException {
		click(inventory);
		click(supplierOrder);
		click(selectRadioBtn);
		Thread.sleep(4000L);
		click(deleteBtn);
		click(yesBtn);
		log.info(" Supplier Order Deleted.");
		Thread.sleep(4000L);
	}
	public void PrintSupplierOrder() throws InterruptedException {
		click(inventory);
		click(supplierOrder);
		click(selectRadioBtn);
		click(printBtn);
		log.info(" Supplier Order Printed.");
		Thread.sleep(4000L);
	}
	public void UploadtoXero() throws InterruptedException {
		click(inventory);
		click(supplierOrder);
		click(selectRadioBtn);
		click(uploadtoXeroBtn);
		click(yesBtn);
		click(okBtn);
		log.info(" Supplier Order Uploaded to Xero.");
		Thread.sleep(4000L);
	}
	public boolean UpdateXeroOrderNumber() throws InterruptedException {
		click(inventory);
		click(supplierOrder);
		click(selectRadioBtn);
		click(updateXeroNumberBtn);
		xeroOrderNumber.clear();
		sendKeys(xeroOrderNumber,"656");
		sendKeys(notes,"test notes");
		click(okBtn);
		log.info(" Xero Order Number Updated");
		boolean check = driver.getCurrentUrl().contains("SPO");
		System.out.println(check);
		Thread.sleep(4000L);
		return check;
	}
	public void AddBUlkEntryInSupplierOrderRow() throws InterruptedException {
		clickWithJS(inventory);
		clickWithJS(supplierOrder);
		click(selectSupplierOrder);
		Thread.sleep(3000L);
		click(supplierOrderRowTab);
		Thread.sleep(3000L);
		click(bulkEntryBtn);
		clickWithJS(okBtn);
		click(yes);
		click(okBtn);
		log.info(" Bulk Entry Added in Supplier Order Row Tab ");
		Thread.sleep(3000L);
	}
	public void ExportSupplierOrder() throws InterruptedException {
		clickWithJS(inventory);
		click(supplierOrder);
		click(exportBtn);
		log.info("Supplier Order Exported ");
		Thread.sleep(4000L);
	}
	public void SearchMatchedSupplierOrder() throws InterruptedException {
		click(inventory);
		click(supplierOrder);
		sendKeys(search,"SPO-00003217");
		log.info("Macthed Supplier Order");
		Thread.sleep(4000L);
	}
	public void SearchNotMatchedSupplierOrder() throws InterruptedException {
		click(inventory);
		click(supplierOrder);
		sendKeys(search,"123456");
		log.info("Not Matched Supplier Order ");
		Thread.sleep(4000L);
	}

	//supplier invoice page

	public boolean VerifySUI() throws InterruptedException {
		click(inventory);
		click(supplierInvoice);
		click(newBtn);
		newSupplierInnvoice.isDisplayed();
		boolean check = newSupplierInnvoice.isDisplayed();
		System.out.println(check);
		log.info("Supplier Invoice form Verifried");
		Thread.sleep(3000L);
		return check;
	}

	public boolean CreateSUIEntry() throws InterruptedException {
		clickWithJS(inventory);
		click(supplierInvoice);
		click(newBtn);
		click(supplier);
		sendKeys(supplier,"E. A. (Hong Kong) Limited");
		//		sendKeys(supplier,Keys.DOWN);
		//		sendKeys(supplier,Keys.ENTER);
		Thread.sleep(5000L);
		click(currency);
		click(currencyValue);
		sendKeys(externalReference1,"Test");
		sendKeys(externalReference2,"Test");
		click(invoiceDate);
		click(invoiceDateValue);
		click(ok);
		log.info("Supplier Invoice form Created");
		Thread.sleep(3000L);
		return true;
	}
	public boolean EditSUIEntry() throws InterruptedException {
		click(inventory);
		click(supplierInvoice);
		click(selectInvoiceRow);
		click(editBtn);
		click(supplier);
		//		sendKeys(supplier,"E. A. (Hong Kong) Limited");
		//		sendKeys(supplier,Keys.DOWN);
		//		sendKeys(supplier,Keys.ENTER);
		//		Thread.sleep(10000L);
		click(currency);
		click(currencyValue);
		sendKeys(externalReference1,"Test");
		sendKeys(externalReference2,"Test");
		//		click(invoiceDate);
		//		click(invoiceDateValue);
		click(ok);
		log.info("Supplier Invoice  Edited");
		Thread.sleep(3000L);
		return true;
	}
	public void DeleteSUIEntry() throws InterruptedException {
		clickWithJS(inventory);
		Thread.sleep(3000L);
		clickWithJS(supplierInvoice);
		Thread.sleep(3000L);
		click(selectInvoiceRow);
		Thread.sleep(3000L);
		click(deleteBtn);
		Thread.sleep(3000L);
		click(yes);
		log.info("Supplier Invoice  Deleted");
		Thread.sleep(4000L);
	}

	public void SupplierInvoiceRow() throws InterruptedException {
		click(inventory);
		click(supplierInvoice);
		click(selectInvoiceRow);
		click(supplierInvoiceRowTab);
		click(selectBtnsupplierInvoiceRow);
		click(supplierOrderDropdown);
		click(supplierOrderValue);
		click(ok);
		log.info("SUI Selected");
		Thread.sleep(4000L);
		
	}
	public boolean NewTransfer() throws InterruptedException {
		click(inventory);
		click(storageTransactionMenu);
		click(newTransferBtn);
		sendKeys(product,"Test 0007514");
		sendKeys(product,Keys.DOWN);
		sendKeys(product,Keys.ENTER);
		sendKeys(storageSource,"14B1");
		sendKeys(storageSource,Keys.DOWN);
		sendKeys(storageSource,Keys.ENTER);
		sendKeys(storageDestination,"11B");
		Thread.sleep(5000L);
		//		sendKeys(storageDestination,Keys.DOWN);
		//		sendKeys(storageDestination,Keys.ENTER);
		sendKeys(quantity,"10");
		sendKeys(notes,"Test");
		click(ok);
		//		click(dismiss);
		log.info("New Transfer Created");
		Thread.sleep(4000L);
		return true;
	}
	public void CompleteStoragetoStorage() throws InterruptedException {
		clickWithJS(inventory);
		clickWithJS(storageTransactionMenu);
		Thread.sleep(3000L);
		clickWithJS(stateDropdown);
		Thread.sleep(3000L);
		clickWithJS(stateDropdownValue);
		clickWithJS(stateDropdownSelected);
		Thread.sleep(3000L);
		//		click(directionDropdown);
		//		click(directionDropdownValue);
		//		click(directionDropdownSelected);
		clickWithJS(selectIDRadioBtn);
		clickWithJS(completeBtn);
		clickWithJS(yes);
		clickWithJS(okBtn);
		log.info("Storage to storage state Completed");
		Thread.sleep(4000L);
	}
	public boolean VerifyStockTake() throws InterruptedException {
		click(inventory);
		click(storageCard);
		click(storageName);
		click(stockTab);
		click(addProductBtn);
		//		productName
		sendKeys(productName,"D11T- KIT");
		//		sendKeys(productName,Keys.DOWN);
		//		sendKeys(productName,Keys.ENTER);
		Thread.sleep(10000L);
		qty.clear();
		sendKeys(qty,"10");
		click(reasonDropdown);
		click(reasonDropdownValue);
		//		workOrder
		sendKeys(stockNotes,"test");
		click(okBtn);
		
		log.info("Add storage transaction with Stock");
		Thread.sleep(4000L);
		return true;
	}

	public boolean VerifyNotesStoragaeTransaction() throws InterruptedException {
		click(inventory);
		clickWithJS(storageTransactionMenu);
		WebElement cellAddress = driver.findElement(By.xpath("//th[@id='Notes-column']"));
		String value = cellAddress.getText();
		System.out.println("The Cell Value is : " +value);
		boolean plTest = driver.getCurrentUrl().contains("storagetransactions");
		log.info("Verify notes in storage list transaction");
		Thread.sleep(4000L);
		return plTest;
	}
	public boolean AddStorage() throws InterruptedException {
		click(inventory);
		clickWithJS(storageMenu);
		click(newBtn);
		String str = generateRandomTestName();
		sendKeys(name,str);
		click(storageType);
		click(storageTypeValue);
		clickWithJS(stockAccounting);
		click(stockAccountingValue);
		sendKeys(note,"test");
		click(ok);
		boolean plTest = driver.getCurrentUrl().contains(str);
		log.info("New Storage Created");
		Thread.sleep(10000L);
		return plTest;

	}

	public boolean EditStorage() throws InterruptedException {
		click(inventory);
		click(storageMenu);
		click(selectRadioBtn);
		click(edit);
		name.clear();
		String str = generateRandomTestName();
		name.clear();
		sendKeys(name,str);
		sendKeys(note,"test");
		click(ok);
		boolean plTest = driver.getCurrentUrl().contains(str);
		log.info("New Storage Edited");
		Thread.sleep(10000L);
		return plTest;
	}
	public void CreateChild() throws InterruptedException {
		click(inventory);
		click(storageMenu);
		click(selectRadioBtn);
		click(createChild);
		sendKeys(name,"Test");
		Thread.sleep(3000L);
		clickWithJS(storageType);
		click(storageTypeValue1);
		clickWithJS(stockAccounting);
		click(stockAccountingValue);
		sendKeys(note,"test");
		click(ok);
		log.info("New Child Created");
		Thread.sleep(3000L);

	}
	public void ChildExport() throws InterruptedException {
		click(inventory);
		click(storageMenu);
		click(selectChild);
		clickWithJS(childExport);
		log.info(" Child Exported");
		Thread.sleep(3000L);

	}
	public void StockExport() throws InterruptedException {
		click(inventory);
		click(storageMenu);
		click(selectChild);
		click(stockTab);
		Thread.sleep(3000L);
		clickWithJS(stockExport);
		log.info(" Stock Exported");
		Thread.sleep(3000L);

	}
	public void TransactionExport() throws InterruptedException {
		click(inventory);
		click(storageMenu);
		click(selectChild);
		click(transactionTab);
		Thread.sleep(3000L);
		click(transactionExport);
		log.info(" Transaction Exported");
		Thread.sleep(3000L);

	}
	public void DeleteWithStocks() throws InterruptedException {
		click(inventory);
		click(storageMenu);
		click(selectRadioBtn);
		click(deleteBtn);
		click(yesDelete);
		click(dismissBtn);
		Thread.sleep(3000L);
		log.info(" Not deleted due to stocks ");
		Thread.sleep(3000L);
	}
	public boolean AddNewStorageType() throws InterruptedException {
		click(inventory);
		click(storageTypeMenu);
		click(newBtn);
		String str = generateRandomTestName();
		sendKeys(name, str);
		click(okBtn);
		boolean plTest = driver.getCurrentUrl().contains(str);
		log.info("New Storage Type Created");
		Thread.sleep(10000L);
		return plTest;
	}

	public boolean EditStorageType() throws InterruptedException {
		click(inventory);
		click(storageTypeMenu);
		click(selectRadioBtn);
		click(editBtn);
		name.clear();
		String str = generateRandomTestName();
		sendKeys(name,str);
		click(okBtn);
		boolean plTest = driver.getCurrentUrl().contains(str);
		log.info(" Storage Type Edited");
		Thread.sleep(3000L);
		return plTest;
	}

	public void AddChild() throws InterruptedException {
		click(inventory);
		click(storageTypeMenu);
		click(selectRadioBtn);
		click(addChildBtn);
		String str = generateRandomTestName();
		sendKeys(name,str);
		click(okBtn);
		log.info(" Storage Child Added");
		Thread.sleep(3000L);
	}

	public void ExportChildren() throws InterruptedException {
		click(inventory);
		click(storageTypeMenu);
		//		click(selectRadioBtn);
		//		click(addChildBtn);
		//		sendKeys(name,"Testing");
		//		click(okBtn);
		click(exportChildren);
		log.info(" Storage Child Exported");
		Thread.sleep(10000L);
	}
	public void VerifyStock() throws InterruptedException {
		click(inventory);
		click(stockTakeMenu);
		click(stockTakeBtn);
		log.info("Stock Take Verified");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void ExportStock() throws InterruptedException {
		click(inventory);
		click(stockTakeMenu);
		click(stockTakeBtn);
		click(exportStock);
		click(location);
		click(locationValue1);
		click(locationValue2);
		click(location);
		click(okBtn);
		log.info("Export Stock");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void FileCollectionTab() throws InterruptedException {
		click(inventory);
		click(stockTakeMenu);
		click(selectStockTake);
		log.info("Verified Stock Take File Tab");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


	public boolean AddProduct() throws InterruptedException {
		click(inventory);
		clickWithJS(productMenu);
		click(newBtn);
		String str = generateRandomNumber();
		sendKeys(itemCode,str);
		String str1 = generateRandomTestName();
		sendKeys(itemName,str1);
		sendKeys(description,"test description");
		String str2 = generateRandomTestName();
		sendKeys(customerReferenceNumber,str2);
		click(type);
		click(typeValue);
		click(categories);
		click(categoriesValue);
		click(sourcing);
		click(sourcingValue);
		sendKeys(weight,"10");
		sendKeys(uom,"3");
		sendKeys(oemPartNumber,str1);
		sendKeys(brand,str);
		//		click(replenish);
		//		click(replenishValue);
		sendKeys(notes,"Test Notes");
		click(okBtn);
		boolean plTest = driver.getCurrentUrl().contains(str);
		log.info("Product Added");
		Thread.sleep(3000L);
		return plTest;
	}


	public boolean EditProduct() throws InterruptedException {
		click(inventory);
		click(productMenu);
		click(selectRadioBtn);
		click(editBtn);
		//		String str = generateRandomNumber();
		//		sendKeys(itemCode,str);
		//		String str1 = generateRandomTestName();
		//		sendKeys(itemName,str1);
		//		sendKeys(description,"test description");
		//		String str2 = generateRandomTestName();
		//		sendKeys(customerReferenceNumber,str2);
		//		click(type);
		//		click(typeValue);
		//		click(categories);
		//		click(categoriesValue);
		//		click(sourcing);
		//		click(sourcingValue);
		//		sendKeys(weight,"10");
		//		sendKeys(uom,"3");
		//		sendKeys(oemPartNumber,str1);
		//		sendKeys(brand,str);
		//		click(replenish);
		//		click(replenishValue);
		sendKeys(notes,"Test Notes");
		click(okBtn);
		boolean plTest = driver.getCurrentUrl().contains("");
		log.info("Product Edited");
		Thread.sleep(10000L);
		return plTest;

	}
	public void DeleteProduct() throws InterruptedException {
		click(inventory);
		click(productMenu);
		click(selectRadioBtn);
		click(deleteBtn);
		click(yesDeleteBtn);
		click(DismissBtn);
		log.info("Product Deleted");
		Thread.sleep(3000L);
	}

	public void CloneProduct() throws InterruptedException {
		clickWithJS(inventory);
		clickWithJS(productMenu);
		clickWithJS(selectRadioBtn);
		clickWithJS(cloneBtn);
		clickWithJS(yesDeleteBtn);
		log.info("Product Clone");
		Thread.sleep(3000L);
	}
	public void UpdateAveragePrice() throws InterruptedException {
		clickWithJS(inventory);
		click(productMenu);
		click(selectRadioBtn);
		click(updateAveragePrice);
		averagePrice.clear();
		sendKeys(averagePrice,"123");
		sendKeys(notes,"test");
		click(okBtn);
		log.info("Update Average Price");
		Thread.sleep(3000L);
	}
	public void ExportPurchase() throws InterruptedException {
		clickWithJS(inventory);
		clickWithJS(productMenu);
		click(selectRadioBtn);
		click(exportPurchase);
		click(yes1);
		click(ok);
		//		click(no);
		log.info("purchase exported");
		Thread.sleep(3000L);
	}
	public void ExportProduct() throws InterruptedException {
		click(inventory);
		click(productMenu);
		click(exportBtn);
		click(yes);
		log.info("Product Exported");
		Thread.sleep(10000L);

	}
	public void AttachmentExport() throws InterruptedException {
		click(inventory);
		click(productMenu);
		click(selectProduct);
		Thread.sleep(3000L);
		click(attachement);
		click(exportBtn2);
		Thread.sleep(3000L);
		click(ok);
		log.info("Attachment Exported");
		Thread.sleep(3000L);
	}
	public void UsedInExport() throws InterruptedException {
		click(inventory);
		click(productMenu);
		click(selectProduct);
		Thread.sleep(3000L);
		click(usedInTab);
		click(exportBtn2);
		log.info("UsedIn Exported");
		Thread.sleep(3000L);
	}
	public void ComponentExport() throws InterruptedException {
		click(inventory);
		click(productMenu);
		click(selectProduct);
		Thread.sleep(3000L);
		click(componentsTab);
		click(exportBtn2);
		log.info("Component Exported");
		Thread.sleep(3000L);
	}
	public void ProductStockExport() throws InterruptedException {
		click(inventory);
		clickWithJS(productMenu);
		click(selectProduct);
		Thread.sleep(3000L);
		click(stockTab);
		click(exportBtn2);
		log.info("Stock Exported");
		Thread.sleep(3000L);
	}
	public void ReservationExport() throws InterruptedException {
		click(inventory);
		clickWithJS(productMenu);
		click(selectProduct);
		Thread.sleep(3000L);
		click(reservationTab);
		click(exportBtn2);
		log.info("Reservation Exported");
		Thread.sleep(3000L);
	}
	public void ProductTransactionExport() throws InterruptedException {
		click(inventory);
		click(productMenu);
		click(selectProduct);
		Thread.sleep(3000L);
		click(transactionsTab);
		Thread.sleep(3000L);
		click(exportBtn);
		log.info("Product Transaction Exported");
		Thread.sleep(3000L);
	}
	public void VerifyHistory() throws InterruptedException {
		click(inventory);
		click(productMenu);
		click(selectProduct);
		click(historyTab);
		log.info("History Verified");
		Thread.sleep(3000L);
	}
	public void SearchMatch() throws InterruptedException {
		click(inventory);
		click(productMenu);
		click(search);
		sendKeys(search,"027758");
		log.info("Matched");
		Thread.sleep(3000L);

	}
	public void SearchNoMatch() throws InterruptedException {
		click(inventory);
		click(productMenu);
		click(search);
		sendKeys(search,"123456");
		log.info("Not Matched");
		Thread.sleep(3000L);

	}
	public void ComponentAdd() throws InterruptedException {
		click(inventory);
		click(productMenu);
		click(selectProduct);
		Thread.sleep(3000L);
		click(componentsTab);
		click(addBtn);
		sendKeys(productName,"A00123-42000");
		Thread.sleep(5000L);
		//		sendKeys(productName,Keys.DOWN);
		quantity.clear();
		sendKeys(quantity,"5");
		click(okBtn);
		log.info("Component Added");
		Thread.sleep(3000L);

	}
	public void ComponentEdit() throws InterruptedException {
		click(inventory);
		click(productMenu);
		click(selectProduct);
		click(componentsTab);
		click(editBtn);
		sendKeys(notes,"test");
		click(okBtn);
		log.info("Component Edited");
		Thread.sleep(3000L);

	}
	public void ComponentDelete() throws InterruptedException {
		click(inventory);
		click(productMenu);
		click(selectProduct);
		click(componentsTab);
		click(deleteBtn);
		click(yesBtn);
		log.info("Component Deleted");
		Thread.sleep(3000L);
	}
	public boolean StockAddStorage() throws InterruptedException {
		click(inventory);
		click(productMenu);
		click(selectProduct);
		Thread.sleep(3000L);
		click(stockTab);
		click(addStorageBtn);
		sendKeys(storageName,"SR01");
		Thread.sleep(5000L);
		quantity.clear();
		sendKeys(quantity,"5");
		click(reason);
		click(reasonValue);
		sendKeys(workOrder,"MRF-00000085");
		click(okBtn);
		boolean plTest = driver.getCurrentUrl().contains("Stocks");
		log.info("Storage Added");
		Thread.sleep(10000L);
		return plTest;
	}
	public boolean AddProductCategory() throws InterruptedException {
		click(inventory);
		click(productCategoryMenu);
		click(newBtn);
		String strName=generateRandomTestName();
		sendKeys(name,strName);
		sendKeys(description,"testing");
		click(stockDeductionSelect);
		click(stockDeductionSelectValue);
		//		click(bomUploadSelect);
		//		click(bomUploadSelectValue);
		click(okBtn);
		boolean plTest = driver.getCurrentUrl().contains(strName);
		log.info("Product Categories Added");
		Thread.sleep(3000L);
		return plTest;
	}
	public boolean EditProductCategory() throws InterruptedException {
		click(inventory);
		click(productCategoryMenu);
		click(selectProductCategories);
		click(editBtn);
		description.clear();
		sendKeys(description,"testing");
		click(okBtn);
		//		click(yes);
		boolean plTest = driver.getCurrentUrl().contains("");
		log.info("Product Categories Edited");
		Thread.sleep(3000L);
		return plTest;

	}
	public void ExportProductCategory() throws InterruptedException {
		clickWithJS(inventory);
		clickWithJS(productCategoryMenu);
		click(exportBtn);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("Product Categories Exported");
		Thread.sleep(3000L);

	}
	public void SearchMatchProductCategory() throws InterruptedException {
		click(inventory);
		click(productCategoryMenu);
		sendKeys(inputSearch,"alarms");
		log.info("Record Matched");
		Thread.sleep(3000L);

	}
	public void SearchUnMatchProductCategory() throws InterruptedException {
		click(inventory);
		click(productCategoryMenu);
		sendKeys(inputSearch,"abcd");
		log.info("Record Unmatched");
		Thread.sleep(3000L);
	}
	public void SortProductCategory() throws InterruptedException {
		clickWithJS(inventory);
		clickWithJS(productCategoryMenu);
		click(nameColumn);
		log.info("Record Sorted");
		Thread.sleep(3000L);
	}
	public void VerifyHistoryProductCategory() throws InterruptedException {
		clickWithJS(inventory);
		click(productCategoryMenu);
		Thread.sleep(2000L);
		click(selectProductValue);
		Thread.sleep(3000L);
		click(historyTab);
		log.info("Verify Product category");
		Thread.sleep(3000L);
	}
	public void DeleteProductCategory() throws InterruptedException {
		click(inventory);
		click(productCategoryMenu);
		click(selectProductCategories);
		click(deleteBtn);
		click(yesBtn);
		log.info("Product Categories Deleted ");
		Thread.sleep(4000L);
	}

}
