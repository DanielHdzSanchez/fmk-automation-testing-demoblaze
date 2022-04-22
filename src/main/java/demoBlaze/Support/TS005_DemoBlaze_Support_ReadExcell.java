package demoBlaze.Support;
import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TS005_DemoBlaze_Support_ReadExcell {

	public String[][] readExcel() throws Exception {
		
		File GET_EXCEL = new File("src\\main\\resources\\users.xlsx");
		FileInputStream FILEINPUT = new FileInputStream(GET_EXCEL);
		
		try (XSSFWorkbook xwGetWorkBook = new XSSFWorkbook(FILEINPUT)) {
			
			XSSFSheet xsGetSheet = xwGetWorkBook.getSheet("Sheet1");
			int intTotRow = xsGetSheet.getLastRowNum() +1;
			int intTotCol = xsGetSheet.getRow(0).getLastCellNum();
			String[][] strData = new String[intTotRow][intTotCol];

			for (int i = 0; i < intTotRow; i++) {
				XSSFRow row = xsGetSheet.getRow(i);
				for (int j = 0; j < intTotCol; j++) {
					XSSFCell xcCell = row.getCell(j);
					String strValue = convertCellToString(xcCell);
					strData[i][j] = strValue;
				}
			}
			return strData;
		}
	}

	public static String convertCellToString(XSSFCell xcCell) {
	    String strResult = null;
	    switch (xcCell.getCellType()) {
	    case NUMERIC:
	    	strResult = String.valueOf(xcCell.getNumericCellValue());
	        break;
	    case STRING:
	    	strResult = xcCell.getStringCellValue();
	        break;
	    default:
	        throw new RuntimeException(
	                "There is no support for this type of cell");
	    }
	    return strResult;
	}

}
