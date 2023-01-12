package rahulshettyacademy.TestComponent;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import rahulshettyacademy.PageObject.LandingPage;

public class BaseTest {
	
	public WebDriver driver;
	public LandingPage lp;
	public WebDriver initializaDriver() throws IOException
	{

	Properties prop = new Properties();
	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "\\src\\main\\java\\rahulshettyacademy\\resources\\GlobalData.properties");
	prop.load(fis);
	String browserName = prop.getProperty("browser");
	if(browserName.equalsIgnoreCase("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	return driver;
	
	}
	
	@BeforeMethod
	public LandingPage openWebsite() throws IOException
	{
		driver = initializaDriver();
		lp = new LandingPage(driver);
		lp.launchWebsite();
		return lp;
	}
	
	
}


//WebDriverManager.chromedriver().setup();
//WebDriver driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));