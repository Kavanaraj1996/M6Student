package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewLeadPage {

	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@name='company']")
	private WebElement company;
	
	@FindBy(xpath="//input[@name='designation']")
	private WebElement title;
	
	@FindBy(xpath="//input[@name='phone']")
	private WebElement phone;
	
	@FindBy(xpath="//input[@name='mobile']")
	private WebElement mobile;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@name='noofemployees']")
	private WebElement noOfEmp;
	
	@FindBy(xpath="//textarea[@name='lane']")
	private WebElement street;
	
	@FindBy(xpath="//input[@name='pobox']")
	private WebElement pobox;
	
	@FindBy(xpath="//input[@name='code']")
	private WebElement postalCode;
	
	@FindBy(xpath="//input[@name='city']")
	private WebElement city;
	
	@FindBy(xpath="//input[@name='country']")
	private WebElement country;
	
	@FindBy(xpath="//input[@name='state']")
	private WebElement state;
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[2]")
	private WebElement saveBtn;
	/**
	 * Business login
	 * @param fname
	 * @param lname
	 * @param comp
	 */
	
	public CreateNewLeadPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getFirstname() {
		return firstname;
	}


	public WebElement getLastname() {
		return lastname;
	}


	public WebElement getCompany() {
		return company;
	}


	public WebElement getTitle() {
		return title;
	}


	public WebElement getPhone() {
		return phone;
	}


	public WebElement getMobile() {
		return mobile;
	}


	public WebElement getEmail() {
		return email;
	}


	public WebElement getNoOfEmp() {
		return noOfEmp;
	}


	public WebElement getStreet() {
		return street;
	}


	public WebElement getPobox() {
		return pobox;
	}


	public WebElement getPostalCode() {
		return postalCode;
	}


	public WebElement getCity() {
		return city;
	}


	public WebElement getCountry() {
		return country;
	}


	public WebElement getState() {
		return state;
	}


	public WebElement getSaveBtn() {
		return saveBtn;
	}

	/**
	 *  this is business lib to create lead with mandatory fields
	 * @param fname
	 * @param lname
	 * @param comp
	 */
	public void createLead(String fname,String lname,String comp)
	{
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		company.sendKeys(comp);
		saveBtn.click();
	}
	/**
	 * this i business library to create Lead with all creds
	 * @param fname
	 * @param lname
	 * @param comp
	 * @param desg
	 * @param phno
	 * @param mob
	 * @param mailId
	 * @param employees
	 * @param strt
	 * @param pb
	 * @param postcode
	 * @param cty
	 * @param cntry
	 * @param st
	 */
	public void createLead(String fname,String lname,String comp,String desg,
	String phno,String mob,String mailId,String employees,String strt,
	String pb,String postcode,String cty,String cntry,String st)
	{
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		company.sendKeys(comp);
		title.sendKeys(desg);
		phone.sendKeys(phno);
		mobile.sendKeys(mob);
		email.sendKeys(mailId);
		noOfEmp.sendKeys(employees);
		street.sendKeys(strt);
		pobox.sendKeys(pb);
		postalCode.sendKeys(postcode);
		city.sendKeys(cty);
		country.sendKeys(cntry);
		state.sendKeys(st);
		saveBtn.click();
	}
	/**
	 * this is Business libarary to create Lead with employee creds
	 * @param fname
	 * @param lname
	 * @param comp
	 * @param desg
	 * @param phno
	 * @param mob
	 * @param mailId
	 * @param employees
	 */
	public void createLead(String fname,String lname,String comp,String desg,
	String phno,String mob,String mailId,String employees) 
	{
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		company.sendKeys(comp);
		title.sendKeys(desg);
		phone.sendKeys(phno);
		mobile.sendKeys(mob);
		email.sendKeys(mailId);
		noOfEmp.sendKeys(employees);
		saveBtn.click();
	}
	/**
	 * this is Business libarary to create Lead with employee address creds
	 * @param fname
	 * @param lname
	 * @param comp
	 * @param strt
	 * @param pb
	 * @param postcode
	 * @param cty
	 * @param cntry
	 * @param st
	 */
	public void createLead(String fname,String lname,String comp,String strt,
			String pb,String postcode,String cty,String cntry,String st) 
			{
				firstname.sendKeys(fname);
				lastname.sendKeys(lname);
				company.sendKeys(comp);
				street.sendKeys(strt);
				pobox.sendKeys(pb);
				postalCode.sendKeys(postcode);
				city.sendKeys(cty);
				country.sendKeys(cntry);
				state.sendKeys(st);
				saveBtn.click();
			}
	
}

	
	
	
	
	