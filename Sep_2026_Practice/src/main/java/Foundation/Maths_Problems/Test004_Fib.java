package Foundation.Maths_Problems;

public class Test004_Fib {
    public static void main(String[] args) {
        int a =0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);

        for(int i =0; i<3; i++){
            int c = a+b; // c = 1
            System.out.println(c);
            a=b; //1
            b =c; //1


        }
    }
}
