package paypalpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import pages.CreateLeadPage;
import pages.ViewLeadPage;
import wdMethods.ProjectMethods;

public class PaypalHome extends ProjectMethods{

	public PaypalHome(){		
		PageFactory.initElements(driver,this);
	}
	@FindBy(how=How.ID,using="signup-button")
	private WebElement signup;
	
	public PayPalSignUp clickSignup() {
		click(signup);
		return new PayPalSignUp();
	}
	
}
