package generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements IAutoconstant {
	protected static WebDriver driver;
	@BeforeMethod
	public void setUp() throws IOException
	{
		Flib flib = new Flib();
		String url = flib.readPropData(PROP_PATH,"url");
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
