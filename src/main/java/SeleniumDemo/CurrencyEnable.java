package SeleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrencyEnable extends ConfigFileLogin {

	public void helper() {
		WebDriver driver = configFile();
		
		driver.findElement(By.linkText("Currencies")).click();
		for (int i = 1; i <= 50; i++) {

			{

				if (i == 50) {
					driver.findElement(By.xpath(
							"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[2]/ul[1]/li[2]/a[1]"))
							.click();
					helper();
				} else {

					driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[1]/a[1]/i[1]")).click();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					driver.findElement(
							By.cssSelector(".btn.btn-outline-light.border.text-dark.ml-1.btn-sm.dropdown-toggle"))
							.click();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					driver.findElement(By.cssSelector(
							"body > div > div > div.main-panel > div.content-wrapper.p-0 > div.app-heading > div > div:nth-child(1) > div > div > a:nth-child(1)"))
							.click();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					driver.findElement(
							By.cssSelector("div[class='btn-group border-0 d-flex w-100'] button[type='submit']"))
							.click();

					JavascriptExecutor jse = (JavascriptExecutor) driver;
					jse.executeScript("arguments[0].click()",
							driver.findElement(By.cssSelector("body > div.swal-overlay")));

					driver.findElement(By.cssSelector(".d-none.d-sm-block")).click();

					if (i % 16 == 0) {

						JavascriptExecutor js = (JavascriptExecutor) driver;
						js.executeScript("window.scrollBy(0,250)", "");
					}

				}
			}

		}

	}
}
