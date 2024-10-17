package excelReading;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

     FileInputStream myfile=new FileInputStream("C:\\Users\\Madhuri Dilwale\\Desktop\\manualTesting\\madhuri.xlsx");

     Workbook myWorkBook = WorkbookFactory.create(myfile);
      Sheet mysheet = myWorkBook.getSheet("Sheet2");
      Row myrow = mysheet.getRow(0);
      Cell mycell = myrow.getCell(0);
      CellType mycelltype = mycell.getCellType();
      System.out.println(mycelltype);
    System.out.println( mycell.getStringCellValue());
     
	}

}
