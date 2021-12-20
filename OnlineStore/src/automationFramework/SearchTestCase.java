package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchTestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\GeckoDriver\\geckodriver.exe");
		WebDriver wd = new FirefoxDriver();
		
		wd.get("https://id.hm.com/");
		
		//input produk yang dicari
		wd.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("Baju");
		
		//button search produk
		wd.findElement(By.xpath("/html/body/div[1]/header/div[3]/div[2]/div[2]/form/div[2]/button")).click();
		
		System.out.println("Succesfully opened and search keyword the website Online Store H&M");
		
		Thread.sleep(5000);
		
		wd.quit();

	}

}
