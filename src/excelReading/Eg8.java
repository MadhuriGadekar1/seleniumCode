package excelReading;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg8 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

  FileInputStream myFile=new FileInputStream("C:\\Users\\Madhuri Dilwale\\Desktop\\manualTesting\\madhuri.xlsx");
  Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
  int TotalNumberRow = mySheet.getLastRowNum();
  int TotalNumberColumn = mySheet.getRow(0).getLastCellNum()-1;
  
  //Outer loop for row
  //inner loop for column
  for(int i=0;i<=TotalNumberRow;i++)
  {
	  for(int j=0;j<=TotalNumberColumn;j++)
	  {
		 Cell myCell = mySheet.getRow(i).getCell(j);
		 CellType dataType = myCell.getCellType();
		 //data type:STRING,NUMERIC,BOOlean
		 if(dataType==CellType.STRING)
		 {
			 System.out.print(myCell.getStringCellValue()+" ");
		 }
		 else if(dataType==CellType.NUMERIC)
		 {
			 System.out.print(myCell.getNumericCellValue()+" ");
		 }
		 else if(dataType==CellType.BOOLEAN)
		 {
			 System.out.print(myCell.getBooleanCellValue()+" ");
		 }
		 
	  }
	  System.out.println();
  }
  

	}

}
