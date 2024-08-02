package tc_reo;

import org.testng.annotations.Test;

import genericlibOrUtility.BaseClass;
import genericlibOrUtility.ExcelUtilityOrLib;
import genericlibOrUtility.JavaLibrary;
import objectRepo.CreateNewOrgPage;
import objectRepo.HomePage;
import objectRepo.OrganizationPage;

public class Org_03 extends BaseClass{

	@Test(groups= {"smoke"})
	public void org03Tc() throws Exception
	{
		JavaLibrary jl=new JavaLibrary();
		int num=jl.generateRandomNumber(1000);
		ExcelUtilityOrLib EUTIL=new ExcelUtilityOrLib();
		String ORGNAME=EUTIL.readDataFromExcel("Organisation", 7, 1);
		String WSITE=EUTIL.readDataFromExcel("Organisation", 7, 2);
		String BILLADD=EUTIL.readDataFromExcel("Organisation", 7, 4);
		String BILLCITY=EUTIL.readDataFromExcel("Organisation", 7, 5);
		String BILLSTATE=EUTIL.readDataFromExcel("Organisation", 7, 6);
		
		HomePage hp=new HomePage(driver);
		hp.clickOnOrg();;
		OrganizationPage orgBtn=new OrganizationPage(driver);
		orgBtn.ClickOnCreateOrgButton();
		CreateNewOrgPage CNO=new CreateNewOrgPage(driver);
		CNO.createOrg(ORGNAME+num, WSITE,BILLADD,BILLCITY,BILLSTATE);
		System.out.println("Org03 excecution success...!!");
		Thread.sleep(3000);
	}
}
