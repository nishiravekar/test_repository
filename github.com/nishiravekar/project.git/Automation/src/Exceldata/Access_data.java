package Exceldata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public class Access_data {

	    public static void main(String[] args) throws Exception   {
		File excel= new File("E://HyDataKey1.xls");
		FileInputStream fis = new FileInputStream(excel);
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet ws = wb.getSheet("Sheet1");
		
		int rowNum = ws.getLastRowNum()+1 ;
		int colNum = ws.getRow(0).getLastCellNum();
		String[][] data =new String[rowNum][colNum];
		
		for(int i =0; i<rowNum; i++){
	    HSSFRow row = ws.getRow(i);
		for(int j=0; j<colNum; j++){
		HSSFCell cell =row.getCell(j);
		String value = cellToString(cell);
		//System.out.println(ws.getCell(i,j).getContents() + "\t");
		System.out.println(value);
		
		}		
		System.out.println();
		
		}
		
	    }

	    private static String cellToString(HSSFCell cell) {
	    int type;
		Object result;
		type = cell.getCellType();
		
		switch(type){
		
		case 0 :
		result = cell.getNumericCellValue();
		break;
		case 1 :
		result = cell.getStringCellValue();	
		break;
		default:
		throw new RuntimeException("There are no support for this type of cell");
		}
		return result.toString();
		
	}
	
	
}
