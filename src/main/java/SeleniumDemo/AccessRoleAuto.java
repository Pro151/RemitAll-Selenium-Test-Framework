package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.lang.Thread.sleep;

public class AccessRoleAuto extends ConfigFileLogin {


    public void accessRole() throws InterruptedException {
        WebDriver driver = configFile();

        driver.findElement(By.linkText("Access Roles")).click();
        driver.findElement(By.xpath("//span[@class='d-none d-sm-block']")).click();
        driver.findElement(By.name("q")).sendKeys("Client1");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".mdi.mdi-magnify")).click();
        driver.findElement(By.xpath("")).click();
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[3]/div/div[1]/div/div/div[1]/div/div[1]")).click();
        driver.findElement(By.id("title")).sendKeys("SubAdmin");
        driver.findElement(By.id("description")).sendKeys("SubAdmin access");
        driver.findElement(By.xpath("//span[normalize-space()='Save']")).click();


    }


	
}
