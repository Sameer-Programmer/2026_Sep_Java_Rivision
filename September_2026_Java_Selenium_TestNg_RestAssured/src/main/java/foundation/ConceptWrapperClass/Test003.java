
package foundation.ConceptWrapperClass;
public class Test003 {

    public static void main(String[] args) {

        String s = "100";

        // parseInt() → returns primitive int
        int a = Integer.parseInt(s);

        // valueOf() → returns Integer object
        Integer b = Integer.valueOf(s);

        System.out.println(a);
        System.out.println(b);
    }
}