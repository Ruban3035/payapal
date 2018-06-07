package paypalpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class PayPalSignupDetails extends ProjectMethods{
	public PayPalSignupDetails() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(how=How.ID,using="country")
	private WebElement elecountry;
	public PayPalSignupDetails SelectCountry()
	{
		selectDropDownUsingText(elecountry, "India");
		return this;
	}
	@FindBy(how=How.ID,using="email")
	private WebElement eleemail;
	
	public PayPalSignupDetails enterEmail(String data)
	{
		type(eleemail, data);
		return this;
	}
	@FindBy(how=How.ID,using="password")
	private WebElement elepassword;
	
	public PayPalSignupDetails enterPassword(String data)
	{
		type(elepassword, data);
		return this;
	}
	@FindBy(how=How.ID,using="confirmPassword")
	private WebElement elecpassword;
	
	public PayPalSignupDetails entercPassword(String data)
	{
		type(elecpassword, data);
		return this;
	}

}
