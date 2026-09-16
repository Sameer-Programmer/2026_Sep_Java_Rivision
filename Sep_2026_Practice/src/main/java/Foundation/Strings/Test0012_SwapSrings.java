package Foundation.Strings;

public class Test0012_SwapSrings {
    public static void main(String[] args) {
        String s = "sameer";
        String r = "mohamed";

        s = s+r;
        System.out.println(s);//sameermohamed
        r = s.substring(0,6);
        System.out.println(r); //sameer
        s=s.substring(6);
        System.out.println(s); //mohamed
    }
}
