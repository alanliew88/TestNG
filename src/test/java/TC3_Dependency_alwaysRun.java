import org.testng.annotations.Test;

public class TC3_Dependency_alwaysRun {

    @Test
    void startcar(){
        System.out.println("Car Starting..");
    }
    @Test (dependsOnMethods = "startcar")
    void drivecar(){
        System.out.println("Vvroom vrromm");
    }

    @Test (dependsOnMethods = {"startcar", "drivecar"}, alwaysRun = true)
    void stopcar(){
        System.out.println("tik tik");
    }

}
