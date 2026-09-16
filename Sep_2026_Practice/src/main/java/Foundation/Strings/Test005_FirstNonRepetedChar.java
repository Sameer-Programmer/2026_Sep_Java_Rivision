package Foundation.Strings;

public class Test005_FirstNonRepetedChar {
    public static void main(String[] args) {

        String s1 = "aabbcde";
        for(int i = 0; i<s1.length();i++){
            int count = 0;
            for(int j = 0; j<s1.length();j++){
                if(s1.charAt(i)==s1.charAt(j)){
                    count++;
                }

            }

            if(count==1){
                System.out.println(s1.charAt(i));
                break;
            }
        }

    }
}
