package genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	public String  getDataFromExcelFile(String sheetName , int rowIndex , int cellIndex) throws Exception {
		FileInputStream fis = new FileInputStream(IconstantUtility.excelpath);
		Workbook book =  WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(sheetName);
		DataFormatter df = new DataFormatter();
		String cellValue = df.formatCellValue(sh.getRow(rowIndex).getCell(cellIndex));
		//System.out.println(cellValue);
		return cellValue;
	}
}
