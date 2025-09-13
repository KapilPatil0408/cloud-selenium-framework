package com.ui.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.constants.Env;
import com.utility.JSONUtility;
import com.utility.PropertiesUtil;

public class RetryAnalyzer implements IRetryAnalyzer{

//	private static final int MAXIMUN_NUMBER_OF_ATTEMPTS= Integer.parseInt(PropertiesUtil.readProperties(Env.QA, "MAXIMUN_NUMBER_OF_ATTEMPTS"));
	
	private static final int MAXIMUN_NUMBER_OF_ATTEMPTS= JSONUtility.readJson(Env.QA).getMAXIMUN_NUMBER_OF_ATTEMPTS();	
	private static int currentAttempt=1;
	
	@Override
	public boolean retry(ITestResult result) {
		if(currentAttempt <= MAXIMUN_NUMBER_OF_ATTEMPTS) {
			currentAttempt++;
			return true;
		}
		return false;
	}

}
