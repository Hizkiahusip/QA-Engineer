package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LoginTestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\GeckoDriver\\geckodriver.exe");
		WebDriver wd = new FirefoxDriver();
		
		wd.get("https://id.hm.com/");
		
		//button Sign in/Join
		wd.findElement(By.xpath("/html/body/div[1]/header/div[1]/div[2]/ul/li[4]")).click();
		
		//email
		wd.findElement(By.xpath("//*[@id=\"popup-email\"]")).sendKeys("hizkiaparhusip@gmail.com");
		
		//password
		wd.findElement(By.xpath("//*[@id=\"popup-pass\"]")).sendKeys("1234");
		
		//sign in button
		wd.findElement(By.xpath("//*[@id=\"pop-up-signin\"]")).click();
		
		System.out.println("Succesfully sign in to website Online Store H&M");
		
		Thread.sleep(5000);
		
		wd.quit();

	

	}

}
