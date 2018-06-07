package paypalpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class PayPalSignUp extends ProjectMethods {
	public PayPalSignUp() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(how=How.ID,using="radio-personal")
	private WebElement eleradio;
	public PayPalSignUp SelectRadioButton()
	{
		boolean select = verifySelected(eleradio);
		if(!select)
		{
			click(eleradio);
		}
		return this;
	}
	@FindBy(how=How.LINK_TEXT,using="Next")
	private WebElement eleNext;
	
	public PayPalSignupDetails clickNext()
	{
		click(eleNext);
		return new PayPalSignupDetails();
	}
	

}
