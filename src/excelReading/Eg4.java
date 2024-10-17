package excelReading;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
         //read complete column
          FileInputStream myfile=new FileInputStream("C:\\Users\\Madhuri Dilwale\\Desktop\\manualTesting\\madhuri.xlsx");
          Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
             for (int j=0; j<=2; j++) {
    		      String value = mysheet.getRow(j).getCell(0).getStringCellValue();
    		      System.out.println(value+" ");

	}

     }
}
	
