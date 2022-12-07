import org.testng.annotations.Test;

public class TC2_Priority_Disabled {

    @Test (priority = 1)
    void setup(){
        System.out.println("Opening Browser");
    }
    @Test (priority = 2, enabled = false)
    void login(){
        System.out.println("This is login test");
    }

    @Test (priority = 3)
    void teardown(){
        System.out.println("Closing Browser");
    }

}
