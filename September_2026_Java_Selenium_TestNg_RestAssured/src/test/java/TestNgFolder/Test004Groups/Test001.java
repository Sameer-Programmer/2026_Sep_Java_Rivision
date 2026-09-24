package TestNgFolder.Test004Groups;
import org.testng.annotations.Test;
public class Test001 {
    @Test (groups = {"sanity"})
    public void m1(){
        System.out.println("Sanity");
    }
    @Test (groups = {"sanity"})
    public void m2(){
        System.out.println("Sanity");
    }

    @Test (groups = {"Regression"})
    public void m3(){
        System.out.println("Regression");
    }
    @Test(groups = {"Regression"})
    public void m4(){
        System.out.println("Regression");
    }

    @Test(groups = {"sanity","Regression"})
    public void m5(){
        System.out.println("Regression_And_Sanity");
    }

    @Test(groups = {"sanity","Regression"})
    public void m6(){
        System.out.println("Regression_And_Sanity");
    }

}
