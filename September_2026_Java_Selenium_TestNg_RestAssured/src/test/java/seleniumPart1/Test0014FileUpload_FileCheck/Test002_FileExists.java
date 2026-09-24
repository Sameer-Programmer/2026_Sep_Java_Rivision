package seleniumPart1.Test0014FileUpload_FileCheck;

import java.io.File;

public class Test002_FileExists {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir");
        String file1 = path+"//Documents//Arrays.pdf";

        File f1  = new File(file1);
        if(f1.exists()){
            System.out.println("Filefound");
        }else{
            System.out.println("File Not found");
        }


    }
}
