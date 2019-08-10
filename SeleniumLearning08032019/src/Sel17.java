import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sel17 {

	public static void main(String[] args) throws IOException {
		File filedata= new File("C:\\Users\\KrishnapriyaSudharma\\Desktop\\Excel\\test data.xlsx");
		
		FileInputStream fis= new FileInputStream(filedata);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		//getting sheet using index
		XSSFSheet sheet = wb.getSheetAt(0);
		//to get row count
		int rowcount=sheet.getLastRowNum();
		System.out.println(rowcount);
		
		for(int i=0;i<=rowcount;i++)
		{
			int columncount=sheet.getRow(i).getLastCellNum();
			System.out.println(columncount);
			for(int j=0;j<=columncount;j++) {
				System.out.println("value of " + i + "row" + j+ "column" + sheet.getRow(i).getCell(j));
				
			}
		}
		
		//this has to be given
		wb.close();

	}

}
