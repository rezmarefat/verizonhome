package common5;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class browsers5 {
	public static WebDriver driver;
  @BeforeClass
  @Parameters({"url","browser"})
  public void beforeClass(String wbsite, String br) {
			 if(br.equalsIgnoreCase("chrome")){
				 System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\verizonhomepage\\drivers\\chromedriver.exe ");
			  driver=new ChromeDriver();
			  driver.get(wbsite);
			 driver.manage().window().maximize();
			
		  }else if(br.equalsIgnoreCase("firefox")) {
			  System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\eclipse-workspace\\verizonhomepage\\drivers\\geckodriver.exe");
			  driver=new FirefoxDriver();
			  driver.get(wbsite);
			  driver.manage().window().maximize();
			
		  }else{
			  System.out.println("Please check name");
		  }
  }
  @AfterClass
  public void afterClass() {
  }
  public void screenshots(String source) throws IOException {
     
    File shots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(shots,new File(source+timestamp()+"screenshot.png"));
      }
  public String timestamp() {
      return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
  }
}