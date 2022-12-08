import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TC6_Parameters {

    WebDriver driver;

    @BeforeClass
    @Parameters({"Browser", "url"})
    void Setup(String browser, String url){

        if (browser.equalsIgnoreCase("Chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }else if (browser.equalsIgnoreCase("Firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        driver.get(url);

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
