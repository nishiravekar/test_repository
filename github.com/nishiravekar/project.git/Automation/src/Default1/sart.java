package Default1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class sart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://dev.cttransit.webship.com/contact/feedback_form");
		
		//driver.findElement(By.cssSelector("span.select2-selection__arrow")).click();
	
        Thread.sleep(5000);
		//driver.findElement(By.id("select2-edit-field-ff-nature-of-feedback-result-5ywd-Information Request")).click(); 
		
		Select drop = new Select(driver.findElement(By.id("edit-field-ff-nature-of-feedback")));
		drop.selectByValue("Complaint"); 
	}

}
