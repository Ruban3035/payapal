package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods {
	
	public CreateLeadPage() {		
		PageFactory.initElements(driver,this);
	}
	@FindBy(how=How.XPATH,using="(//input[@class='inputBox'])[1]")
	private WebElement eleCompanyName;
	public CreateLeadPage typeCompanyName(String data)
	{
		type(eleCompanyName, data);
		return this;
	}
	@FindBy(how=How.XPATH,using="(//input[@class='inputBox'])[3]")
	private WebElement eleFirstName;
	public CreateLeadPage typeFirstName(String data)
	{
		type(eleFirstName, data);
		return this;
	}
	@FindBy(how=How.XPATH,using="(//input[@class='inputBox'])[4]")
	private WebElement eleLastName;
	public CreateLeadPage typeLastName(String data)
	{
		type(eleLastName, data);
		return this;
	}
	@FindBy(how=How.XPATH,using="//input[@class='smallSubmit']")
	private WebElement eleClickCreateLead;
	public ViewLeadPage clickCreateLead()
	{
		
		click(eleClickCreateLead);
		return new ViewLeadPage();
	}


}
