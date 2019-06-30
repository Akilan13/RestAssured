package utility;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;





public class ExcelUtils {
	
	private static XSSFSheet sh1;
	private static XSSFWorkbook wb;
	private static XSSFCell cell;
	private static XSSFRow Rows;
	
	
	
	public static void Openexcel(String pathname,String sheetname) throws Exception {
		try {
		//File src1 = new File(pathname);
		FileInputStream FS1 = new FileInputStream(pathname);
		wb =new XSSFWorkbook(FS1);
		sh1= wb.getSheet(sheetname);
		
		} catch (Exception e) {
			 throw (e);
		}
	}
	
	
	public static int rowcount() throws Exception {
		try {
		int j = sh1.getLastRowNum();
		return j;
		} catch (Exception e) {
			throw e;
		}
	}
	
	
	public static int Colcount() throws Exception {
		try {
		int z= sh1.getRow(1).getLastCellNum();
		return z;
		} catch (Exception e) {
			throw e;
		}
	}
	
	public static String Readcelldata(int row,int col) throws Exception {
		try {
		DataFormatter dataFormatter = new DataFormatter();	
		cell = sh1.getRow(row).getCell(col);
		//String celldata = cell.getStringCellValue();
		String celldata1 = dataFormatter.formatCellValue(cell);
		return celldata1;
		
	} catch (Exception e) {
		return"";
	}
	}
	
	
	public static void setcelldata(int Rownum,int Colnum,String result) {
		Rows = sh1.getRow(Rownum);
		cell = Rows.getCell(Colnum,Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);
		
		if (cell==null) {
			cell=Rows.createCell(Colnum);
			cell.setCellValue(result);
		}else {
			cell.setCellValue(result);
		}
		
	}
	
	public static int getRowContains(String sTestCaseName, int colNum) throws Exception{
		int i;
		try {
			int rowCount = sh1.getRow(1).getLastCellNum();
			for ( i=0 ; i<rowCount; i++){
				
				String ActualTestcasename = sh1.getRow(i).getCell(colNum).toString();
				if  (ActualTestcasename.equalsIgnoreCase(sTestCaseName)){
					break;
				}
			}
			return i;
				}catch (Exception e){
			
			throw(e);
			}
		}
	
	public static void Closeexcel() throws Exception {
		FileOutputStream out = new FileOutputStream(Constant.Path_TestData);
		wb.write(out);
		out.close();
		//wb.close();
		sh1 = null;
		wb= null;
		cell = null;
		Rows = null;
		
		
		
	}
}
