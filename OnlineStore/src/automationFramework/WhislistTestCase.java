package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WhislistTestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\GeckoDriver\\geckodriver.exe");
		WebDriver wd = new FirefoxDriver();
		
		wd.get("https://id.hm.com/");
		
		//menu men
		wd.findElement(By.xpath("/html/body/div[1]/header/div[3]/div[1]/div/div[2]/div/nav/ul/li[2]/a")).click();
		
		//sub-menu clothes
		wd.findElement(By.xpath("/html/body/div[1]/main/div[2]/div[1]/div/aside/nav/ul/li[1]/ul/li[1]/a")).click();
		
		//add to whislist
		wd.findElement(By.xpath("//*[@id=\"wishlist263360\"]")).click();
		
		//open favourite
		wd.findElement(By.xpath("/html/body/div[1]/header/div[1]/div[2]/ul/li[5]/a")).click();
		
		System.out.println("Succesfully add to whislist website Online Store H&M");
		
		Thread.sleep(5000);
		
		wd.quit();


	}

}
