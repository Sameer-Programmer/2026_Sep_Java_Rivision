package TestNgFolder.Test001Basics;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test004Dependency {
    @Test
    public void m1() {
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = {"m1"})
    public void m2() {
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = {"m1", "m2"})
    public void m3() {
        int a = 10;
        int b = 20;
        int total = a + b;
        System.out.println(total);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(40, 30);
        softAssert.assertAll();
    }
}
