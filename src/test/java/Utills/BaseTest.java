package Utills;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

public class BaseTest {
	public static WebDriver driver;

	static File file = new File("./Resources/propertiesFile/configuration.properties");
	static FileInputStream fi = null;
	protected static Properties prop = new Properties();
	static {
		try {
			fi = new FileInputStream(file);

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		}
		try {
			prop.load(fi);
		} catch (IOException el) {
			el.printStackTrace();

		}
	}


	@BeforeMethod
	public static void intializeDriver() {
		System.setProperty("webdriver.chrome.driver", prop.getProperty("driverPath"));
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@BeforeMethod
	public static void openBrowser() throws InterruptedException {

		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@AfterMethod
	public static void closeBrowser() 
	{

	driver.quit();

	}
}
