package Default1;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class screenShot {

	
public static void main(String[] args) throws IOException {
		
		
	//	WebDriver driver =new FirefoxDriver();
		
		//driver.get("https://www.google.co.in/?gfe_rd=cr&ei=ggVpV4CKJrDT8gfU2YHoCg");
	      
	     //         File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	          
	         //     FileUtils.copyFile(scrFile, new File("D:\\screenshot.png"));
		
		
		    Random t = new Random();
		  int no =  t.nextInt(500);
		  
		  System.out.println("  "+no);
		    
		    
		}

		
	}
	

