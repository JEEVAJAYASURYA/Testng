package org.net;

import org.testng.annotations.DataProvider;

public class Data {
	@DataProvider(name="login")
	private Object[][] greens() {
		return new Object[][] {
			{"surya","jai"},
			{"jai","jp"},
			{"manoj","vicky"},
			{"priya","moorthy"}

	};
}
}
