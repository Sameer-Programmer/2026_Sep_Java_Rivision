package Workouts;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test001 {
    public static void main(String[] args) throws IOException {
        String projectpath = System.getProperty("user.dir");
        String file1 = projectpath+"//TestData//TestData.xlsx";

        FileInputStream fis = new FileInputStream(file1);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        int LastRowIndex = sheet.getLastRowNum();
        System.out.println(LastRowIndex);
        int columns = sheet.getRow(0).getLastCellNum(); // count comes Count starts from Zero
        int rows = LastRowIndex + 1;
        System.out.println(rows);
        System.out.println(columns);

        for(int i = 0; i<rows; i++){
            XSSFRow row = sheet.getRow(i);
            for(int j = 0; j<columns;j++){
               String value = row.getCell(j).toString();
                System.out.print(value+" ");
            }
            System.out.println();
        }



    }
}
