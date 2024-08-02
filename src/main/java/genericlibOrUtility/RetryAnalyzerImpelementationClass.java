package genericlibOrUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
/*
 * this class will run only if any Test case is fail. 
 * we intentionally failed contact  TC by giving wrong path in contactPage class.
 */
public class RetryAnalyzerImpelementationClass implements IRetryAnalyzer{

	int count=1;
	int retryCount=3;
	@Override
	public boolean retry(ITestResult result) 
	{
		while(count<=retryCount)
		{
			count++;
			return true;
		}
		return false;
	}
}
