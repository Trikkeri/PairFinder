package com.trg.PairFinder;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class View {
	
	private JFrame frame;
	private JPanel inputPanel;
	private JScrollPane inputTxtAreaScrollPane;
	private JTextArea inputTxtArea;
	private JPanel tablePanel;
	private JScrollPane tableScrollPane;
	private DefaultTableModel tableModel;
	private JTable processedInputTable;
	private JPanel outputPanel;
	
	
	public View() {
		createUI();
	}
	
	public void createUI() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        frame = new JFrame("Pairfinder");
        frame.setPreferredSize(new Dimension(600, 400));
        frame.setResizable(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        
        inputPanel = new JPanel();
        inputPanel.setBorder(new TitledBorder(null, "Pane1", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.X_AXIS));
        frame.add(inputPanel);
        
        inputTxtArea = new JTextArea();
        inputTxtArea.setColumns(50);
        inputTxtArea.setRows(5);
        
        inputTxtAreaScrollPane = new JScrollPane();
        inputTxtAreaScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        inputTxtAreaScrollPane.setViewportView(inputTxtArea);
        inputPanel.add(inputTxtAreaScrollPane);
        
        tablePanel = new JPanel();
        tablePanel.setBorder(new TitledBorder(null, "Pane 2", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        tablePanel.setLayout(new BoxLayout(tablePanel, BoxLayout.X_AXIS));
        frame.add(tablePanel);
        
        processedInputTable = new JTable();
		tableModel = new DefaultTableModel();
        tableModel.addColumn("futureCheckbox");
        tableModel.addColumn("SSN");
        tableModel.addColumn("Name");
        processedInputTable.setModel(tableModel);
        
        tableScrollPane = new JScrollPane();
        tableScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        tableScrollPane.setViewportView(processedInputTable);
        tablePanel.add(tableScrollPane);
        
        outputPanel = new JPanel();
        outputPanel.setBorder(new TitledBorder(null, "Pane 3", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        frame.add(outputPanel);
        
        frame.pack();
	}
	
	public JTextArea getInputTxtArea() {
		return inputTxtArea;
	}
	
	public JTable getProcessedInputTable() {
		return processedInputTable;
	}
	
	public DefaultTableModel getTableModel() {
		return tableModel;
	}
}
