package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeLogin {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver Chrome = new ChromeDriver();
		Chrome.manage().window().maximize();
		Chrome.get("https://www.google.com/search?q=youtube&oq=you&aqs=chrome.1.69i60j0j69i57j46j0j69i65j69i61l2.5146j0j7&sourceid=chrome&ie=UTF-8");
		Chrome.close();


	}

}
