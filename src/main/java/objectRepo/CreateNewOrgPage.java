package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrgPage {

	@FindBy(xpath="//input[@name='accountname']")
	private WebElement orgname;
	
	@FindBy(xpath="//input[@name='website']")
	private WebElement website;
	
	@FindBy(xpath="//input[@name='employees']")
	private WebElement empNo;
	
	@FindBy(xpath="//input[@name='phone']")
	private WebElement phnNo;
	
	@FindBy(xpath="//input[@name='otherphone']")
	private WebElement otherPhnNo;
	
	@FindBy(xpath="//input[@name='email1']")
	private WebElement emailId;
	
	@FindBy(xpath="//textarea[@name='bill_street']")
	private WebElement billingAddress ;
	
	@FindBy(xpath="//input[@name='bill_state']")
	private WebElement billingState;
	
	@FindBy(xpath="//input[@name='bill_city']")
	private WebElement billingCity ;
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[2]")
	private WebElement saveBtn ;
	
	
	public CreateNewOrgPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getOrgname() {
		return orgname;
	}


	public WebElement getWebsite() {
		return website;
	}


	public WebElement getEmpNo() {
		return empNo;
	}


	public WebElement getPhnNo() {
		return phnNo;
	}


	public WebElement getOtherPhnNo() {
		return otherPhnNo;
	}


	public WebElement getEmailId() {
		return emailId;
	}


	public WebElement getBillingAddress() {
		return billingAddress;
	}


	public WebElement getBillingState() {
		return billingState;
	}


	public WebElement getBillingCity() {
		return billingCity;
	}


	public WebElement getSaveBtn() {
		return saveBtn;
	}
	/**
	 * this is business lib to create org with mandatory fields
	 * @param organizationName
	 * @param web
	 * @param eNum
	 */
	public void createOrg(String organizationName, String web, String eNum) {
		orgname.sendKeys(organizationName);
		website.sendKeys(web);
		empNo.sendKeys(eNum);
		saveBtn.click();
	}
	/**
	 * this is business lib to create org with e address
	 * @param organizationName
	 * @param web
	 * @param eNum
	 * @param phn
	 * @param ophn
	 * @param mailId
	 */
	public void createOrg(String organizationName, String web, 
			String eNum,String phn,String ophn,String mailId) {
		orgname.sendKeys(organizationName);
		website.sendKeys(web);
		empNo.sendKeys(eNum);
		phnNo.sendKeys(phn);
		otherPhnNo.sendKeys(ophn);
		emailId.sendKeys(mailId);
		saveBtn.click();
	}
	/**
	 * this is business lib to create org with billing address
	 * @param organizationName
	 * @param web
	 * @param bAddress
	 * @param bState
	 * @param bCity
	 */
	public void createOrg(String organizationName, String web, 
			String bAddress,String bState,String bCity) {
		orgname.sendKeys(organizationName);
		website.sendKeys(web);
		billingAddress.sendKeys(bAddress);
		billingState.sendKeys(bState);
		billingCity.sendKeys(bCity);
		saveBtn.click();
	}
	/**
	 * this is business lib to create org with all creds
	 * @param organizationName
	 * @param web
	 * @param eNum
	 * @param phn
	 * @param ophn
	 * @param mailId
	 * @param bAddress
	 * @param bState
	 * @param bCity
	 */
	public void createOrg(String organizationName, String web,
			String eNum,String phn,String ophn,String mailId,
			String bAddress,String bState,String bCity) {
		orgname.sendKeys(organizationName);
		website.sendKeys(web);
		empNo.sendKeys(eNum);
		phnNo.sendKeys(phn);
		otherPhnNo.sendKeys(ophn);
		emailId.sendKeys(mailId);
		billingAddress.sendKeys(bAddress);
		billingState.sendKeys(bState);
		billingCity.sendKeys(bCity);
		saveBtn.click();
	}
}
