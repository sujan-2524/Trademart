package trademartbase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basepage {
	public static WebDriver driver ;
	
	public  void launchchrome() {
	
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://products.ncryptedprojects.com/trademart/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
	//	WebDriverWait wait= new WebDriverWait(driver,);
		
	}
	
	public  void closeApplication() {
		driver.quit();
	}

}