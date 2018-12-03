package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public abstract class Basetest implements Const {
	public WebDriver driver;
	
	@ BeforeSuite
	public void setuppath()
	{
		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
	}

	
	@BeforeMethod
	public void openapp()
	{
		WebDriver driver=new InternetExplorerDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.hometown.in/");
	}
	@AfterMethod
	public void closeapp()
	{
		driver.quit();
	}
}
