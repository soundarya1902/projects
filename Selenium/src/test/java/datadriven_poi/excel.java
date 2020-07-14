package datadriven_poi;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel 
{
 public static void main(String [] args) throws IOException
 {
	 FileInputStream fis=new FileInputStream("C:\\MYFOLDER\\sou study\\selenium\\datadriven_via_apachepoixlsx.xlsx");
	 XSSFWorkbook wb=new XSSFWorkbook(fis);
	 XSSFSheet sheet=wb.getSheet("Sheet1");
	Iterator<Row> rows=sheet.iterator();
	while(rows.hasNext())
	{
		Row r1=rows.next();
		
		Iterator<Cell> cell=r1.cellIterator();
		
		while(cell.hasNext())
		{
			Cell cell1=cell.next();
			System.out.println(cell1.getStringCellValue());
		}
	}
 }
}
