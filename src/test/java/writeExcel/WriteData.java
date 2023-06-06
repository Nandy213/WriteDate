package writeExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\Dinesh\\eclipse-workspace\\WriteData\\DemoExcel\\Data.xlsx");
		FileInputStream fis=new FileInputStream(f);
			Workbook wb=new XSSFWorkbook(fis);
				Sheet s=wb.createSheet("Data");
				Row r=s.createRow(0);
					Cell c=r.createCell(0);
					c.setCellValue("Email id");
					 
					Sheet s2=wb.getSheet("Data");
					Row r2=s2.getRow(0);
					Cell Createcell=r2.createCell(1);
					Createcell.setCellValue("password");
					
					wb.getSheet("Data").createRow(1).createCell(0).setCellValue("nandy00@gmail.com");
					wb.getSheet("Data").getRow(1).createCell(1).setCellValue(1234567);
					
						FileOutputStream fos=new FileOutputStream(f);
					wb.write(fos);
					wb.close();
				

	}

}
