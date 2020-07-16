package runvrizon5;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import common5.browsers5;
import net.bytebuddy.asm.Advice.Enter;
import pages.pagemain;

public class verizonfirst extends browsers5 {
  @Test
  public void f() throws InterruptedException {
	  
	
	/*1  verizon // Actions cntro=new Actions(driver);
	1 // WebElement pointer=driver.findElement(By.linkText("Shop"));
	1  //cntro.moveToElement(pointer).perform();
	  1//Thread.sleep(5000);
	1  pagemain obj5=new pagemain (driver);
		1 obj5.Internet();
		1 */
	/*  pagemain obj5=new pagemain (driver);
	  2 obj5.Internet();
	  2 obj5.search();
	  2  Thread.sleep(4000);
	2 obj5.phoneclick();
	*/
	  pagemain obj5=new pagemain (driver);
	  obj5.signin1();
	  obj5.userandpass();
	  Thread.sleep(3000);
	  driver.navigate().back();
	  driver.navigate().back();

	  
	  
	  
	  
	  
  }
}
