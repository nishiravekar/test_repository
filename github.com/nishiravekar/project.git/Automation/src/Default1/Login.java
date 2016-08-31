package Default1;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class Login {
	
	public WebDriver driver;
	
	//public HtmlUnitDriver driver;
	
	
	
	
	    @BeforeMethod
	    public void beforeMethod() {
	  
	  //  driver = new HtmlUnitDriver(true);
	    	
	    //	driver = new HtmlUnitDriver(BrowserVersion.FIREFOX_24);
	    	
	 //   	File file = new File("D:\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
	//		 System.setProperty("phantomjs.binary.path", file.getAbsolutePath());
	//		 WebDriver driver = new PhantomJSDriver();
	    	
	    	
	    	
	    	
	    	DesiredCapabilities DesireCaps = new DesiredCapabilities();
	    	DesireCaps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "D:\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
	    	WebDriver driver = new PhantomJSDriver(DesireCaps);
	    	
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://dev.ingrammicrotraining.com/");
        
        System.out.println("TESTING TEST");
        driver.manage().window().maximize(); 
        driver.findElement(By.cssSelector("div.fancybox-overlay.fancybox-overlay-fixed")).click(); //Closing the popoup window
        }
	  
	    @Test
        public void Login_test() {
	
		WebElement button = driver.findElement(By.cssSelector("a#p_lt_ctl00_FoundationTwoColumnLayout_FoundationTwoColumnLayout_zoneTwo_WebPartZone_WebPartZone_zone_SignOutButton_btnSignOutLink"));
		button.click();
		WebElement UserName = driver.findElement(By.cssSelector("input#p_lt_ctl01_pageplaceholder_p_lt_ctl00_LoginForm_Login1_UserName"));
		UserName.sendKeys("rekha.wavhal@goldencomm.com");
		
		WebElement Password = driver.findElement(By.cssSelector("input#p_lt_ctl01_pageplaceholder_p_lt_ctl00_LoginForm_Login1_Password"));
		Password.sendKeys("PeonSF11!");
		
		WebElement Login_button = driver.findElement(By.cssSelector("input#p_lt_ctl01_pageplaceholder_p_lt_ctl00_LoginForm_Login1_LoginButton"));
		Login_button.click();  
		
		System.out.println("Login Successfully");

  }
	    
	    @AfterMethod
	    public void afterMethod() { 
	    driver.close();
}
}