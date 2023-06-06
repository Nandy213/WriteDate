package writeExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Dinesh\\eclipse-workspace\\WriteData\\DemoExcel\\Data.xlsx");
			FileInputStream fis=new FileInputStream(f);
			Workbook wb=new XSSFWorkbook(fis);
				Sheet s=wb.getSheet("Data");
					Row r=s.getRow(0);
					Cell c=r.getCell(0);
					System.out.println(s.getRow(0).getCell(0));
	}
}
			

	


