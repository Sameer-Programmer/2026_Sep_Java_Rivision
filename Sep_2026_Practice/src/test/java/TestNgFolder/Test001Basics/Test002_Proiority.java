package TestNgFolder.Test001Basics;

import org.testng.annotations.Test;

public class Test002_Proiority {
    @Test(priority = 1)
    public void m1(){
        System.out.println("Sameer-p2");
    }

    @Test(priority = 2)
    public void m2(){
        System.out.println("Sameer");
    }
}
