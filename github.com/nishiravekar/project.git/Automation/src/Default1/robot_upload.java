package Default1;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.Robot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class robot_upload {

	public static void main(String[] args) throws Exception {
		WebDriver driver =new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		WebElement Image = driver.findElement(By.xpath("//*[@id='photo']"));
		Image.click();
		
		StringSelection selection = new StringSelection("C:\\Users\\Nishikant Ravekar\\Desktop\\shopclues.png");

        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null); //copy the above string to clip board  
        
        Robot robot;
        robot = new Robot();

        robot.keyPress(KeyEvent.VK_ENTER);

        robot.keyRelease(KeyEvent.VK_ENTER);


        robot.delay(2000); 

        robot.keyPress(KeyEvent.VK_CONTROL);

        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_CONTROL); //paste the copied string into the dialog box

        robot.keyPress(KeyEvent.VK_ENTER);

        robot.keyRelease(KeyEvent.VK_ENTER); 

        driver.close();
	

	}

}
