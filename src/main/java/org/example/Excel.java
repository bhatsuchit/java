package org.example;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Excel {
    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir") + File.separator + "data" +File.separator +"Book1.xlsx";
        System.out.println(path);

        FileInputStream file= new FileInputStream(path);
        XSSFWorkbook wb= new XSSFWorkbook(file);
        XSSFSheet sh= wb.getSheetAt(0);

        String val= sh.getRow(5).getCell(1).getStringCellValue();
        System.out.println(val);
        int lastRow = sh.getLastRowNum();
        System.out.println(lastRow);


    }
}
