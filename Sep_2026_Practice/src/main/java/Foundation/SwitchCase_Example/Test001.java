package Foundation.SwitchCase_Example;

public class Test001 {
    public static void main(String[] args) {
        String browser = "chromes";

        switch(browser){
            case "chrome": System.out.println("run through chrome"); break;
            case "Firefox": System.out.println("run through Firefox"); break;
            case "Edge": System.out.println("run through Edge"); break;
            default:
                System.out.println("Please select the Browsers");

        }
    }
}
