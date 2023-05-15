package com.vision.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.vision.generics.TestBase;
import com.vision.pageObjects.LoginPage;

public class LoginPageTest extends TestBase {

	SoftAssert sa=new SoftAssert();
	

	@Test(retryAnalyzer = com.vision.generics.RetryAnalyzer.class)
	public void LoginModule() {
		
		
		
		LoginPage lp=new LoginPage(TestBase.driver);
		sa.assertTrue(lp.negativeLoginTest());
		sa.assertTrue(lp.positiveLoginTest());
		lp.signOut();
		
	}
	
	

}
