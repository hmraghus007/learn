package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_file implements Const{

	public static String getcellvalue(String path,String sheet,int row,int cell) throws EncryptedDocumentException, FileNotFoundException, IOException 
	
	{
		
		String v=" ";
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		v=wb.getSheet(sheet).getRow(row).getCell(cell).toString();
		
		return v;
		
		
	}



public static int getrow(String path,String sheet) throws EncryptedDocumentException, FileNotFoundException, IOException
{
	int rc=0;;
	Workbook wb = WorkbookFactory.create(new FileInputStream(path));
	rc=wb.getSheet(sheet).getLastRowNum();
	return rc;
	
}
}
