package foundation.Strings;

public class Test004_Frequency {
    public static void main(String[] args) {
        String s1 = "aabbccdda"; //a2b2c
        int count =1;
        for(int i = 0; i<s1.length()-1; i++){
            if(s1.charAt(i)==s1.charAt(i+1)){
                count++;
            }else {
                System.out.println(s1.charAt(i)+" "+count);
                count =1;
            }

        }
        System.out.println(s1.charAt(s1.length()-1)+" "+count);


    }
}
