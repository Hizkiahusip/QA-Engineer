package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JoinUsTestCase {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\GeckoDriver\\geckodriver.exe");
		WebDriver wd = new FirefoxDriver();
		
		wd.get("https://id.hm.com/");
		
		//button Sign in/Join
		wd.findElement(By.xpath("/html/body/div[1]/header/div[1]/div[2]/ul/li[4]")).click();
		
		wd.findElement(By.xpath("/html/body/div[1]/header/div[1]/div[2]/ul/div[2]/div/div/form/div[2]/button")).click();
		
		//first name
		wd.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("hizkia");
		
		//last name
		wd.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("parhusip");
		
		//email
		wd.findElement(By.xpath("//*[@id=\"popup-email_address\"]")).sendKeys("hizkiaparhusip@gmail.com");
		
		//password
		wd.findElement(By.xpath("//*[@id=\"popup-register-pass\"]")).sendKeys("1234");
		
		//terms and condition
		wd.findElement(By.xpath("//*[@id=\"register-input-custom\"]")).click();
		
		//join us button
		wd.findElement(By.xpath("/html/body/div[1]/header/div[1]/div[2]/ul/div[1]/div/form/div[1]/button")).click();
				
		System.out.println("Succesfully join us to website Online Store H&M");
		
		Thread.sleep(5000);
		
		wd.quit();


				


	}

}
