package SeleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.print.DocFlavor;

public class CountryConfig extends ConfigFileLogin {

    public void helperCountry() {

        WebDriver driver = configFile();
        driver.findElement(By.linkText("Countries")).click();
        int j;
        for (j = 26; j <= 40; j++) {

            driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/div/table/tbody/tr[" + j + "]/td[1]"))
                    .click();

           /* for (int k = 1; k <= 3; k++) {
                driver.findElement(By.xpath(
                                "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]/span[1]"))
                        .click();
                driver.findElement(By.xpath("//span[normalize-space()='Add']")).click();


                // Platform selection drop down
                WebElement dropDownElement =
                        driver.findElement(By.xpath("//*[@id='platform-id-selectized']"));
                dropDownElement.click();
                driver.findElement(By.xpath(
                        "/html/body/div/div/div[2]/div/form/div[3]/div/div[1]/div/div/div[1]/div/div[2]/div/div[" + k + "]"
                )).click();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ie) {
                }

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

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ie) {
                }

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
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ie) {
                }
                JavascriptExecutor jse = (JavascriptExecutor) driver;
                jse.executeScript("arguments[0].click()",
                        driver.findElement(By.cssSelector("body > div.swal-overlay")));
                driver.findElement(By.className("d-sm-block")).click();
            }


            // Payment channel config end
            // ***************************************************************************************************************************

            // Payout channel config start
            // ***************************************************************************************************************************


            for (int l = 1; l <= 5; l++) {

                driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div/div[2]/div/div/ul/li[2]/a/span[1]")).click();
                driver.findElement(By.xpath("//span[normalize-space()='Add']")).click();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ie) {
                }
                //currency
                WebElement dropDownElement7 = driver.findElement(By.xpath("//*[@id='currency-id-selectized']"));
                dropDownElement7.click();
                driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[3]/div/div[1]/div/div/div[1]/div/div[2]/div/div[1]")).click();


                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ie) {
                }

                //payout method
                WebElement dropDownElement8 = driver.findElement(By.xpath("//*[@id='delivery-method-id-selectized']"));
                dropDownElement8.click();
                driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[3]/div/div[1]/div/div/div[2]/div/div[2]/div/div[" + l + "]")).click();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ie) {
                }

//				//Minimum Payout Amount
                driver.findElement(By.id("min-payout-amount")).sendKeys("100.00");

                //Maximum Payout Amount
                driver.findElement(By.id("max-payout-amount")).sendKeys("1000.00");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ie) {
                }

                //driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[10]/div[1]/div[1]")).click();
                //driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[11]")).click();
                //save
                driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/button[1]")).click();
                JavascriptExecutor jse1 = (JavascriptExecutor) driver;
                jse1.executeScript("arguments[0].click()",
                        driver.findElement(By.cssSelector("body > div.swal-overlay")));
                driver.findElement(By.className("d-sm-block")).click();

            }
*/
            // Payout channel config end
            // ***************************************************************************************************************************

            //Client payment bank account config start
            //****************************************************************************************************************************


            for (int m = 1; m <= 3; m++) {
                driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div/div[2]/div/div/ul/li[3]/a/span[2]")).click();
                driver.findElement(By.xpath("//span[normalize-space()='Add']")).click();
                //bank logo
                //platform
                WebElement dropDownElement9 =
                        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]"));
                dropDownElement9.click();
                driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[3]/div/div[1]/div/div/div[2]/div/div[2]/div/div[" + m + "]")).click();
                //currency
                //destination
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ie) {
                }
                //Bank name
                driver.findElement(By.id("bank-name")).sendKeys("HDRC");
                driver.findElement(By.linkText("Add Account Property")).click();
                driver.findElement(By.id("property")).sendKeys("IBAN");
                driver.findElement(By.id("property-value")).sendKeys("IBAN000000000000000");
                driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
                driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/button[1]")).click();
                JavascriptExecutor jse2 = (JavascriptExecutor) driver;
                jse2.executeScript("arguments[0].click()",
                        driver.findElement(By.cssSelector("body > div.swal-overlay")));
                driver.findElement(By.className("d-sm-block")).click();

                //Client payment bank account config end
                //****************************************************************************************************************************
            }
            driver.findElement(By.className("d-sm-block")).click();
        }


    }


}
