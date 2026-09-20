package TestNgFolder.Test004Excel;

import org.testng.annotations.DataProvider;

import java.io.IOException;

public class Test002 {

    @DataProvider(name="Dp1_EUC")
    public String[][]  methodDP1() throws IOException {
        return Test001ExcelUtilityClass.m1();
    }
}
