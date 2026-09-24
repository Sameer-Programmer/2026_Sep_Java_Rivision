package seleniumPart1.Test0020ReadFileConfig;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class Test002_Excel {
    public static void main(String[] args) throws IOException {

        String projectpath = System.getProperty("user.dir");
        String filepath1 = projectpath+"//TestData/TestData.xlsx";

        FileInputStream fis = new FileInputStream(filepath1);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet =workbook.getSheet("Sheet1");
        int rows = sheet.getLastRowNum();
        int columns = sheet.getRow(0).getLastCellNum();

        System.out.println(rows+"      Rows"); //Rows Count from 0
        System.out.println(columns+"   Columns");// //Rows Count from 1

        for(int i = 0; i<rows;i++){
          XSSFRow row =  sheet.getRow(i);
            for(int j =0; j<columns;j++){
              String s =  row.getCell(j).toString();
                System.out.print(s+" ");
            }
            System.out.println();
        }



    }
}
