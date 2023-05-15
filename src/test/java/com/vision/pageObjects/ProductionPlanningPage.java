package com.vision.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.vision.generics.GeneralFunctions;

public class ProductionPlanningPage extends GeneralFunctions{
	public WebDriver driver;
	public static Logger log = Logger.getLogger(ProductionPlanningPage.class);
	
	//new version dismiss message
	@FindBy(xpath = "//span[contains(text(),'Dismiss')]")
	private WebElement newVersionMsgDismiss;
	
	//production planning page
	@FindBy(xpath = "//span[normalize-space()='Production Planning']")
	private WebElement productionPlanningPage;
	
	
	@FindBy(xpath = "//*[@id=\"ui-tabpanel-0\"]/cristalise-gantt/div/div[1]/div[1]/p-selectbutton/div/div[1]/div/span")
	private WebElement ProductionPlanningMinute;
	
	@FindBy(xpath = "//*[@id=\"ui-tabpanel-0\"]/cristalise-gantt/div/div[1]/div[1]/p-selectbutton/div/div[2]/div/span")
	private WebElement ProductionPlanningHour;
	
	@FindBy(xpath = "//*[@id=\"ui-tabpanel-0\"]/cristalise-gantt/div/div[1]/div[1]/p-selectbutton/div/div[4]/div/span")
	private WebElement ProductionPlanningWeek;
	
	@FindBy(xpath = "//*[@id=\"ui-tabpanel-0\"]/cristalise-gantt/div/div[1]/div[1]/p-selectbutton/div/div[5]/div/span")
	private WebElement ProductionPlanningMonth;
	
	@FindBy(xpath = "//*[@id=\"ui-tabpanel-0\"]/cristalise-gantt/div/div[1]/div[2]/p-multiselect[1]/div/div[3]")
	private WebElement productionPlanningSelectWorkOrderDropdown;
	
	@FindBy(xpath = "//*[@id=\"ui-tabpanel-0\"]/cristalise-gantt/div/div[1]/div[2]/p-multiselect[1]/div/div[4]/div[2]/ul/p-multiselectitem[1]/li/span")
	private WebElement productionPlanningSelectWorkOrderDropdownValue;
	
	@FindBy(xpath = "//*[@id=\"ui-tabpanel-0\"]/cristalise-gantt/div/div[1]/div[2]/p-multiselect[1]/div/div[4]/div[1]/div[2]/input")
	private WebElement productionPlanningSelectWorkOrderSearch;
	
	@FindBy(xpath = "//*[@id=\"ui-tabpanel-0\"]/cristalise-gantt/div/div[1]/div[2]/p-multiselect[2]/div/div[3]/span")
	private WebElement productionPlanningSelectCustomerDropdown;
	
	@FindBy(xpath = "//*[@id=\"ui-tabpanel-0\"]/cristalise-gantt/div/div[1]/div[2]/p-multiselect[2]/div/div[4]/div[2]/ul/p-multiselectitem[1]/li")
	private WebElement productionPlanningSelectCustomerValue;
	
	@FindBy(xpath="//*[@id=\"ui-tabpanel-0\"]/cristalise-gantt/div/div[1]/div[2]/p-multiselect[3]/div/div[3]/span")
	private WebElement productionPlanningSelectFlowDropdown;
	
	@FindBy(xpath="//*[@id=\"ui-tabpanel-0\"]/cristalise-gantt/div/div[1]/div[2]/p-multiselect[3]/div/div[4]/div[2]/ul/p-multiselectitem[1]/li")
	private WebElement productionPlanningSelectFlowDropdownValue;
	
	@FindBy(xpath = "/html/body/cristalise-root/div/div[3]/cristalise-production-planning/div/div/div[1]/span[1]/p-button/button")
	private WebElement productionPlanningShowBtn;
	
	@FindBy(xpath = "/html/body/cristalise-root/div/div[3]/cristalise-production-planning/div/div/div[1]/span[1]/p-button/button/span[1]")
	private WebElement productionPlanningHideBtn;
	
	@FindBy(xpath = "/html/body/cristalise-root/div/div[3]/cristalise-production-planning/div/div/div[1]/span[2]/p-button/button/span[1]")
	private WebElement productionPlanningExpandTaskBtn;
	
	@FindBy(xpath = "/html/body/cristalise-root/div/div[3]/cristalise-production-planning/div/div/div[1]/span[2]/p-button/button/span[1]")
	private WebElement productionPlanningCollpaseTaskBtn;
	
	
	@FindBy(xpath = "/html/body/cristalise-root/div/div[3]/cristalise-production-planning/div/div/div[1]/span[3]/p-button/button/span[1]")
	private WebElement productionPlanningRefreshBtn;
	
	@FindBy(xpath = "/html/body/cristalise-root/div/div[3]/cristalise-production-planning/div/div/div[1]/span[5]/p-button/button/span[1]")
	private WebElement productionPlanningShowResourceUsageBtn;
	
	@FindBy(xpath="")
	private WebElement productionPlanningDemo;
	
	@FindBy(xpath="//*[@id=\"ui-tabpanel-0\"]/cristalise-gantt/div/div[3]/div/div/div[1]/div[1]/div/div/div[2]/div[1]/div/div[1]")
	private WebElement productionPlanningPlusTaskName;
	
	@FindBy(xpath="//*[@id=\"ui-tabpanel-0\"]/cristalise-gantt/div/div[3]/div/div/div[1]/div[1]/div/div/div[2]/div[1]/div/div[1]")
	private WebElement productionPlanningNegativeTaskName;
	
	public ProductionPlanningPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean ProductionPlanningOpen() {
		click(productionPlanningPage);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains("productionPlanning");
		log.info("Production planning page is open");
		try {
			Thread.sleep(3000L);
			newVersionMsgDismiss.click();
		} catch (Exception e) {
		}
		return plTest;
	}
	public boolean ProductionPlanningMinute() {
		click(productionPlanningPage);
		click(ProductionPlanningMinute);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains("productionPlanning");
		log.info("Production planning minute button work successfully.");
		try {
			Thread.sleep(3000L);
			newVersionMsgDismiss.click();
		} catch (Exception e) {
		}
		return plTest;
	}
	public boolean ProductionPlanningHour(){
		click(productionPlanningPage);
		click(ProductionPlanningHour);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains("productionPlanning");
		log.info("Production planning hour button work successfully.");
		try {
			Thread.sleep(3000L);
			newVersionMsgDismiss.click();
		} catch (Exception e) {
		}
		return plTest;
	}
	
	public boolean ProductionPlanningWeek(){
		click(productionPlanningPage);
		click(ProductionPlanningWeek);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains("productionPlanning");
		log.info("Production planning week button work successfully.");
		try {
			Thread.sleep(3000L);
			newVersionMsgDismiss.click();
		} catch (Exception e) {
		}
		return plTest;
	}
	
	public boolean ProductionPlanningMonth(){
		click(productionPlanningPage);
		System.out.println("Jawed");
		click(ProductionPlanningMonth);
		System.out.println("Alam");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains("productionPlanning");
		log.info("Production planning month button work successfully.");
		try {
			Thread.sleep(3000L);
			newVersionMsgDismiss.click();
		} catch (Exception e) {
		}
		return plTest;
	}
	public boolean ProductionPlanningSelectWorkOrder(){
		click(productionPlanningPage);
		click(productionPlanningSelectWorkOrderDropdown);
		click(productionPlanningSelectWorkOrderDropdownValue);
		click(productionPlanningSelectWorkOrderDropdown);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains("productionPlanning");
		log.info("Production planning work order Selected  successfully.");
		try {
			Thread.sleep(3000L);
			newVersionMsgDismiss.click();
		} catch (Exception e) {
		}
		return plTest;
	}
	public boolean ProductionPlanningSelectCustomer(){
		click(productionPlanningPage);
		click(productionPlanningSelectCustomerDropdown);
		click(productionPlanningSelectCustomerValue);
		click(productionPlanningSelectCustomerDropdown);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains("productionPlanning");
		log.info("Production planning Select Customer Selected  successfully.");
		try {
			Thread.sleep(3000L);
			newVersionMsgDismiss.click();
		} catch (Exception e) {
		}
		return plTest;
	}
	public boolean ProductionPlanningSelectFlow(){
		click(productionPlanningPage);
		click(productionPlanningSelectFlowDropdown);
		click(productionPlanningSelectFlowDropdownValue);
		click(productionPlanningSelectFlowDropdown);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains("productionPlanning");
		log.info("Production planning select flow selected  successfully.");
		try {
			Thread.sleep(3000L);
			newVersionMsgDismiss.click();
		} catch (Exception e) {
		}
		return plTest;
	}
	public boolean ProductionPlanningShow(){
		click(productionPlanningPage);
		click(productionPlanningShowBtn);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains("productionPlanning");
		log.info("Production planning show functionality work  successfully.");
		try {
			Thread.sleep(3000L);
			newVersionMsgDismiss.click();
		} catch (Exception e) {
		}
		return plTest;
	}
	public boolean ProductionPlanningExpandTask(){
		click(productionPlanningPage);
		click(productionPlanningExpandTaskBtn);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains("productionPlanning");
		log.info("Production planning expand task work  successfully.");
		try {
			Thread.sleep(3000L);
			newVersionMsgDismiss.click();
		} catch (Exception e) {
		}
		return plTest;
	}
	
	public boolean ProductionPlanningRefresh(){
		click(productionPlanningPage);
		click(productionPlanningRefreshBtn);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains("productionPlanning");
		log.info("Production planning refresh button work  successfully.");
		try {
			Thread.sleep(3000L);
			newVersionMsgDismiss.click();
		} catch (Exception e) {
		}
		return plTest;
	}
	
	public boolean ProductionPlanningShowResourceUsage(){
		click(productionPlanningPage);
		click(productionPlanningShowResourceUsageBtn);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains("productionPlanning");
		log.info("Production planning show resource usage button successfully.");
		try {
			Thread.sleep(3000L);
			newVersionMsgDismiss.click();
		} catch (Exception e) {
		}
		return plTest;
	}
	public boolean ProductionPlanningPlusTaskName(){
		click(productionPlanningPage);
		click(productionPlanningPlusTaskName);
		click(productionPlanningNegativeTaskName);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains("productionPlanning");
		log.info("Production planning expand task name work  successfully.");
		try {
			Thread.sleep(3000L);
			newVersionMsgDismiss.click();
		} catch (Exception e) {
		}
		return plTest;
	}

}
