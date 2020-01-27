package com.collection.set;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ArrayListTest {

	@Test
	public void addList() throws IOException
	{
		ArrayList <String> list = new ArrayList<String>();
		FileInputStream file = new FileInputStream("C://Users//Anuj Gunsola//SampleData.xlsx");
		XSSFWorkbook work = new XSSFWorkbook(file);
		XSSFSheet sheet = work.getSheet("SalesOrders");
		for(Iterator <Row> itrow=sheet.iterator();itrow.hasNext();) {
			for(Iterator<Cell> itcell=itrow.next().cellIterator();itcell.hasNext();) {
				list.add(itcell.next().getStringCellValue());				
			}		
		}
	//	System.out.println(list);
	//	System.out.println(list.size());
		System.out.println(list.contains("Thompson"));
	}

}