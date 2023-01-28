package genericPackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements IAutoConstant {
	static WebDriver driver;
	@BeforeMethod
	public void steUp()
	{
		 Flib flib = new Flib();
	     browservalue = flib.readPropertydata(PROP_PATH, "Browser");
	}
	
	

	
	
	
}
