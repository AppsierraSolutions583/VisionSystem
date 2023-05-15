package com.vision.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vision.generics.GeneralFunctions;

public class AnalyticsPage extends GeneralFunctions {

	public WebDriver driver;
	public static Logger log = Logger.getLogger(AnalyticsPage.class);

	@FindBy(xpath = "//span[text()[contains(.,'TYPE')]]")
	private WebElement type;

	@FindBy(xpath = "//p-menubarsub/ul/li/a/span[text()='Timekeeping']")
	private WebElement timeKeeping;

	@FindBy(xpath = "//p-menubarsub/ul/li/a/span[text()='WorkOrder']")
	private WebElement workOrder;

	// flow filter

	@FindBy(xpath = "//span[text()[contains(.,'FLOW')]]")
	private WebElement flowAll;

	@FindBy(xpath = "//span[text()='ALL']")
	private WebElement all;

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

	// week filter
	@FindBy(xpath = "//span[text()='Week']")
	private WebElement week;

	@FindBy(xpath = "//span[text()='Current Week']")
	private WebElement currentWeek;

	@FindBy(xpath = "//span[text()='Week 1']")
	private WebElement week1;

	@FindBy(xpath = "//span[text()='Week 2']")
	private WebElement week2;

	@FindBy(xpath = "//span[text()='Week 3']")
	private WebElement week3;

	@FindBy(xpath = "//span[text()='Week 4']")
	private WebElement week4;

	@FindBy(xpath = "//span[text()='Week 5']")
	private WebElement week5;

	// month filter
	@FindBy(xpath = "//span[text()='Month']")
	private WebElement month;

	@FindBy(xpath = "//span[text()='Current Month']")
	private WebElement currentMonth;

	@FindBy(xpath = "//span[text()='May 2022']")
	private WebElement may2022;

	@FindBy(xpath = "//span[text()='April 2022']")
	private WebElement april2022;

	@FindBy(xpath = "//span[text()='March 2022']")
	private WebElement march2022;

	@FindBy(xpath = "//span[text()='February 2022']")
	private WebElement february2022;

	@FindBy(xpath = "//span[text()='January 2022']")
	private WebElement january2022;

	@FindBy(xpath = "//span[text()='December 2021']")
	private WebElement december2021;

	@FindBy(xpath = "//span[text()='November 2021']")
	private WebElement november2021;

	@FindBy(xpath = "//span[text()='October 2021']")
	private WebElement october2021;

	@FindBy(xpath = "//span[text()='September 2021']")
	private WebElement september2021;

	@FindBy(xpath = "//span[text()='August 2021']")
	private WebElement august2021;

	@FindBy(xpath = "//span[text()='July 2021']")
	private WebElement july2021;

	@FindBy(xpath = "//span[text()='June 2021']")
	private WebElement june2021;

	@FindBy(xpath = "//span[text()='May 2021']")
	private WebElement may2021;

	// year filter
	@FindBy(xpath = "//span[text()='Year']")
	private WebElement year;

	@FindBy(xpath = "//span[text()='Current Year']")
	private WebElement currentYear;

	@FindBy(xpath = "//span[text()='2021']")
	private WebElement year2021;

	@FindBy(xpath = "//span[text()='2020']")
	private WebElement year2020;

	@FindBy(xpath = "//span[text()='2019']")
	private WebElement year2019;

	// apply button
	@FindBy(xpath = "//span[text()='Apply']")
	private WebElement applybtn;

	// frame

	// table

	@FindBy(xpath = "//span[text()='Work Order Duration Based on Shipment Date (dd hh mm ss)']")
	private WebElement WorkOrderDurationBasedonShipmentDate;

	@FindBy(xpath = "//table[@class='ui-table-scrollable-header-table']/thead/tr/th[1]")
	private WebElement flow;

	@FindBy(xpath = "//table[@class='ui-table-scrollable-header-table']/thead/tr/th[2]")
	private WebElement totalWorkOrderDuration;

	@FindBy(xpath = "//table[@class='ui-table-scrollable-header-table']/thead/tr/th[3]")
	private WebElement workOrderCount;
	@FindBy(xpath = "//tbody//tr//td/a[text()='1']")
	private WebElement calnderFirstDate;

	@FindBy(xpath = "//span[contains(text(),'Today')]/parent::button")
	private WebElement calnderToday;

	@FindBy(xpath = "(//button[contains(@class,'ui-calendar-button')])[1]")
	private WebElement calender1;
	@FindBy(xpath = "(//button[contains(@class,'ui-calendar-button')])[2]")
	private WebElement calender2;
	@FindBy(xpath = "//span[text()='Apply']")
	private WebElement apply;
	
	@FindBy(xpath = "//span[normalize-space()='Analytics']")
	private WebElement analytics;
	

	public AnalyticsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void goToAnalytics() {
		click(analytics);
		try {
			Thread.sleep(2000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("Landed on Analytics Page");
	}
	
	public void useFilter(WebElement element) {

		click(flowAll);
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
	}
	
	public void applyFlowFilters() {
		useFilter(all);
		log.info("Used Filter for all");
		useFilter(batteryCable);
		log.info("Used Filter for batteryCable");
		useFilter(harnessEnclosure);
		log.info("Used Filter for harnessEnclosure");
		useFilter(kit);
		log.info("Used Filter for kit");
		useFilter(mfa);
		log.info("Used Filter for mfa");
		useFilter(mfaBrackets);
		log.info("Used Filter for mfaBrackets");
		useFilter(mfaHma);
		log.info("Used Filter for mfaHma");
		useFilter(pro1);
		log.info("Used Filter for pro1");
		useFilter(pro2);
		log.info("Used Filter for pro2");
		useFilter(replacementHarness);
		log.info("Used Filter for replacementHarness");

	}
	
	public void totalFilter() {
		click(type);
		try {
			Thread.sleep(2000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(workOrder);
		try {
			Thread.sleep(2000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		applyFlowFilters();
		try {
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(type);
		try {
			Thread.sleep(2000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(timeKeeping);
		try {
			Thread.sleep(2000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		applyFlowFilters();
		try {
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
}
