package foundation.Strings;

public class Test002_SeperateChars {
    public static void main(String[] args) {
        String s = "abcd1234!@#";
        String onlyAlphabets ="";
        String onlyNums="";
        String onlySpecChars="";

        for(int i = 0; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='A' & ch<='Z' || ch>='a' & ch<='z'){
                onlyAlphabets +=ch;
            }else if(ch>='0' & ch<='9'){
                onlyNums+=ch;
            }else{
                onlySpecChars+=ch;
            }
        }
        System.out.println(onlyAlphabets);
        System.out.println(onlySpecChars);
        System.out.println(onlyNums);


    }
}
