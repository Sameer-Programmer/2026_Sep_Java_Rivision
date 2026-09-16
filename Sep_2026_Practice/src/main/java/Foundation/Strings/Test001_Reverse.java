package Foundation.Strings;

public class Test001_Reverse {
    public static void main(String[] args) {
        String s1 = "Sameer";
        String reverse ="";
        String originalString = s1;
        for(int i = s1.length()-1; i>=0;i--){
            char ch= s1.charAt(i);
            reverse = reverse +ch;
        }
        System.out.println(reverse);

        if(reverse == originalString){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a Palindrome");
        }
    }
}
