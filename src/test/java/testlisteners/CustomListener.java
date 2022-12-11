package testlisteners;

import org.testng.ITest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements ITestListener {


    //This belong to ItestListener and it will execute before the test
    public void onStart(ITestContext arg){

        System.out.println("Start Test Execution..."+arg.getName());

    }

    //This belong to Itestlistener and it will execute after the test
    public void onFinish(ITestContext arg){
        System.out.println("Finishing the test execution...."+ arg.getName());
    }

    public void onTestStart(ITestResult arg0){
        System.out.println("Start Test...."+ arg0.getName());
    }

    public void onTestSkipped(ITestResult arg0){
        System.out.println("Test Skipped...."+ arg0.getName());
    }

    public void onTestSuccess(ITestResult arg0){
        System.out.println("Test Success...."+ arg0.getName());
    }

    public void onTestFailure(ITestResult arg0){
        System.out.println("Test Failed...."+ arg0.getName());
    }
}
