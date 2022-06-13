package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class AccessRoleAuto extends ConfigFileLogin {


    public void helper()  {
        WebDriver driver = configFile();

        driver.findElement(By.linkText("Access Roles")).click();
        driver.findElement(By.xpath("//span[@class='d-none d-sm-block']")).click();
        //driver.findElement(By.xpath("//input[@placeholder='Search.....']")).sendKeys("Client1");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //driver.findElement(By.xpath("//i[@class='mdi mdi-magnify']")).click();
        try {
            driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[3]/div/div[1]/div/div/div[1]/div/div[1]")).click();;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("selected the super admin");
        }

        driver.findElement(By.cssSelector("")).click();
        //driver.findElement(By.linkText("Super Administrator")).click();
        driver.findElement(By.id("title")).sendKeys("SubAdmin");
        driver.findElement(By.id("description")).sendKeys("SubAdmin access");
        JavascriptExecutor jse1 = (JavascriptExecutor) driver;
        jse1.executeScript("arguments[0].click()",
        driver.findElement(By.xpath("//span[normalize-space()='Save']")));


    }


	
}
