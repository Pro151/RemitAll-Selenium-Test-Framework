package SeleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TraversingFromDashboard extends ConfigFileLogin{

	public void helper1() {
		WebDriver driver = configFile();

		// for login
		//login(driver);

		// dashboard
		
		driver.findElement(By.linkText("Dashboard")).click();
		

		// orders
		driver.findElement(By.linkText("Orders")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Show']")).click();
		try {
			driver.findElement(By.xpath("//a[normalize-space()='75 records']")).click();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Done Selection in order");
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[1]/form/div/div/div/i")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[@class='item']")).click(); //
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("q")).sendKeys("Arun");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.className("mdi-filter")).click();
		driver.findElement(By.xpath("//span[@class='d-none d-sm-block']")).click();
		driver.findElement(By.xpath("//span[@class='d-none d-sm-block']")).click();

		// analytics
		driver.findElement(By.xpath("//a[normalize-space()='Analytics']")).click();
		driver.findElement(By.xpath("//span[@class='mdc-list-item__secondary-text']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Show']")).click();
		commonHeader(driver,"analytics done");
		driver.findElement(By.id("q")).sendKeys("Arun");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[@class='d-none d-sm-block']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		
		
		// earning statements
		driver.findElement(By.xpath("//a[normalize-space()='Earnings Statement']")).click(); //
		driver.findElement(By.xpath("//button[normalize-space()='Show']")).click();

		try {
			driver.findElement(By.xpath("//a[normalize-space()='75 records']")).click();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Done Selection in earning statements");
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("q")).sendKeys("Arun");
		driver.findElement(By.linkText("All")).click();
		driver.findElement(By.linkText("Active")).click();
		driver.findElement(By.linkText("Disabled")).click();

		driver.findElement(By.xpath("//button[@id='toggleSidebar']//span[@class='mdi mdi-menu']")).click();
		driver.findElement(By.xpath("//button[@id='toggleSidebar']//span[@class='mdi mdi-menu']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Dashboard")).click();

		
		// Earning settlements
		driver.findElement(By.xpath("//a[normalize-space()='Earnings Settlements']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[normalize-space()='Show']")).click();
		commonHeader(driver,"Earning settlements done");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("q")).sendKeys("Arun");
		driver.findElement(By.linkText("All")).click();
		driver.findElement(By.id("q")).sendKeys("Arun");
		driver.findElement(By.linkText("Due")).click();
		driver.findElement(By.id("q")).sendKeys("Arun");
		driver.findElement(By.linkText("Processed")).click();
		driver.findElement(By.id("q")).sendKeys("Arun");

		
		// customers
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[normalize-space()='Customers']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[normalize-space()='Show']")).click();
		commonHeader(driver,"customers done");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("q")).sendKeys("Arun");
		driver.findElement(By.linkText("All")).click();
		driver.findElement(By.id("q")).sendKeys("Arun");
		driver.findElement(By.linkText("Live")).click();
		driver.findElement(By.id("q")).sendKeys("Arun");
		driver.findElement(By.linkText("Blocked")).click();
		driver.findElement(By.id("q")).sendKeys("Arun");
		driver.findElement(By.linkText("Suspended")).click();
		driver.findElement(By.id("q")).sendKeys("Arun");
		driver.findElement(By.linkText("Flagged")).click();
		driver.findElement(By.id("q")).sendKeys("Arun");
		driver.findElement(By.xpath("//span[@class='d-none d-sm-block']")).click();
		
		
		
		// Documents verification
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[normalize-space()='Document Verification']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[normalize-space()='Show']")).click();
		commonHeader(driver,"Documents verification done");//calling common header
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("q")).sendKeys("Arun");
		driver.findElement(By.xpath("//span[@class='d-none d-sm-block']")).click();

		
		
		// customer documents
		driver.findElement(By.xpath("//a[normalize-space()='Customer Documents']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[normalize-space()='Show']")).click();
		commonHeader(driver,"Customer document done");//calling common header
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("q")).sendKeys("Arun");
		driver.findElement(By.linkText("All")).click();
		driver.findElement(By.id("q")).sendKeys("Arun");
		driver.findElement(By.linkText("Pending")).click();
		driver.findElement(By.id("q")).sendKeys("Arun");
		driver.findElement(By.linkText("Accepted")).click();
		driver.findElement(By.id("q")).sendKeys("Arun");
		driver.findElement(By.linkText("Rejected")).click();
		driver.findElement(By.id("q")).sendKeys("Arun");
		driver.findElement(By.xpath("//span[@class='d-none d-sm-block']")).click();

		
		
		// Customer Login Logs
		driver.findElement(By.xpath("//a[normalize-space()='Customer Login Logs']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[normalize-space()='Show']")).click();
		commonHeader(driver,"Customer Login Logs done");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("q")).sendKeys("Arun");
		driver.findElement(By.xpath("//span[@class='d-none d-sm-block']")).click();

	}

//	private static void login(WebDriver driver) {
//		driver.findElement(By.id("username")).sendKeys("super.admin");
//		driver.findElement(By.id("password")).sendKeys("Secret");
//		driver.findElement(By.id("toggle-password")).click();
//		driver.findElement(By.className("btn-block")).click();
//
//	}

	private static void commonHeader(WebDriver driver,String message) {
		try {
			driver.findElement(By.xpath("//a[normalize-space()='75 records']")).click();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println(message);
		}
		driver.findElement(By.xpath("//input[@id='date-range']")).click(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		for (int i = 0; i <= 4; i++) {
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/table/thead/tr[1]/th[1]")).click();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		for (int i = 0; i <= 2; i++) {
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/table/tbody/tr[2]/td[3]")).click();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[normalize-space()='Apply']")).click();

	}

}
