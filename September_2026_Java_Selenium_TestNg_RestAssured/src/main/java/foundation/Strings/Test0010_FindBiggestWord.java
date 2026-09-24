package foundation.Strings;

public class Test0010_FindBiggestWord {
    public static void main(String[] args) {
        String s1 = "I love india";
        String [] arr = s1.split(" ");

        String  maxword = arr[0];

        for(String word : arr){
            if(maxword.length()<word.length()){
                 maxword = word;
            }
        }
        System.out.println(maxword);

    }
}
