package excelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		//1.Create and Read the Excel file
		FileInputStream fis = new FileInputStream("./data/input.xlsx");	
		
		//2.Create WorkBook or group of sheet
		Workbook wb = WorkbookFactory.create(fis);
		
		//3.Read the Sheet
		Sheet sh = wb.getSheet("TC01");
		
		//4.Read the Row
		Row row = sh.getRow(1);
		
		//5.Read the Cell
		Cell cell = row.getCell(2);
		
		//6.Read and Print the Data
		String data = cell.getStringCellValue();
		System.out.println(data);
		
		
		
		
	}

}
