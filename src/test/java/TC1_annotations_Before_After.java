import org.testng.annotations.*;

public class TC1_annotations_Before_After {

    @BeforeClass
    void beforeClass(){
        System.out.println("This is before class ... ");
    }

    @AfterClass
    void afterClass(){
        System.out.println("This is after class ...");
    }

    @BeforeMethod
    void beforemethod(){
        System.out.println("This is before method..");
    }

    @AfterMethod
    void aftermethod(){
        System.out.println("This is after method...");
    }

    @Test
    void simplelogin(){
        System.out.println("Loggin in ...");
    }

    @Test
    void simplelogout(){
        System.out.println("Logging out...");
    }

    @BeforeSuite
    void beforeSuite(){
        System.out.println("This is before suite...");
    }

    @AfterSuite
    void afterSuite(){
        System.out.println("This is after suite");
    }
}
