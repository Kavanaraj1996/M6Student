package tc_reo;

import org.testng.annotations.Test;

import genericlibOrUtility.BaseClass;
import genericlibOrUtility.ExcelUtilityOrLib;
import objectRepo.CreateNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadPage;

public class Le_02 extends BaseClass {

	@Test(groups= {"sanity"})
	public void le02Tc() throws Exception
	{
		ExcelUtilityOrLib EUTIL=new ExcelUtilityOrLib();
		String FNAME=EUTIL.readDataFromExcel("Leads", 4, 1);
		String LNAME=EUTIL.readDataFromExcel("Leads", 4, 2);
		String CNAME=EUTIL.readDataFromExcel("Leads", 4, 3);
		String TITLENAME=EUTIL.readDataFromExcel("Leads", 4, 4);
		String PHONENAME=EUTIL.readDataFromExcel("Leads", 4, 5);
		String MOB=EUTIL.readDataFromExcel("Leads", 4, 6);
		String EMAIL=EUTIL.readDataFromExcel("Leads", 4, 7);
		String NOOFEMP=EUTIL.readDataFromExcel("Leads", 4, 8);
		String STREET=EUTIL.readDataFromExcel("Leads", 4, 9);
		String POBOX=EUTIL.readDataFromExcel("Leads", 4, 10);
		String POCODE=EUTIL.readDataFromExcel("Leads", 4, 11);
		String CITY=EUTIL.readDataFromExcel("Leads", 4, 12);
		String STATE=EUTIL.readDataFromExcel("Leads", 4, 13);
		String COUNTRY=EUTIL.readDataFromExcel("Leads", 4, 14);
				
		HomePage hp=new HomePage(driver);
		hp.clickOnLeads();
		LeadPage lp=new LeadPage(driver);
		lp.clickOnCreateLeadButton();
		
		CreateNewLeadPage CNL=new CreateNewLeadPage(driver);
		CNL.createLead(FNAME, LNAME, CNAME,TITLENAME,PHONENAME,MOB,EMAIL,NOOFEMP,STREET,POBOX,POCODE,CITY,STATE,COUNTRY);
		System.out.println("Le02 excecution success...!!");
		
	}
}
