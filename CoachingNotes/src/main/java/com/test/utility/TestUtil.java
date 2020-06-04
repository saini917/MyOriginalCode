 package com.test.utility;

import java.util.ArrayList;

public class TestUtil {
	static Xls_Reader reader;

	public static ArrayList<Object[]> getDataFromExcel() {

		ArrayList<Object[]> mydata = new ArrayList<Object[]>();
		try {
			reader = new Xls_Reader(System.getProperty("user.dir")+"/src/main/java/com/testdata/testData.xlsx");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		for (int rowNum = 2; rowNum <= reader.getRowCount("regtestdata"); rowNum++) {
			String firstname = reader.getCellData("regtestdata", "Firstname", rowNum);
			String lastname = reader.getCellData("regtestdata", "Lastname", rowNum);
			String emailAddress = reader.getCellData("regtestdata", "EmailAddress", rowNum);
			String password = reader.getCellData("regtestdata", "Password", rowNum);

			Object ob[] = { firstname, lastname, emailAddress, password };
			mydata.add(ob);
		}
		return mydata;

	}

}
