package com.trg.PairFinder;

public class SSNPair {

	private boolean isChecked;
	private String ssn;
	private String name;
	
	public SSNPair(String ssn, String name, boolean isChecked) {
		this.ssn = ssn;
		this.name = name;
		this.isChecked = false;
	}
	
	public boolean isChecked() {
		return isChecked;
	}
	
	public void setChecked(boolean isChecked) {
		this.isChecked = isChecked;
	}
	
	public String getSsn() {
		return ssn;
	}
	
	public void setSSN(String ssn) {
		this.ssn = ssn;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
