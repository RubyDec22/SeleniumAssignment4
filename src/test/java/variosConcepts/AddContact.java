package variosConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class AddContact {
	
	WebDriver driver;
	
	// Login page
	By USER_NAME_FIELD = By.xpath("//input[@id = 'username']");
	By PASSWORD_FIELD = By.xpath("//input[@id = 'password']");
	By SIGN_IN_FIELD = By.xpath("//button[@name = 'login']");
	//Select options
	By CUSTOMER_FIELD =By.xpath("//span[contains(text(), 'Customers')]");
	By ADD_CUSTOMER_FIELD =By.xpath("//a[contains(text(), 'Add Customer')]");
	//define Transaction page field
	By FULL_NAME_FIELD = By.xpath("//input[@id='account']");
	By ACCOUNT_DROWPDOWN_MENU_FIELD = By.xpath("//select[@id='cid']");
	By EMAIL_FIELD = By.xpath("//input[@id='email']");
	By PHONE_NUMBER_FIELD = By.xpath("//input[@id='phone']");
	By ADDRESS_FIELD =By.xpath("//input[@id='address']");
	By CITY_FIELD = By.xpath("//input[@id='city']");
	By STATE_FIELD = By.xpath("//input[@id='state']");
	By ZIP_CODE_FIELD =By.xpath("//input[@id='zip']");
	By COUNTRY_FIELD = By.xpath("//select[@id='country']");
	By TAGS_FIELD = By.xpath("//select[@id= 'tags']");
	By CURRENCY_FIELD =By.xpath("//select[@id= 'currency']");
	By GROUP_FIELD =By.xpath("//select[@id= 'group']");
	By COMFIRM_PASSWORD =By.xpath("//input[@id='cpassword']");
	By SAVE_BOTTOM_FIELD = By.xpath("//button[@id= 'submit']");
	By LIST_CUSTOMER_FIELD = By.xpath("//a[contains(text(), 'List Customers')]");
	By FIND_NEW_CUSTOMER_FIELD = By.xpath("//input[@id= 'foo_filter']");
	
	

	@Before
	   public void init() {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	   }

	   @Test
	    public void LoginTest() {
		
		driver.findElement(USER_NAME_FIELD).sendKeys("demo@techfios.com");
		driver.findElement(PASSWORD_FIELD).sendKeys("558566");
		driver.findElement(SIGN_IN_FIELD).click();
		
	   }
	   @Test
	   public void AddContact() throws InterruptedException {
		   LoginTest();
		   
		   driver.findElement(CUSTOMER_FIELD).click();
		 Assert.assertTrue("Customer page not found", driver.findElement(CUSTOMER_FIELD).isDisplayed());
		 System.out.println("CUSTOMER");
		
		 driver.findElement(ADD_CUSTOMER_FIELD).click();
		 Assert.assertTrue("Add customer page not found", driver.findElement(ADD_CUSTOMER_FIELD).isEnabled());
		 System.out.println("ADD_CUSTOMER");
		 
		 Thread.sleep(2000);
		 driver.findElement(FULL_NAME_FIELD).sendKeys("Kwatra Ruby");
		 Assert.assertTrue("full name page not found", driver.findElement(FULL_NAME_FIELD).isDisplayed());
		 System.out.println("FULL_NAME");
		 
		 Thread.sleep(2000);
		 Select sel = new Select(driver.findElement(ACCOUNT_DROWPDOWN_MENU_FIELD));
		 sel.selectByVisibleText("Bank Of America");
		 Assert.assertTrue("Account drowpdown page not found", driver.findElement(ACCOUNT_DROWPDOWN_MENU_FIELD).isDisplayed());
		 System.out.println("(ACCOUNT_DROWPDOWN");
		 
		 Thread.sleep(2000);
		 driver.findElement(EMAIL_FIELD).sendKeys("demo@techfios.com");
		 Assert.assertTrue("email page not found", driver.findElement(EMAIL_FIELD).isDisplayed());
		 System.out.println("(EMAIL");
		 
		 Thread.sleep(2000);
		 driver.findElement(PHONE_NUMBER_FIELD).sendKeys("800-707-3131");
		 Assert.assertTrue("phone page not found", driver.findElement(PHONE_NUMBER_FIELD).isDisplayed());
		 System.out.println("PHONE_NUMBER");
		 
		 Thread.sleep(2000);
		 driver.findElement(ADDRESS_FIELD).sendKeys("2341 Belt Line Road");
		 Assert.assertTrue("Address page not found", driver.findElement(ADDRESS_FIELD).isDisplayed());
		 System.out.println("ADDRESS");
		 
		 driver.findElement(CITY_FIELD).sendKeys("Dallas");
		 Assert.assertTrue("City page not found", driver.findElement(CITY_FIELD).isDisplayed());
		 System.out.println("CITY");
		 
		 driver.findElement(STATE_FIELD).sendKeys("Texas");
		 Assert.assertTrue("State page not found", driver.findElement(STATE_FIELD).isDisplayed());
		 System.out.println("STATE");
		
		 driver.findElement(ZIP_CODE_FIELD).sendKeys("75043");
		 Assert.assertTrue("Zip code page not found", driver.findElement(ZIP_CODE_FIELD).isDisplayed());
		 System.out.println("ZIP");
		 
		 Thread.sleep(2000);
		 Select sel2 =new Select(driver.findElement(COUNTRY_FIELD));
		 sel2.selectByVisibleText("United States");
		 Assert.assertTrue("country page not found", driver.findElement(COUNTRY_FIELD).isDisplayed());
		 System.out.println("COUNTRY");
		 
		 Thread.sleep(2000);
		 Select sel3 = new Select(driver.findElement(TAGS_FIELD));
		 sel3.selectByVisibleText("IT Training");
		 Assert.assertTrue("Tags page not found", driver.findElement(TAGS_FIELD).isDisplayed());
		 System.out.println("TAGS");
		 
		 Thread.sleep(2000);
		 Select sel4 = new Select(driver.findElement(CURRENCY_FIELD));
		 sel4.selectByVisibleText("USD");
		 Assert.assertTrue("currency page not found", driver.findElement(CURRENCY_FIELD).isDisplayed());
		 System.out.println("CURRENCY");
		 
		 Thread.sleep(2000);
		 Select sel5 = new Select(driver.findElement(GROUP_FIELD));
		 sel5.selectByVisibleText("Selenium");
		 Assert.assertTrue("Group page not found", driver.findElement(GROUP_FIELD).isDisplayed());
		 System.out.println("GROUP");
		 
		 Thread.sleep(2000);
		 driver.findElement(PASSWORD_FIELD).sendKeys("abc123");
		 Assert.assertTrue("Password page not found", driver.findElement(PASSWORD_FIELD).isDisplayed());
		 System.out.println("PASSWORD");
		 
		 Thread.sleep(2000);
		 driver.findElement(COMFIRM_PASSWORD).sendKeys("abc123");
		 Assert.assertTrue("Comfirm page not found", driver.findElement(COMFIRM_PASSWORD).isDisplayed());
		 System.out.println("COMFIRM");
		 
		 driver.findElement(SAVE_BOTTOM_FIELD).click();
		 Assert.assertTrue(" save bottom page not found", driver.findElement(SAVE_BOTTOM_FIELD).isDisplayed());
		 System.out.println("SAVE_BOTTOM");
		 
		 Thread.sleep(2000);
		 driver.findElement(LIST_CUSTOMER_FIELD).click();
		 Assert.assertTrue("list customer page not found", driver.findElement(LIST_CUSTOMER_FIELD).isDisplayed());
		 System.out.println("LIST_CUSTOMER");
		 
		 driver.findElement(FIND_NEW_CUSTOMER_FIELD).sendKeys("Kwatra Ruby");
		 Assert.assertTrue("page not found", driver.findElement(FIND_NEW_CUSTOMER_FIELD).isDisplayed());
		 System.out.println("FIND_NEW_CUSTOMER");
		 
		 Thread.sleep(2000);
	   }
	   
}
