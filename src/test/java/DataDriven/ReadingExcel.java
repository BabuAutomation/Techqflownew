package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream File=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Techqflow1\\Test-Data\\Automation sample.xlsx");

		XSSFWorkbook workbook=new XSSFWorkbook(File);
		XSSFSheet Sheet=workbook.getSheet("Sheet1");
		int totalrows=Sheet.getLastRowNum();
		int totalcell=Sheet.getRow(1).getLastCellNum();
		System.out.println(totalrows);
		System.out.println(totalcell);
		
		for(int r=0;r<totalrows;r++)
		{
			XSSFRow currentrow=Sheet.getRow(r);
			for(int c=0;c<totalcell;c++)
			{
				String Value=currentrow.getCell(c).toString();
				System.out.print(Value  + "     ");
			}
				System.out.println();
			
		} 		
	}


}

