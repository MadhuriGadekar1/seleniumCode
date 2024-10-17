package excelReading;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

   FileInputStream myFile=new FileInputStream("C:\\Users\\Madhuri Dilwale\\Desktop\\manualTesting\\madhuri.xlsx");
   Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
   //how to get total number of rows
   int lastRowNumber = mySheet.getLastRowNum();
   int totalRow = lastRowNumber;
   System.out.println(totalRow);
   //How to get Total number of column
   short LastCellNumber = mySheet.getRow(0).getLastCellNum();
   int totalNumberOfColumn=LastCellNumber-1;
   System.out.println(totalNumberOfColumn);
   

	}

}
