package com.vision.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vision.generics.GeneralFunctions;

public class LoginPage extends GeneralFunctions {

	public WebDriver driver;
	public static Logger log = Logger.getLogger(LoginPage.class);

	private String username = "Emmanuelk";
	private String pass = "emmanuelk";

	@FindBy(xpath = "//input[@id='username']")
	private WebElement id;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;

	@FindBy(xpath = "//button[@id='login']")
	private WebElement signIn;

	@FindBy(xpath = "//*[contains(text(),'Incorrect username or password')]")
	private WebElement errorMsg;

	@FindBy(xpath = "//span[contains(text(),'Dismiss')]")
	private WebElement newVersionMsgDismiss;

	@FindBy(xpath = "//span[@id='logoutButton']")
	private WebElement logout;

	@FindBy(xpath = "//h5[contains(text(),'Log in')]")
	private WebElement logoutVerify;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean positiveLoginTest() {
		sendKeys(id, username);
		sendKeys(password, pass);
		click(signIn);
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean plTest = driver.getCurrentUrl().contains("dashboard");
		log.info("Sign-In is Done.");
		try {
			Thread.sleep(3000L);
			newVersionMsgDismiss.click();
		} catch (Exception e) {
		}
		return plTest;
	}

	public boolean negativeLoginTest() {
		sendKeys(id, "Testing");
		sendKeys(password, "Testing");
		click(signIn);
		boolean nlTest = visibilityCheck(errorMsg);
		log.info("Negative SignIn is Verified.");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return nlTest;
	}

	public boolean signOut() {
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(logout);
		boolean logoutVfy = driver.getCurrentUrl().contains("login");
		log.info("LogOut is Done.");
		return logoutVfy;

	}

}
