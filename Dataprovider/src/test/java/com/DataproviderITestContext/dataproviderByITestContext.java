package com.DataproviderITestContext;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

public class dataproviderByITestContext {
	Object[][] groupArray;
	
	@DataProvider(name="SearchProvider")
	public Object[][] getdDataProvider(ITestContext c){
		

		for(String groups:c.getIncludedGroups()){
			if(groups.equalsIgnoreCase("A")){
				groupArray= new Object[][]{
					{"deepak","india"},
					{"saini","USA"},
					{"siya","Austria"}
				};
				break;
			}

			else if(groups.equalsIgnoreCase("B")){
				groupArray= new Object[][]{
					{"canada"},
					{"Africa"},
					{"Austrialia"}
				};
				break;
			}
		}
		return groupArray;
	}

}
