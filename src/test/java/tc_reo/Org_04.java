package tc_reo;

import org.testng.annotations.Test;

import genericlibOrUtility.BaseClass;
import genericlibOrUtility.ExcelUtilityOrLib;
import genericlibOrUtility.JavaLibrary;
import objectRepo.CreateNewOrgPage;
import objectRepo.HomePage;
import objectRepo.OrganizationPage;

public class Org_04 extends BaseClass{

	@Test(groups= {"regression"})
	public void org04Tc() throws Exception
	{
		JavaLibrary jl=new JavaLibrary();
		int num=jl.generateRandomNumber(1000);
		ExcelUtilityOrLib EUTIL=new ExcelUtilityOrLib();
		String ORGNAME=EUTIL.readDataFromExcel("Organisation", 10, 1);
		String WSITE=EUTIL.readDataFromExcel("Organisation", 10, 2);
		String EMPS=EUTIL.readDataFromExcel("Organisation", 10, 3);
		String PHN=EUTIL.readDataFromExcel("Organisation", 10, 4);
		String OTHPHN=EUTIL.readDataFromExcel("Organisation", 10, 5);
		String EMAIL=EUTIL.readDataFromExcel("Organisation", 10, 6);
		String BILLADD=EUTIL.readDataFromExcel("Organisation", 10, 7);
		String BILLCITY=EUTIL.readDataFromExcel("Organisation", 10, 8);
		String BILLSTATE=EUTIL.readDataFromExcel("Organisation", 10, 9);
		
		HomePage hp=new HomePage(driver);
		hp.clickOnOrg();;
		OrganizationPage orgBtn=new OrganizationPage(driver);
		orgBtn.ClickOnCreateOrgButton();
		CreateNewOrgPage CNO=new CreateNewOrgPage(driver);
		CNO.createOrg(ORGNAME+num, WSITE, EMPS,PHN,OTHPHN,EMAIL,BILLADD,BILLCITY,BILLSTATE);
		System.out.println("Org04 excecution success...!!");
		Thread.sleep(3000);
	}
}
