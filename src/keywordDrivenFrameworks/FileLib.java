package keywordDrivenFrameworks;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	
	public String readFromExcel(String excelpath,String sheetName,int row,int cell) throws Throwable {
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		String excelvalue = wb.getSheet(sheetName).getRow(row).getCell(cell).toString();
		return excelvalue;
	}
	
	public void writeDataToExcel(String excelPath,String sheetname,int row,int cell,String data) throws Throwable {
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetname).getRow(row).createCell(cell).setCellValue(data);
		FileOutputStream fos = new FileOutputStream(excelPath);
		wb.write(fos);
		
	}
	public String readPropData(String proppath,String key) throws Throwable  {
		FileInputStream fis = new FileInputStream(proppath);
		Properties prop = new Properties();
		prop.load(fis);
//		String propValue = prop.getProperty(data);
		String propValue = prop.getProperty(key, "Incoreect key");
		return propValue;
	}
	public int getRowCount(String excelpath,String SheetName) throws Throwable  {
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		int rowCount = wb.getSheet(SheetName).getLastRowNum();
		return rowCount;
	}

}
