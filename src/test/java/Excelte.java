import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Excelte {
    public static void main(String[] args) throws IOException {
         String path = System.getProperty("user.dir") +File.separator+"data"+ File.separator+"assin1.xlsx";
         System.out.println(path);

        FileInputStream file= new FileInputStream(path);
        XSSFWorkbook wb=new XSSFWorkbook(file);
        XSSFSheet sh= wb.getSheetAt(0);


        int lastrow=sh.getLastRowNum();

         for (int i=1;i<=lastrow;i++)
         {

         double dateofjoin=sh.getRow(i).getCell(4).getNumericCellValue();
             if( dateofjoin<=2020)
             {
                 String name= sh.getRow(i).getCell(0).getStringCellValue();
                 String job = sh.getRow(i).getCell(1).getStringCellValue();
                 System.out.println(name +" - " +job);
             }

         }

    }
}
