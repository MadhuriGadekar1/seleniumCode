package excelReading;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
     //read complete row
		//row--0---2
     FileInputStream myfile= new FileInputStream("C:\\Users\\Madhuri Dilwale\\Desktop\\manualTesting\\madhuri.xlsx");
     Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
     for(int i=0;i<=3;i++)
     {
    	 String value = mysheet.getRow(0).getCell(i).getStringCellValue();
    	 
    	 System.out.print(value + " ");
     }
     
	}

}
