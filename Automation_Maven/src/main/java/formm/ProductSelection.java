package formm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductSelection {
	
	public static WebDriver driver;
	
	public ProductSelection(WebDriver driver) {
	this.driver= driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@title='Women']")
	private WebElement womendress;

	@FindBy(xpath="(//a[@title='Summer Dresses'])[1]")
	private WebElement summerdress;
	
	@FindBy(xpath="//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 last-line last-item-of-tablet-line last-mobile-line']")
	private WebElement photo;
	
	@FindBy(xpath="(//a[@class='button lnk_view btn btn-default'])[2]")
	private WebElement photoselect;
	
	@FindBy(id="thumb_18")
	private WebElement smallimg;
	
	@FindBy(xpath="//a[@class='fancybox-item fancybox-close']")
	private WebElement closeimg;
	
	@FindBy(xpath="(//a[@data-field-qty='qty'])[2]")
	private WebElement qty;
	
	@FindBy(id="group_1")
	private WebElement dresssize;
	
	@FindBy(name="Yellow")
	private WebElement color;
	
	@FindBy(name="Submit")
	private WebElement addtocart;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement checkout1;
	
	
	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getCheckout1() {
		return checkout1;
	}

	
	public WebElement getColor() {
		return color;
	}

	public WebElement getDresssize() {
		return dresssize;
	}

	public WebElement getQty() {
		return qty;
	}

	public WebElement getCloseimg() {
		return closeimg;
	}

	public WebElement getSmallimg() {
		return smallimg;
	}

	public WebElement getPhotoselect() {
		return photoselect;
	}

	public WebElement getPhoto() {
		return photo;
	}

	public WebElement getSummerdress() {
		return summerdress;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getWomendress() {
		return womendress;
	}
	
	
	
	
}
