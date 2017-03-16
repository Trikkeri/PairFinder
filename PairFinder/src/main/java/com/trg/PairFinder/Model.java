package com.trg.PairFinder;

import java.util.ArrayList;
import java.util.List;

public class Model {

	private List<String> testValues;
	
	public Model() {
		testValues = new ArrayList<String>();
		testValues.add("010101-0101");
		testValues.add("020202-0202");
		testValues.add("hiphei");
	}
	
	protected ArrayList<String> checkForPairs(String str) {
	
		ArrayList<String> foundPairs = new ArrayList<String>();
		
		for (String string : testValues) {
			if(string.equals(str)) {
				foundPairs.add(string);
			}
		}
		
		return foundPairs;
	}
	
}
