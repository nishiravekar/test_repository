package Default1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkbox {
	
	
	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://tuition-aws-staging.diamondmindinc.com/schoolConfig/paymentMethodOptions");
		
		driver.findElement(By.xpath(".//*[@id='LoginForm_username']")).sendKeys("dhee@g.com");
		driver.findElement(By.xpath(".//*[@id='LoginForm_password']")).sendKeys("Dheeraj1");
		
WebElement c1 = driver.findElement(By.xpath(".//*[@id='LoginForm_rememberMe']"));
		
		boolean s1 = c1.isSelected();
		
		if(s1==true){
			System.out.println("Checkbox is already checked");  
			}
			else
			{
				c1.click();
			System.out.println("Checked the checkbox");
			}
		
		
		driver.findElement(By.xpath(".//*[@id='login-form']/div[6]/input")).click();
		
		Thread.sleep(5000);		
		
		driver.findElement(By.xpath(".//*[@id='nav']/li[2]/a/span")).click();
		
		driver.findElement(By.xpath(".//*[@id='nav']/li[2]/ul/li[1]/a/span")).click();
		
	/*	public  CheckingChkbox(WebElement chkbx1){
			boolean checkstatus;
			checkstatus=chkbx1.isSelected();
			if (checkstatus==true){
			System.out.println("Checkbox is already checked");  
			}
			else
			{
			chkbx1.click();
			System.out.println("Checked the checkbox");
			}
			}  */
		
	/*	WebElement c1 = driver.findElement(By.xpath(".//*[@id='SchoolConfig_payment_credit_allowed']"));
		
		boolean s1 = c1.isSelected();
		
		if(s1==true){
			System.out.println("Checkbox is already checked");  
			}
			else
			{
				c1.click();
			System.out.println("Checked the checkbox");
			}  */
		
		
		
		
		
		
		
		
	}

}
