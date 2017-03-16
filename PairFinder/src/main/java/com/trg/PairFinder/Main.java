package com.trg.PairFinder;

import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				try {
					View v = new View();
					Model m = new Model();
					Controller c = new Controller(v, m);
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
