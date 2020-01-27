package qackickacademy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelData {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("C://Users//Anuj Gunsola//Contact List1.xlsx");
		XSSFWorkbook work = new XSSFWorkbook(file);
		XSSFSheet sheet = work.getSheet("Sheet1");
	}
}
