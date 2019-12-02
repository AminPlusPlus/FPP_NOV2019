package lesson5_lab3_02_Dec;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main extends JFrame {
	
	//UI Components
	JPanel buttonsPanel = new JPanel();
	JPanel inputsPanel = new JPanel();
	private JButton  btnCountLetters;
	private JButton  btnReverseLetters;
	private JButton  btnRemoveDublicators;
	private JLabel	 inputLabel;
	private JLabel   outputLabel;
	private TextField inputText;
	private TextField outputText;
	
	
	public Main() {
		
		//btns
		btnCountLetters = new JButton("Count Letters");
		btnReverseLetters = new JButton("Reverse Letters");
		btnRemoveDublicators = new JButton("Remove Dublicates");
		
		
		btnRemoveDublicators.addActionListener((e)-> {
			
		});
		
		btnRemoveDublicators.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				if (e.getSource() == btnCountLetters) {
					outputText.setText(""+inputText.getText().length());
				}  
				
				if (e.getSource() == btnReverseLetters) {
					StringBuilder reverse = new StringBuilder(inputText.getText());
					outputText.setText(""+reverse.reverse());
				}  
				if (e.getSource() == btnRemoveDublicators) {
					StringBuilder removeDublicators = new StringBuilder();
					inputText.getText().chars().distinct().forEach(c -> removeDublicators.append((char) c));
					outputText.setText(""+removeDublicators);
				}  
				
				
			}
		});
		
		//labels
		inputLabel = new JLabel("Input");
		outputLabel = new JLabel("OutPut");
		
		//TextFields
		inputText = new TextField();
		outputText = new TextField();
		
		outputText.setEditable(false);
		
		//inputText.setSize(new Dimension(100,20));
		
		btnCountLetters.addActionListener(new ButtonsListener());
		btnReverseLetters.addActionListener(new ButtonsListener());
		btnRemoveDublicators.addActionListener(new ButtonsListener());
		
	
		//btn1.addMouseListener(new MyButtonListener1());
		
		
		add(BorderLayout.PAGE_START,buttonsPanel);
		add(BorderLayout.PAGE_END,inputsPanel);
		
		buttonsPanel.setLayout(new BoxLayout(buttonsPanel,BoxLayout.PAGE_AXIS));
		inputsPanel.setLayout(new BoxLayout(inputsPanel,BoxLayout.Y_AXIS));
		
		//add buttons
		buttonsPanel.add(btnCountLetters);
		buttonsPanel.add(btnReverseLetters);
		buttonsPanel.add(btnRemoveDublicators);
		
		//add textfields
		inputsPanel.add(inputLabel);
		inputsPanel.add(inputText);
		inputsPanel.add(outputLabel);
		inputsPanel.add(outputText);
		

		setSize(200,200);
		setTitle("Hello Worlds");
		setVisible(true);
	}
	
	
	public class ButtonsListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
			if (e.getSource() == btnCountLetters) {
				outputText.setText(""+inputText.getText().length());
			}  
			
			if (e.getSource() == btnReverseLetters) {
				StringBuilder reverse = new StringBuilder(inputText.getText());
				outputText.setText(""+reverse.reverse());
			}  
			if (e.getSource() == btnRemoveDublicators) {
				StringBuilder removeDublicators = new StringBuilder();
				inputText.getText().chars().distinct().forEach(c -> removeDublicators.append((char) c));
				outputText.setText(""+removeDublicators);
			}  
			
			
		}

	}



	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				new Main();
			}
			
		});
	
	}

}
