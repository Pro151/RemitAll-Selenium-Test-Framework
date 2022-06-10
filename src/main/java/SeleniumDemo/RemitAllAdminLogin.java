package SeleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class RemitAllAdminLogin {

	public static void main(String[] args) {
		
		//invoking driver
		//chrome -> ChromeDriver -> MET
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Promit\\Downloads\\Softwares\\chromedriver_win32\\chromedriver.exe");
		
		//System.setProperty("webdriver.edge.driver","C:\\Users\\Promit\\Downloads\\Softwares\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//WebDriver driver= new EdgeDriver();
		driver.get("https://backend.staging.remitall.co.uk/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("username")).sendKeys("super.admin");
		driver.findElement(By.id("password")).sendKeys("Secret");
		driver.findElement(By.id("toggle-password")).click();
		//driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/form/div[6]/button")).click();
		driver.findElement(By.className("btn-block")).click();
		driver.findElement(By.linkText("Orders")).click();
		driver.findElement(By.linkText("Currencies")).click();
		
		//Currency enable
		/*int i;
		for(i=25;i<=45;i++) {
			
		driver.findElement(By.xpath("//tbody/tr["+i+"]/td[1]/a[1]/i[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector(".btn.btn-outline-light.border.text-dark.ml-1.btn-sm.dropdown-toggle")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("body > div > div > div.main-panel > div.content-wrapper.p-0 > div.app-heading > div > div:nth-child(1) > div > div > a:nth-child(1)")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("div[class='btn-group border-0 d-flex w-100'] button[type='submit']")).click();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", driver.findElement(By.cssSelector("body > div.swal-overlay")));
		
		driver.findElement(By.cssSelector(".d-none.d-sm-block")).click();
		
		}*/
		//driver.close();
		////tbody/tr[9]/td[1]/a[1]/i[1]
		////tbody/tr[8]/td[1]/a[1]/i[1]
		//driver.quit();
		
		
		

	}

}
