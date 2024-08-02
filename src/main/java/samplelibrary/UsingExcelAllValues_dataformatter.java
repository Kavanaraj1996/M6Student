package samplelibrary;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UsingExcelAllValues_dataformatter {

	public static void main(String[] args) throws Exception
	{
		FileInputStream fis=new FileInputStream("E:\\Selenium\\ExcelScript01.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("sample");
		DataFormatter df=new DataFormatter();
		String value=df.formatCellValue(sh.getRow(10).getCell(4));
		System.out.println(value);
	}
}
