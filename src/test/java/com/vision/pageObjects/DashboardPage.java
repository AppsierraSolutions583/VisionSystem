package com.vision.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vision.generics.GeneralFunctions;

public class DashboardPage extends GeneralFunctions {

	public WebDriver driver;
	public static Logger log = Logger.getLogger(DashboardPage.class);

	@FindBy(xpath = "//span[contains(text(),'Dashboard')]")
	private WebElement dashboard;

	@FindBy(xpath = "//span[contains(text(),'In-Progress WOs')]")
	private WebElement inProgressWO;

	@FindBy(xpath = "//span[contains(text(),'Completed WOs')]")
	private WebElement completedWo;

	@FindBy(xpath = "//span[contains(text(),'Completed WOs')]")
	private WebElement cancelledWO;

	@FindBy(xpath = "//span[contains(text(),'New WOs')]")
	private WebElement newWO;

	@FindBy(xpath = "//span[contains(text(),'Total WO')]")
	private WebElement totalWO;

	@FindBy(xpath = "//span[contains(@class,'singleSummaryCount ')]")
	private WebElement numbertotalWO;

	@FindBy(xpath = "//div[@id='item1']/div/div[2]/span[2]")
	private WebElement numberInProgressWO;

	@FindBy(xpath = "//div[@id='item2']/div/div[2]/span[2]")
	private WebElement totalCompletedWO;

	@FindBy(xpath = "//div[@id='item3']/div/div[2]/span[2]")
	private WebElement totalCancelledWO;

	@FindBy(xpath = "//div[@id='item0']/div/div[2]/span[2]")
	private WebElement totalNewWO;

	@FindBy(xpath = "//span[contains(text(),'Total Shipments')]")
	private WebElement totalShipment;

	@FindBy(xpath = "//span[contains(text(),'Total Lacking Parts')]")
	private WebElement totalLackingPart;

	@FindBy(xpath = "//span[@class='topbar-search']/input")
	private WebElement searchBar;

	@FindBy(xpath = "(//a[@href=\"#\"])[4]")
	private WebElement filter;

	@FindBy(xpath = "//webuilib-uuid-link[@id='ID']//span[@id='plainText']")
	private WebElement idWO;

	@FindBy(xpath = "//button[@id='WIRE MARKING']")
	private WebElement wireMarking;

	@FindBy(xpath = "//button[@id='Dismiss']")
	private WebElement dismiss;

	@FindBy(xpath = "(//div[contains(@class,'fieldBox')]//span/a)[2]")
	private WebElement getCustomer;

	@FindBy(xpath = "(//div[contains(@class,'fieldBox')]//span/a)[1]")
	private WebElement getProduct;

	@FindBy(xpath = "(//div[contains(@class,'fieldBox')]//span[@id='plainText'])[1]")
	private WebElement getFlow;

	@FindBy(xpath = "(//div[contains(@class,'fieldBox')]//span[@id='plainText'])[2]")
	private WebElement getWOQuantity;

	@FindBy(xpath = "(//div[contains(@class,'fieldBox')]//span[@id='plainText'])[3]")
	private WebElement getShipmentDate;

	@FindBy(xpath = "//li[contains(@class,'ui-steps-item Current')]/a/span[2]")
	private WebElement currentStep;

	@FindBy(xpath = "//webuilib-uuid-link[@id='Type']/span")
	private WebElement typeOfWO;

	// Filter

	@FindBy(xpath = "//tbody//tr//td/a[text()='1']")
	private WebElement calnderFirstDate;

	@FindBy(xpath = "//span[contains(text(),'Today')]/parent::button")
	private WebElement calnderToday;

	@FindBy(xpath = "(//button[contains(@class,'ui-calendar-button')])[1]")
	private WebElement calender1;
	@FindBy(xpath = "(//button[contains(@class,'ui-calendar-button')])[2]")
	private WebElement calender2;

	@FindBy(xpath = "//span[contains(text(),'FLOW')]")
	private WebElement flowFilter;

	@FindBy(xpath = "//span[text()='ALL']")
	private WebElement all;

	@FindBy(xpath = "//span[text()='New']")
	private WebElement nw;

	@FindBy(xpath = "//span[text()='Battery Cable']")
	private WebElement batteryCable;

	@FindBy(xpath = "//span[text()='Harness Enclosure']")
	private WebElement harnessEnclosure;

	@FindBy(xpath = "//span[text()='KIT']")
	private WebElement kit;

	@FindBy(xpath = "//span[text()='MFA']")
	private WebElement mfa;

	@FindBy(xpath = "//span[text()='MFA(Brackets)']")
	private WebElement mfaBrackets;

	@FindBy(xpath = "//span[text()='MFA(HMA)']")
	private WebElement mfaHma;

	@FindBy(xpath = "//span[text()='MFA(HME)']")
	private WebElement mfaHme;

	@FindBy(xpath = "//span[text()='PARTS']")
	private WebElement parts;

	@FindBy(xpath = "//span[text()='PRO1']")
	private WebElement pro1;

	@FindBy(xpath = "//span[text()='PRO2']")
	private WebElement pro2;

	@FindBy(xpath = "//span[text()='Replacement Harness']")
	private WebElement replacementHarness;

	@FindBy(xpath = "//span[text()='Dummy']")
	private WebElement dummy;

	@FindBy(xpath = "//span[text()='Cancelled']")
	private WebElement cancelled;

	// Apply button

	@FindBy(xpath = "//span[text()='Apply']")
	private WebElement apply;

	// Work order
	@FindBy(xpath = "//button[@id='redirectButton']/span[text()='Work Orders']")
	private WebElement workOrder;
	
	

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean verifyDisplayOfAllElements() {
		boolean verifyAll = false;
		boolean inProgress = visibilityCheck(inProgressWO);
		boolean completed = visibilityCheck(completedWo);
		boolean cancelled = visibilityCheck(cancelledWO);
		boolean newWork = visibilityCheck(newWO);
		boolean total = visibilityCheck(totalWO);
		boolean totalship = visibilityCheck(totalShipment);
		boolean totalLacking = visibilityCheck(totalLackingPart);

		if (inProgress && completed && cancelled && newWork && total && totalship && totalLacking) {
			verifyAll = true;
			log.info("Everything on Dashboard Is Displayed.");
		}

		return verifyAll;
	}

	public void useFilter(WebElement element) {

		click(flowFilter);
		try {
			Thread.sleep(2000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(element);
		click(calender1);
		try {
			Thread.sleep(1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(calnderFirstDate);
		click(calender2);
		try {
			Thread.sleep(1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(calnderToday);
		click(apply);
		try {
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String name = collectText(flowFilter);
		log.info("Filter applied for : "+name);
		getData(totalWO, numbertotalWO);
		getData(newWO, totalNewWO);
		getData(completedWo, totalCompletedWO);
		getData(cancelledWO, totalCancelledWO);
	}

	public void applyFilters() {
		useFilter(all);
		useFilter(nw);
		useFilter(batteryCable);
		useFilter(harnessEnclosure);
		useFilter(kit);
		useFilter(mfa);
		useFilter(mfaBrackets);
		useFilter(mfaHma);
		useFilter(parts);
		useFilter(pro1);
		useFilter(pro2);
		useFilter(replacementHarness);

	}

	public void getData(WebElement element1, WebElement element2) {

		String filtername = collectText(flowFilter);
		String name = collectText(element1);
		String value = collectText(element2);
		log.info("The Number of " + name + "for " + filtername + " is : " + value);

	}
	
	public boolean gotoWorkOrderFromDashboard() {
		click(dashboard);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		click(workOrder);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean flag=driver.getCurrentUrl().contains("workorders");
		return flag;
	}

	public boolean searchWO() {

		sendKeys(searchBar, "56968");
		log.info("Searched for work order 56968.");
		searchBar.sendKeys(Keys.ENTER);
		boolean flag=chechTextContains(idWO, "56968");
		try {
			Thread.sleep(6000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		log.info("ID :" + collectText(idWO));
		log.info("Type Of Work Order :" + collectText(typeOfWO));
		log.info("Product :" + collectText(getProduct));
		log.info("Customer :" + collectText(getCustomer));
		log.info("Flow :" + collectText(getFlow));
		log.info("Work Order Quantity :" + collectText(getWOQuantity));
		log.info("Shipment Date :" + collectText(getShipmentDate));
		log.info("Currently Running Step is :" + collectText(currentStep));

		return flag;
	}

}
