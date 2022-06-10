package SeleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CountryConfig extends ConfigFileLogin {

	public void helperCountry() {
		
		WebDriver driver = configFile();
		driver.findElement(By.linkText("Countries")).click();
		int j;
		for (j = 1; j <= 40; j++) {

			driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/div/table/tbody/tr[" + j + "]/td[1]"))
					.click();
			driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]/span[1]"))
					.click();
			driver.findElement(By.xpath("//span[normalize-space()='Add']")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			// Platform selection drop down
			/*
			 * WebElement dropDownElement =
			 * driver.findElement(By.xpath("//*[@id='platform-id-selectized']"));
			 * dropDownElement.click(); driver.findElement(By .xpath(
			 * "/html/body/div/div/div[2]/div/form/div[3]/div/div[1]/div/div/div[1]/div/div[2]/div/div[3]"
			 * )) .click();
			 */

			// select currency drop-down
			WebElement dropDownElement1 = driver.findElement(By.xpath("//*[@id='currency-id-selectized']"));
			dropDownElement1.click();
			driver.findElement(By
					.xpath("/html/body/div/div/div[2]/div/form/div[3]/div/div[1]/div/div/div[2]/div/div[2]/div/div[2]"))
					.click();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

			// select payment method
			WebElement dropDownElement2 = driver.findElement(By.xpath("//*[@id='payment-method-id-selectized']"));
			dropDownElement2.click();
			driver.findElement(
					By.xpath("/html/body/div/div/div[2]/div/form/div[3]/div/div[1]/div/div/div[3]/div/div[2]/div/div"))
					.click();

			// drpDwn1.selectByIndex(1);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

			// select payment interface
			WebElement dropDownElement3 = driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]"));
			dropDownElement3.click();
			driver.findElement(By
					.xpath("/html/body/div/div/div[2]/div/form/div[3]/div/div[1]/div/div/div[4]/div/div[2]/div/div[1]"))
					.click();

			// set minimum transaction amount
			driver.findElement(By.id("min-txn-amount")).sendKeys("100");

			// set maximum transaction amount
			driver.findElement(By.id("max-txn-amount")).sendKeys("10000");

			// set maximum multiple of amount
			driver.findElement(By.id("x-payment-amount")).sendKeys("0.50");
			// driver.findElement(By.cssSelector("button[class='btn btn-sm
			// btn-success']")).clear();
			// driver.findElement(By.cssSelector("a[class='text-dark']
			// span[class='d-sm-block']")).click();
			// driver.findElement(By.cssSelector(".btn.btn-sm.text-nowrap.btn-outline-light.border.text-dark")).click();
			driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[2]/div/button/span[2]")).click();
			driver.findElement(By.linkText("Back to home")).click();

			// Payment channel config end
			// ***************************************************************************************************************************

			// Payout channel config start
			// ***************************************************************************************************************************

			/*
			 * driver.findElement(By.
			 * xpath("//span[normalize-space()='No active payout channels.']")).click();
			 * driver.findElement(By.cssSelector(".btn.btn-sm.btn-primary")).click();
			 * 
			 * // currency selection Select payout0 = new
			 * Select(driver.findElement(By.xpath("")));
			 * payout0.selectByVisibleText("AFN - Afghan afghani");
			 * 
			 * // Payout Method selection Select payout1 = new
			 * Select(driver.findElement(By.xpath("//div/div[1]/div[@class='option']")));
			 * payout1.selectByVisibleText("AFN - Afghan afghani");
			 * 
			 * // set minimum transaction amount
			 * driver.findElement(By.id("min-payout-amount")).sendKeys("100");
			 * 
			 * // set minimum transaction amount
			 * driver.findElement(By.id("max-payout-amount")).sendKeys("100");
			 * 
			 * // Input only Payout Amount Select payout2 = new
			 * Select(driver.findElement(By.cssSelector(
			 * ".selectize-input.items.full.has-options.has-items.focus.input-active.dropdown-active']"
			 * ))); payout2.selectByVisibleText("Yes");
			 * 
			 * // Individual Recipient Allowed Select payout3 = new
			 * Select(driver.findElement(By.cssSelector(
			 * ".selectize-input.items.full.has-options.has-items.focus.input-active.dropdown-active"
			 * ))); payout3.selectByVisibleText("Yes");
			 * 
			 * // Ask for Middle Name Select payout4 = new
			 * Select(driver.findElement(By.cssSelector(
			 * ".selectize-input.items.full.has-options.has-items.focus.input-active.dropdown-active"
			 * ))); payout4.selectByVisibleText("No");
			 * 
			 * // Business Recipient Allowed Select payout5 = new
			 * Select(driver.findElement(By.cssSelector(
			 * ".selectize-input.items.full.has-options.has-items.focus.input-active.dropdown-active"
			 * ))); payout5.selectByVisibleText("No");
			 * 
			 * // Subscription Service Select payout6 = new
			 * Select(driver.findElement(By.cssSelector(
			 * ".selectize-input.items.full.has-options.has-items.focus.input-active.dropdown-active"
			 * ))); payout6.selectByVisibleText("No");
			 */
	}
		
		

	}

}
