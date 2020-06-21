package excelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToFindHowManyCellInRow {
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		//1.Create and Read the Excel file
		FileInputStream fis = new FileInputStream("./data/input.xlsx");	
		
		//2.Create WorkBook or group of sheet
		Workbook wb = WorkbookFactory.create(fis);
		
		//3.Read the Sheet
		Sheet sh = wb.getSheet("TC02");
		
		//4.Read the Row
		Row row = sh.getRow(1);
		
		//To get no of Cells
		short cellcount = row.getLastCellNum();
		System.out.println(cellcount);
		

}
}