package tc_reo;

import org.testng.annotations.Test;

import genericlibOrUtility.BaseClass;
import genericlibOrUtility.ExcelUtilityOrLib;
import objectRepo.CreateNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadPage;

public class LE_01 extends BaseClass {

	@Test(groups={"smoke"})
	public void le01Tc() throws Exception
	{
		ExcelUtilityOrLib EUTIL=new ExcelUtilityOrLib();
		String FNAME=EUTIL.readDataFromExcel("Leads", 1, 1);
		String LNAME=EUTIL.readDataFromExcel("Leads", 1, 2);
		String CNAME=EUTIL.readDataFromExcel("Leads", 1, 3);
		
		HomePage hp=new HomePage(driver);
		hp.clickOnLeads();
		LeadPage lp=new LeadPage(driver);
		lp.clickOnCreateLeadButton();
		
		CreateNewLeadPage CNL=new CreateNewLeadPage(driver);
		CNL.createLead(FNAME, LNAME, CNAME);
		System.out.println("Le01 excecution success...!!");
		
	}
}
