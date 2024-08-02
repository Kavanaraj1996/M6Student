package tc_reo;

import org.testng.annotations.Test;

import genericlibOrUtility.BaseClass;
import genericlibOrUtility.ExcelUtilityOrLib;
import genericlibOrUtility.JavaLibrary;
import objectRepo.ContactPage;
import objectRepo.HomePage;

public class Con_01 extends BaseClass{

	@Test(retryAnalyzer=genericlibOrUtility.RetryAnalyzerImpelementationClass.class)
	public void con01tc() throws Exception
	{
		HomePage hp=new HomePage(driver);
		hp.clickOnContact();
		ContactPage cp=new ContactPage(driver);
		cp.ClickOnCreateContactBtn();
		
		ExcelUtilityOrLib EUTIL=new ExcelUtilityOrLib();
		String FNAME=EUTIL.readDataFromExcel("Contacts", 1, 1);
		String LNAME=EUTIL.readDataFromExcel("Contacts", 1, 2);
		String ORGNAME=EUTIL.readDataFromExcel("Contacts", 1, 3);
		JavaLibrary jlib=new JavaLibrary();
		int num=jlib.generateRandomNumber(1000);
	}
}
