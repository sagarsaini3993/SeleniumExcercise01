import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputBoxTest {
	
	
	WebDriver driver;
	final String URL = "https://www.seleniumeasy.com/test/basic-first-form-demo.html";
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
	public void testSingleInputField() throws Throwable{
//		fail("Not yet implemented");
		
		
		
//		1. Find the textbox.   (id = user-message)
//		2. Type "Hello World" into textbox.
//		3. Find the Button.		(????)
//		4. Click on the Button
//		5. Find the output msg thing.	(id = display)
//		6. check the output message.	(expected result = "Hello World")
		
		WebElement textBox = driver.findElement(By.id("user-message"));
		textBox.sendKeys("Hello World");
		
		WebElement button = driver.findElement(By.cssSelector("form#get-input button"));
		button.click();
		
		WebElement outputSpan = driver.findElement(By.id("display"));
		String outputMessage = outputSpan.getText();
		
		assertEquals("Hello World", outputMessage);
		
		Thread.sleep(1000);
		TimeUnit.SECONDS.sleep(1);
		driver.close();
		
	}
	
	public void testTwoInputFields() {
		
	}

}
