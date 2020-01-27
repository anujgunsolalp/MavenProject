package com.collection.set;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LinkedListEx {

	public static void main(String[] args) throws IOException {
		LinkedList <String> set = new LinkedList<String>();
		FileInputStream file = new FileInputStream("C://Users//Anuj Gunsola//SampleData.xlsx");
		XSSFWorkbook work = new XSSFWorkbook(file);
		XSSFSheet sheet = work.getSheet("SalesOrders");
		for(Iterator <Row> itrow=sheet.iterator();itrow.hasNext();) {
			for(Iterator<Cell> itcell=itrow.next().cellIterator();itcell.hasNext();) {
				set.add(itcell.next().getStringCellValue());
			}		
		}
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.contains("Sorvino"));
	}

}
