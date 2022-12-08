import org.testng.annotations.Test;

public class TC4_Grouping {

    @Test(groups={"regression"}, priority = 1)
    void setup(){
        System.out.println("regression");
    }


    @Test (groups={"sanity"}, priority = 2)
    void setap00(){
        System.out.println("sanity");
    }

    @Test (groups={"sanity", "regression"}, priority = 3)
    void teardown(){
        System.out.println("regression and sanity");
    }
    @Test(priority = 4)
    void setup1(){
        System.out.println("4");
    }
    @Test (priority = 5 )
    void login1(){
        System.out.println("5");
    }

    @Test (priority = 6)
    void teardown1(){
        System.out.println("6");
    }
}
