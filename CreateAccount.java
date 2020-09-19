package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {
	public static void main(String[] args) throws InterruptedException {

	WebDriverManager.chromedriver().setup();
	ChromeDriver Chrome = new ChromeDriver();
	Chrome.manage().window().maximize();
	Chrome.get("http://leaftaps.com/opentaps/control/main");
	Thread.sleep(400);
	Chrome.findElementById("username").sendKeys("demosalesmanager");
	Chrome.findElementById("password").sendKeys("crmsfa");
	Chrome.findElementByClassName("decorativeSubmit").click();
	Chrome.findElementByLinkText("CRM/SFA").click();
	Chrome.findElementByLinkText("Accounts").click();
	Chrome.findElementByLinkText("Create Account").click();
	Chrome.findElementById("accountName").sendKeys("Current Account");
	Chrome.findElementByName("description").sendKeys("Worker");
	Chrome.findElementById("groupNameLocal").sendKeys("van2025");
	Chrome.findElementById("officeSiteName").sendKeys("Nanganallur");
	Chrome.findElementById("annualRevenue").sendKeys("1,20,200");
	WebElement industry = Chrome.findElementByName("industryEnumId");
	Select sel=new Select(industry);
	sel.selectByIndex(3);
	WebElement ownership = Chrome.findElementByName("ownershipEnumId");
	Select sel1=new Select(ownership);
	sel1.selectByVisibleText("S-Corporation");
	WebElement source = Chrome.findElementById("dataSourceId");
	Select sel2=new Select(source);
	sel2.selectByValue("LEAD_EMPLOYEE");
	WebElement marketing = Chrome.findElementById("marketingCampaignId");
	Select sel3=new Select(marketing);
	sel3.selectByIndex(6);
	WebElement state = Chrome.findElementById("generalStateProvinceGeoId");
	Select sel4=new Select(state);
	sel4.selectByValue("TX");
	Chrome.findElementByClassName("smallSubmit").click();
	WebElement ownership1 = Chrome.findElementByName("ownershipEnumId");
	Select sel11=new Select(ownership1);
	
Chrome.close();
	}
	
}
