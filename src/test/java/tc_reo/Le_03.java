package tc_reo;

import org.testng.annotations.Test;

import genericlibOrUtility.BaseClass;
import genericlibOrUtility.ExcelUtilityOrLib;
import objectRepo.CreateNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadPage;

public class Le_03 extends BaseClass {

	@Test(groups= {"regression"})
	public void le03Tc() throws Exception
	{
		ExcelUtilityOrLib EUTIL=new ExcelUtilityOrLib();
		String FNAME=EUTIL.readDataFromExcel("Leads", 8, 1);
		String LNAME=EUTIL.readDataFromExcel("Leads", 8, 2);
		String CNAME=EUTIL.readDataFromExcel("Leads", 8, 3);
		String TITLENAME=EUTIL.readDataFromExcel("Leads", 8, 4);
		String PHONENAME=EUTIL.readDataFromExcel("Leads", 8, 5);
		String MOB=EUTIL.readDataFromExcel("Leads", 8, 6);
		String EMAIL=EUTIL.readDataFromExcel("Leads",8, 7);
		String NOOFEMP=EUTIL.readDataFromExcel("Leads", 8, 8);
				
		HomePage hp=new HomePage(driver);
		hp.clickOnLeads();
		LeadPage lp=new LeadPage(driver);
		lp.clickOnCreateLeadButton();
		
		CreateNewLeadPage CNL=new CreateNewLeadPage(driver);
		CNL.createLead(FNAME, LNAME, CNAME,TITLENAME,PHONENAME,MOB,EMAIL,NOOFEMP);
		System.out.println("Le03 excecution success...!!");
		
	}
}
