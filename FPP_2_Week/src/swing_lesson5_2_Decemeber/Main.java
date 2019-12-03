package swing_lesson5_2_Decemeber;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {
	
	private JButton  btn;
	private JButton  btn1;
	private TextField emailInput;
	
	public Main() {
		
		JPanel mainPanel = new JPanel();
		JPanel textfieldsPanel = new JPanel();
		
		btn = new JButton("ClickMe");
		btn1 = new JButton("ClickMe 2");
		emailInput = new TextField("Enter Email");
		
		btn.addActionListener(new MyButtonListener());
		btn1.addMouseListener(new MyButtonListener1());
		
		mainPanel.add(btn);
		mainPanel.add(btn1);
		mainPanel.setBackground(Color.red);
		
		textfieldsPanel.add(emailInput);
		textfieldsPanel.setBackground(Color.blue);
		
		//layout manager
		add(BorderLayout.BEFORE_FIRST_LINE,mainPanel);
		add(textfieldsPanel);
		setSize(500,500);
		setTitle("Hello Worlds");
		setVisible(true);
	}
	
	
	public class MyButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			btn.setText("hello btn");
		}

	}
	
	public class MyButtonListener1 implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			btn1.setText("Mouse Clicked");
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
		
			btn1.setText("Mouse Pressed");
		}

		@Override
		public void mouseReleased(MouseEvent e) {
		
			btn1.setText("Mouse Relaeased");
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			
			btn1.setText("Mouse Entered");
		}

		@Override
		public void mouseExited(MouseEvent e) {
			btn1.setText("Mouse Existed");
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
