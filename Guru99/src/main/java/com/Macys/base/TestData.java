package com.Macys.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestData {
	
	public static List<String> readData() throws IOException {
	FileInputStream file=new FileInputStream(Utils.testfn);
	Workbook wb=new XSSFWorkbook(file);
	Sheet sheet = wb.getSheet("Tamil");
	int rows = sheet.getPhysicalNumberOfRows();
	LinkedList<String> data=new LinkedList();
	for(int i=1;i<rows;i++) {
		for(int j=0;j<=1;j++) {
			String string = sheet.getRow(i).getCell(j).getStringCellValue();
			data.add(string);
		}
	}
	return data;
	}	
}
