package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static Object[][] readExcel(String path,String sheetname) throws IOException {
		XSSFWorkbook book = new XSSFWorkbook(path);
		//XSSFSheet sheet = book.getSheetAt(0);
		XSSFSheet sheet = book.getSheet(sheetname);
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = row.getCell(0);

		String strCellValue = cell.getStringCellValue();
		int rowCount = 0;
		rowCount = sheet.getLastRowNum();
		int colCount = row.getLastCellNum();
		Object cellValue = null;
		Object[][] data = new Object[rowCount][colCount];
		//System.out.println(rowCount);
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
					cellValue = (int) cellValuei;
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