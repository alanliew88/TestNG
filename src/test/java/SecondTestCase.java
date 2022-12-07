import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestCase {
    @Test(priority = 1)
    void setup(){
        System.out.println("Opening Browser");
    }

    @Test(priority = 2)
    void searchCustomer(){
        System.out.println("This is searching customer");
    }

    @Test(priority = 3)
    void addcustomer(){
        System.out.println("This is to add customer");
        Assert.assertEquals(1,2);
    }
}
