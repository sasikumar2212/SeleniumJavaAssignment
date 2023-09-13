package stepdefinition;

import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static Object[][] readData(String path,String sheetname) throws IOException {
		// TODO Auto-generated method stub
		// Step 1 Create a excel file and attach to the project
		// Step 2 Set path of the file to read data
		XSSFWorkbook book = new XSSFWorkbook(path);
		// Step 3 identify the sheet
		//XSSFSheet sheet = book.getSheetAt(0);
		XSSFSheet sheet = book.getSheet(sheetname);
		// Step 4 identify the row
		XSSFRow row = sheet.getRow(0);
		// Step 5 identify the cell
		XSSFCell cell = row.getCell(0);

		String strCellValue = cell.getStringCellValue();

		// System.out.println(sheet);
		int rowCount = 0;
		// get the count of row
		// int rowCount = sheet.getLastRowNum();
		rowCount = sheet.getLastRowNum();
		int colCount = row.getLastCellNum();
		// sheet

		Object cellValue = null;
		Object[][] data = new Object[rowCount][colCount];
		System.out.println(colCount);
		for (int i = 1; i <= rowCount; i++) {
			//System.out.println(i);
			for (int j = 0; j < colCount; j++) {
				CellType cellValueType = sheet.getRow(i).getCell(j).getCellType();
				switch (cellValueType) {
				case STRING:
					cellValue = sheet.getRow(i).getCell(j).getStringCellValue();
					break;
				case NUMERIC:
					double cellValuei = sheet.getRow(i).getCell(j).getNumericCellValue();
					cellValue=(int)cellValuei; 
					break;
				}

				// System.out.println(cellValue);
				data[i - 1][j] = cellValue;
			}
		}
		// close the workbook
		book.close();
		return data;

	}
}
