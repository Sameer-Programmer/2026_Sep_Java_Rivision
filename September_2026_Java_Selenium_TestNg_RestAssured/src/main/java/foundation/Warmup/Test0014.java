package foundation.Warmup;

public class Test0014 {

    public int getData(int num){
        num = num%60;
        return num;
    }


    public static void main(String[] args) {
        Test0014 ts = new Test0014();
        System.out.println(ts.getData(45));



    }
}
