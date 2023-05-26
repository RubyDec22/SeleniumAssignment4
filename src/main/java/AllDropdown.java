import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllDropdown {

	WebDriver driver;

	// Login page
	By USER_NAME_FIELD = By.xpath("//input[@id = 'username']");
	By PASSWORD_FIELD = By.xpath("//input[@id = 'password']");
	By SIGN_IN_FIELD = By.xpath("//button[@name = 'login']");
	//select options
	By CUSTOMER_FIELD =By.xpath("//span[contains(text(), 'Customers')]");
	By ADD_CUSTOMER_FIELD =By.xpath("//a[contains(text(), 'Add Customer')]");
	//transaction
	By ACCOUNT_DROWPDOWN_MENU_FIELD = By.xpath("//select[@id='cid']");
    
	
	@Before
	public void init() {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void LoginTest() {

		driver.findElement(USER_NAME_FIELD).sendKeys("demo@techfios.com");
		driver.findElement(PASSWORD_FIELD).sendKeys("abc123");
		driver.findElement(SIGN_IN_FIELD).click();

	}

       @Test
       public void AddContact() throws InterruptedException {
  
	   LoginTest();
	   
	 
	   
	   driver.findElement(CUSTOMER_FIELD).click();
		 Assert.assertTrue("Customer page not found", driver.findElement(CUSTOMER_FIELD).isDisplayed());
		
		 driver.findElement(ADD_CUSTOMER_FIELD).click();
		 Assert.assertTrue("Add customer page not found", driver.findElement(ADD_CUSTOMER_FIELD).isEnabled());
		 
		
		 Select dropdown = new Select(driver.findElement(By.id("cid")));
		 List<WebElement> options = dropdown.getOptions();
		 for (int i = 0; i < options.size(); i++) {
			    dropdown.selectByIndex(i);
			    System.out.println(options.get(i).getText());
			    
			Assert.assertTrue("Dropdown page not found", driver.findElement(ACCOUNT_DROWPDOWN_MENU_FIELD).isDisplayed());    
			    Thread.sleep(500);
			}
		 
       }
       
}
		 
		 

	 
	   
	   
	   
	   
	   
	   
	   
	   

