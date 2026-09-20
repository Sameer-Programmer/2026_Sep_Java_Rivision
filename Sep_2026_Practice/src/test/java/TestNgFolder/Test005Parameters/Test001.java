package TestNgFolder.Test005Parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test001 {

    @Parameters({"browser"})
    @Test
    public void m1(String br){
        switch (br){
            case "chrome": System.out.println("Running through chrome"); break;
            case "firefox": System.out.println("Running through Firfox"); break;
            case "edge": System.out.println("Running through Edge"); break;
            default:
                System.out.println("please select proper browser");

        }
    }
}
