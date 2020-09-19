package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoadUrl {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver Chrome = new ChromeDriver();
		Chrome.get("https://acme-test.uipath.com/login");
		Thread.sleep(400);
			WebElement email=Chrome.findElementById("email");
	email.sendKeys("kumar.testleaf@gmail.com");
	WebElement password=Chrome.findElementById("password");
	password.sendKeys("leaf@12");
	Chrome.findElementByXPath("//button[@type='submit']").click();
    System.out.println(Chrome.getTitle());
        Chrome.close();

		// 

	}
	
	}

