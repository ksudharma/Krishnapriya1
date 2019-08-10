import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Sel15 {

	public static void main(String[] args) throws IOException, RowsExceededException, WriteException, BiffException {
		//create an excel file
		File fileexcel= new File("C:\\Users\\KrishnapriyaSudharma\\Desktop\\Excel");
		//create a workbook in the excel file
		WritableWorkbook writebook = Workbook.createWorkbook(fileexcel);
		//create a sheet
		writebook.createSheet("sunil", 0);
		//passing data to the sheet which is named as sunil
		//getting the sheet
		//index number
		WritableSheet writesheet=writebook.getSheet(0);
		//fill data
		//1st 0 is column and 2nd 0 is row
		Label testdata1 = new Label(0,0,"IBM");
		writesheet.addCell(testdata1);
		Label testdata2 = new Label(0,1,"Manipal");
		writesheet.addCell(testdata2);

		//one more sheet
		writebook.createSheet("kumar", 1);
		WritableSheet writesheet1=writebook.getSheet(1);
		Label testdata3 = new Label(0,5,"name");
		writesheet1.addCell(testdata3);
		
		//without below 2 lines it wont work
		writebook.write();
		writebook.close();
		
		//Reading from excel sheet, the data what is added
		Workbook workbook = Workbook.getWorkbook(new File ("C:\\\\Users\\\\KrishnapriyaSudharma\\\\Desktop\\\\Excel"));
		Sheet sheet = null;
		//number of sheets in the workbook
		int numofsheets=workbook.getNumberOfSheets();
		Cell cell=null;
		//iterate the sheets present in the excel
		for(int p=0;p<=numofsheets;p++) {
			sheet = workbook.getSheet(p);
			//fetch the data of rows and columns
			int numofrows=sheet.getRows();
			int numofcolumns=sheet.getColumns();
			//print data
			System.out.println(sheet.getRows()+"\t" + sheet.getColumns());
			//print sheet name
			System.out.println("data from sheet" + p);
			//fetch the data inside the sheets
			for(int i=0;i<numofrows;i++)
				for(int j=0;j<numofcolumns;j++) {
					cell=sheet.getCell(j,i);
					//condition to check if data is there or not
					
					if(cell.getContents().length()>0) {
						System.out.println(cell);
					}
					
				}
		}
		


	}

}
