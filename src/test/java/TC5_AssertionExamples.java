import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC5_AssertionExamples {

    WebDriver driver;

    @BeforeTest
    void Setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com");

    }

    @Test (priority = 1)
    void logoTest() throws InterruptedException {
        Thread.sleep(5000);
        WebElement logo = driver.findElement(By.xpath("//div[@class='orangehrm-login-logo']/img"));

    }

    @Test (priority = 2)
    void homePageTitle(){
        String title = driver.getTitle();
        Assert.assertEquals("OrangeHRM", "OrangeHRM");
    }

    @AfterClass
    void tearDown(){
        driver.quit();
    }




}
