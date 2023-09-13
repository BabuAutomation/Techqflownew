package DataDriven;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcel {

	public static void main(String[] args) throws IOException  {
		

		Scanner sc=new Scanner(System.in);
		FileOutputStream File=new FileOutputStream("C:\\Users\\DELL\\eclipse-workspace\\Techqflow1\\Test-Data\\Data.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet();
		
		for(int r=0;r<5;r++)
		{
			XSSFRow currentrow=sheet.createRow(r);
			for(int c=0;c<4;c++)
			{
				System.out.println("Enter value");
				String value=sc.next();
				currentrow.createCell(c).setCellValue(value);
			}
		}
		
		workbook.write(File);
		workbook.close();
		File.close();

	}

}
