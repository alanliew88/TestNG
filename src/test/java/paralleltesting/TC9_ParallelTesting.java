package paralleltesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TC9_ParallelTesting {

    WebDriver driver;

    @Test
    void logotest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);
        WebElement logo = driver.findElement(By.xpath("//div[@class=\"orangehrm-login-logo\"]/img"));
        Assert.assertTrue(logo.isDisplayed());

    }

    @Test
    void homePageTitle() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);
        Assert.assertEquals(driver.getTitle(), "OrangeHRM");

    }

    @AfterMethod
    void tearDown(){
        driver.quit();
    }


}
