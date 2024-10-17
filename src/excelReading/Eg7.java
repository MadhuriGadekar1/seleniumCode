package excelReading;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg7 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

    FileInputStream myFile=new FileInputStream("C:\\Users\\Madhuri Dilwale\\Desktop\\manualTesting\\madhuri.xlsx");
     Sheet mysheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
     
     //total row
    int totalRow = mysheet.getLastRowNum();
    
    //total Column
    int totalColumn = mysheet.getRow(0).getLastCellNum()-1;
    
    //Read all data
    //outer for loop---->Row
    //Inner forLoop for------> column
    for(int i=0;i<=totalRow;i++)
    {
    	for(int j=0;j<=totalColumn;j++)
    	{
    		String value = mysheet.getRow(i).getCell(j).getStringCellValue();
    		System.out.print(value + " ");
    	}
    	System.out.println();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	}

}
