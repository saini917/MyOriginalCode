package com.DataproviderITestContext;

import java.lang.reflect.Method;
import org.testng.annotations.DataProvider;

public class dataproviderByMethod {

	@DataProvider(name="SearchProvider")
	public Object[][] getdDataProvider(Method m){
		if(m.getName().equalsIgnoreCase("testMethodA")){
			return new Object[][] {
				{ "Guru99", "India" },
				{ "Krishna", "UK" },
				{ "Bhupesh", "USA" }
			};}
		else{
			return new Object[][] {
				{ "Canada" },
				{ "Russia" },
				{ "Japan" }
			};}       
	}
}


