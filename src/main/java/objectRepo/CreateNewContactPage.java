package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewContactPage {

	@FindBy(xpath="//input[@name='firstname']")
	private WebElement fname;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lname;
	
	@FindBy(xpath="//input[@name='account_name']")
	private WebElement orgName;
	
	@FindBy(xpath="//input[@name='title']")
	private WebElement title;
	
	@FindBy(xpath="//input[@name='department']")
	private WebElement department;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement emailId;
	
	@FindBy(xpath="//input[@name='assistant']")
	private WebElement assistant;
	
	@FindBy(xpath="//input[@name='assistantphone']")
	private WebElement assisPhNo;
	
	@FindBy(xpath="//input[@name='phone']")
	private WebElement officePhNo;
	
	@FindBy(xpath="//input[@name='mobile']")
	private WebElement mobile;
	
	@FindBy(xpath="//input[@name='homephone']")
	private WebElement homePhNo;
	
	@FindBy(xpath="//input[@name='otherphone']")
	private WebElement otherPhNo;
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[2]")
	private WebElement saveBtn;
	
	public CreateNewContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getOrgName() {
		return orgName;
	}

	public WebElement getTitle() {
		return title;
	}

	public WebElement getDepartment() {
		return department;
	}

	public WebElement getEmailId() {
		return emailId;
	}

	public WebElement getAssistant() {
		return assistant;
	}

	public WebElement getAssisPhNo() {
		return assisPhNo;
	}

	public WebElement getOfficePhNo() {
		return officePhNo;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getHomePhNo() {
		return homePhNo;
	}

	public WebElement getOtherPhNo() {
		return otherPhNo;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	/**
	 *  this is business lib to create contact with mandatory fields
	 * @param fstname
	 * @param lstname
	 * @param orgname
	 */
	public void createContact(String fstname,String lstname, String orgname) {
		fname.sendKeys(fstname);
		lname.sendKeys(lstname);
		orgName.sendKeys(orgname);
		saveBtn.click();
	}
	/**
	 *  this is business lib to create contact with assistant detail
	 * @param fstname
	 * @param lstname
	 * @param orgname
	 * @param tle
	 * @param dept
	 * @param mailId
	 * @param assist
	 * @param assistPhn
	 */
	public void createContact(String fstname,String lstname, String orgname,
		String tle,String dept, String mailId,String assist,String assistPhn) {
		fname.sendKeys(fstname);
		lname.sendKeys(lstname);
		orgName.sendKeys(orgname);
		title.sendKeys(tle);
		department.sendKeys(dept);
		emailId.sendKeys(mailId);
		assistant.sendKeys(assist);
		assisPhNo.sendKeys(assistPhn);
		saveBtn.click();
	}
	/**
	 * this is business lib to create contact with phone numbers
	 * @param fstname
	 * @param lstname
	 * @param orgname
	 * @param tle
	 * @param dept
	 * @param mailId
	 * @param assist
	 * @param assistPhn
	 * @param offPhn
	 * @param mbl
	 * @param hmPhn
	 * @param otherPhn
	 */
	public void createContact(String fstname,String lstname, String orgname,
		String tle,String dept, String mailId,String assist,String assistPhn,
		String offPhn, String mbl, String hmPhn, String otherPhn) {
			fname.sendKeys(fstname);
			lname.sendKeys(lstname);
			orgName.sendKeys(orgname);
			title.sendKeys(tle);
			department.sendKeys(dept);
			emailId.sendKeys(mailId);
			assistant.sendKeys(assist);
			assisPhNo.sendKeys(assistPhn);
			officePhNo.sendKeys(offPhn);
			mobile.sendKeys(mbl);
			homePhNo.sendKeys(hmPhn);
			otherPhNo.sendKeys(otherPhn);
			saveBtn.click();
		}
	
	public void createContact(String offPhn, String mbl, String hmPhn, String otherPhn) {
			officePhNo.sendKeys(offPhn);
			mobile.sendKeys(mbl);
			homePhNo.sendKeys(hmPhn);
			otherPhNo.sendKeys(otherPhn);
			saveBtn.click();
			}
}
