package SeleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class ConfigFileLogin {

	public WebDriver configFile() {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Promit\\Downloads\\Softwares\\chromedriver_win32\\chromedriver.exe");

		// System.setProperty("webdriver.edge.driver","C:\\Users\\Promit\\Downloads\\Softwares\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		// WebDriver driver= new EdgeDriver();
		driver.get("https://backend.staging.remitall.co.uk/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("username")).sendKeys("super.admin");
		driver.findElement(By.id("password")).sendKeys("Secret");
		driver.findElement(By.className("btn-block")).click();
		return driver;

	}

}
