package foundation.Collections_Problems;

public class Test005_CountTheOccurences {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,1,1};
        int count = 0;
        int value = 1;
        for(int x :arr){
            if(x==value){
                count++;
            }
        }
        System.out.println(count);
    }
}
