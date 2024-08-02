package genericlibOrUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataInExcelGeneric {
	public void writeDataInExcel(String sheetName,int rowNum,int cellNum,String values) throws Exception
	{
		FileInputStream fis=new FileInputStream(IconstantUtility.excelPath);
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet(sheetName);
		sh.createRow(rowNum).createCell(cellNum).setCellValue(values);
		
		FileOutputStream fos=new FileOutputStream(IconstantUtility.excelPath);
		book.write(fos);
	}

}
