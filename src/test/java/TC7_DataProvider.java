import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TC7_DataProvider {

    //data provider are very important as it can be used for data driven testing , and it serve the
    //purpose of running a set of test with the different set of data

    @DataProvider(name = "LoginDataProvider")
    public Object [][]getData(){
            Object[][] data = {{"abc@gmail.com","abc"},{"cde@gmail.com","cde"},{"efg@gmail.com", "efg"}};
            return data;
    }


    @Test(dataProvider = "LoginDataProvider")
    void logintest(String email, String password){
        System.out.println(email +" "+ password);
    }





}
