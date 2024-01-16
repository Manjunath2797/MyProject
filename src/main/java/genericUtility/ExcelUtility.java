package genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.Icon;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	/**
	 * This generic method is to fetch data from excel
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @return
	 * @throws IOException
	 */

	public String getDataFromExcel(String sheetName , int rowIndex , int cellIndex) throws IOException {
		FileInputStream fis = new FileInputStream(IconstantUtility.excelPath);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(sheetName);
		DataFormatter df = new DataFormatter();
		String cellValue =  df.formatCellValue(sh.getRow(rowIndex).getCell(cellIndex));
		return cellValue;
		/*
		Row r =  sh.getRow(5);
		Cell c =  r.getCell(2);
		String cellValue=c.getStringCellValue();
		System.out.println(cellValue);
		*/
	}
	
	/**
	 * This is a generic method is to fetch multiple values  from excel
	 * @param sheetName
	 * @return
	 * @throws Exception
	 */
	
	public  String getMultipleValue(String sheetName) throws Exception {
		String data = null;
		FileInputStream fis = new FileInputStream(IconstantUtility.excelPath);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(sheetName);
		DataFormatter format = new DataFormatter();
		
		for (int i = 0 ; i <= sh.getLastRowNum() ; i++ ) {
			Row r = sh.getRow(i);
			for (int j = 0 ;j <= r.getLastCellNum() ; j++) {
				data = format.formatCellValue(r.getCell(j));
			}
		}
		return data;	
	}
	
	/**
	 * This method is to write data into excel
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @param data
	 * @throws Exception
	 */
	
	public  void writeDateIntoCell(String sheetName , int rowNum , int cellNum , String data) throws Exception {
		
		FileInputStream fis = new FileInputStream(IconstantUtility.excelPath);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(sheetName);
		sh.createRow(rowNum).createCell(cellNum).setCellValue(data);
		
		FileOutputStream fos = new FileOutputStream(IconstantUtility.excelPath);
		book.write(fos);
		
	}
}
