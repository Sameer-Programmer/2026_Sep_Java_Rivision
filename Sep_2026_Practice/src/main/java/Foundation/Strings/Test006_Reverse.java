package Foundation.Strings;

public class Test006_Reverse {
    public static void main(String[] args) {
        String s1 = "I love India"; //let result = ""//aidnI evol I
        String [] arr = s1.split(" ");
        System.out.println(arr.length);
        System.out.println(s1);

        for(int i = arr.length-1; i>=0; i--){
            StringBuilder sb = new StringBuilder(arr[i]);
            System.out.print(sb.reverse()+" ");
        }

        System.out.println("**************************");

        for(int i = arr.length-1; i>=0; i--){
            StringBuilder sb = new StringBuilder(arr[i]);
            System.out.print(sb+" "); //India love I

        }

        System.out.println("**************************");

        for(int i = 0; i< arr.length; i++){
            StringBuilder sb = new StringBuilder(arr[i]);
            System.out.print(sb.reverse()+" ");

        }
        System.out.println("**************************");

        for(int i = 0; i< arr.length; i++){
            StringBuilder sb = new StringBuilder(arr[i]);
            System.out.print(sb);

        }

    }
}
