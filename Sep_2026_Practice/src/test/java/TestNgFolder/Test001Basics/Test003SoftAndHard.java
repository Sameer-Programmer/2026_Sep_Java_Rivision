package TestNgFolder.Test001Basics;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test003SoftAndHard {
    @Test
    public void m1(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(1>2);  // Here mention the Reference
        System.out.println("Sameer I am running");
        softAssert.assertAll(); // if we dont mention test case will pass

    }
    @Test
    public void m2(){
        Assert.assertTrue(false);
        System.out.println("I wont Execute because of Hard Assertions");
    }
}
