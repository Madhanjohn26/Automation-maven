package formm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public static WebDriver driver;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement email;
	
	@FindBy(id="passwd")
	private WebElement pass;
	
	@FindBy(id="SubmitLogin")
	private WebElement login;
	
	@FindBy(xpath="//a[@class='login']")
	private WebElement signIn;
	
	
	public WebElement getSignIn() {
		return signIn;
	}
	
	
	public WebDriver getDriver() {
		return driver;
	}





	public WebElement getLogin() {
		return login;
	}


	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	public WebElement getEmail() {
		return email;
	}


	public WebElement getPass() {
		return pass;
	}

	
		
	}
	

