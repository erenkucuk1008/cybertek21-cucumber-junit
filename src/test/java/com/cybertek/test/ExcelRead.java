package com.cybertek.test;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelRead {

    // in this test, we will read an excel file

    @Test
    public void excel_read_test() throws IOException {

        //to be able to read the file, we need to load the file
        String path = "SampleData.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);

        //workbook - sheet - row - cell

        //We create workbook and load the SampleData file...
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        //We create the sheet and pass the name what we want to work on
        XSSFSheet sheet = workbook.getSheet("Employees");

        System.out.println(sheet.getRow(1).getCell(0));// Eren
        System.out.println(sheet.getRow(2).getCell(0));//Arzum

        //returns the count of used cells only
        //if there are rows not used they will not be counted
        //started from 1
        int usedRows = sheet.getPhysicalNumberOfRows();

        //returns the count from top to bottom
        //even counts if there are empty cells
        //this starts from 0
        int lastUsedRow = sheet.getLastRowNum();

        //TODO: 1- CREATE A LOGIC TO PRINT OUT ARZUM'S NAME DYNAMICALLY

        for (int rowNum = 0; rowNum<usedRows; rowNum++){

            XSSFCell currentCell = sheet.getRow(rowNum).getCell(0);
            if (currentCell.toString().equals("Arzum ")){
                System.out.println("CurrentCell = "+ currentCell);
            }
        }

        //TODO: 2- CREATE A LOGIC TO PRINT OUT KUCUK LAST NAME

        for (int rowNum=0; rowNum<usedRows; rowNum++){

            if (sheet.getRow(rowNum).getCell(1).toString().equals("Kucuk")){
                System.out.println("CurrentCell = "+sheet.getRow(rowNum).getCell(1) );
            }
        }

        //TODO: 3- IF THE NAME IS EREN, PRINT OUT JOB TITLE

        for (int rowNum=0; rowNum<usedRows; rowNum++){
            if (sheet.getRow(rowNum).getCell(0).toString().equals("Eren")){
                System.out.println("CurrentCell = "+sheet.getRow(rowNum).getCell(2) );
            }
        }

    }
}
