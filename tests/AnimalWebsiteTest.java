import static org.junit.Assert.*;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnimalWebsiteTest {
	
	
	WebDriver driver;
	final String URL = "https://www.webdirectory.com/Animals/";
	final String DRIVER_PATH = "/Users/macstudent/Desktop/chromedriver";

	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver",DRIVER_PATH);
		driver = new ChromeDriver();
		
		driver.get(URL);
		
	}

	@After
	public void tearDown() throws Exception {
		
		Thread.sleep(1000);
		TimeUnit.SECONDS.sleep(1);
		driver.close();
		
	}

	@Test
	public void testNumberOfLinks() {
//		fail("Not yet implemented");
		
		List<WebElement> listOfLinks = driver.findElements(By.cssSelector("ul li a"));
		
		
		int numLinks = listOfLinks.size();
		assertEquals(10, numLinks);
		
	}

}
