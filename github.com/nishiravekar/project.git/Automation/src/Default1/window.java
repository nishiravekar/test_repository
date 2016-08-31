package Default1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class window {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new FirefoxDriver();
		driver.get("http://www.codeproject.com/");
        WebElement discuss =driver.findElement(By.xpath("//*[@id='ctl00_TopNavBar_Forums']/span[1]"));
		
		WebElement app = driver.findElement(By.xpath("//*[@id='ctl00_TPR']/div[2]/div/ul/li[4]/ul/li[2]/a"));
		WebElement run = driver.findElement(By.xpath("//*[@id='ctl00_TPR']/div[2]/div/ul/li[4]/ul/li[2]/ul/li[1]/a"));

		
		Actions actionsbuilder = new Actions(driver);
		Action hoverAction = actionsbuilder
				               .moveToElement(discuss)
				               .build();
		hoverAction.perform();
		
		Action hover = actionsbuilder
	               .moveToElement(app)
	               .build();
		hover.perform();
		

		Action ho = actionsbuilder
	               .moveToElement(run)
	               .click()
	               .build();
	             		
		ho.perform();
	

		
		//*[@id='ctl00_TPR']/div[2]/div/ul/li[4]/ul/li[2]/a
		
		
		
		
		
		/*String bgcolor = Rowtag.getCssValue("background-Color");
		System.out.println("beforehover" + bgcolor);
		hoverAction.perform();
		
		bgcolor = Rowtag.getCssValue("background-Color");   //here "background-Color" -> is a keyword it should be as it is
		System.out.println("afterhover "  + bgcolor);
		
	//	WebElement txtUserName =driver.findElement(By.name("userName"));
		
		/*Action multipleactions = actionsbuilder
				.moveToElement(txtUserName)
				.click()
		        .keyDown(txtUserName,Keys.SHIFT)
		        .sendKeys(txtUserName,"Hello")
		        .sendKeys(txtUserName,"Hii")
		        .keyUp(txtUserName,Keys.SHIFT)
		        .sendKeys(txtUserName,"Nishi")
		        .build();
				
		        multipleactions.perform();*/
	}
	}              