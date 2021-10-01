package formm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SummaryReport {
	
	public static WebDriver driver;
	
	public SummaryReport(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
	private WebElement chekcout2;
	
	@FindBy(name="message")
	private WebElement messag;
	
	@FindBy(name="processAddress")
	private WebElement address;
	
	@FindBy(id="uniform-cgv")
	private WebElement agree;
	
	@FindBy(name="processCarrier")
	private WebElement carrier;
	
	
	@FindBy(xpath="//a[@class='bankwire']")
	private WebElement bankwire;
	
	public WebElement getBankwire() {
		return bankwire;
	}

	public WebElement getOrder() {
		return order;
	}


	@FindBy(xpath="//button[@class='button btn btn-default button-medium']")
	private WebElement order;
	
	public WebElement getAddress() {
		return address;
	}

	public WebElement getAgree() {
		return agree;
	}

	public WebElement getCarrier() {
		return carrier;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getChekcout2() {
		return chekcout2;
	}

	public WebElement getMessag() {
		return messag;
	}
	
	
	

}
