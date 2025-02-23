package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {

	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement createNewOrgButton;
	
	public OrganizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	/**
	 * business lib to click on create new org
	 */
	public void ClickOnCreateOrgButton() {
		createNewOrgButton.click();
	}
}
