package excelReading;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

     FileInputStream myFile=new FileInputStream("C:\\Users\\Madhuri Dilwale\\Desktop\\manualTesting\\Madhuri.xlsx");
     String value=WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
     System.out.println(value);
     
	}

}
