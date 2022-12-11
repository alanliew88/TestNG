package testlisteners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.ITestListener;

@Listeners(testlisteners.CustomListener.class)
public class ListenerTest1 {

    @Test
    void test1(){
        System.out.println("This is Test1");
        Assert.assertEquals("A","A");
    }

    @Test
    void test2(){
        System.out.println("This is Test2");
        Assert.assertEquals("A","B");
    }

    @Test
    void test3(){
        System.out.println("This is Test3");
        throw new SkipException("This is skip exception");
    }
}
