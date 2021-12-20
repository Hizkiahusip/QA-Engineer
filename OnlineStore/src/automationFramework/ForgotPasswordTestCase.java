package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ForgotPasswordTestCase {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\GeckoDriver\\geckodriver.exe");
		WebDriver wd = new FirefoxDriver();
		
		wd.get("https://id.hm.com/");
		
		//button Sign in/Join
		wd.findElement(By.xpath("/html/body/div[1]/header/div[1]/div[2]/ul/li[4]")).click();
		
		wd.findElement(By.xpath("/html/body/div[1]/header/div[1]/div[2]/ul/div[2]/div/div/form/div[1]/p/a")).click();
		
		wd.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("hizkiaparhusip@gmail.com");
		
		wd.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/form/div/div/button/span")).click();
		
		System.out.println("Succesfully forgot password to website Online Store H&M");
		
		Thread.sleep(5000);
		
		wd.quit();

	}

}
