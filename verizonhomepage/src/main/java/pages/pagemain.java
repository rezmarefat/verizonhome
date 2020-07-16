package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pagemain {
  WebDriver driver;
  
  @FindBy(xpath ="//span[contains(text(),'Search')]")
  WebElement shop;
  @FindBy( id="globalSearch")
  WebElement search2;
  @FindBy( xpath = "//main//li[2]//div[1]//div[1]//img[1]")
  WebElement phone;
  @FindBy(xpath = "//label[2]//span[1]//div[1]//div[1]")
  WebElement colour;
  @FindBy(id =   "signoutText")
  WebElement signin;
  @FindBy(xpath =   "//span[contains(text(),'My Account')]")
  WebElement myaccount;
  @FindBy(id = "loginHeaderUsername")
  WebElement username2;
  @FindBy(id = "loginHeaderPassword")
  WebElement pass2;
  @FindBy(id = "loginHeaderButton")
  WebElement submit2;
  
  
//span[contains(text(),'My Account')]
  
  
  
  //create page factory constructure
  public pagemain(WebDriver driver) {
    this.driver=driver;
    PageFactory.initElements(driver, this);
  }
  //create meter according to the action

  public void Internet() {
	  shop.click();
  }
  public void search() {
	 search2.sendKeys("apple");
	 search2.sendKeys(Keys.ENTER);
  }
  public void phoneclick() {
	phone.click();
	colour.click();
	
  }
  public void signin1() {
signin.click();
myaccount.click();

	
  }
  public void userandpass(String logindp) {
	  username2.sendKeys(logindp);
	  
	
	  
	
	    }

public void pass2(String passdp) {
	pass2.sendKeys(passdp);
	
}
public void submit2() {
	submit2.click();
	
}
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  

  
  }