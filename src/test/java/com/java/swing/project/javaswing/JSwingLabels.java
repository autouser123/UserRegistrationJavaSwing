package com.java.swing.project.javaswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JSwingLabels {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Java Button Example");
		JLabel l1=new JLabel("First Name");
		JLabel l2=new JLabel("Last Name");
		JTextField txt1 = new JTextField();
		JTextField txt2 = new JTextField();
		JButton btn = new JButton("Submit!!");
		l1.setBounds(50,100,80,80);
		l2.setBounds(220,100,80,80);
		txt1.setBounds(120,120,70,40);
		txt2.setBounds(120,170,70,40);
		btn.setBounds(200,300,90,50);		
		frame.add(btn);
		frame.add(l1);
		frame.add(l2);
		frame.add(txt1);
		frame.add(txt2);
		frame.setSize(500, 500);		 
		frame.setLayout(null);
		frame.setVisible(true);	
	}
}

 /*class JSwingText {

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
	}*/