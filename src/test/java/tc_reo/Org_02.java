package tc_reo;

import org.testng.annotations.Test;

import genericlibOrUtility.BaseClass;
import genericlibOrUtility.ExcelUtilityOrLib;
import genericlibOrUtility.JavaLibrary;
import objectRepo.CreateNewOrgPage;
import objectRepo.HomePage;
import objectRepo.OrganizationPage;

public class Org_02 extends BaseClass {
	@Test(groups= {"smoke","sanity"})
	public void org02Tc() throws Exception
	{
		JavaLibrary jl=new JavaLibrary();
		int num=jl.generateRandomNumber(1000);
		ExcelUtilityOrLib EUTIL=new ExcelUtilityOrLib();
		String ORGNAME=EUTIL.readDataFromExcel("Organisation", 4, 1);
		String WSITE=EUTIL.readDataFromExcel("Organisation", 4, 2);
		String EMPS=EUTIL.readDataFromExcel("Organisation", 4, 3);
		String PHN=EUTIL.readDataFromExcel("Organisation", 4, 4);
		String OTHPHN=EUTIL.readDataFromExcel("Organisation", 4, 5);
		String EMAIL=EUTIL.readDataFromExcel("Organisation", 4, 6);
		
		HomePage hp=new HomePage(driver);
		hp.clickOnOrg();;
		OrganizationPage orgBtn=new OrganizationPage(driver);
		orgBtn.ClickOnCreateOrgButton();
		CreateNewOrgPage CNO=new CreateNewOrgPage(driver);
		CNO.createOrg(ORGNAME+num, WSITE, EMPS,PHN,OTHPHN,EMAIL);
		System.out.println("Org02 excecution success...!!");
		Thread.sleep(3000);
	}
}
