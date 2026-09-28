package foundation.Strings;

public class Test020 {
    public static void main(String[] args) {
        String s = "Sameer you are a good Developer";
        // output = Sameer_you_are_a_good_Developer
        String  [] arr = s.split(" ");
        String result ="_";
        String out ="";
        System.out.println(arr.length);

        for(int i = 0; i< arr.length;i++){
            if(i==arr.length-1){
                out = out+arr[i];
            }else {
                out = out+arr[i]+result;
            }

        }
        System.out.println(out);



    }
}
