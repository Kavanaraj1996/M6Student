package genericlibOrUtility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class GenericMethodFetchMultipleData {
	public void readMultipleData(String sheetName,int firstRowNum,int firstCellNum) throws Exception {
		FileInputStream fis= new FileInputStream(IconstantUtility.excelPath);
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet(sheetName);
		DataFormatter format=new DataFormatter();
		for(int i=firstRowNum;i<=sh.getLastRowNum();i++)
		{
			Row r=sh.getRow(i);
			for(int j=firstCellNum;j<=r.getLastCellNum()-1;j++)
			{
				String values=format.formatCellValue(r.getCell(j));
						System.out.println(values);
				
			}
		}
	}

}
