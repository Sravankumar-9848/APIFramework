package com.api.models.listeners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener {
  private static final Logger logger=LogManager.getLogger(TestListeners.class);
  
	public void onStart(ITestContext context) {
		logger.info("Started");
	}
	  public void onTestStart(ITestResult result) {
		  logger.info("Test suite Started");
		  }
	public void onFinish(ITestContext context) {
		logger.info("Test suite Completed");
	}
	public void onTestSuccess(ITestResult result) {
		logger.info("Test suite Passed");
		logger.info("Description"+result.getMethod().getMethodName());
		
	}
	public void onTestFailure(ITestResult result) {
		logger.info("failed"+result.getMethod().getMethodName());
	}



	public void onTestSkipped(ITestResult result) {
		logger.info("Skipped"+result.getMethod().getMethodName());
	}
}
