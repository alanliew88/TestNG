import org.testng.annotations.Test;

public class TC8_DataProvider_Sub {

    @Test(dataProvider = "LoginDataProvider", dataProviderClass = TC7_DataProvider.class)
    void logintest(String email, String password){
        System.out.println(email +" "+ password);
    }
}
