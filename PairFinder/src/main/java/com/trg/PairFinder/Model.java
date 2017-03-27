package com.trg.PairFinder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Model {
	
	private List<SSNPair> knownSSNList; 
	
	public Model() {
		knownSSNList = new ArrayList<SSNPair>();
		buildKnownSSNList();
	}
	
	private void buildKnownSSNList() {
		FileHandler fh = new FileHandler();
		List<String> fromFile = new ArrayList<String>();
		fromFile = fh.readFromFile();
		
		for(String str : fromFile) {
			
			
			knownSSNList.add(new SSNPair())
		}
		
	}
	
	protected ArrayList<String> checkForPairs(String input) {
	
		ArrayList<String> inputFromUI = new ArrayList<String>();
		inputFromUI = splitStringFromDelimiter(input);
		
		ArrayList<String> pairs = new ArrayList<String>();
		
		for(String str : inputFromUI) {
			if(inputFromUI.equals(str)) {
				pairs.add(string);
			}
		}
		
		return pairs;
	}

	private ArrayList<String> splitStringFromDelimiter(String input) {
		// Split each ssn to own row casting return value
		return new ArrayList<String>(Arrays.asList(input.split(";")));
	}
}
