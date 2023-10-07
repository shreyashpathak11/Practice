package javaFeature;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Loggers;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class SwitchCaseExcel {

	@Test
	void ex() {

		Logger loggers = LogManager.getLogger(SwitchCaseExcel.class.getName());

		try {
			InputStream in = new FileInputStream("C:\\Users\\Shreyash Pathak\\OneDrive\\Desktop\\test.xlsx");

			XSSFWorkbook wb = new XSSFWorkbook(in);
			XSSFSheet sheet = wb.getSheet("test");

			int rowCount = sheet.getLastRowNum();
			int cellCount = sheet.getRow(0).getLastCellNum();

			System.out.println(rowCount);
			System.out.println(cellCount);

			for (int i = 0; i <= rowCount; i++) {

				XSSFRow row = sheet.getRow(i);

				for (int j = 0; j < cellCount; j++) {

					XSSFCell cell = row.getCell(j);

					if (cell != null) {

						switch (cell.getCellType()) {

						case STRING:
							String stringValue = cell.getStringCellValue();
							System.out.print(stringValue + " ");
							break;

						case NUMERIC:
							double intValue = cell.getNumericCellValue();
							System.out.print(intValue + " ");
							break;
						case BOOLEAN:
							boolean boolValue = cell.getBooleanCellValue();
							System.out.print(boolValue + " ");
							break;

						default:
							break;

						}

					} else {
						System.out.print("NV" + " ");
					}
				}

				System.out.println("");

			}

			loggers.debug("This is debug");
			loggers.warn("Warn");
			loggers.error("error");
			loggers.fatal("Fatal");
			loggers.info("Info");

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
