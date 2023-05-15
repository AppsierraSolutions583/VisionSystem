package com.vision.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vision.generics.GeneralFunctions;

public class OutstandingOrdersPage extends GeneralFunctions {

	public WebDriver driver;
	public static Logger log = Logger.getLogger(OutstandingOrdersPage.class);

	@FindBy(xpath = "//span[text()='Production']")
	private WebElement Producion;
	
	@FindBy(xpath = "//*[text()='Outstanding Orders']")
	private WebElement Outstanding;
	
	@FindBy(xpath = "//body/cristalise-root[1]/div[1]/div[3]/cristalise-orders[1]/div[1]/div[1]/p-table[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement PO_Search;
	
	@FindBy(xpath = "(//span[@class='ui-radiobutton-icon ui-clickable'])[1]")
	private WebElement Radio1;
	
	@FindBy(xpath = "(//span[@class='ui-radiobutton-icon ui-clickable'])[2]")
	private WebElement Radio2;
	
	@FindBy(xpath = "//a[@href=\"#/hmws/workorders/WOM-00070939\"]")
	private WebElement eyebtn;
	
	@FindBy(xpath = "//span[text()='Progress']")
	private WebElement Progress;
	
	@FindBy(xpath = "//span[text()='Costing']")
	private WebElement Costing;
	
	@FindBy(xpath = "//span[text()='Children']")
	private WebElement Children;
	
	@FindBy(xpath = "//span[text()='Purchase Order Rows']")
	private WebElement Purchase;
	
	@FindBy(xpath = "//span[text()='Reservations']")
	private WebElement Reserve;
	
	@FindBy(xpath = "//span[text()='Transactions']")
	private WebElement Trans;
	
	@FindBy(xpath = "(//span[text()='Timekeeping'] )[3]")
	private WebElement Timekeep;
	
	@FindBy(xpath = "//span[text()='Production Workflow']")
	private WebElement Production;
	
	@FindBy(xpath = "//span[text()='Attachments']")
	private WebElement Attach;
	

	public OutstandingOrdersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Methods
	public void gotoOutstanding() {
		click(Producion);
		click(Outstanding);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void searchPO() {
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sendKeys(PO_Search, "16661");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(Radio1);
	}

	public void gotoI() {
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(Radio2);
		click(eyebtn);
	}

	public void checktabs() {
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(Progress);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(Costing);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(Children);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(Purchase);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(Reserve);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(Trans);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(Timekeep);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(Production);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(Attach);
	}
}
