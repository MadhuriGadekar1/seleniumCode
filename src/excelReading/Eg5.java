package excelReading;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
    //read all data from sheet
		FileInputStream myfile=new FileInputStream("C:\\Users\\Madhuri Dilwale\\Desktop\\manualTesting\\madhuri.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		//outer loop for row
		//1--->2
		//inner loop for column
		//1--->3
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=3;j++)
			{
				String value = mysheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value + " ");
			}
			System.out.println();
		}
     
	}

}
