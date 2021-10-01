package BaseSelenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import baseclassselenium.BaseClass;
import formm.LoginPage;
import formm.ProductSelection;
import formm.SummaryReport;

import org.openqa.selenium.OutputType;

public class Testingg1 extends BaseClass {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		/*
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\PC\\eclipse-workspace\\BaseProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		*/
		
		driver = getProperty("chrome");
		openLink("http://automationpractice.com/index.php");
		
		//WebElement login = driver.findElement(By.xpath("//a[@class='login']"));
			
		/*
		Thread.sleep(5000);
		driver.findElement(By.id("email_create")).sendKeys("Orange30@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(5000);
		//Registration Page
		driver.findElement(By.xpath("//label[@for='id_gender1']")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Jairo");
		driver.findElement(By.id("customer_lastname")).sendKeys("Jerin");
		driver.findElement(By.id("passwd")).sendKeys("Jairo@123");
		WebElement bDay = driver.findElement(By.id("days"));
		Select bd = new Select(bDay);
		bd.selectByValue("17");
		WebElement bMonth = driver.findElement(By.id("months"));
		selectOption(bMonth, "August ");
		
		//Select bm = new Select(bMonth);
		//bm.selectByVisibleText("August ");
		WebElement bYear = driver.findElement(By.id("years"));
		Select by = new Select(bYear);
		by.selectByValue("2019");
		driver.findElement(By.xpath("//label[@for='optin']")).click();
		driver.findElement(By.id("firstname")).sendKeys("Jairo");
		driver.findElement(By.id("lastname")).sendKeys("Jerin");
		driver.findElement(By.id("company")).sendKeys("GreenTech");
		driver.findElement(By.id("address1")).sendKeys("Kannapiran St");
		driver.findElement(By.id("address2")).sendKeys("23");
		driver.findElement(By.id("city")).sendKeys("New York");
		WebElement State = driver.findElement(By.id("id_state"));
		Select sta = new Select(State);
		sta.selectByVisibleText("Alaska");
		driver.findElement(By.id("postcode")).sendKeys("99501");
		WebElement county = driver.findElement(By.id("id_country"));
		Select coty = new Select(county);
		coty.selectByVisibleText("United States");
		driver.findElement(By.id("other")).sendKeys("Need 90% offer");
		driver.findElement(By.name("phone")).sendKeys("1234567890");
		driver.findElement(By.id("phone_mobile")).sendKeys("1234567890");
		driver.findElement(By.name("alias")).sendKeys("112 4th ave");
		driver.findElement(By.name("submitAccount")).click();
		  
		 */
		
		/*
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		inputValues(email, "Orange1@gmail.com");
		//sendKeys("Orange1@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("Jairo@123");
		driver.findElement(By.id("SubmitLogin")).click();
		*/
		LoginPage log = new LoginPage(driver);
		clickOnElement(log.getSignIn());
		//Thread.sleep(4000);
		expli(log.getEmail());
		inputValues(log.getEmail(), "Orange1@gmail.com");
		inputValues(log.getPass(), "Jairo@123");
		clickOnElement(log.getLogin());
		//Thread.sleep(5000);
		implicitwait(20);
		//Women MouseOVer
		//WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		//moveToElement(women);
		
		ProductSelection prod= new ProductSelection(driver);
		moveElement(prod.getWomendress());
		
		//Actions wn = new Actions(driver);
		//wn.moveToElement(women).build().perform();
		
		//Dresses
		//driver.findElement(By.xpath("(//a[@title='Summer Dresses'])[1]")).click();
		clickOnElement(prod.getSummerdress());
		
		//WebElement photo = driver.findElement(By.xpath("//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 last-line last-item-of-tablet-line last-mobile-line']"));
		//moveElement(photo);
		moveElement(prod.getPhoto());
		
		//driver.findElement(By.xpath("(//a[@class='quick-view'])[2]")).click();
		
		//driver.switchTo().frame(0);
		//driver.findElement(By.xpath("(//a[@class='button lnk_view btn btn-default'])[2]")).click();
		clickOnElement(prod.getPhotoselect());
		
		Thread.sleep(4000);
		//WebElement smallimg = driver.findElement(By.id("thumb_18"));
		//smallimg.click();
		clickOnElement(prod.getSmallimg());
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//a[@class='fancybox-item fancybox-close']")).click();
		clickOnElement(prod.getCloseimg());
		Thread.sleep(4000);
		//WebElement qty = driver.findElement(By.xpath("(//a[@data-field-qty='qty'])[2]"));
		//qty.click();
		//qty.click();
		clickOnElement(prod.getQty());
		clickOnElement(prod.getQty());
		//WebElement dressSize = driver.findElement(By.id("group_1"));
		//Select ds = new Select(dressSize);
		//ds.selectByVisibleText("M");
		selectText(prod.getDresssize(), "M","text");
		
		//driver.findElement(By.name("Yellow")).click();
		clickOnElement(prod.getColor());
		
		//driver.findElement(By.name("Submit")).click();
		clickOnElement(prod.getAddtocart());
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.switchTo().defaultContent();
		//driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
		clickOnElement(prod.getCheckout1());
		
		SummaryReport sr= new SummaryReport(driver);
		//driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
		clickOnElement(sr.getChekcout2());		
		//driver.findElement(By.name("message")).sendKeys("Good");
		inputValues(sr.getMessag(), "Good");
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		implicitwait(20);
		
		//driver.findElement(By.name("processAddress")).click();
		clickOnElement(sr.getAddress());
		//driver.findElement(By.id("uniform-cgv")).click();
		clickOnElement(sr.getAgree());
		//driver.findElement(By.name("processCarrier")).click();
		clickOnElement(sr.getCarrier());
		Thread.sleep(4000 );
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//a[@class='bankwire']")).click();
		clickOnElement(sr.getBankwire());
		//driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']")).click();
		clickOnElement(sr.getOrder());
		takesnap("C:\\Users\\PC\\eclipse-workspace\\Automation_Maven\\Screenshot\\madhan1.png");
		
		
	}
}
