package excelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		//1.Create and Read the Excel file
		FileInputStream fis = new FileInputStream("./data/input.xlsx");	
		
		//2.Create WorkBook or group of sheet
		Workbook wb = WorkbookFactory.create(fis);
		
		//3.Read the Sheet
		Sheet sh = wb.getSheet("TC01");
		
		int rowcount = sh.getLastRowNum();
		
		for (int i = 0; i <rowcount; i++) 
		{
			//get the no of cells in row
			Row row = sh.getRow(i);
			short cellcount = row.getLastCellNum();
			
			for (int j = 0; j <cellcount; j++)
			{
				Cell cell = row.getCell(j);
				String data = cell.getStringCellValue();
				System.out.print(data+"     ");
			}
			System.out.println();
			
		}
		
		
		

}
}