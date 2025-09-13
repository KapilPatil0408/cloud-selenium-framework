package com.utility;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.ui.pojo.User;

public class ExcelReaderUtility {

	public static Iterator<User> readExcel(String fileName) {
		File xslxFile = new File("./testData/"+fileName);
		XSSFWorkbook xssfWorkbook = null;
		XSSFSheet xssfSheet;
		Cell emailAddressCell;
		Cell passwordCell;
		List<User> userList = null;
		User user;
		Row row;
		Iterator<Row> rowIterator;
		try {
			xssfWorkbook = new XSSFWorkbook(xslxFile);
			xssfSheet = xssfWorkbook.getSheet("LoginTestData");
			userList = new ArrayList<User>();
			rowIterator = xssfSheet.iterator();
			rowIterator.next(); // skipping column name
			while (rowIterator.hasNext()) {
				row = rowIterator.next();
				emailAddressCell = row.getCell(0);
				passwordCell = row.getCell(1);
				user = new User(emailAddressCell.toString(), passwordCell.toString());
				userList.add(user);
				xssfWorkbook.close();
			}

		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return userList.iterator();
	}
}
