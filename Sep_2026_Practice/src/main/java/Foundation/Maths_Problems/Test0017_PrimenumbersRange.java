package Foundation.Maths_Problems;

public class Test0017_PrimenumbersRange {
    public static void main(String[] args) {

        for(int i = 1; i<100;i++){
            int count = 0;
            for(int j = 1; j<i;j++){
                if(i%j==0){
                    count++;
                }
            }

            if(count==1){
                System.out.println(i);
            }

        }

    }
}
