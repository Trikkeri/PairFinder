package com.trg.PairFinder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.Timer;

public class Controller {

	private View v;
	private Model m;
	
	public Controller(View view, Model model) {
		v = view;
		m = model;
		
		initializeController(new DelayedKeyListener());
	}
	
	private void initializeController(KeyListener kl){
		v.getInputTxtArea().addKeyListener(kl);
		checkForPairs();
	}
	
	private void checkForPairs() {
		
		ArrayList<String> pairs = new ArrayList<String>();
		
		pairs = m.checkForPairs(v.getInputTxtArea().getText());
		//System.out.println("pairs: " + pairs.get(0));
		v.getTableModel().addRow(new Object[] { "", "test", "test" });
	}
	
	class DelayedKeyListener implements KeyListener {
		
		@Override
		public void keyPressed(KeyEvent arg0) {

		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			ActionListener taskPerformer = new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("This should fire after 2 secs");
					checkForPairs();
				}
			};
			Timer t = new Timer(2000, taskPerformer);
			t.setRepeats(false);
			t.start();
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			
		}
	}
}


