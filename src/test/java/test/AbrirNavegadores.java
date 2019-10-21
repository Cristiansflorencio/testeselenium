package test;

import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbrirNavegadores {
	
	
	static WebDriver driver;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
		//driver = new FirefoxDriver();
		driver = new ChromeDriver();
		
		driver.get("http://www.youtube.com.br");
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.close();
		
		//driver.quit();
	}

	

	

}
