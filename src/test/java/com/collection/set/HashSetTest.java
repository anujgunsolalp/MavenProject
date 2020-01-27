package com.collection.set;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class HashSetTest {

	@Test
	public void addSet() throws IOException {

		HashSet<String> set = new HashSet<String>();
		FileInputStream file = new FileInputStream("C://Users//Anuj Gunsola//SampleData.xlsx");
		XSSFWorkbook work = new XSSFWorkbook(file);
		XSSFSheet sheet = work.getSheet("SalesOrders");
		for (Iterator<Row> itrow = sheet.iterator(); itrow.hasNext();) {
			for (Iterator<Cell> itcell = itrow.next().cellIterator(); itcell.hasNext();) {
				set.add(itcell.next().getStringCellValue());
			}
		}
		// System.out.println(set);
		HashSetTest.call(set);
	}

	public static void call(HashSet<String> set) {
		System.out.println(set.contains("Kivell"));
	}
}
