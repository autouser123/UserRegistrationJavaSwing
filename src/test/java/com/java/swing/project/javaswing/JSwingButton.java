package com.java.swing.project.javaswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JSwingButton {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Java Button Example");
		JButton btn = new JButton("Click Me!!");
		btn.setBounds(125,100,100,30);		
		frame.add(btn);		
		frame.setSize(500, 500);		 
		frame.setLayout(null);
		frame.setVisible(true);	
	}
}

 class JSwingText {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Java Button Example");
		JTextField txtField = new JTextField();
		txtField.setBounds(75, 50, 200, 30);
		frame.add(txtField);
		frame.setSize(500, 500);		 
		frame.setLayout(null);
		frame.setVisible(true);		
	}

}
  
 //registerNow
 class JSwingButtonImage {

		public static void main(String[] args) {
			JFrame frame = new JFrame("Java Button Example");
			ImageIcon img = new ImageIcon("C:\\Users\\manish.patidar\\Downloads\\registerNow.png");
			JButton btn = new JButton(img);
			btn.setBounds(125,100,270,50);		
			frame.add(btn);		
			frame.setSize(500, 500);		 
			frame.setLayout(null);
			frame.setVisible(true);	
		}
	}
 
 class JSwingForm {
		public static void main(String[] args) {
			JFrame frame = new JFrame("Java Button Example");
			JButton btn = new JButton(new ImageIcon("C:\\Users\\manish.patidar\\Downloads\\registerNow.png"));
			final JTextField txtField = new JTextField();
			btn.setBounds(75,300,270,50);
			txtField.setBounds(75, 50, 200, 30);
			btn.addActionListener(new ActionListener() {				
				public void actionPerformed(ActionEvent e) {
					txtField.setText("Well Come to java world!!");					
				}
			});
			frame.add(btn);
			frame.add(txtField);
			frame.setSize(500, 500);		 
			frame.setLayout(null);
			frame.setVisible(true);	
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}