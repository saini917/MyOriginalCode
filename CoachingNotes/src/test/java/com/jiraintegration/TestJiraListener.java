package com.jiraintegration;

import org.apache.commons.httpclient.util.ExceptionUtil;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestJiraListener implements ITestListener {

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestFailure(ITestResult result) {
		JiraPolicyUtility jiraPolicy = result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(JiraPolicyUtility.class);
		boolean isTicketReady = jiraPolicy.logTicketReady();
		if(isTicketReady){
			//raise jira ticket
			System.out.println("is ticket ready for JIRA: " +isTicketReady);
			
			JiraServiceProvider jiraSP= new JiraServiceProvider("url", "username", "password", "project name");
			String issueSummary=result.getMethod().getConstructorOrMethod().getMethod().getName() +"got failed due to some reason";
			String issueDescription= result.getThrowable().getMessage() +"\n";
			issueDescription.concat(ExceptionUtils.getFullStackTrace(result.getThrowable()));
			jiraSP.createJiraTicket("Bug", issueSummary, issueDescription, "deepak");
		}
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

}
