package trainingtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	public  void accountlogin() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://acme-testuipath.com/account/login");
		WebElement email = driver.findElementByXPath("//*[@id='email']");
		email.sendKeys("Kumar.testleaf@gmail.com");
		WebElement password = driver.findElementByXPath("//*[@id='password']");
		password.sendKeys("leaf@12");
		WebElement login = driver.findElementByXPath("//*[@id='buttonLogin']");
		login.click();
		WebElement Vendorbutton = driver.findElementByXPath("//*[@id='dashmenu']/div[5]/button");
		Vendorbutton.click();
		Actions select = new Actions(driver);
		select.moveToElement(Vendorbutton);
		WebElement searchvendor = driver.findElementByXPath("//a[text()='Search for Invoice']");
		searchvendor.click();
		WebElement vendorname = driver.findElementByXPath("//input[@id='vendorName']");
		vendorname.sendKeys("Blue Lagoon");
		WebElement search = driver.findElementByXPath("//button[@id='buttonSearch']");
		search.click();
		String countryname = driver.findElementByXPath("//td[text()='France']").getText();
		
		 
		
		
	}

}
