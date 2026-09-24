package foundation.Strings;

public class Test0019_MoveSpacestoEnd {
    public static void main(String[] args) {


        String s = "j ava  se in i u  m";
        String result ="";
        String container2 ="";

        for(int i = 0; i<s.length();i++){
            char ch = s.charAt(i);
            boolean b = Character.isWhitespace(ch);
            if(!b){
                result = result+ch;
            }else {
                container2 = container2+ch;
            }
        }
        System.out.println(result+container2);
        System.out.println(s.length());
        System.out.println(result.length());
        System.out.println(container2.length());

    }
}
