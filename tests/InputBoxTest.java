import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputBoxTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSingleInputField() {
//		fail("Not yet implemented");
		
		System.setProperty("webdriver.chrome.driver","/Users/macstudent/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		
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
		
		driver.close();
		
	}
	
	public void testTwoInputFields() {
		
	}

}
