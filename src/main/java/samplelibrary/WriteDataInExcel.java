package samplelibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericlibOrUtility.IconstantUtility;

public class WriteDataInExcel {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream(IconstantUtility.excelPath);
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Sheet1");
		sh.createRow(10).createCell(4).setCellValue("HELLO WELCOME TO EXCEL");
		FileOutputStream fos=new FileOutputStream(IconstantUtility.excelPath);
		book.write(fos);
		System.out.println("pass");
	}
}
