package Foundation.Strings;

import java.util.Arrays;

public class Test0013_ReplaceExtraSpace {
    public static void main(String[] args) {
        String s = "I    Love        Java";
        String result = s.replaceAll("\\s+"," ");
        System.out.println(result);

    }
}
