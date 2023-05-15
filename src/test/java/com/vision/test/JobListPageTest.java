package com.vision.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.vision.generics.TestBase;
import com.vision.pageObjects.JobListPage;
import com.vision.pageObjects.LoginPage;

public class JobListPageTest extends TestBase{
	
	
	SoftAssert sa=new SoftAssert();
	
	@Test(retryAnalyzer = com.vision.generics.RetryAnalyzer.class)
	public void JobListtest() {
		LoginPage lp = new LoginPage(TestBase.driver);
		sa.assertTrue(lp.positiveLoginTest());
		
		JobListPage jp=new JobListPage(TestBase.driver);
		sa.assertTrue(jp.goToJobList());
		sa.assertTrue(jp.searchForJob());
		jp.openWO();
		
	}
	
	

}
