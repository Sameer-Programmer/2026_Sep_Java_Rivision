package foundation.conceptExeception;

public class Test001 {
    public static void main(String[] args) {

       try {
           System.out.println(10/0);
       } catch (Exception e) {
           System.out.println("Exception Handles");
       }finally {
           System.out.println("Executed");
       }

    }
}
/*
-throw Explicitly Through exception
- throws - declares an exection
 */