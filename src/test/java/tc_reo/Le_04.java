package tc_reo;

import org.testng.annotations.Test;

import genericlibOrUtility.BaseClass;
import genericlibOrUtility.ExcelUtilityOrLib;
import objectRepo.CreateNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadPage;

public class Le_04 extends BaseClass {
	@Test(groups= {"smoke","sanity"})
	public void le04Tc() throws Exception
	{
		ExcelUtilityOrLib EUTIL=new ExcelUtilityOrLib();
		String FNAME=EUTIL.readDataFromExcel("Leads", 11, 1);
		String LNAME=EUTIL.readDataFromExcel("Leads", 11, 2);
		String CNAME=EUTIL.readDataFromExcel("Leads", 11, 3);
		String STREET=EUTIL.readDataFromExcel("Leads", 11, 4);
		String POBOX=EUTIL.readDataFromExcel("Leads", 11, 5);
		String POCODE=EUTIL.readDataFromExcel("Leads", 11, 6);
		String CITY=EUTIL.readDataFromExcel("Leads", 11, 7);
		String STATE=EUTIL.readDataFromExcel("Leads", 11, 8);
		String COUNTRY=EUTIL.readDataFromExcel("Leads", 11, 9);
				
		HomePage hp=new HomePage(driver);
		hp.clickOnLeads();
		LeadPage lp=new LeadPage(driver);
		lp.clickOnCreateLeadButton();
		
		CreateNewLeadPage CNL=new CreateNewLeadPage(driver);
		CNL.createLead(FNAME, LNAME, CNAME,STREET,POBOX,POCODE,CITY,STATE,COUNTRY);
		System.out.println("Le04 excecution success...!!");
		
	}
}
