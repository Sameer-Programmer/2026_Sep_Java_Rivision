package foundation.TwoDimensionalArray;

public class Test001 {
    public static void main(String[] args) {
        String [][] arr =  {
                {"username","Password"},
                {"Sameer","sameer105A"},
                {"Imran","imr106"},
        };

        for(int i = 1; i< arr.length;i++){
            for(int j = 0; j<arr[0].length;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }

    }
}
