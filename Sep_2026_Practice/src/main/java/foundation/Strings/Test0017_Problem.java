package foundation.Strings;

public class Test0017_Problem {

    public static void main(String[] args) {
        // Toggle Case (HeLLo → hEllO)

        String s = "HeLLo";//
        String result ="";

        for(int i = 0 ; i<s.length();i++){
            char ch = s.charAt(i);
            boolean b = Character.isUpperCase(ch);
            if(b){
                result = result+Character.toLowerCase(ch);
            }else {
                result = result+Character.toUpperCase(ch);
            }

        }

        System.out.println(result);
    }

}
