package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccessRoleAuto extends ConfigFileLogin {


    public void accessRole() {
        WebDriver driver = configFile();

        driver.findElement(By.linkText("Access Roles")).click();


    }


	
}
