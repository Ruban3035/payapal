package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods {
	public ViewLeadPage() {		
		PageFactory.initElements(driver,this);
	}
	@FindBy(how=How.XPATH,using="(//span[@class='tabletext'])[4]")
	private WebElement eleFirstName;
	public ViewLeadPage verifyLead(String data)
	{
		verifyExactText(eleFirstName, data);
		return this;
	}
	
	

}
