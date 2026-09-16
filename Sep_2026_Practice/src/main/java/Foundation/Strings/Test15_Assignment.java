package Foundation.Strings;

public class Test15_Assignment {
    public static void main(String[] args) {

        String s = "aaabba";
        boolean result = true;
        boolean foundB = false;
        for(char c : s.toCharArray()){
            if(c=='b'){
                foundB = true;
            }
            if(c=='a' && foundB){
                result = false;
                break;
            }
        }

        System.out.println(result);

    }
}
