package com.trg.PairFinder;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {

	private URI file;
	private List<String> linesFromFile;
	
	public FileHandler() {
		try {
			file = new URI("C:\\temp\\testitiedosto.txt");
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		
		linesFromFile = new ArrayList<String>();
	}
	
	public List<String> readFromFile() {

		try {
			linesFromFile = Files.readAllLines(Paths.get(file), StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return linesFromFile;
	}
}
