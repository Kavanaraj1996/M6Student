package tc_reo;

import org.testng.annotations.Test;

import genericlibOrUtility.BaseClass;
import genericlibOrUtility.ExcelUtilityOrLib;
import genericlibOrUtility.JavaLibrary;
import objectRepo.CreateNewLeadPage;
import objectRepo.CreateNewOrgPage;
import objectRepo.HomePage;
import objectRepo.LeadPage;
import objectRepo.OrganizationPage;

public class Org_01 extends BaseClass{
	@Test(groups= {"smoke","regression"})
	public void org01Tc() throws Exception
	{
		JavaLibrary jl=new JavaLibrary();
		int num=jl.generateRandomNumber(1000);
		ExcelUtilityOrLib EUTIL=new ExcelUtilityOrLib();
		String ORGNAME=EUTIL.readDataFromExcel("Organisation", 1, 1);
		String WSITE=EUTIL.readDataFromExcel("Organisation", 1, 2);
		String EMPS=EUTIL.readDataFromExcel("Organisation", 1, 3);
		
		HomePage hp=new HomePage(driver);
		hp.clickOnOrg();;
		OrganizationPage orgBtn=new OrganizationPage(driver);
		orgBtn.ClickOnCreateOrgButton();
		CreateNewOrgPage CNO=new CreateNewOrgPage(driver);
		CNO.createOrg(ORGNAME+num, WSITE, EMPS);
		System.out.println("Org01 excecution success...!!");
		Thread.sleep(3000);
	}
}
