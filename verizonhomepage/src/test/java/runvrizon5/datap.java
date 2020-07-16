package runvrizon5;

import org.testng.annotations.Test;

import common5.browsers5;
import pages.pagemain;

import org.testng.annotations.DataProvider;

public class datap extends browsers5 {
  @Test(dataProvider = "dp")
  public void f(String n, String s) throws InterruptedException {
	  
	  pagemain obj5=new pagemain (driver);
	  obj5.signin1();
	  obj5.userandpass(n);
	  obj5.pass2(s);
	  obj5.submit2();
	  driver.navigate().back();
	  driver.navigate().back();
	  
	  
	 
	  
	  

	  
	  
	  
  }
  

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "reza", "21231561" },
      new Object[] { "koorosh", "6545456456" },
      new Object[] { "trump", "848489" },
    };
  }
}
