package TestNgFolder.Test004Excel;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class Test001ExcelUtilityClass {

    public static String [][] m1() throws IOException {
        String project = System.getProperty("user.dir");
        String file1 = project + "//TestData//TestData.xlsx";
        FileInputStream fis = new FileInputStream(file1);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet xssfSheetsheet = workbook.getSheet("Sheet3");
        int rows = xssfSheetsheet.getLastRowNum(); // provides last index of rows
        int totalrows = rows+1;
        int columns = xssfSheetsheet.getRow(0).getLastCellNum(); //count of columns

        String data[][] = new String[rows][columns];

        for(int i = 1; i<totalrows;i++){
           XSSFRow row = xssfSheetsheet.getRow(i);
           for(int j = 0; j<columns;j++){
               data[i-1][j] = row.getCell(j).toString(); //Here why i-1 is required Array index starts from zero we are removinh header row
           }
        }

        return data;
    }

}
