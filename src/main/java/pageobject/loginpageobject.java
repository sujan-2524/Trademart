package pageobject;

import org.openqa.selenium.By;

import trademartbase.basepage;

public class loginpageobject extends basepage {
	
	public static By clickOnLogin = By.xpath("//div[@class='login_signup']//a[@title = 'Log In']");
	public static By emailInputBox = By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]");
	public static By passwordInputBox = By.xpath("//input[@id='password']");
	public static By loginbutton = By.xpath("//button[@id='submitLogin']");
	public static By invaildErrorMsg = By.xpath("//span[@id = 'loginerr']");
	public static By forgotPassword =By.xpath("//a[@class = 'frgt-pass']");
	public static By checkBox = By.xpath("//input[@name ='isRemember']");
	public static By closeButton = By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/button[1]");
    public static By linkedInButton = By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/form[1]/div[2]/center[2]/div[1]/a[1]/img[1]");
	public static By faceBookButton = By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/form[1]/div[2]/center[2]/div[1]/a[2]/img[1]");
	public static By gmailButton = By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/form[1]/div[2]/center[2]/div[1]/a[3]/img[1]");
	
	
	
	//action methods
       public void firstloginButton(){
    	   driver.findElement(clickOnLogin).click();
    	   
       }
       
       public void enterEmail(String Email) {
    	   driver.findElement(emailInputBox).sendKeys(Email);
       }
	
       public void enterPassword(String password) {
    	   driver.findElement(passwordInputBox).sendKeys(password);
    	   
       }
	public void clickonSubmit() {
		driver.findElement(loginbutton).click();
		
	}
	public void errorMsg() {
		driver.findElement(invaildErrorMsg);
	}
	public void forgotpwd() {
		driver.findElement(forgotPassword).click();
		
	}
	public void checkbox() {
	driver.findElement(checkBox).click();
	
		
	}
	public void closebutton() {
		driver.findElement(closeButton);
		
	}
	public void linkedin() {
		driver.findElement(linkedInButton);
	}
	public void facebook() {
		driver.findElement(faceBookButton);
	}
	public void gmail() {
		driver.findElement(gmailButton);
	}
	
	
}
