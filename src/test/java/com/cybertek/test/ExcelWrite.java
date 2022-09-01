package com.cybertek.test;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWrite {

    XSSFWorkbook workbook;
    XSSFSheet sheet;
    XSSFRow row;
    XSSFCell cell;

    @Test
    public void excel_write() throws IOException {

        String path = "SampleData.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path);

        //loading excel
        workbook = new XSSFWorkbook(fileInputStream);

        //open sheet using workbook obj
        sheet = workbook.getSheet("Employees");

        //Eren's row
        row = sheet.getRow(1);

        //Eren's cell
        cell = row.getCell(1);
/*
        //storing Arzum's name if we want to re-use it
        XSSFCell arzumCell = sheet.getRow(2).getCell(0);

        System.out.println("Before: "+arzumCell);

        arzumCell.setCellValue("Hawaii");

        System.out.println("After: "+arzumCell);

 */
        //Dynamic way of the solution - yukaridakinin for loop la yapilisi
        for (int rowNum=0; rowNum<sheet.getPhysicalNumberOfRows(); rowNum++){
            if (sheet.getRow(rowNum).getCell(0).toString().equals("Arzum ")){
                sheet.getRow(rowNum).getCell(0).setCellValue("Hawaii");
            }
        }

        //load the file to outputStream
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        //write to the file using workbook object
        workbook.write(fileOutputStream);
        fileInputStream.close();
        fileOutputStream.close();
        workbook.close();

    }
}
